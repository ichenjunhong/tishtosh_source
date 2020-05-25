package com.github.luben.zstd;

import com.github.luben.zstd.p996a.C14726a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZstdInputStream extends FilterInputStream {
    private static final int srcBuffSize = ((int) recommendedDInSize());
    private long dstPos;
    private boolean finalize = true;
    private boolean frameFinished = true;
    private boolean isClosed;
    private boolean isContinuous;
    private boolean needRead = true;
    private byte[] src = new byte[srcBuffSize];
    private long srcPos;
    private long srcSize;
    private final long stream;

    private static native long createDStream();

    private native int decompressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    private static native int freeDStream(long j);

    private native int initDStream(long j);

    private static native long recommendedDInSize();

    private static native long recommendedDOutSize();

    public boolean markSupported() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.finalize) {
            close();
        }
    }

    public synchronized boolean getContinuous() {
        return this.isContinuous;
    }

    static {
        C14726a.load();
    }

    public synchronized int available() throws IOException {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        } else if (!this.needRead) {
            return 1;
        } else {
            return this.in.available();
        }
    }

    public synchronized void close() throws IOException {
        if (!this.isClosed) {
            freeDStream(this.stream);
            this.in.close();
            this.isClosed = true;
        }
    }

    public synchronized int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = 0;
        while (i == 0) {
            i = readInternal(bArr, 0, 1);
        }
        if (i != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    public void setFinalize(boolean z) {
        this.finalize = z;
    }

    public synchronized ZstdInputStream setContinuous(boolean z) {
        this.isContinuous = z;
        return this;
    }

    public ZstdInputStream(InputStream inputStream) throws IOException {
        super(inputStream);
        synchronized (this) {
            this.stream = createDStream();
            initDStream(this.stream);
        }
    }

    public synchronized long skip(long j) throws IOException {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        } else if (j <= 0) {
            return 0;
        } else {
            int min = (int) Math.min(recommendedDOutSize(), j);
            byte[] bArr = new byte[min];
            long j2 = j;
            while (j2 > 0) {
                int read = read(bArr, 0, (int) Math.min((long) min, j2));
                if (read < 0) {
                    break;
                }
                j2 -= (long) read;
            }
            return j - j2;
        }
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        if (i >= 0) {
            if (i2 <= bArr.length - i) {
                int i3 = 0;
                if (i2 == 0) {
                    return 0;
                }
                while (i3 == 0) {
                    i3 = readInternal(bArr, i, i2);
                }
                return i3;
            }
        }
        StringBuilder sb = new StringBuilder("Requested lenght ");
        sb.append(i2);
        sb.append(" from offset ");
        sb.append(i);
        sb.append(" in buffer of size ");
        sb.append(bArr.length);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public int readInternal(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        if (this.isClosed) {
            throw new IOException("Stream closed");
        } else if (i3 < 0 || i4 > bArr2.length - i3) {
            StringBuilder sb = new StringBuilder("Requested lenght ");
            sb.append(i4);
            sb.append(" from offset ");
            sb.append(i3);
            sb.append(" in buffer of size ");
            sb.append(bArr2.length);
            throw new IndexOutOfBoundsException(sb.toString());
        } else {
            int i5 = i3 + i4;
            long j = (long) i3;
            this.dstPos = j;
            long j2 = -1;
            while (true) {
                long j3 = (long) i5;
                if (this.dstPos < j3 && j2 < this.dstPos) {
                    boolean z = false;
                    if (this.needRead && (this.in.available() > 0 || this.dstPos == j)) {
                        this.srcSize = (long) this.in.read(this.src, 0, srcBuffSize);
                        this.srcPos = 0;
                        if (this.srcSize < 0) {
                            this.srcSize = 0;
                            if (this.frameFinished) {
                                return -1;
                            }
                            if (this.isContinuous) {
                                return (int) (this.dstPos - j);
                            }
                            throw new IOException("Read error or truncated source");
                        }
                        this.frameFinished = false;
                    }
                    long j4 = this.dstPos;
                    long j5 = j4;
                    int decompressStream = decompressStream(this.stream, bArr, i5, this.src, (int) this.srcSize);
                    long j6 = (long) decompressStream;
                    if (Zstd.isError(j6)) {
                        StringBuilder sb2 = new StringBuilder("Decompression error: ");
                        sb2.append(Zstd.getErrorName(j6));
                        throw new IOException(sb2.toString());
                    } else if (decompressStream == 0) {
                        this.frameFinished = true;
                        if (this.srcPos == this.srcSize) {
                            z = true;
                        }
                        this.needRead = z;
                        return (int) (this.dstPos - j);
                    } else {
                        if (this.dstPos < j3) {
                            z = true;
                        }
                        this.needRead = z;
                        j2 = j5;
                    }
                }
            }
            return (int) (this.dstPos - j);
        }
    }
}

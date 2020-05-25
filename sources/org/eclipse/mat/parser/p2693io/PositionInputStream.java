package org.eclipse.mat.parser.p2693io;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.mat.parser.internal.Messages;

/* renamed from: org.eclipse.mat.parser.io.PositionInputStream */
public class PositionInputStream extends FilterInputStream implements DataInput {
    private long position;
    private final byte[] readBuffer = new byte[32];

    public boolean markSupported() {
        return false;
    }

    public long position() {
        return this.position;
    }

    public String readLine() throws IOException {
        throw new UnsupportedOperationException();
    }

    public String readUTF() throws IOException {
        return DataInputStream.readUTF(this);
    }

    public void reset() {
        throw new UnsupportedOperationException(Messages.PositionInputStream_reset);
    }

    public int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.position++;
        }
        return read;
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    public final int readInt() throws IOException {
        readFully(this.readBuffer, 0, 4);
        return readInt(this.readBuffer, 0);
    }

    public final long readLong() throws IOException {
        readFully(this.readBuffer, 0, 8);
        return readLong(this.readBuffer, 0);
    }

    public boolean readBoolean() throws IOException {
        int read = this.in.read();
        if (read >= 0) {
            this.position++;
            if (read != 0) {
                return true;
            }
            return false;
        }
        throw new EOFException();
    }

    public byte readByte() throws IOException {
        int read = this.in.read();
        if (read >= 0) {
            this.position++;
            return (byte) read;
        }
        throw new EOFException();
    }

    public final int readUnsignedByte() throws IOException {
        int read = this.in.read();
        if (read >= 0) {
            this.position++;
            return read;
        }
        throw new EOFException();
    }

    public char readChar() throws IOException {
        int read = this.in.read();
        int read2 = this.in.read();
        if ((read | read2) >= 0) {
            this.position += 2;
            return (char) ((read << 8) + (read2 << 0));
        }
        throw new EOFException();
    }

    public short readShort() throws IOException {
        int read = this.in.read();
        int read2 = this.in.read();
        if ((read | read2) >= 0) {
            this.position += 2;
            return (short) ((read << 8) + (read2 << 0));
        }
        throw new EOFException();
    }

    public int readUnsignedShort() throws IOException {
        int read = this.in.read();
        int read2 = this.in.read();
        if ((read | read2) >= 0) {
            this.position += 2;
            return (read << 8) + (read2 << 0);
        }
        throw new EOFException();
    }

    public void mark(int i) {
        throw new UnsupportedOperationException(Messages.PositionInputStream_mark);
    }

    public final void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }

    public PositionInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        this.position += skip;
        return skip;
    }

    public final int skipBytes(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int skip = (int) skip((long) (i - i2));
            if (skip <= 0) {
                break;
            }
            i2 += skip;
        }
        return i2;
    }

    public final int skipBytes(long j) throws IOException {
        int i = 0;
        while (true) {
            long j2 = (long) i;
            if (j2 >= j) {
                break;
            }
            int skip = (int) skip(j - j2);
            if (skip <= 0) {
                break;
            }
            i += skip;
        }
        return i;
    }

    public int readIntArray(int[] iArr) throws IOException {
        byte[] bArr;
        int length = iArr.length * 4;
        if (length > this.readBuffer.length) {
            bArr = new byte[length];
        } else {
            bArr = this.readBuffer;
        }
        if (read(bArr, 0, length) == length) {
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = readInt(bArr, i * 4);
            }
            return iArr.length;
        }
        throw new IOException();
    }

    public int readLongArray(long[] jArr) throws IOException {
        byte[] bArr;
        int length = jArr.length * 8;
        if (length > this.readBuffer.length) {
            bArr = new byte[length];
        } else {
            bArr = this.readBuffer;
        }
        if (read(bArr, 0, length) == length) {
            for (int i = 0; i < jArr.length; i++) {
                jArr[i] = readLong(bArr, i * 8);
            }
            return jArr.length;
        }
        throw new IOException();
    }

    public void seek(long j) throws IOException {
        if (this.in instanceof BufferedRandomAccessInputStream) {
            this.position = j;
            ((BufferedRandomAccessInputStream) this.in).seek(j);
        } else if (this.in instanceof SimpleBufferedRandomAccessInputStream) {
            this.position = j;
            ((SimpleBufferedRandomAccessInputStream) this.in).seek(j);
        } else {
            throw new UnsupportedOperationException(Messages.PositionInputStream_seek);
        }
    }

    private static final int readInt(byte[] bArr, int i) throws IOException {
        byte b = bArr[i] & 255;
        byte b2 = bArr[i + 1] & 255;
        byte b3 = bArr[i + 2] & 255;
        byte b4 = bArr[i + 3] & 255;
        if ((b | b2 | b3 | b4) >= 0) {
            return (b << 24) + (b2 << 16) + (b3 << 8) + (b4 << 0);
        }
        throw new EOFException();
    }

    private static final long readLong(byte[] bArr, int i) {
        return (((long) bArr[i]) << 56) + (((long) (bArr[i + 1] & 255)) << 48) + (((long) (bArr[i + 2] & 255)) << 40) + (((long) (bArr[i + 3] & 255)) << 32) + (((long) (bArr[i + 4] & 255)) << 24) + ((long) ((bArr[i + 5] & 255) << 16)) + ((long) ((bArr[i + 6] & 255) << 8)) + ((long) ((bArr[i + 7] & 255) << 0));
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.position += (long) read;
        }
        return read;
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            } else {
                throw new EOFException();
            }
        }
    }
}

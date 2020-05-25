package okio;

import com.C2240a;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;

public final class RealBufferedSource implements BufferedSource {
    public final Buffer buffer = new Buffer();
    public boolean closed;
    public final Source source;

    public final Buffer buffer() {
        return this.buffer;
    }

    public final InputStream inputStream() {
        return new RealBufferedSource$inputStream$1(this);
    }

    public final boolean isOpen() {
        if (!this.closed) {
            return true;
        }
        return false;
    }

    public final Timeout timeout() {
        return this.source.timeout();
    }

    public final byte readByte() {
        require(1);
        return this.buffer.readByte();
    }

    public final byte[] readByteArray() {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteArray();
    }

    public final ByteString readByteString() {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteString();
    }

    public final int readInt() {
        require(4);
        return this.buffer.readInt();
    }

    public final int readIntLe() {
        require(4);
        return this.buffer.readIntLe();
    }

    public final long readLong() {
        require(8);
        return this.buffer.readLong();
    }

    public final long readLongLe() {
        require(8);
        return this.buffer.readLongLe();
    }

    public final short readShort() {
        require(2);
        return this.buffer.readShort();
    }

    public final short readShortLe() {
        require(2);
        return this.buffer.readShortLe();
    }

    public final String readUtf8() {
        this.buffer.writeAll(this.source);
        return this.buffer.readUtf8();
    }

    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public final void close() {
        if (!this.closed) {
            this.closed = true;
            this.source.close();
            this.buffer.clear();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.source);
        sb.append(')');
        return sb.toString();
    }

    public final boolean exhausted() {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.buffer.exhausted() || this.source.read(this.buffer, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public final int readUtf8CodePoint() {
        require(1);
        byte b = this.buffer.getByte(0);
        if ((b & 224) == 192) {
            require(2);
        } else if ((b & 240) == 224) {
            require(3);
        } else if ((b & 248) == 240) {
            require(4);
        }
        return this.buffer.readUtf8CodePoint();
    }

    public final String readUtf8Line() {
        long indexOf = indexOf(10);
        if (indexOf != -1) {
            return this.buffer.readUtf8Line$jvm(indexOf);
        }
        if (this.buffer.size() != 0) {
            return readUtf8(this.buffer.size());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r4 == 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r1 = com.C2240a.m6772a("Expected leading [0-9] or '-' character but was %#x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(r8)}, 1));
        p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r1, "java.lang.String.format(format, *args)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        throw new java.lang.NumberFormatException(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long readDecimalLong() {
        /*
            r10 = this;
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        L_0x0008:
            r6 = 0
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L_0x0050
            okio.Buffer r8 = r10.buffer
            byte r8 = r8.getByte(r4)
            r9 = 48
            if (r8 < r9) goto L_0x001f
            r9 = 57
            if (r8 <= r9) goto L_0x0028
        L_0x001f:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x002a
            r9 = 45
            if (r8 == r9) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r4 = r6
            goto L_0x0008
        L_0x002a:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x002f
            goto L_0x0050
        L_0x002f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            java.lang.Byte r4 = java.lang.Byte.valueOf(r8)
            r2[r3] = r4
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r1 = com.C2240a.m6772a(r2, r1)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0050:
            okio.Buffer r0 = r10.buffer
            long r0 = r0.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.RealBufferedSource.readDecimalLong():long");
    }

    public final long readHexadecimalUnsignedLong() {
        require(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request((long) i2)) {
                break;
            }
            byte b = this.buffer.getByte((long) i);
            if ((b >= 48 && b <= 57) || ((b >= 97 && b <= 102) || (b >= 65 && b <= 70))) {
                i = i2;
            } else if (i == 0) {
                String str = "Expected leading [0-9a-fA-F] character but was %#x";
                String a = C2240a.m6772a(str, Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
                throw new NumberFormatException(a);
            }
        }
        return this.buffer.readHexadecimalUnsignedLong();
    }

    public final long indexOf(byte b) {
        return indexOf(b, 0, Long.MAX_VALUE);
    }

    public final long indexOfElement(ByteString byteString) {
        C52711k.m112240b(byteString, "targetBytes");
        return indexOfElement(byteString, 0);
    }

    public final int read(byte[] bArr) {
        C52711k.m112240b(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    public final void require(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    public RealBufferedSource(Source source2) {
        C52711k.m112240b(source2, "source");
        this.source = source2;
    }

    public final byte[] readByteArray(long j) {
        require(j);
        return this.buffer.readByteArray(j);
    }

    public final ByteString readByteString(long j) {
        require(j);
        return this.buffer.readByteString(j);
    }

    public final String readString(Charset charset) {
        C52711k.m112240b(charset, "charset");
        this.buffer.writeAll(this.source);
        return this.buffer.readString(charset);
    }

    public final String readUtf8(long j) {
        require(j);
        return this.buffer.readUtf8(j);
    }

    public final long indexOf(ByteString byteString) {
        C52711k.m112240b(byteString, "bytes");
        return indexOf(byteString, 0);
    }

    public final int read(ByteBuffer byteBuffer) {
        C52711k.m112240b(byteBuffer, "sink");
        if (this.buffer.size() == 0 && this.source.read(this.buffer, 8192) == -1) {
            return -1;
        }
        return this.buffer.read(byteBuffer);
    }

    public final void readFully(byte[] bArr) {
        C52711k.m112240b(bArr, "sink");
        try {
            require((long) bArr.length);
            this.buffer.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.buffer.size() > 0) {
                int read = this.buffer.read(bArr, i, (int) this.buffer.size());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public final long readAll(Sink sink) {
        C52711k.m112240b(sink, "sink");
        long j = 0;
        while (this.source.read(this.buffer, 8192) != -1) {
            long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(this.buffer, completeSegmentByteCount);
            }
        }
        if (this.buffer.size() <= 0) {
            return j;
        }
        long size = j + this.buffer.size();
        sink.write(this.buffer, this.buffer.size());
        return size;
    }

    public final boolean request(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!this.closed) {
            while (this.buffer.size() < j) {
                if (this.source.read(this.buffer, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final int select(Options options) {
        C52711k.m112240b(options, "options");
        if (!this.closed) {
            do {
                int selectPrefix$jvm = this.buffer.selectPrefix$jvm(options, true);
                switch (selectPrefix$jvm) {
                    case -2:
                        break;
                    case -1:
                        return -1;
                    default:
                        this.buffer.skip((long) options.getByteStrings$jvm()[selectPrefix$jvm].size());
                        return selectPrefix$jvm;
                }
            } while (this.source.read(this.buffer, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void skip(long j) {
        if (!this.closed) {
            while (j > 0) {
                if (this.buffer.size() == 0 && this.source.read(this.buffer, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.buffer.size());
                this.buffer.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String readUtf8LineStrict(long j) {
        boolean z;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long indexOf = indexOf(10, 0, j2);
            if (indexOf != -1) {
                return this.buffer.readUtf8Line$jvm(indexOf);
            }
            if (j2 < Long.MAX_VALUE && request(j2) && this.buffer.getByte(j2 - 1) == 13 && request(1 + j2) && this.buffer.getByte(j2) == 10) {
                return this.buffer.readUtf8Line$jvm(j2);
            }
            Buffer buffer2 = new Buffer();
            this.buffer.copyTo(buffer2, 0, Math.min(32, this.buffer.size()));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(this.buffer.size(), j));
            sb.append(" content=");
            sb.append(buffer2.readByteString().hex());
            sb.append("…");
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final String readString(long j, Charset charset) {
        C52711k.m112240b(charset, "charset");
        require(j);
        return this.buffer.readString(j, charset);
    }

    public final long indexOf(byte b, long j) {
        return indexOf(b, j, Long.MAX_VALUE);
    }

    public final boolean rangeEquals(long j, ByteString byteString) {
        C52711k.m112240b(byteString, "bytes");
        return rangeEquals(j, byteString, 0, byteString.size());
    }

    public final void readFully(Buffer buffer2, long j) {
        C52711k.m112240b(buffer2, "sink");
        try {
            require(j);
            this.buffer.readFully(buffer2, j);
        } catch (EOFException e) {
            buffer2.writeAll(this.buffer);
            throw e;
        }
    }

    public final long indexOfElement(ByteString byteString, long j) {
        C52711k.m112240b(byteString, "targetBytes");
        if (!this.closed) {
            while (true) {
                long indexOfElement = this.buffer.indexOfElement(byteString, j);
                if (indexOfElement != -1) {
                    return indexOfElement;
                }
                long size = this.buffer.size();
                if (this.source.read(this.buffer, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, size);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final long indexOf(ByteString byteString, long j) {
        C52711k.m112240b(byteString, "bytes");
        if (!this.closed) {
            while (true) {
                long indexOf = this.buffer.indexOf(byteString, j);
                if (indexOf != -1) {
                    return indexOf;
                }
                long size = this.buffer.size();
                if (this.source.read(this.buffer, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (size - ((long) byteString.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final long read(Buffer buffer2, long j) {
        boolean z;
        C52711k.m112240b(buffer2, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!(true ^ this.closed)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.buffer.size() == 0 && this.source.read(this.buffer, 8192) == -1) {
            return -1;
        } else {
            return this.buffer.read(buffer2, Math.min(j, this.buffer.size()));
        }
    }

    public final long indexOf(byte b, long j, long j2) {
        boolean z = true;
        if (!this.closed) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long indexOf = this.buffer.indexOf(b, j, j2);
                    if (indexOf != -1) {
                        return indexOf;
                    }
                    long size = this.buffer.size();
                    if (size >= j2 || this.source.read(this.buffer, 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, size);
                }
                return -1;
            }
            StringBuilder sb = new StringBuilder("fromIndex=");
            sb.append(j);
            sb.append(" toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final int read(byte[] bArr, int i, int i2) {
        C52711k.m112240b(bArr, "sink");
        long j = (long) i2;
        Util.checkOffsetAndCount((long) bArr.length, (long) i, j);
        if (this.buffer.size() == 0 && this.source.read(this.buffer, 8192) == -1) {
            return -1;
        }
        return this.buffer.read(bArr, i, (int) Math.min(j, this.buffer.size()));
    }

    public final boolean rangeEquals(long j, ByteString byteString, int i, int i2) {
        C52711k.m112240b(byteString, "bytes");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        } else if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!request(1 + j2) || this.buffer.getByte(j2) != byteString.getByte(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }
}

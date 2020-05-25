package okio;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p2628d.p2639f.p2641b.C52711k;

public final class RealBufferedSink implements BufferedSink {
    public final Buffer buffer = new Buffer();
    public boolean closed;
    public final Sink sink;

    public final Buffer buffer() {
        return this.buffer;
    }

    public final boolean isOpen() {
        if (!this.closed) {
            return true;
        }
        return false;
    }

    public final OutputStream outputStream() {
        return new RealBufferedSink$outputStream$1(this);
    }

    public final Timeout timeout() {
        return this.sink.timeout();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.sink);
        sb.append(')');
        return sb.toString();
    }

    public final void close() {
        if (!this.closed) {
            Throwable th = null;
            try {
                if (this.buffer.size() > 0) {
                    this.sink.write(this.buffer, this.buffer.size());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.sink.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.closed = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final BufferedSink emit() {
        if (!this.closed) {
            long size = this.buffer.size();
            if (size > 0) {
                this.sink.write(this.buffer, size);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink emitCompleteSegments() {
        if (!this.closed) {
            long completeSegmentByteCount = this.buffer.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                this.sink.write(this.buffer, completeSegmentByteCount);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void flush() {
        if (!this.closed) {
            if (this.buffer.size() > 0) {
                this.sink.write(this.buffer, this.buffer.size());
            }
            this.sink.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public RealBufferedSink(Sink sink2) {
        C52711k.m112240b(sink2, "sink");
        this.sink = sink2;
    }

    public final long writeAll(Source source) {
        C52711k.m112240b(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this.buffer, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            emitCompleteSegments();
        }
    }

    public final BufferedSink writeByte(int i) {
        if (!this.closed) {
            this.buffer.writeByte(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeDecimalLong(long j) {
        if (!this.closed) {
            this.buffer.writeDecimalLong(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeHexadecimalUnsignedLong(long j) {
        if (!this.closed) {
            this.buffer.writeHexadecimalUnsignedLong(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeInt(int i) {
        if (!this.closed) {
            this.buffer.writeInt(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeIntLe(int i) {
        if (!this.closed) {
            this.buffer.writeIntLe(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeLong(long j) {
        if (!this.closed) {
            this.buffer.writeLong(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeLongLe(long j) {
        if (!this.closed) {
            this.buffer.writeLongLe(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeShort(int i) {
        if (!this.closed) {
            this.buffer.writeShort(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeShortLe(int i) {
        if (!this.closed) {
            this.buffer.writeShortLe(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeUtf8CodePoint(int i) {
        if (!this.closed) {
            this.buffer.writeUtf8CodePoint(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final int write(ByteBuffer byteBuffer) {
        C52711k.m112240b(byteBuffer, "source");
        if (!this.closed) {
            int write = this.buffer.write(byteBuffer);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeUtf8(String str) {
        C52711k.m112240b(str, "string");
        if (!this.closed) {
            this.buffer.writeUtf8(str);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink write(ByteString byteString) {
        C52711k.m112240b(byteString, "byteString");
        if (!this.closed) {
            this.buffer.write(byteString);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink write(byte[] bArr) {
        C52711k.m112240b(bArr, "source");
        if (!this.closed) {
            this.buffer.write(bArr);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeString(String str, Charset charset) {
        C52711k.m112240b(str, "string");
        C52711k.m112240b(charset, "charset");
        if (!this.closed) {
            this.buffer.writeString(str, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink write(Source source, long j) {
        C52711k.m112240b(source, "source");
        while (j > 0) {
            long read = source.read(this.buffer, j);
            if (read != -1) {
                j -= read;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public final void write(Buffer buffer2, long j) {
        C52711k.m112240b(buffer2, "source");
        if (!this.closed) {
            this.buffer.write(buffer2, j);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeUtf8(String str, int i, int i2) {
        C52711k.m112240b(str, "string");
        if (!this.closed) {
            this.buffer.writeUtf8(str, i, i2);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink write(byte[] bArr, int i, int i2) {
        C52711k.m112240b(bArr, "source");
        if (!this.closed) {
            this.buffer.write(bArr, i, i2);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public final BufferedSink writeString(String str, int i, int i2, Charset charset) {
        C52711k.m112240b(str, "string");
        C52711k.m112240b(charset, "charset");
        if (!this.closed) {
            this.buffer.writeString(str, i, i2, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }
}

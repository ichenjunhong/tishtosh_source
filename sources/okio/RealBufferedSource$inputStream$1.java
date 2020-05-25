package okio;

import java.io.IOException;
import java.io.InputStream;
import p2628d.p2639f.p2641b.C52711k;

public final class RealBufferedSource$inputStream$1 extends InputStream {
    final /* synthetic */ RealBufferedSource this$0;

    public final void close() {
        this.this$0.close();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.this$0);
        sb.append(".inputStream()");
        return sb.toString();
    }

    public final int available() {
        if (!this.this$0.closed) {
            return (int) Math.min(this.this$0.buffer.size(), 2147483647L);
        }
        throw new IOException("closed");
    }

    public final int read() {
        if (this.this$0.closed) {
            throw new IOException("closed");
        } else if (this.this$0.buffer.size() == 0 && this.this$0.source.read(this.this$0.buffer, 8192) == -1) {
            return -1;
        } else {
            return this.this$0.buffer.readByte() & 255;
        }
    }

    RealBufferedSource$inputStream$1(RealBufferedSource realBufferedSource) {
        this.this$0 = realBufferedSource;
    }

    public final int read(byte[] bArr, int i, int i2) {
        C52711k.m112240b(bArr, "data");
        if (!this.this$0.closed) {
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            if (this.this$0.buffer.size() == 0 && this.this$0.source.read(this.this$0.buffer, 8192) == -1) {
                return -1;
            }
            return this.this$0.buffer.read(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}

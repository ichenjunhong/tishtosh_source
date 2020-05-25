package okio;

import java.io.InputStream;
import p2628d.p2639f.p2641b.C52711k;

public final class Buffer$inputStream$1 extends InputStream {
    final /* synthetic */ Buffer this$0;

    public final void close() {
    }

    public final int available() {
        return (int) Math.min(this.this$0.size(), 2147483647L);
    }

    public final int read() {
        if (this.this$0.size() > 0) {
            return this.this$0.readByte() & 255;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.this$0);
        sb.append(".inputStream()");
        return sb.toString();
    }

    Buffer$inputStream$1(Buffer buffer) {
        this.this$0 = buffer;
    }

    public final int read(byte[] bArr, int i, int i2) {
        C52711k.m112240b(bArr, "sink");
        return this.this$0.read(bArr, i, i2);
    }
}

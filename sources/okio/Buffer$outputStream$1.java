package okio;

import java.io.OutputStream;
import p2628d.p2639f.p2641b.C52711k;

public final class Buffer$outputStream$1 extends OutputStream {
    final /* synthetic */ Buffer this$0;

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.this$0);
        sb.append(".outputStream()");
        return sb.toString();
    }

    Buffer$outputStream$1(Buffer buffer) {
        this.this$0 = buffer;
    }

    public final void write(int i) {
        this.this$0.writeByte(i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        C52711k.m112240b(bArr, "data");
        this.this$0.write(bArr, i, i2);
    }
}

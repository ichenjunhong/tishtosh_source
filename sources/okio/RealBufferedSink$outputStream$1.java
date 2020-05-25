package okio;

import java.io.IOException;
import java.io.OutputStream;
import p2628d.p2639f.p2641b.C52711k;

public final class RealBufferedSink$outputStream$1 extends OutputStream {
    final /* synthetic */ RealBufferedSink this$0;

    public final void close() {
        this.this$0.close();
    }

    public final void flush() {
        if (!this.this$0.closed) {
            this.this$0.flush();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.this$0);
        sb.append(".outputStream()");
        return sb.toString();
    }

    RealBufferedSink$outputStream$1(RealBufferedSink realBufferedSink) {
        this.this$0 = realBufferedSink;
    }

    public final void write(int i) {
        if (!this.this$0.closed) {
            this.this$0.buffer.writeByte((int) (byte) i);
            this.this$0.emitCompleteSegments();
            return;
        }
        throw new IOException("closed");
    }

    public final void write(byte[] bArr, int i, int i2) {
        C52711k.m112240b(bArr, "data");
        if (!this.this$0.closed) {
            this.this$0.buffer.write(bArr, i, i2);
            this.this$0.emitCompleteSegments();
            return;
        }
        throw new IOException("closed");
    }
}

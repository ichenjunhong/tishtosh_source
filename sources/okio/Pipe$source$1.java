package okio;

import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

public final class Pipe$source$1 implements Source {
    final /* synthetic */ Pipe this$0;
    private final Timeout timeout = new Timeout();

    public final Timeout timeout() {
        return this.timeout;
    }

    public final void close() {
        synchronized (this.this$0.getBuffer$jvm()) {
            this.this$0.setSourceClosed$jvm(true);
            Buffer buffer$jvm = this.this$0.getBuffer$jvm();
            if (buffer$jvm != null) {
                buffer$jvm.notifyAll();
            } else {
                throw new C52857u("null cannot be cast to non-null type java.lang.Object");
            }
        }
    }

    Pipe$source$1(Pipe pipe) {
        this.this$0 = pipe;
    }

    public final long read(Buffer buffer, long j) {
        C52711k.m112240b(buffer, "sink");
        synchronized (this.this$0.getBuffer$jvm()) {
            if (!this.this$0.getSourceClosed$jvm()) {
                while (this.this$0.getBuffer$jvm().size() == 0) {
                    if (this.this$0.getSinkClosed$jvm()) {
                        return -1;
                    }
                    this.timeout.waitUntilNotified(this.this$0.getBuffer$jvm());
                }
                long read = this.this$0.getBuffer$jvm().read(buffer, j);
                Buffer buffer$jvm = this.this$0.getBuffer$jvm();
                if (buffer$jvm != null) {
                    buffer$jvm.notifyAll();
                    return read;
                }
                throw new C52857u("null cannot be cast to non-null type java.lang.Object");
            }
            throw new IllegalStateException("closed".toString());
        }
    }
}

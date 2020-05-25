package okio;

import java.io.IOException;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

public final class Pipe$sink$1 implements Sink {
    final /* synthetic */ Pipe this$0;
    private final Timeout timeout = new Timeout();

    public final Timeout timeout() {
        return this.timeout;
    }

    public final void close() {
        synchronized (this.this$0.getBuffer$jvm()) {
            if (!this.this$0.getSinkClosed$jvm()) {
                if (this.this$0.getSourceClosed$jvm()) {
                    if (this.this$0.getBuffer$jvm().size() > 0) {
                        throw new IOException("source is closed");
                    }
                }
                this.this$0.setSinkClosed$jvm(true);
                Buffer buffer$jvm = this.this$0.getBuffer$jvm();
                if (buffer$jvm != null) {
                    buffer$jvm.notifyAll();
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type java.lang.Object");
            }
        }
    }

    public final void flush() {
        synchronized (this.this$0.getBuffer$jvm()) {
            if (!(!this.this$0.getSinkClosed$jvm())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.this$0.getSourceClosed$jvm()) {
                if (this.this$0.getBuffer$jvm().size() > 0) {
                    throw new IOException("source is closed");
                }
            }
        }
    }

    Pipe$sink$1(Pipe pipe) {
        this.this$0 = pipe;
    }

    public final void write(Buffer buffer, long j) {
        C52711k.m112240b(buffer, "source");
        synchronized (this.this$0.getBuffer$jvm()) {
            if (!this.this$0.getSinkClosed$jvm()) {
                while (j > 0) {
                    if (!this.this$0.getSourceClosed$jvm()) {
                        long maxBufferSize$jvm = this.this$0.getMaxBufferSize$jvm() - this.this$0.getBuffer$jvm().size();
                        if (maxBufferSize$jvm == 0) {
                            this.timeout.waitUntilNotified(this.this$0.getBuffer$jvm());
                        } else {
                            long min = Math.min(maxBufferSize$jvm, j);
                            this.this$0.getBuffer$jvm().write(buffer, min);
                            j -= min;
                            Buffer buffer$jvm = this.this$0.getBuffer$jvm();
                            if (buffer$jvm != null) {
                                buffer$jvm.notifyAll();
                            } else {
                                throw new C52857u("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                    } else {
                        throw new IOException("source is closed");
                    }
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }
}

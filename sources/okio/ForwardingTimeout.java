package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;

public class ForwardingTimeout extends Timeout {
    private Timeout delegate;

    public final Timeout delegate() {
        return this.delegate;
    }

    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    public boolean hasDeadline() {
        return this.delegate.hasDeadline();
    }

    public void throwIfReached() throws IOException {
        this.delegate.throwIfReached();
    }

    public long timeoutNanos() {
        return this.delegate.timeoutNanos();
    }

    public final ForwardingTimeout setDelegate(Timeout timeout) {
        C52711k.m112240b(timeout, "delegate");
        this.delegate = timeout;
        return this;
    }

    public ForwardingTimeout(Timeout timeout) {
        C52711k.m112240b(timeout, "delegate");
        this.delegate = timeout;
    }

    public Timeout deadlineNanoTime(long j) {
        return this.delegate.deadlineNanoTime(j);
    }

    public Timeout timeout(long j, TimeUnit timeUnit) {
        C52711k.m112240b(timeUnit, "unit");
        return this.delegate.timeout(j, timeUnit);
    }
}

package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public class Timeout {
    public static final Companion Companion = new Companion(null);
    public static final Timeout NONE = new Timeout$Companion$NONE$1();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public Timeout clearTimeout() {
        this.timeoutNanos = 0;
        return this;
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public Timeout deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        C52711k.m112240b(obj, "monitor");
        try {
            boolean hasDeadline2 = hasDeadline();
            long timeoutNanos2 = timeoutNanos();
            long j = 0;
            if (hasDeadline2 || timeoutNanos2 != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline2 && timeoutNanos2 != 0) {
                    timeoutNanos2 = Math.min(timeoutNanos2, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline2) {
                    timeoutNanos2 = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos2 > 0) {
                    long j2 = timeoutNanos2 / 1000000;
                    obj.wait(j2, (int) (timeoutNanos2 - (1000000 * j2)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= timeoutNanos2) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public final Timeout deadline(long j, TimeUnit timeUnit) {
        boolean z;
        C52711k.m112240b(timeUnit, "unit");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        }
        StringBuilder sb = new StringBuilder("duration <= 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public Timeout timeout(long j, TimeUnit timeUnit) {
        boolean z;
        C52711k.m112240b(timeUnit, "unit");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        StringBuilder sb = new StringBuilder("timeout < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}

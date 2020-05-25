package okio;

import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;

public final class Timeout$Companion$NONE$1 extends Timeout {
    Timeout$Companion$NONE$1() {
    }

    public final void throwIfReached() {
    }

    public final Timeout deadlineNanoTime(long j) {
        return this;
    }

    public final Timeout timeout(long j, TimeUnit timeUnit) {
        C52711k.m112240b(timeUnit, "unit");
        return this;
    }
}

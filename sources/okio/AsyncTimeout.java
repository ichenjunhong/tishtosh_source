package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public class AsyncTimeout extends Timeout {
    public static final Companion Companion = new Companion(null);
    public static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    public static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    public static AsyncTimeout head;
    private boolean inQueue;
    public AsyncTimeout next;
    public long timeoutAt;

    public static final class Companion {
        private Companion() {
        }

        public final AsyncTimeout awaitTimeout$jvm() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            if (asyncTimeout == null) {
                C52711k.m112234a();
            }
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 == null) {
                long nanoTime = System.nanoTime();
                AsyncTimeout.class.wait(AsyncTimeout.IDLE_TIMEOUT_MILLIS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                if (asyncTimeout3 == null) {
                    C52711k.m112234a();
                }
                if (asyncTimeout3.next != null || System.nanoTime() - nanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.head;
            }
            long remainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
            if (remainingNanos > 0) {
                long j = remainingNanos / 1000000;
                AsyncTimeout.class.wait(j, (int) (remainingNanos - (1000000 * j)));
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            if (asyncTimeout4 == null) {
                C52711k.m112234a();
            }
            asyncTimeout4.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            return asyncTimeout2;
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final boolean cancelScheduledTimeout(AsyncTimeout asyncTimeout) {
            synchronized (AsyncTimeout.class) {
                for (AsyncTimeout asyncTimeout2 = AsyncTimeout.head; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.next) {
                    if (asyncTimeout2.next == asyncTimeout) {
                        asyncTimeout2.next = asyncTimeout.next;
                        asyncTimeout.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        public final void scheduleTimeout(AsyncTimeout asyncTimeout, long j, boolean z) {
            synchronized (AsyncTimeout.class) {
                if (AsyncTimeout.head == null) {
                    AsyncTimeout.head = new AsyncTimeout();
                    new Watchdog().start();
                }
                long nanoTime = System.nanoTime();
                if (j != 0 && z) {
                    asyncTimeout.timeoutAt = Math.min(j, asyncTimeout.deadlineNanoTime() - nanoTime) + nanoTime;
                } else if (j != 0) {
                    asyncTimeout.timeoutAt = j + nanoTime;
                } else if (z) {
                    asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
                } else {
                    throw new AssertionError();
                }
                long remainingNanos = asyncTimeout.remainingNanos(nanoTime);
                AsyncTimeout asyncTimeout2 = AsyncTimeout.head;
                if (asyncTimeout2 == null) {
                    C52711k.m112234a();
                }
                while (true) {
                    if (asyncTimeout2.next == null) {
                        break;
                    }
                    AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
                    if (asyncTimeout3 == null) {
                        C52711k.m112234a();
                    }
                    if (remainingNanos < asyncTimeout3.remainingNanos(nanoTime)) {
                        break;
                    }
                    asyncTimeout2 = asyncTimeout2.next;
                    if (asyncTimeout2 == null) {
                        C52711k.m112234a();
                    }
                }
                asyncTimeout.next = asyncTimeout2.next;
                asyncTimeout2.next = asyncTimeout;
                if (asyncTimeout2 == AsyncTimeout.head) {
                    AsyncTimeout.class.notify();
                }
            }
        }
    }

    static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
            r1.timedOut();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                okio.AsyncTimeout$Companion r1 = okio.AsyncTimeout.Companion     // Catch:{ all -> 0x0019 }
                okio.AsyncTimeout r1 = r1.awaitTimeout$jvm()     // Catch:{ all -> 0x0019 }
                okio.AsyncTimeout r2 = okio.AsyncTimeout.head     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0012
                r1 = 0
                okio.AsyncTimeout.head = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0012:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.timedOut()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.AsyncTimeout.Watchdog.run():void");
        }
    }

    /* access modifiers changed from: protected */
    public void timedOut() {
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return Companion.cancelScheduledTimeout(this);
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.inQueue = true;
                Companion.scheduleTimeout(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final Sink sink(Sink sink) {
        C52711k.m112240b(sink, "sink");
        return new AsyncTimeout$sink$1(this, sink);
    }

    public final Source source(Source source) {
        C52711k.m112240b(source, "source");
        return new AsyncTimeout$source$1(this, source);
    }

    public final IOException exit$jvm(IOException iOException) {
        C52711k.m112240b(iOException, "cause");
        if (!exit()) {
            return iOException;
        }
        return newTimeoutException(iOException);
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void exit$jvm(boolean z) {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }
}

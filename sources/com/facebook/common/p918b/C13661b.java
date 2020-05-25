package com.facebook.common.p918b;

import com.facebook.common.p921e.C13697a;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.common.b.b */
public class C13661b extends AbstractExecutorService {

    /* renamed from: a */
    public static final Class<?> f35643a = C13661b.class;

    /* renamed from: b */
    public final String f35644b;

    /* renamed from: c */
    public final BlockingQueue<Runnable> f35645c;

    /* renamed from: d */
    public final AtomicInteger f35646d;

    /* renamed from: e */
    private final Executor f35647e;

    /* renamed from: f */
    private volatile int f35648f = 1;

    /* renamed from: g */
    private final C13663a f35649g;

    /* renamed from: h */
    private final AtomicInteger f35650h;

    /* renamed from: com.facebook.common.b.b$a */
    class C13663a implements Runnable {
        public final void run() {
            try {
                Runnable runnable = (Runnable) C13661b.this.f35645c.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    C13697a.m27673a(C13661b.f35643a, "%s: Worker has nothing to run", (Object) C13661b.this.f35644b);
                }
                int decrementAndGet = C13661b.this.f35646d.decrementAndGet();
                if (!C13661b.this.f35645c.isEmpty()) {
                    C13661b.this.mo25540a();
                } else {
                    C13697a.m27674a(C13661b.f35643a, "%s: worker finished; %d workers left", (Object) C13661b.this.f35644b, (Object) Integer.valueOf(decrementAndGet));
                }
            } catch (Throwable th) {
                int decrementAndGet2 = C13661b.this.f35646d.decrementAndGet();
                if (!C13661b.this.f35645c.isEmpty()) {
                    C13661b.this.mo25540a();
                } else {
                    C13697a.m27674a(C13661b.f35643a, "%s: worker finished; %d workers left", (Object) C13661b.this.f35644b, (Object) Integer.valueOf(decrementAndGet2));
                }
                throw th;
            }
        }

        private C13663a() {
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo25540a() {
        int i = this.f35646d.get();
        while (i < this.f35648f) {
            int i2 = i + 1;
            if (this.f35646d.compareAndSet(i, i2)) {
                C13697a.m27675a(f35643a, "%s: starting worker %d of %d", this.f35644b, Integer.valueOf(i2), Integer.valueOf(this.f35648f));
                this.f35647e.execute(this.f35649g);
                return;
            }
            C13697a.m27673a(f35643a, "%s: race in startWorkerIfNeeded; retrying", (Object) this.f35644b);
            i = this.f35646d.get();
        }
    }

    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        } else if (this.f35645c.offer(runnable)) {
            int size = this.f35645c.size();
            int i = this.f35650h.get();
            if (size > i && this.f35650h.compareAndSet(i, size)) {
                C13697a.m27674a(f35643a, "%s: max pending work in queue = %d", (Object) this.f35644b, (Object) Integer.valueOf(size));
            }
            mo25540a();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f35644b);
            sb.append(" queue is full, size=");
            sb.append(this.f35645c.size());
            throw new RejectedExecutionException(sb.toString());
        }
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    public C13661b(String str, int i, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        this.f35644b = str;
        this.f35647e = executor;
        this.f35645c = blockingQueue;
        this.f35649g = new C13663a();
        this.f35646d = new AtomicInteger(0);
        this.f35650h = new AtomicInteger(0);
    }
}

package android.support.p030v4.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.content.h */
abstract class C0736h<Params, Progress, Result> {

    /* renamed from: a */
    private static final ThreadFactory f2553a = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f2563a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("ModernAsyncTask #");
            sb.append(this.f2563a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };

    /* renamed from: b */
    private static final BlockingQueue<Runnable> f2554b = new LinkedBlockingQueue(10);

    /* renamed from: c */
    public static final Executor f2555c;

    /* renamed from: h */
    private static C0742b f2556h;

    /* renamed from: i */
    private static volatile Executor f2557i;

    /* renamed from: d */
    final FutureTask<Result> f2558d = new FutureTask<Result>(this.f2562j) {
        /* access modifiers changed from: protected */
        public final void done() {
            try {
                C0736h.this.mo2409c(get());
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (CancellationException unused2) {
                C0736h.this.mo2409c(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };

    /* renamed from: e */
    public volatile C0743c f2559e = C0743c.PENDING;

    /* renamed from: f */
    final AtomicBoolean f2560f = new AtomicBoolean();

    /* renamed from: g */
    final AtomicBoolean f2561g = new AtomicBoolean();

    /* renamed from: j */
    private final C0744d<Params, Result> f2562j = new C0744d<Params, Result>() {
        public final Result call() throws Exception {
            C0736h.this.f2561g.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                Result a = C0736h.this.mo2373a((Params[]) this.f2570b);
                try {
                    Binder.flushPendingCommands();
                    C0736h.this.mo2410d(a);
                    return a;
                } catch (Throwable th) {
                    th = th;
                    obj = a;
                    C0736h.this.mo2410d(obj);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C0736h.this.f2560f.set(true);
                throw th;
            }
        }
    };

    /* renamed from: android.support.v4.content.h$a */
    static class C0741a<Data> {

        /* renamed from: a */
        final C0736h f2567a;

        /* renamed from: b */
        final Data[] f2568b;

        C0741a(C0736h hVar, Data... dataArr) {
            this.f2567a = hVar;
            this.f2568b = dataArr;
        }
    }

    /* renamed from: android.support.v4.content.h$b */
    static class C0742b extends Handler {
        C0742b() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            C0741a aVar = (C0741a) message.obj;
            if (message.what == 1) {
                aVar.f2567a.mo2411e(aVar.f2568b[0]);
            }
        }
    }

    /* renamed from: android.support.v4.content.h$c */
    public enum C0743c {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: android.support.v4.content.h$d */
    static abstract class C0744d<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f2570b;

        C0744d() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo2373a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2374a(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2375b(Result result) {
    }

    /* renamed from: a */
    public final boolean mo2408a() {
        return this.f2560f.get();
    }

    /* renamed from: b */
    private static Handler m2134b() {
        C0742b bVar;
        synchronized (C0736h.class) {
            if (f2556h == null) {
                f2556h = new C0742b();
            }
            bVar = f2556h;
        }
        return bVar;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f2554b, f2553a);
        f2555c = threadPoolExecutor;
        f2557i = threadPoolExecutor;
    }

    C0736h() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo2409c(Result result) {
        if (!this.f2561g.get()) {
            mo2410d(result);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Result mo2410d(Result result) {
        m2134b().obtainMessage(1, new C0741a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo2411e(Result result) {
        if (mo2408a()) {
            mo2375b(result);
        } else {
            mo2374a(result);
        }
        this.f2559e = C0743c.FINISHED;
    }

    /* renamed from: a */
    public final C0736h<Params, Progress, Result> mo2407a(Executor executor, Params... paramsArr) {
        if (this.f2559e != C0743c.PENDING) {
            switch (this.f2559e) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    throw new IllegalStateException("We should never reach this state");
            }
        } else {
            this.f2559e = C0743c.RUNNING;
            this.f2562j.f2570b = null;
            executor.execute(this.f2558d);
            return this;
        }
    }
}

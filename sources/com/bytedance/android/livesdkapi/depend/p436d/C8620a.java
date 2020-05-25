package com.bytedance.android.livesdkapi.depend.p436d;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.android.livesdkapi.depend.d.a */
public class C8620a implements Executor {

    /* renamed from: a */
    public static final String f23587a = "a";

    /* renamed from: b */
    private ArrayBlockingQueue<Runnable> f23588b;

    /* renamed from: c */
    private C8624c f23589c;

    /* renamed from: d */
    private C8623b f23590d;

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.a$a */
    public static class C8622a {

        /* renamed from: a */
        int f23591a;

        /* renamed from: b */
        C8624c f23592b;

        /* renamed from: c */
        String f23593c;
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.a$b */
    public static class C8623b implements Runnable {

        /* renamed from: a */
        public boolean f23594a;

        /* renamed from: b */
        private ArrayBlockingQueue<Runnable> f23595b;

        public final void run() {
            while (!this.f23594a) {
                try {
                    ((Runnable) this.f23595b.take()).run();
                } catch (InterruptedException unused) {
                }
            }
        }

        private C8623b(ArrayBlockingQueue<Runnable> arrayBlockingQueue) {
            this.f23595b = arrayBlockingQueue;
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.a$c */
    public interface C8624c {
        /* renamed from: a */
        void mo14291a();
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.a$d */
    static class C8625d implements ThreadFactory {

        /* renamed from: a */
        private String f23596a;

        /* renamed from: b */
        private AtomicInteger f23597b;

        private C8625d(String str) {
            this.f23597b = new AtomicInteger();
            this.f23596a = str;
        }

        public final Thread newThread(Runnable runnable) {
            int incrementAndGet = this.f23597b.incrementAndGet();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f23596a);
            sb.append("-");
            sb.append(incrementAndGet);
            Thread thread = new Thread(runnable, sb.toString());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            return thread;
        }
    }

    public void execute(Runnable runnable) {
        if (!this.f23588b.offer(runnable) && this.f23589c != null) {
            this.f23589c.mo14291a();
        }
    }

    private C8620a(int i, ThreadFactory threadFactory, C8624c cVar) {
        this.f23588b = new ArrayBlockingQueue<>(i);
        this.f23590d = new C8623b(this.f23588b);
        threadFactory.newThread(this.f23590d).start();
        this.f23589c = cVar;
    }
}

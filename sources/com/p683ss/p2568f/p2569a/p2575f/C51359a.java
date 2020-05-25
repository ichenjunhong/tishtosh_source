package com.p683ss.p2568f.p2569a.p2575f;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.f.a.f.a */
public class C51359a {

    /* renamed from: a */
    private static volatile ThreadPoolExecutor f128450a;

    /* renamed from: b */
    private static Deque<C51360a> f128451b = new ArrayDeque();

    /* renamed from: c */
    private static Deque<C51360a> f128452c = new ArrayDeque();

    /* renamed from: com.ss.f.a.f.a$a */
    public static class C51360a implements Runnable {

        /* renamed from: a */
        private Runnable f128453a;

        public final void run() {
            this.f128453a.run();
            C51359a.m110471a(this);
        }

        public C51360a(Runnable runnable) {
            this.f128453a = runnable;
        }
    }

    /* renamed from: a */
    private static ThreadPoolExecutor m110470a() {
        if (f128450a == null) {
            synchronized (C51359a.class) {
                if (f128450a == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                    f128450a = threadPoolExecutor;
                }
            }
        }
        return f128450a;
    }

    /* renamed from: a */
    public static synchronized Future m110469a(Runnable runnable) {
        synchronized (C51359a.class) {
            if (f128450a == null) {
                m110470a();
            }
            StringBuilder sb = new StringBuilder("addExecuteTask,cur thread num:");
            if (f128450a == null) {
                m110470a();
            }
            sb.append(f128450a.getPoolSize());
            C51360a aVar = new C51360a(runnable);
            if (f128452c.size() >= 5) {
                f128451b.add(aVar);
                return null;
            }
            f128452c.add(aVar);
            Future submit = f128450a.submit(aVar);
            return submit;
        }
    }

    /* renamed from: a */
    public static synchronized void m110471a(C51360a aVar) {
        synchronized (C51359a.class) {
            f128452c.remove(aVar);
            if (f128451b.size() > 0) {
                Iterator it = f128451b.iterator();
                if (it.hasNext()) {
                    C51360a aVar2 = (C51360a) it.next();
                    it.remove();
                    f128452c.add(aVar2);
                    f128450a.execute(aVar2);
                }
            }
        }
    }
}

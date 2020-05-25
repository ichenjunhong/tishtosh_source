package com.p683ss.android.ugc.aweme.base;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.ss.android.ugc.aweme.base.n */
public final class C23566n {

    /* renamed from: a */
    public static final Executor f62683a = new ScheduledThreadPoolExecutor(4);

    /* renamed from: b */
    public static C23566n f62684b;

    /* renamed from: c */
    private boolean f62685c;

    /* renamed from: d */
    private Executor f62686d;

    /* renamed from: com.ss.android.ugc.aweme.base.n$a */
    public static class C23568a {

        /* renamed from: a */
        public Executor f62690a;

        /* renamed from: a */
        public final C23568a mo48753a(Executor executor) {
            if (executor == null) {
                executor = C23566n.f62683a;
            }
            this.f62690a = executor;
            return this;
        }
    }

    /* renamed from: a */
    public static synchronized C23566n m57766a() {
        C23566n nVar;
        synchronized (C23566n.class) {
            if (f62684b == null) {
                f62684b = new C23566n();
            }
            nVar = f62684b;
        }
        return nVar;
    }

    /* renamed from: a */
    public final void mo48751a(C23568a aVar) {
        this.f62686d = aVar.f62690a;
        this.f62685c = true;
    }

    /* renamed from: a */
    private static void m57767a(C23566n nVar) {
        if (!nVar.f62685c) {
            throw new IllegalStateException("TaskManager not init");
        }
    }

    /* renamed from: b */
    private static Runnable m57768b(final Handler handler, final Callable callable, final int i) {
        return new Runnable() {
            public final void run() {
                if (handler == null) {
                    try {
                        callable.call();
                    } catch (Exception unused) {
                    }
                } else {
                    Message obtainMessage = handler.obtainMessage(i);
                    try {
                        obtainMessage.obj = callable.call();
                    } catch (Exception e) {
                        obtainMessage.obj = e;
                    }
                    handler.sendMessage(obtainMessage);
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo48750a(Handler handler, Callable callable, int i) {
        m57767a(this);
        this.f62686d.execute(m57768b(handler, callable, i));
    }
}

package com.bytedance.ies.p661d.p662a;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.bytedance.ies.d.a.b */
public final class C10632b {

    /* renamed from: a */
    public static final Executor f28171a = new ScheduledThreadPoolExecutor(4);

    /* renamed from: b */
    public static C10632b f28172b;

    /* renamed from: c */
    public static Handler f28173c;

    /* renamed from: d */
    public boolean f28174d;

    /* renamed from: e */
    public Executor f28175e;

    /* renamed from: com.bytedance.ies.d.a.b$a */
    public static class C10634a {

        /* renamed from: a */
        public Executor f28179a;
    }

    /* renamed from: a */
    public static synchronized C10632b m21416a() {
        C10632b bVar;
        synchronized (C10632b.class) {
            if (f28172b == null) {
                f28172b = new C10632b();
            }
            bVar = f28172b;
        }
        return bVar;
    }

    /* renamed from: a */
    private static void m21417a(C10632b bVar) {
        if (!bVar.f28174d) {
            throw new IllegalStateException("TaskManager not init");
        }
    }

    /* renamed from: b */
    private static Runnable m21418b(final Handler handler, final Callable callable, final int i) {
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
    public final void mo18874a(Handler handler, Callable callable, int i) {
        m21417a(this);
        this.f28175e.execute(m21418b(handler, callable, i));
    }
}

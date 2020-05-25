package com.bytedance.p785o.p786a.p787a;

import android.os.Looper;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.o.a.a.b */
public final class C12407b implements UncaughtExceptionHandler {

    /* renamed from: a */
    public boolean f32657a;

    /* renamed from: b */
    public UncaughtExceptionHandler f32658b;

    /* renamed from: c */
    public final List<C12412e> f32659c = new LinkedList();

    /* renamed from: b */
    public final boolean mo23466b(C12412e eVar) {
        boolean remove;
        synchronized (this.f32659c) {
            remove = this.f32659c.remove(eVar);
        }
        return remove;
    }

    /* renamed from: a */
    private static boolean m24985a(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            if (th instanceof OutOfMemoryError) {
                return true;
            }
            if (i > 20) {
                return false;
            }
            i++;
            try {
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo23465a(C12412e eVar) {
        boolean add;
        synchronized (this.f32659c) {
            add = this.f32659c.add(eVar);
        }
        return add;
    }

    /* renamed from: a */
    private void m24984a(Thread thread, Throwable th) {
        if (this.f32658b != null && this.f32658b != this) {
            this.f32658b.uncaughtException(thread, th);
        }
    }

    /* renamed from: b */
    private boolean m24986b(Thread thread, Throwable th) throws Throwable {
        try {
            synchronized (this.f32659c) {
                for (C12412e a : this.f32659c) {
                    if (a.mo23468a(thread, th)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            if (m24985a(th) || !m24986b(thread, th)) {
                m24984a(thread, th);
            } else if (thread != null && thread.getName().equals("main")) {
                while (true) {
                    Looper.loop();
                }
                m24984a(thread, e);
            }
        } catch (Exception e) {
            if (m24985a((Throwable) e) || !m24986b(thread, e)) {
                m24984a(thread, e);
            }
        } catch (Throwable th2) {
            m24984a(thread, th2);
        }
    }
}

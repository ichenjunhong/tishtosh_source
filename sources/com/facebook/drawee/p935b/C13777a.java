package com.facebook.drawee.p935b;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.p920d.C13689i;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.drawee.b.a */
public final class C13777a {

    /* renamed from: d */
    private static C13777a f35866d;

    /* renamed from: a */
    public final Set<C13779a> f35867a = new HashSet();

    /* renamed from: b */
    public final Handler f35868b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Runnable f35869c = new Runnable() {
        public final void run() {
            C13777a.m27906b();
            for (C13779a d : C13777a.this.f35867a) {
                d.mo25730d();
            }
            C13777a.this.f35867a.clear();
        }
    };

    /* renamed from: com.facebook.drawee.b.a$a */
    public interface C13779a {
        /* renamed from: d */
        void mo25730d();
    }

    /* renamed from: a */
    public static synchronized C13777a m27905a() {
        C13777a aVar;
        synchronized (C13777a.class) {
            if (f35866d == null) {
                f35866d = new C13777a();
            }
            aVar = f35866d;
        }
        return aVar;
    }

    /* renamed from: b */
    public static void m27906b() {
        boolean z;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27657b(z);
    }

    /* renamed from: a */
    public final void mo25728a(C13779a aVar) {
        m27906b();
        this.f35867a.remove(aVar);
    }
}

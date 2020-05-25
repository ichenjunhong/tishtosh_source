package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.measurement.C16590cg;

/* renamed from: com.google.android.gms.measurement.internal.fc */
abstract class C17119fc {

    /* renamed from: c */
    private static volatile Handler f48331c;

    /* renamed from: a */
    volatile long f48332a;

    /* renamed from: b */
    private final C17030bw f48333b;

    /* renamed from: d */
    private final Runnable f48334d;

    C17119fc(C17030bw bwVar) {
        C15464q.m32123a(bwVar);
        this.f48333b = bwVar;
        this.f48334d = new C17120fd(this, bwVar);
    }

    /* renamed from: a */
    public abstract void mo33040a();

    /* renamed from: a */
    public final void mo33344a(long j) {
        mo33346c();
        if (j >= 0) {
            this.f48332a = this.f48333b.mo32849l().mo28523a();
            if (!m41870d().postDelayed(this.f48334d, j)) {
                this.f48333b.mo32854q().f48445b.mo33377a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo33345b() {
        return this.f48332a != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo33346c() {
        this.f48332a = 0;
        m41870d().removeCallbacks(this.f48334d);
    }

    /* renamed from: d */
    private final Handler m41870d() {
        Handler handler;
        if (f48331c != null) {
            return f48331c;
        }
        synchronized (C17119fc.class) {
            if (f48331c == null) {
                f48331c = new C16590cg(this.f48333b.mo32850m().getMainLooper());
            }
            handler = f48331c;
        }
        return handler;
    }
}

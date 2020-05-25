package com.google.android.gms.internal.measurement;

import android.os.Handler;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.internal.measurement.aw */
abstract class C16552aw {

    /* renamed from: c */
    private static volatile Handler f46493c;

    /* renamed from: a */
    final C16862t f46494a;

    /* renamed from: b */
    volatile long f46495b;

    /* renamed from: d */
    private final Runnable f46496d = new C16553ax(this);

    C16552aw(C16862t tVar) {
        C15464q.m32123a(tVar);
        this.f46494a = tVar;
    }

    /* renamed from: a */
    public abstract void mo31793a();

    /* renamed from: a */
    public final void mo31811a(long j) {
        mo31815d();
        if (j >= 0) {
            this.f46495b = this.f46494a.f47336c.mo28523a();
            if (!m39493e().postDelayed(this.f46496d, j)) {
                this.f46494a.mo32518a().mo32501d("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final void mo31813b(long j) {
        if (mo31814c()) {
            if (j < 0) {
                mo31815d();
                return;
            }
            long abs = j - Math.abs(this.f46494a.f47336c.mo28523a() - this.f46495b);
            if (abs < 0) {
                abs = 0;
            }
            m39493e().removeCallbacks(this.f46496d);
            if (!m39493e().postDelayed(this.f46496d, abs)) {
                this.f46494a.mo32518a().mo32501d("Failed to adjust delayed post. time", Long.valueOf(abs));
            }
        }
    }

    /* renamed from: b */
    public final long mo31812b() {
        if (this.f46495b == 0) {
            return 0;
        }
        return Math.abs(this.f46494a.f47336c.mo28523a() - this.f46495b);
    }

    /* renamed from: c */
    public final boolean mo31814c() {
        return this.f46495b != 0;
    }

    /* renamed from: d */
    public final void mo31815d() {
        this.f46495b = 0;
        m39493e().removeCallbacks(this.f46496d);
    }

    /* renamed from: e */
    private final Handler m39493e() {
        Handler handler;
        if (f46493c != null) {
            return f46493c;
        }
        synchronized (C16552aw.class) {
            if (f46493c == null) {
                f46493c = new C16590cg(this.f46494a.f47334a.getMainLooper());
            }
            handler = f46493c;
        }
        return handler;
    }
}

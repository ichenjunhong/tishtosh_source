package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.p030v4.content.C0708a;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.internal.C15342k;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.auth.api.signin.internal.e */
public final class C15150e extends C0708a<Void> implements C15342k {

    /* renamed from: f */
    private Semaphore f39189f = new Semaphore(0);

    /* renamed from: g */
    private Set<C15233f> f39190g;

    public C15150e(Context context, Set<C15233f> set) {
        super(context);
        this.f39190g = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final Void mo2371d() {
        int i = 0;
        for (C15233f a : this.f39190g) {
            if (a.mo28103a((C15342k) this)) {
                i++;
            }
        }
        try {
            this.f39189f.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        return null;
    }

    /* renamed from: g */
    public final void mo2388g() {
        this.f39189f.drainPermits();
        mo2394l();
    }

    /* renamed from: f */
    public final void mo27961f() {
        this.f39189f.release();
    }
}

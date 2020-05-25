package com.bytedance.als;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import com.bytedance.als.C2759d;

/* renamed from: com.bytedance.als.h */
public abstract class C2764h<T extends C2759d> implements C0184k {

    /* renamed from: a */
    private final C0185l f8329a = new C0185l(this);

    /* renamed from: a */
    public abstract T mo7353a();

    public void bM_() {
        this.f8329a.mo332a(C0177a.ON_PAUSE);
    }

    public void bN_() {
        this.f8329a.mo332a(C0177a.ON_DESTROY);
    }

    public void bO_() {
        this.f8329a.mo332a(C0177a.ON_CREATE);
    }

    public final C0176h getLifecycle() {
        return this.f8329a;
    }

    /* renamed from: s_ */
    public void mo7357s_() {
        this.f8329a.mo332a(C0177a.ON_START);
    }

    /* renamed from: t_ */
    public void mo7358t_() {
        this.f8329a.mo332a(C0177a.ON_RESUME);
    }

    /* renamed from: u_ */
    public void mo7359u_() {
        this.f8329a.mo332a(C0177a.ON_STOP);
    }
}

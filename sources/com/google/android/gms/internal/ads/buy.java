package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class buy implements bwh {

    /* renamed from: a */
    private WeakReference<C15839dq> f44027a;

    public buy(C15839dq dqVar) {
        this.f44027a = new WeakReference<>(dqVar);
    }

    /* renamed from: a */
    public final View mo30767a() {
        C15839dq dqVar = (C15839dq) this.f44027a.get();
        if (dqVar != null) {
            return dqVar.mo31040o();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo30768b() {
        return this.f44027a.get() == null;
    }

    /* renamed from: c */
    public final bwh mo30769c() {
        return new bva((C15839dq) this.f44027a.get());
    }
}

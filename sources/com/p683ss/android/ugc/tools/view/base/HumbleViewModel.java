package com.p683ss.android.ugc.tools.view.base;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0209x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.tools.view.base.HumbleViewModel */
public abstract class HumbleViewModel extends C0209x implements C0183j {

    /* renamed from: a */
    private final C0184k f125791a;

    /* renamed from: c */
    public boolean f125792c;

    /* renamed from: a */
    private final void mo64559a() {
        if (!this.f125792c) {
            this.f125792c = true;
            onCleared();
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        mo64559a();
        this.f125791a.getLifecycle().mo325b(this);
    }

    public HumbleViewModel(C0184k kVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        this.f125791a = kVar;
        C0176h lifecycle = this.f125791a.getLifecycle();
        C52711k.m112236a((Object) lifecycle, "lifecycleOwner.lifecycle");
        if (lifecycle.mo323a() == C0178b.DESTROYED) {
            mo64559a();
        } else {
            this.f125791a.getLifecycle().mo324a(this);
        }
    }
}

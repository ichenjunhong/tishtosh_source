package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

public class LifecycleAwareObserver_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final LifecycleAwareObserver f31472a;

    LifecycleAwareObserver_LifecycleAdapter(LifecycleAwareObserver lifecycleAwareObserver) {
        this.f31472a = lifecycleAwareObserver;
    }

    /* renamed from: a */
    public final void mo313a(C0184k kVar, C0177a aVar, boolean z, C0197q qVar) {
        boolean z2;
        if (qVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!z2 || qVar.mo344a("onLifecycleEvent", 2)) {
                this.f31472a.onLifecycleEvent(kVar);
            }
        } else if (aVar == C0177a.ON_DESTROY) {
            if (!z2 || qVar.mo344a("onDestroy", 1)) {
                this.f31472a.onDestroy();
            }
        }
    }
}

package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

public class lifecycleAwareLazy_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final lifecycleAwareLazy f31611a;

    lifecycleAwareLazy_LifecycleAdapter(lifecycleAwareLazy lifecycleawarelazy) {
        this.f31611a = lifecycleawarelazy;
    }

    /* renamed from: a */
    public final void mo313a(C0184k kVar, C0177a aVar, boolean z, C0197q qVar) {
        boolean z2;
        if (qVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && aVar == C0177a.ON_CREATE) {
            if (!z2 || qVar.mo344a("onStart", 1)) {
                this.f31611a.onStart();
            }
        }
    }
}

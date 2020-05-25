package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

public class JediViewHolderProxy_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final JediViewHolderProxy f31690a;

    JediViewHolderProxy_LifecycleAdapter(JediViewHolderProxy jediViewHolderProxy) {
        this.f31690a = jediViewHolderProxy;
    }

    /* renamed from: a */
    public final void mo313a(C0184k kVar, C0177a aVar, boolean z, C0197q qVar) {
        boolean z2;
        if (qVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (aVar == C0177a.ON_CREATE) {
                if (!z2 || qVar.mo344a("onCreate", 1)) {
                    this.f31690a.onCreate();
                }
            } else if (aVar == C0177a.ON_START) {
                if (!z2 || qVar.mo344a("onStart", 1)) {
                    this.f31690a.onStart();
                }
            } else if (aVar == C0177a.ON_STOP) {
                if (!z2 || qVar.mo344a("onStop", 1)) {
                    this.f31690a.onStop();
                }
            } else if (aVar == C0177a.ON_DESTROY) {
                if (!z2 || qVar.mo344a("onDestroy", 1)) {
                    this.f31690a.onDestroy();
                }
            }
        }
    }
}

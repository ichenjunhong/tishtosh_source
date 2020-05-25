package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

public class JediViewHolder_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final JediViewHolder f31635a;

    JediViewHolder_LifecycleAdapter(JediViewHolder jediViewHolder) {
        this.f31635a = jediViewHolder;
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
                if (!z2 || qVar.mo344a("create$ext_adapter_release", 1)) {
                    this.f31635a.create$ext_adapter_release();
                }
            } else if (aVar == C0177a.ON_START) {
                if (!z2 || qVar.mo344a("start$ext_adapter_release", 1)) {
                    this.f31635a.start$ext_adapter_release();
                }
            } else if (aVar == C0177a.ON_RESUME) {
                if (!z2 || qVar.mo344a("resume$ext_adapter_release", 1)) {
                    this.f31635a.resume$ext_adapter_release();
                }
            } else if (aVar == C0177a.ON_PAUSE) {
                if (!z2 || qVar.mo344a("pause$ext_adapter_release", 1)) {
                    this.f31635a.pause$ext_adapter_release();
                }
            } else if (aVar == C0177a.ON_STOP) {
                if (!z2 || qVar.mo344a("stop$ext_adapter_release", 1)) {
                    this.f31635a.stop$ext_adapter_release();
                }
            } else if (aVar == C0177a.ON_DESTROY) {
                if (!z2 || qVar.mo344a("destroy$ext_adapter_release", 1)) {
                    this.f31635a.destroy$ext_adapter_release();
                }
            }
        }
    }
}

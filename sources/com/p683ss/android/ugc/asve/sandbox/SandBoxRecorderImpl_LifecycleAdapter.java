package com.p683ss.android.ugc.asve.sandbox;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

/* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRecorderImpl_LifecycleAdapter */
public class SandBoxRecorderImpl_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final SandBoxRecorderImpl f56395a;

    SandBoxRecorderImpl_LifecycleAdapter(SandBoxRecorderImpl sandBoxRecorderImpl) {
        this.f56395a = sandBoxRecorderImpl;
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
                    this.f56395a.onCreate();
                }
            } else if (aVar == C0177a.ON_START) {
                if (!z2 || qVar.mo344a("onStart", 1)) {
                    this.f56395a.onStart();
                }
            } else if (aVar == C0177a.ON_RESUME) {
                if (!z2 || qVar.mo344a("onResume", 1)) {
                    this.f56395a.onResume();
                }
            } else if (aVar == C0177a.ON_STOP) {
                if (!z2 || qVar.mo344a("onStop", 1)) {
                    this.f56395a.onStop();
                }
            } else if (aVar == C0177a.ON_PAUSE) {
                if (!z2 || qVar.mo344a("onPause", 1)) {
                    this.f56395a.onPause();
                }
            } else if (aVar == C0177a.ON_DESTROY) {
                if (!z2 || qVar.mo344a("onDestroy", 1)) {
                    this.f56395a.onDestroy();
                }
            }
        }
    }
}

package com.p683ss.android.ugc.asve.recorder.camera;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController_LifecycleAdapter */
public class VECameraController_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final VECameraController f56080a;

    VECameraController_LifecycleAdapter(VECameraController vECameraController) {
        this.f56080a = vECameraController;
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
                    this.f56080a.onCreate();
                }
            } else if (aVar == C0177a.ON_STOP) {
                if (!z2 || qVar.mo344a("onStop", 1)) {
                    this.f56080a.onStop();
                }
            } else if (aVar == C0177a.ON_START) {
                if (!z2 || qVar.mo344a("onResume", 1)) {
                    this.f56080a.onResume();
                }
            } else if (aVar == C0177a.ON_DESTROY) {
                if (!z2 || qVar.mo344a("onDestroy", 1)) {
                    this.f56080a.onDestroy();
                }
            }
        }
    }
}

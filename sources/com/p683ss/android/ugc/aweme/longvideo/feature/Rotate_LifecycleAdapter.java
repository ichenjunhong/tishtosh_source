package com.p683ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.Rotate_LifecycleAdapter */
public class Rotate_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final Rotate f93132a;

    Rotate_LifecycleAdapter(Rotate rotate) {
        this.f93132a = rotate;
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
            if (aVar == C0177a.ON_RESUME) {
                if (!z2 || qVar.mo344a("onResume", 1)) {
                    this.f93132a.onResume();
                }
            } else if (aVar == C0177a.ON_STOP) {
                if (!z2 || qVar.mo344a("onStop", 1)) {
                    this.f93132a.onStop();
                }
            } else if (aVar == C0177a.ON_DESTROY) {
                if (!z2 || qVar.mo344a("onDestroy", 1)) {
                    this.f93132a.onDestroy();
                }
            }
        }
    }
}

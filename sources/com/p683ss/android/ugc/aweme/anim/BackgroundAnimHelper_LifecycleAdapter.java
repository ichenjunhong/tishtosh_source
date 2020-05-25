package com.p683ss.android.ugc.aweme.anim;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

/* renamed from: com.ss.android.ugc.aweme.anim.BackgroundAnimHelper_LifecycleAdapter */
public class BackgroundAnimHelper_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final BackgroundAnimHelper f60868a;

    BackgroundAnimHelper_LifecycleAdapter(BackgroundAnimHelper backgroundAnimHelper) {
        this.f60868a = backgroundAnimHelper;
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
                if (!z2 || qVar.mo344a("resumeAnim", 1)) {
                    this.f60868a.resumeAnim();
                }
            } else if (aVar == C0177a.ON_PAUSE) {
                if (!z2 || qVar.mo344a("stopAnim", 1)) {
                    this.f60868a.stopAnim();
                }
            }
        }
    }
}

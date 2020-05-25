package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.AdPopUpWebPageContainer_LifecycleAdapter */
public class AdPopUpWebPageContainer_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final AdPopUpWebPageContainer f71476a;

    AdPopUpWebPageContainer_LifecycleAdapter(AdPopUpWebPageContainer adPopUpWebPageContainer) {
        this.f71476a = adPopUpWebPageContainer;
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
                    this.f71476a.onResume();
                }
            } else if (aVar == C0177a.ON_PAUSE) {
                if (!z2 || qVar.mo344a("onPause", 1)) {
                    this.f71476a.onPause();
                }
            } else if (aVar == C0177a.ON_DESTROY) {
                if (!z2 || qVar.mo344a("onDestroy", 1)) {
                    this.f71476a.onDestroy();
                }
            }
        }
    }
}

package com.p683ss.android.ugc.aweme.live.alphaplayer;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.PlayerController_LifecycleAdapter */
public class PlayerController_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final PlayerController f92334a;

    PlayerController_LifecycleAdapter(PlayerController playerController) {
        this.f92334a = playerController;
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
            if (aVar == C0177a.ON_PAUSE) {
                if (!z2 || qVar.mo344a("onPause", 1)) {
                    this.f92334a.onPause();
                }
            } else if (aVar == C0177a.ON_RESUME) {
                if (!z2 || qVar.mo344a("onResume", 1)) {
                    this.f92334a.onResume();
                }
            } else if (aVar == C0177a.ON_STOP) {
                if (!z2 || qVar.mo344a("onStop", 1)) {
                    this.f92334a.onStop();
                }
            } else if (aVar == C0177a.ON_DESTROY) {
                if (!z2 || qVar.mo344a("onDestroy", 1)) {
                    this.f92334a.onDestroy();
                }
            }
        }
    }
}

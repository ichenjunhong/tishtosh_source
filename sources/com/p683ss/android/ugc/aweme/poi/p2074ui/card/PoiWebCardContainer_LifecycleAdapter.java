package com.p683ss.android.ugc.aweme.poi.p2074ui.card;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.card.PoiWebCardContainer_LifecycleAdapter */
public class PoiWebCardContainer_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final PoiWebCardContainer f100453a;

    PoiWebCardContainer_LifecycleAdapter(PoiWebCardContainer poiWebCardContainer) {
        this.f100453a = poiWebCardContainer;
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
                    this.f100453a.onCreate();
                }
            } else if (aVar == C0177a.ON_RESUME) {
                if (!z2 || qVar.mo344a("onResume", 1)) {
                    this.f100453a.onResume();
                }
            } else if (aVar == C0177a.ON_PAUSE) {
                if (!z2 || qVar.mo344a("onPause", 1)) {
                    this.f100453a.onPause();
                }
            } else if (aVar == C0177a.ON_DESTROY) {
                if (!z2 || qVar.mo344a("onDestroy", 1)) {
                    this.f100453a.onDestroy();
                }
            }
        }
    }
}

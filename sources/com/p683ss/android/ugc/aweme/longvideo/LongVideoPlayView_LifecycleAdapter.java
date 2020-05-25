package com.p683ss.android.ugc.aweme.longvideo;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

/* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayView_LifecycleAdapter */
public class LongVideoPlayView_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final LongVideoPlayView f93057a;

    LongVideoPlayView_LifecycleAdapter(LongVideoPlayView longVideoPlayView) {
        this.f93057a = longVideoPlayView;
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
                    this.f93057a.onResume();
                }
            } else if (aVar == C0177a.ON_PAUSE) {
                if (!z2 || qVar.mo344a("onPause", 1)) {
                    this.f93057a.onPause();
                }
            } else if (aVar == C0177a.ON_DESTROY) {
                if (!z2 || qVar.mo344a("onDestroy", 1)) {
                    this.f93057a.onDestroy();
                }
            }
        }
    }
}

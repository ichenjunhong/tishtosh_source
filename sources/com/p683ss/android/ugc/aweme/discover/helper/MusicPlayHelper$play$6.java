package com.p683ss.android.ugc.aweme.discover.helper;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$play$6 */
public final class MusicPlayHelper$play$6 implements GenericLifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ MusicPlayHelper f74004a;

    MusicPlayHelper$play$6(MusicPlayHelper musicPlayHelper) {
        this.f74004a = musicPlayHelper;
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        if (aVar != null && aVar == C0177a.ON_PAUSE) {
            this.f74004a.mo56585a();
        }
    }
}

package com.bytedance.android.livesdk.chatroom;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.support.p030v4.app.FragmentActivity;

public final /* synthetic */ class LiveOntologyInfoManager$$Lambda$0 implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C4995b f13303a;

    public LiveOntologyInfoManager$$Lambda$0(C4995b bVar) {
        this.f13303a = bVar;
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        C4995b bVar = this.f13303a;
        if ((kVar instanceof FragmentActivity) && ((FragmentActivity) kVar).isFinishing() && C0177a.ON_DESTROY.equals(aVar) && kVar.hashCode() == bVar.f13382d) {
            bVar.f13380b = false;
            bVar.f13381c = null;
            kVar.getLifecycle().mo325b(bVar.f13383e);
        }
    }
}

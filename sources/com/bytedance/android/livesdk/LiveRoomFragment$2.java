package com.bytedance.android.livesdk;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.livesdk.rank.C8123a;

class LiveRoomFragment$2 implements GenericLifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ FragmentActivity f12231a;

    /* renamed from: b */
    final /* synthetic */ C6752f f12232b;

    LiveRoomFragment$2(C6752f fVar, FragmentActivity fragmentActivity) {
        this.f12232b = fVar;
        this.f12231a = fragmentActivity;
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        if (this.f12231a.isFinishing() && aVar.equals(C0177a.ON_DESTROY)) {
            this.f12232b.mo12875f();
            if (this.f12232b.f18475o.mo15417a() == this.f12232b.f18466f) {
                this.f12232b.f18475o.mo15418a(null);
            }
            C8123a.f22180a = null;
        }
    }
}

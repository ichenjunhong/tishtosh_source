package com.bytedance.android.livesdk.chatroom.p325ui;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.support.p030v4.app.FragmentActivity;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$9 */
class LivePlayFragment$9 implements GenericLifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ C6025ce f15518a;

    LivePlayFragment$9(C6025ce ceVar) {
        this.f15518a = ceVar;
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        if (aVar.equals(C0177a.ON_START) && this.f15518a.f16077y != null) {
            FragmentActivity activity = this.f15518a.getActivity();
            if (!(activity == null || activity.getWindow() == null || this.f15518a.f16064l != 1 || this.f15518a.f16077y == null || this.f15518a.mo12068w().mo12874e() == null)) {
                this.f15518a.mo12068w().mo12874e().mo12893a(true, this.f15518a.f16077y.getView(), this.f15518a.f16077y.f15800i, this.f15518a.f16077y.f15801j, this.f15518a.f16077y.mo11918h());
            }
        }
    }
}

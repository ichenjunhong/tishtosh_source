package com.bytedance.android.livesdk.chatroom.p325ui;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment$13 */
class LivePlayFragment$13 implements GenericLifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ C6025ce f15517a;

    LivePlayFragment$13(C6025ce ceVar) {
        this.f15517a = ceVar;
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        if (aVar.equals(C0177a.ON_START) && this.f15517a.mo12068w().mo12874e() != null) {
            this.f15517a.mo12068w().mo12874e().mo12892a(this.f15517a.f15993A.getView(), this.f15517a.f15993A.f13695a);
        }
    }
}

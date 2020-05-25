package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5258d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.be */
final /* synthetic */ class C5981be implements C1710e {

    /* renamed from: a */
    private final C5977ba f15861a;

    C5981be(C5977ba baVar) {
        this.f15861a = baVar;
    }

    public final void accept(Object obj) {
        C5977ba baVar = this.f15861a;
        C4176c cVar = (C4176c) obj;
        baVar.f15844d = false;
        baVar.f15842b = new C5258d(baVar, C5977ba.m13053a(cVar.f11365b), baVar.f15845e);
        baVar.f15846f.setAdapter(baVar.f15842b);
    }
}

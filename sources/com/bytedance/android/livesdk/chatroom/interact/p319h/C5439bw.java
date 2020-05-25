package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5423bh.C5424a;
import com.bytedance.android.livesdk.user.C8335g;
import p064c.p065a.C1683ag;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.bw */
final /* synthetic */ class C5439bw implements C1710e {

    /* renamed from: a */
    private final C5423bh f14429a;

    C5439bw(C5423bh bhVar) {
        this.f14429a = bhVar;
    }

    public final void accept(Object obj) {
        C5423bh bhVar = this.f14429a;
        C4177d dVar = (C4177d) obj;
        bhVar.f14403d = false;
        ((C5424a) bhVar.mo8518c()).mo11329a();
        C4639e.m11122a().mo10414a(Integer.valueOf(2));
        TTLiveSDKContext.getHostService().mo10315h().mo14535e().mo6159b((C1683ag<? super T>) new C8335g<Object>());
    }
}

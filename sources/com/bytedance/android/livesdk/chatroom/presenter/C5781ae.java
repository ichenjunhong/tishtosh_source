package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.presenter.C5779ad.C5780a;
import com.bytedance.android.livesdk.gift.relay.p381a.C7630b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ae */
public final /* synthetic */ class C5781ae implements C1710e {

    /* renamed from: a */
    private final C5779ad f15228a;

    public C5781ae(C5779ad adVar) {
        this.f15228a = adVar;
    }

    public final void accept(Object obj) {
        C5779ad adVar = this.f15228a;
        C4177d dVar = (C4177d) obj;
        if (dVar != null && dVar.data != null) {
            ((C5780a) adVar.mo8518c()).mo11669a(((C7630b) dVar.data).f20982a);
        }
    }
}

package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.presenter.C5784ah.C5785a;
import com.bytedance.android.livesdk.gift.relay.p381a.C7630b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ai */
public final /* synthetic */ class C5786ai implements C1710e {

    /* renamed from: a */
    private final C5784ah f15232a;

    public C5786ai(C5784ah ahVar) {
        this.f15232a = ahVar;
    }

    public final void accept(Object obj) {
        C5784ah ahVar = this.f15232a;
        C4177d dVar = (C4177d) obj;
        if (dVar != null && dVar.data != null) {
            ((C5785a) ahVar.mo8518c()).mo11672a(((C7630b) dVar.data).f20982a);
        }
    }
}

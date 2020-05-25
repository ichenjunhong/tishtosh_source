package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5770y;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.eb */
final /* synthetic */ class C6130eb implements C1710e {

    /* renamed from: a */
    private final C6118ds f16437a;

    C6130eb(C6118ds dsVar) {
        this.f16437a = dsVar;
    }

    public final void accept(Object obj) {
        C6118ds dsVar = this.f16437a;
        C4177d dVar = (C4177d) obj;
        dsVar.f16406h.setVisibility(4);
        dsVar.f16407i.setVisibility(4);
        dsVar.f16405g.setAdapter(new C6133ee(dsVar.getContext(), ((C5770y) dVar.data).f15207f));
        dsVar.f16405g.setVisibility(0);
    }
}

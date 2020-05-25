package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5529ew.C5534b;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5690a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fj */
final /* synthetic */ class C5548fj implements C1710e {

    /* renamed from: a */
    private final C5529ew f14604a;

    C5548fj(C5529ew ewVar) {
        this.f14604a = ewVar;
    }

    public final void accept(Object obj) {
        C5529ew ewVar = this.f14604a;
        C4175b bVar = (C4175b) obj;
        ewVar.f14575b = false;
        if (bVar.extra == null) {
            ((C5534b) ewVar.mo8518c()).mo11084b(new Exception());
        } else {
            ((C5534b) ewVar.mo8518c()).mo11085b(((C5690a) bVar.extra).f14919a, ((C5690a) bVar.extra).f14920b);
        }
    }
}

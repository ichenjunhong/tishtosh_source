package com.bytedance.android.livesdk.chatroom.interact.p319h;

import java.util.ArrayList;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ee */
final /* synthetic */ class C5509ee implements C1710e {

    /* renamed from: a */
    private final C5506ec f14540a;

    C5509ee(C5506ec ecVar) {
        this.f14540a = ecVar;
    }

    public final void accept(Object obj) {
        C5506ec ecVar = this.f14540a;
        String str = (String) obj;
        List list = (List) ecVar.f14538a.get("data_inroom_banner_pending_data");
        if (list == null) {
            list = new ArrayList();
        }
        list.add(str);
        ecVar.f14538a.lambda$put$1$DataCenter("data_inroom_banner_pending_data", list);
    }
}

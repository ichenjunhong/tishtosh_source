package com.bytedance.android.livesdk.chatroom.interact.p319h;

import java.util.ArrayList;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.hb */
final /* synthetic */ class C5598hb implements C1710e {

    /* renamed from: a */
    private final C5592gx f14686a;

    C5598hb(C5592gx gxVar) {
        this.f14686a = gxVar;
    }

    public final void accept(Object obj) {
        C5592gx gxVar = this.f14686a;
        String str = (String) obj;
        List list = (List) gxVar.f14670a.get("data_banner_pending_data");
        if (list == null) {
            list = new ArrayList();
        }
        list.add(str);
        gxVar.f14670a.lambda$put$1$DataCenter("data_banner_pending_data", list);
    }
}

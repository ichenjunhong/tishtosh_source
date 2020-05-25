package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.chatroom.interact.p319h.C5575gh.C5576a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.gr */
final /* synthetic */ class C5586gr implements C1710e {

    /* renamed from: a */
    private final C5575gh f14664a;

    C5586gr(C5575gh ghVar) {
        this.f14664a = ghVar;
    }

    public final void accept(Object obj) {
        C5575gh ghVar = this.f14664a;
        Long l = (Long) obj;
        if (ghVar.mo8518c() != null) {
            if (l.longValue() <= 0) {
                ghVar.f14645b.dispose();
                ghVar.f14645b = null;
                return;
            }
            ((C5576a) ghVar.mo8518c()).mo11482a(l.intValue() * 50, 5000);
        }
    }
}

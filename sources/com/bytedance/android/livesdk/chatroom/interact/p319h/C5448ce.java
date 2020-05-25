package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5423bh.C5424a;
import com.bytedance.android.livesdk.message.model.C7829bd;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ce */
final /* synthetic */ class C5448ce implements C1710e {

    /* renamed from: a */
    private final C5423bh f14439a;

    /* renamed from: b */
    private final C7829bd f14440b;

    C5448ce(C5423bh bhVar, C7829bd bdVar) {
        this.f14439a = bhVar;
        this.f14440b = bdVar;
    }

    public final void accept(Object obj) {
        C5423bh bhVar = this.f14439a;
        C7829bd bdVar = this.f14440b;
        C4177d dVar = (C4177d) obj;
        if (dVar != null) {
            ((C5424a) bhVar.mo8518c()).mo11331a(bdVar.f21572j, dVar, bdVar.f21587y, bdVar.f21588z, bdVar.f21559C);
        }
    }
}

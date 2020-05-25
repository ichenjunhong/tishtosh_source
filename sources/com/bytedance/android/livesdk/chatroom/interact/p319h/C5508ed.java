package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.livesdk.message.model.C7829bd;
import com.google.gson.C18085o;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ed */
final /* synthetic */ class C5508ed implements C1711f {

    /* renamed from: a */
    static final C1711f f14539a = new C5508ed();

    private C5508ed() {
    }

    public final Object apply(Object obj) {
        IMessage iMessage = (IMessage) obj;
        if (!(iMessage instanceof C7829bd)) {
            return C2942b.m8369a().mo34889b(iMessage);
        }
        C7829bd bdVar = (C7829bd) iMessage;
        C18085o oVar = new C18085o();
        oVar.mo35017a("extra", C2942b.m8369a().mo34875a((Object) bdVar));
        if (bdVar.baseMessage != null) {
            oVar.mo35017a("common", C2942b.m8369a().mo34875a((Object) bdVar.baseMessage));
        }
        return oVar.toString();
    }
}

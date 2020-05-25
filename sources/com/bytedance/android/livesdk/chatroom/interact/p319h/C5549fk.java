package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5529ew.C5534b;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5690a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fk */
final /* synthetic */ class C5549fk implements C1710e {

    /* renamed from: a */
    private final C5529ew f14605a;

    C5549fk(C5529ew ewVar) {
        this.f14605a = ewVar;
    }

    public final void accept(Object obj) {
        C5529ew ewVar = this.f14605a;
        Throwable th = (Throwable) obj;
        ewVar.mo11751c(th);
        ewVar.f14575b = false;
        if (th instanceof C2949a) {
            C2949a aVar = (C2949a) th;
            if (aVar.getErrorCode() == 31002) {
                C5690a aVar2 = (C5690a) C2942b.m8369a().mo34884a(aVar.getExtra(), C5690a.class);
                if (aVar2 == null) {
                    ((C5534b) ewVar.mo8518c()).mo11084b(aVar);
                } else {
                    ((C5534b) ewVar.mo8518c()).mo11082a(aVar2.f14919a, aVar2.f14920b);
                }
            } else {
                ((C5534b) ewVar.mo8518c()).mo11084b(aVar);
            }
            return;
        }
        ((C5534b) ewVar.mo8518c()).mo11084b(th);
    }
}

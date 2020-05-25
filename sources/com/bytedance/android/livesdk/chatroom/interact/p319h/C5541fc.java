package com.bytedance.android.livesdk.chatroom.interact.p319h;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fc */
final /* synthetic */ class C5541fc implements C1710e {

    /* renamed from: a */
    private final C5529ew f14597a;

    C5541fc(C5529ew ewVar) {
        this.f14597a = ewVar;
    }

    public final void accept(Object obj) {
        C5529ew ewVar = this.f14597a;
        Throwable th = (Throwable) obj;
        ewVar.mo11751c(th);
        ewVar.f14576c = false;
        ewVar.f14584k.mo10414a(Integer.valueOf(0));
        if (ewVar.f14583j != null) {
            ewVar.f14583j.mo11449b(th);
        }
    }
}

package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7505d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.aj */
final /* synthetic */ class C5932aj implements C1710e {

    /* renamed from: a */
    private final C5929ah f15619a;

    /* renamed from: b */
    private final C7505d f15620b;

    C5932aj(C5929ah ahVar, C7505d dVar) {
        this.f15619a = ahVar;
        this.f15620b = dVar;
    }

    public final void accept(Object obj) {
        C5929ah ahVar = this.f15619a;
        C7505d dVar = this.f15620b;
        Throwable th = (Throwable) obj;
        ahVar.f15601e = false;
        C7647s.m15649a(ahVar.f15598b, ahVar.f15597a.getId(), th);
        if (dVar != null && dVar.f20539H) {
            C7647s.m15647a(ahVar.f15598b, ahVar.f15597a.getId(), 1, "gift_guide", th);
        }
        if (ahVar.f15599c != null) {
            if (th instanceof C2949a) {
                C2949a aVar = (C2949a) th;
                if (40001 == aVar.getErrorCode()) {
                    ahVar.f15599c.mo9491a();
                } else {
                    ahVar.f15599c.mo9493a(aVar.getPrompt());
                }
            } else {
                ahVar.f15599c.mo9494b();
            }
        }
    }
}

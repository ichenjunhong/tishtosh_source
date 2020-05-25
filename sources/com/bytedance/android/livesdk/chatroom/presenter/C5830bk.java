package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.livesdk.message.model.C7833bh;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bk */
final /* synthetic */ class C5830bk implements C1710e {

    /* renamed from: a */
    private final C5821bf f15291a;

    C5830bk(C5821bf bfVar) {
        this.f15291a = bfVar;
    }

    public final void accept(Object obj) {
        C5821bf bfVar = this.f15291a;
        C4176c cVar = (C4176c) obj;
        for (C7833bh bhVar : cVar.f11365b) {
            bhVar.timestamp = cVar.f11366c.now;
            if (bhVar.f21614i) {
                bhVar.f21628w = true;
            }
            bfVar.onMessage(bhVar);
        }
    }
}

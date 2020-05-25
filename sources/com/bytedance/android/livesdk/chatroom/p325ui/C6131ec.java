package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.live.core.p224c.C3831a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ec */
final /* synthetic */ class C6131ec implements C1710e {

    /* renamed from: a */
    private final C6118ds f16438a;

    C6131ec(C6118ds dsVar) {
        this.f16438a = dsVar;
    }

    public final void accept(Object obj) {
        C6118ds dsVar = this.f16438a;
        C3831a.m9714b("RushRedEnvelopeDialog", (Throwable) obj);
        dsVar.f16405g.setVisibility(4);
        dsVar.f16406h.setVisibility(4);
        dsVar.f16407i.setVisibility(0);
        dsVar.f16407i.setOnClickListener(dsVar);
    }
}

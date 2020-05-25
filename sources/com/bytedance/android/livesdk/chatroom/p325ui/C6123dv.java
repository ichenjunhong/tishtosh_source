package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.p279af.C4602l;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dv */
final /* synthetic */ class C6123dv implements C1710e {

    /* renamed from: a */
    private final C6118ds f16429a;

    C6123dv(C6118ds dsVar) {
        this.f16429a = dsVar;
    }

    public final void accept(Object obj) {
        C6118ds dsVar = this.f16429a;
        Throwable th = (Throwable) obj;
        C3831a.m9714b("RushRedEnvelopeDialog", th);
        dsVar.mo12156c();
        dsVar.f16404f.setOnClickListener(dsVar);
        C4602l.m11046a(dsVar.getContext(), th);
    }
}

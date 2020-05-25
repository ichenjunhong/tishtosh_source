package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ay */
public final /* synthetic */ class C5805ay implements C1710e {

    /* renamed from: a */
    private final C5793ao f15255a;

    public C5805ay(C5793ao aoVar) {
        this.f15255a = aoVar;
    }

    public final void accept(Object obj) {
        C5793ao aoVar = this.f15255a;
        C8686a aVar = (C8686a) obj;
        aoVar.f15243g = false;
        if (aoVar.f15237a != null) {
            aoVar.f15237a.mo11680a(aVar);
        }
    }
}

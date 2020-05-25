package com.bytedance.android.livesdk.chatroom.presenter;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bc */
public final /* synthetic */ class C5812bc implements C1710e {

    /* renamed from: a */
    private final C5793ao f15266a;

    public C5812bc(C5793ao aoVar) {
        this.f15266a = aoVar;
    }

    public final void accept(Object obj) {
        C5793ao aoVar = this.f15266a;
        Throwable th = (Throwable) obj;
        if (aoVar.f15237a != null) {
            aoVar.f15237a.mo11681a(th);
        }
    }
}

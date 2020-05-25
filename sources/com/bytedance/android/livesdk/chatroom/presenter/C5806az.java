package com.bytedance.android.livesdk.chatroom.presenter;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.az */
public final /* synthetic */ class C5806az implements C1710e {

    /* renamed from: a */
    private final C5793ao f15256a;

    public C5806az(C5793ao aoVar) {
        this.f15256a = aoVar;
    }

    public final void accept(Object obj) {
        C5793ao aoVar = this.f15256a;
        Throwable th = (Throwable) obj;
        aoVar.f15243g = false;
        if (aoVar.f15237a != null) {
            aoVar.f15237a.mo11681a(th);
        }
    }
}

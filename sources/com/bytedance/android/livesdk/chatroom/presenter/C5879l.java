package com.bytedance.android.livesdk.chatroom.presenter;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.l */
public final /* synthetic */ class C5879l implements C1710e {

    /* renamed from: a */
    private final C5876j f15391a;

    public C5879l(C5876j jVar) {
        this.f15391a = jVar;
    }

    public final void accept(Object obj) {
        C5876j jVar = this.f15391a;
        Throwable th = (Throwable) obj;
        if (jVar.f15386c != null && !jVar.f15386c.isDisposed()) {
            jVar.f15386c.dispose();
            jVar.f15386c = null;
        }
    }
}

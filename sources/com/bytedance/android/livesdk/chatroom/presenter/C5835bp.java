package com.bytedance.android.livesdk.chatroom.presenter;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bp */
final /* synthetic */ class C5835bp implements C1710e {

    /* renamed from: a */
    private final C5821bf f15298a;

    C5835bp(C5821bf bfVar) {
        this.f15298a = bfVar;
    }

    public final void accept(Object obj) {
        C5821bf bfVar = this.f15298a;
        Throwable th = (Throwable) obj;
        bfVar.f15277d = false;
        bfVar.mo11707e().mo11711a(th);
    }
}

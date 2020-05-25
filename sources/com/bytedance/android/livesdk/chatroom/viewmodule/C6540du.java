package com.bytedance.android.livesdk.chatroom.viewmodule;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.du */
final /* synthetic */ class C6540du implements C1710e {

    /* renamed from: a */
    private final C6323a f17866a;

    C6540du(C6323a aVar) {
        this.f17866a = aVar;
    }

    public final void accept(Object obj) {
        C6323a aVar = this.f17866a;
        Throwable th = (Throwable) obj;
        if (aVar.f17313a != null && aVar.f17313a.mo14577e()) {
            aVar.f17313a.dismiss();
        }
    }
}

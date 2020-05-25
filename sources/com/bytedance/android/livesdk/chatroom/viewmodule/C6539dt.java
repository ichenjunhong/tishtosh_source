package com.bytedance.android.livesdk.chatroom.viewmodule;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dt */
final /* synthetic */ class C6539dt implements C1710e {

    /* renamed from: a */
    private final C6323a f17865a;

    C6539dt(C6323a aVar) {
        this.f17865a = aVar;
    }

    public final void accept(Object obj) {
        C6323a aVar = this.f17865a;
        Long l = (Long) obj;
        if (aVar.f17313a != null && aVar.f17313a.mo14577e()) {
            aVar.f17313a.dismiss();
        }
    }
}

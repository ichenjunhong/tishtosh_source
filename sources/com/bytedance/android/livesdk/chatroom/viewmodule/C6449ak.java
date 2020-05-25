package com.bytedance.android.livesdk.chatroom.viewmodule;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ak */
final /* synthetic */ class C6449ak implements C1710e {

    /* renamed from: a */
    private final C6277c f17753a;

    C6449ak(C6277c cVar) {
        this.f17753a = cVar;
    }

    public final void accept(Object obj) {
        C6277c cVar = this.f17753a;
        Long l = (Long) obj;
        if (cVar.f16957a != null && cVar.f16957a.mo14577e()) {
            cVar.f16957a.dismiss();
        }
    }
}

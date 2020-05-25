package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5699h;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.api.c */
final /* synthetic */ class C4993c implements C1711f {

    /* renamed from: a */
    static final C1711f f13376a = new C4993c();

    private C4993c() {
    }

    public final Object apply(Object obj) {
        C4177d dVar = (C4177d) obj;
        C4176c cVar = new C4176c();
        C4992b.m11477a(dVar, cVar);
        cVar.f11365b = ((C5699h) dVar.data).f14973a;
        return cVar;
    }
}

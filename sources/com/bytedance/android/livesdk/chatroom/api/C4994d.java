package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5700i;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.api.d */
public final /* synthetic */ class C4994d implements C1711f {

    /* renamed from: a */
    public static final C1711f f13377a = new C4994d();

    private C4994d() {
    }

    public final Object apply(Object obj) {
        C4177d dVar = (C4177d) obj;
        C4176c cVar = new C4176c();
        C4992b.m11477a(dVar, cVar);
        cVar.f11365b = ((C5700i) dVar.data).f14974a;
        return cVar;
    }
}

package com.bytedance.android.livesdk.chatroom.p301a.p304c;

import com.bytedance.android.livesdk.p399o.C8064d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.f */
final /* synthetic */ class C4982f implements C1710e {

    /* renamed from: a */
    private final C4974a f13364a;

    C4982f(C4974a aVar) {
        this.f13364a = aVar;
    }

    public final void accept(Object obj) {
        C4974a aVar = this.f13364a;
        Throwable th = (Throwable) obj;
        aVar.f13350g.setVisibility(8);
        aVar.f13351h.setVisibility(8);
        C8064d.m16005b();
        C8064d.m9718a(5, th.getStackTrace());
    }
}

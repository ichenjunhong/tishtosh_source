package com.bytedance.android.livesdk.chatroom.p301a.p304c;

import com.bytedance.android.livesdk.p399o.C8064d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.d */
final /* synthetic */ class C4980d implements C1710e {

    /* renamed from: a */
    private final C4974a f13361a;

    C4980d(C4974a aVar) {
        this.f13361a = aVar;
    }

    public final void accept(Object obj) {
        C4974a aVar = this.f13361a;
        Throwable th = (Throwable) obj;
        aVar.f13348e.setVisibility(8);
        aVar.f13349f.setVisibility(8);
        C8064d.m16005b();
        C8064d.m9718a(5, th.getStackTrace());
    }
}

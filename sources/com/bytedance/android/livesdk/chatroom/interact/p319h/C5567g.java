package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.chatroom.interact.p319h.C5387a.C5388a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.g */
public final /* synthetic */ class C5567g implements C1710e {

    /* renamed from: a */
    private final C5387a f14632a;

    public C5567g(C5387a aVar) {
        this.f14632a = aVar;
    }

    public final void accept(Object obj) {
        C5387a aVar = this.f14632a;
        Throwable th = (Throwable) obj;
        C5387a.m12189a(th);
        aVar.f14343b = false;
        if (aVar.mo8518c() != null) {
            ((C5388a) aVar.mo8518c()).mo11296a(th);
        }
    }
}

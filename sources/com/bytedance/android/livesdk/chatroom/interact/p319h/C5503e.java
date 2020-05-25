package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.chatroom.interact.p319h.C5387a.C5388a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.e */
final /* synthetic */ class C5503e implements C1710e {

    /* renamed from: a */
    private final C5387a f14535a;

    C5503e(C5387a aVar) {
        this.f14535a = aVar;
    }

    public final void accept(Object obj) {
        C5387a aVar = this.f14535a;
        Throwable th = (Throwable) obj;
        C5387a.m12189a(th);
        aVar.f14345d = false;
        if (aVar.mo8518c() != null) {
            ((C5388a) aVar.mo8518c()).mo11300c(th);
        }
    }
}

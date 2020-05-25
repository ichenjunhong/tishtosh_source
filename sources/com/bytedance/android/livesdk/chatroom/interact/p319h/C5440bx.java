package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.chatroom.interact.p319h.C5423bh.C5424a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.bx */
final /* synthetic */ class C5440bx implements C1710e {

    /* renamed from: a */
    private final C5423bh f14430a;

    C5440bx(C5423bh bhVar) {
        this.f14430a = bhVar;
    }

    public final void accept(Object obj) {
        C5423bh bhVar = this.f14430a;
        Throwable th = (Throwable) obj;
        bhVar.f14403d = false;
        bhVar.mo11751c(th);
        ((C5424a) bhVar.mo8518c()).mo11334b(th);
        bhVar.f14401b = -1;
    }
}

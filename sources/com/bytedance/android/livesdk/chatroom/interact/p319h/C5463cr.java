package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.chatroom.interact.C5274ah;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5453cj.C5455a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.cr */
final /* synthetic */ class C5463cr implements C1710e {

    /* renamed from: a */
    private final C5453cj f14470a;

    C5463cr(C5453cj cjVar) {
        this.f14470a = cjVar;
    }

    public final void accept(Object obj) {
        Object th;
        C5453cj cjVar = this.f14470a;
        Throwable th2 = (Throwable) obj;
        cjVar.mo11751c(th2);
        ((C5455a) cjVar.mo8518c()).mo11359c();
        if (th2 instanceof C2949a) {
            th = Integer.valueOf(((C2949a) th2).getErrorCode());
        } else {
            th = th2.toString();
        }
        C5274ah.m11924a(1, 201, th, "anchor", "pk", cjVar.mo11353i().toString());
    }
}

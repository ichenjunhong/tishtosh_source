package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.chatroom.interact.C5278al;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fv */
final /* synthetic */ class C5562fv implements C1710e {

    /* renamed from: a */
    private final C5556fq f14626a;

    /* renamed from: b */
    private final boolean f14627b;

    C5562fv(C5556fq fqVar, boolean z) {
        this.f14626a = fqVar;
        this.f14627b = z;
    }

    public final void accept(Object obj) {
        C5556fq fqVar = this.f14626a;
        boolean z = this.f14627b;
        Throwable th = (Throwable) obj;
        fqVar.mo11751c(th);
        if (z) {
            if (C4632d.PENAL.compareTo((C4632d) fqVar.f14614c.get("data_pk_state")) > 0) {
                fqVar.mo11464b((long) (fqVar.f14614c.f12629t * 1000));
            }
        }
        fqVar.f14614c.lambda$put$1$DataCenter("cmd_stop_interact", Boolean.valueOf(true));
        C5278al.m11942c(th);
    }
}

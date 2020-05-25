package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.interact.C5278al;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ge */
final /* synthetic */ class C5572ge implements C1710e {

    /* renamed from: a */
    private final C5556fq f14637a;

    /* renamed from: b */
    private final long f14638b;

    C5572ge(C5556fq fqVar, long j) {
        this.f14637a = fqVar;
        this.f14638b = j;
    }

    public final void accept(Object obj) {
        C5556fq fqVar = this.f14637a;
        C4177d dVar = (C4177d) obj;
        C5278al.m11932a(SystemClock.uptimeMillis() - this.f14638b);
        fqVar.f14614c.lambda$put$1$DataCenter("cmd_log_link", "OPEN_BATTLE_SUCCEED");
    }
}

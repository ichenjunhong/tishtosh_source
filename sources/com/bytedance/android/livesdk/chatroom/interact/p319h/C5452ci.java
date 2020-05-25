package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.interact.C5278al;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ci */
final /* synthetic */ class C5452ci implements C1710e {

    /* renamed from: a */
    private final C5423bh f14445a;

    /* renamed from: b */
    private final long f14446b;

    C5452ci(C5423bh bhVar, long j) {
        this.f14445a = bhVar;
        this.f14446b = j;
    }

    public final void accept(Object obj) {
        C5423bh bhVar = this.f14445a;
        C4177d dVar = (C4177d) obj;
        C5278al.m11932a(SystemClock.uptimeMillis() - this.f14446b);
        bhVar.f14400a.lambda$put$1$DataCenter("cmd_log_link", "OPEN_BATTLE_SUCCEED");
    }
}

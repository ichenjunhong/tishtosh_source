package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.interact.C5278al;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5379a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5423bh.C5424a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.bp */
final /* synthetic */ class C5432bp implements C1710e {

    /* renamed from: a */
    private final C5423bh f14418a;

    /* renamed from: b */
    private final long f14419b;

    C5432bp(C5423bh bhVar, long j) {
        this.f14418a = bhVar;
        this.f14419b = j;
    }

    public final void accept(Object obj) {
        C5423bh bhVar = this.f14418a;
        long j = this.f14419b;
        ((C5424a) bhVar.mo8518c()).mo11332a((C5379a) ((C4177d) obj).data, null);
        C5278al.m11933a(C5278al.f14125c, System.currentTimeMillis() - j);
    }
}

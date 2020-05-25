package com.bytedance.android.livesdk.chatroom.interact.p321j;

import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5631a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.j.c */
final /* synthetic */ class C5634c implements C1710e {

    /* renamed from: a */
    private final C5630a f14768a;

    /* renamed from: b */
    private final long f14769b;

    C5634c(C5630a aVar, long j) {
        this.f14768a = aVar;
        this.f14769b = j;
    }

    public final void accept(Object obj) {
        C5630a aVar = this.f14768a;
        long j = this.f14769b;
        C4176c cVar = (C4176c) obj;
        aVar.f14755c = false;
        for (C5631a a : aVar.f14758f) {
            a.mo11123a(cVar.f11365b, j);
        }
    }
}

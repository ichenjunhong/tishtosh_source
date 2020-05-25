package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.chatroom.interact.p313c.C5294c.C5296b;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.f */
final /* synthetic */ class C5371f implements Runnable {

    /* renamed from: a */
    private final C5249a f14309a;

    /* renamed from: b */
    private final C5296b f14310b;

    C5371f(C5249a aVar, C5296b bVar) {
        this.f14309a = aVar;
        this.f14310b = bVar;
    }

    public final void run() {
        C5249a aVar = this.f14309a;
        C5296b bVar = this.f14310b;
        if (aVar.f14028h.isEmpty() || !((C5296b) aVar.f14028h.peek()).f14147b.equals(bVar.f14147b)) {
            aVar.mo11096b(bVar);
        }
    }
}

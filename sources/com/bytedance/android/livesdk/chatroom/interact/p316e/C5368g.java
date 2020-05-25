package com.bytedance.android.livesdk.chatroom.interact.p316e;

import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.p316e.C5369h.C5370a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.e.g */
final /* synthetic */ class C5368g implements C1710e {

    /* renamed from: a */
    private final C5362a f14308a;

    C5368g(C5362a aVar) {
        this.f14308a = aVar;
    }

    public final void accept(Object obj) {
        C5362a aVar = this.f14308a;
        Throwable th = (Throwable) obj;
        LinkCrossRoomDataHolder.m11103a().f12628s = 0;
        aVar.f14300d = false;
        if (aVar.f14299c != null) {
            aVar.f14299c.dispose();
            aVar.f14299c = null;
        }
        if (th instanceof C2949a) {
            for (C5370a aVar2 : aVar.f14297a) {
                aVar2.mo11242a((C2949a) th);
                aVar2.mo11244b();
            }
        }
    }
}

package com.bytedance.android.livesdk.chatroom.interact.p316e;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdk.chatroom.interact.p316e.C5369h.C5370a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.e.f */
final /* synthetic */ class C5367f implements C1710e {

    /* renamed from: a */
    private final C5362a f14306a;

    /* renamed from: b */
    private final long f14307b;

    C5367f(C5362a aVar, long j) {
        this.f14306a = aVar;
        this.f14307b = j;
    }

    public final void accept(Object obj) {
        C5362a aVar = this.f14306a;
        long j = this.f14307b;
        C4177d dVar = (C4177d) obj;
        if (dVar.statusCode == 0) {
            LinkAutoMatchModel linkAutoMatchModel = (LinkAutoMatchModel) dVar.data;
            if (linkAutoMatchModel.getRivalRoom() != null) {
                aVar.f14300d = false;
                if (aVar.f14299c != null) {
                    aVar.f14299c.dispose();
                    aVar.f14299c = null;
                }
                for (C5370a b : aVar.f14297a) {
                    b.mo11245b(linkAutoMatchModel);
                }
            } else if (j == 0) {
                aVar.f14300d = false;
                for (C5370a b2 : aVar.f14297a) {
                    b2.mo11244b();
                }
            } else {
                for (C5370a a : aVar.f14297a) {
                    a.mo11243a(linkAutoMatchModel);
                }
            }
        }
    }
}

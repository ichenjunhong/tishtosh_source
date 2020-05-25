package com.bytedance.android.live.broadcast.effect.sticker;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.model.C7489a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.h */
final /* synthetic */ class C3291h implements C1710e {

    /* renamed from: a */
    private final C3288g f9485a;

    /* renamed from: b */
    private final String f9486b;

    C3291h(C3288g gVar, String str) {
        this.f9485a = gVar;
        this.f9486b = str;
    }

    public final void accept(Object obj) {
        C3288g gVar = this.f9485a;
        String str = this.f9486b;
        C4177d dVar = (C4177d) obj;
        if (gVar.f9475a) {
            if (((C7489a) dVar.data).f20512a) {
                str = null;
            }
            gVar.mo8661a(str);
        }
    }
}

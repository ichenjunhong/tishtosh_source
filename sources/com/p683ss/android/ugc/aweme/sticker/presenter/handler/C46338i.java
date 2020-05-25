package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k.C46341a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46317c;
import com.p683ss.android.ugc.aweme.sticker.types.p2328b.C46545a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.i */
public final class C46338i implements C46340k {
    /* renamed from: a */
    public final C46316b mo93033a(C46317c cVar, C46341a aVar) {
        C52711k.m112240b(cVar, "session");
        C52711k.m112240b(aVar, "chain");
        if (cVar instanceof C46315a) {
            C46315a aVar2 = (C46315a) cVar;
            if (aVar2.f116852a.getEffectType() == 2) {
                C46316b a = aVar.mo93036a(C46315a.m100611a(aVar2.f116852a, aVar2.f116853b, aVar2.f116854c, true, aVar2.f116856e));
                C46545a.m101019a(aVar2.f116852a);
                return a;
            }
        }
        return aVar.mo93036a(cVar);
    }
}

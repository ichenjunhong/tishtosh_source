package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k.C46341a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46317c;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d;
import com.p683ss.android.ugc.aweme.sticker.presenter.p2308a.C46291c;
import p2628d.C52775l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.l */
public final class C46342l implements C46340k {

    /* renamed from: a */
    private final C46291c f116930a;

    public C46342l(C46291c cVar) {
        C52711k.m112240b(cVar, "loader");
        this.f116930a = cVar;
    }

    /* renamed from: a */
    public final C46316b mo93033a(C46317c cVar, C46341a aVar) {
        C52711k.m112240b(cVar, "session");
        C52711k.m112240b(aVar, "chain");
        int i = 0;
        if (cVar instanceof C46315a) {
            C46315a aVar2 = (C46315a) cVar;
            if (!aVar2.f116855d) {
                if (aVar2.f116852a.getEffectType() == 0) {
                    i = this.f116930a.mo93010a(aVar2.f116852a, false);
                } else if (aVar2.f116852a.getEffectType() == -1) {
                    i = this.f116930a.mo93010a(aVar2.f116852a, false);
                }
                return new C46316b(i);
            }
        } else if (!(cVar instanceof C46318d)) {
            throw new C52775l();
        } else if (!((C46318d) cVar).f116861d) {
            i = this.f116930a.mo93009a();
            return new C46316b(i);
        }
        i = -1;
        return new C46316b(i);
    }
}

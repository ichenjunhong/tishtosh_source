package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k.C46341a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46317c;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.j */
public final class C46339j implements C46340k {

    /* renamed from: a */
    private final C52671b<Effect, C52860x> f116929a;

    public C46339j(C52671b<? super Effect, C52860x> bVar) {
        C52711k.m112240b(bVar, "guidePresenter");
        this.f116929a = bVar;
    }

    /* renamed from: a */
    public final C46316b mo93033a(C46317c cVar, C46341a aVar) {
        C52711k.m112240b(cVar, "session");
        C52711k.m112240b(aVar, "chain");
        C46316b a = aVar.mo93036a(cVar);
        if (cVar instanceof C46315a) {
            this.f116929a.invoke(((C46315a) cVar).f116852a);
        }
        return a;
    }
}

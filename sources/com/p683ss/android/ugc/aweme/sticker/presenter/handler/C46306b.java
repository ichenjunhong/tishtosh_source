package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k.C46341a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46317c;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.C52775l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.b */
public abstract class C46306b implements C46340k {

    /* renamed from: a */
    private Effect f116842a;

    /* renamed from: a */
    private static void m100578a(C46316b bVar) {
        C52711k.m112240b(bVar, "result");
    }

    /* renamed from: a */
    public abstract void mo93028a();

    /* renamed from: a */
    public abstract void mo93029a(C46316b bVar, C46315a aVar);

    /* renamed from: a */
    public abstract boolean mo93030a(C46315a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo93031b(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
    }

    /* renamed from: a */
    private final C46316b m100577a(C46341a aVar, C46317c cVar) {
        if (this.f116842a != null) {
            mo93028a();
            this.f116842a = null;
        }
        C46316b a = aVar.mo93036a(cVar);
        m100578a(a);
        return a;
    }

    /* renamed from: a */
    public final C46316b mo93033a(C46317c cVar, C46341a aVar) {
        C52711k.m112240b(cVar, "session");
        C52711k.m112240b(aVar, "chain");
        if (cVar instanceof C46315a) {
            C46315a aVar2 = (C46315a) cVar;
            if (!mo93030a(aVar2)) {
                return m100577a(aVar, cVar);
            }
            mo93031b(aVar2);
            C46316b a = aVar.mo93036a(aVar2);
            mo93029a(a, aVar2);
            this.f116842a = aVar2.f116852a;
            return a;
        } else if (cVar instanceof C46318d) {
            return m100577a(aVar, cVar);
        } else {
            throw new C52775l();
        }
    }
}

package com.p683ss.android.ugc.aweme.utils;

import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.o */
public final class C47934o {

    /* renamed from: a */
    public static final C47934o f120530a = new C47934o();

    private C47934o() {
    }

    /* renamed from: a */
    public static final boolean m103707a(Aweme aweme) {
        AwemeStatus awemeStatus;
        C23183v a = C23183v.m56778a();
        C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
        C23051bf B = a.mo47891B();
        C52711k.m112236a((Object) B, "CommonSharePrefCache.inst().enableShoppingTotal");
        Object d = B.mo47782d();
        C52711k.m112236a(d, "CommonSharePrefCache.ins…enableShoppingTotal.cache");
        if (((Boolean) d).booleanValue()) {
            if (aweme != null) {
                awemeStatus = aweme.getStatus();
            } else {
                awemeStatus = null;
            }
            if (awemeStatus != null && aweme.getStatus().isWithGoods() && aweme.getPromotions().size() > 0 && C25945k.m62913d().shouldShowCard() && C25945k.m62921l().mo53300a(aweme)) {
                return true;
            }
        }
        return false;
    }
}

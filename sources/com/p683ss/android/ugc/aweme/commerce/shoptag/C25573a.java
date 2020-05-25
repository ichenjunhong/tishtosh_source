package com.p683ss.android.ugc.aweme.commerce.shoptag;

import com.p683ss.android.ugc.aweme.app.C22930ah;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.shoptag.a */
public final class C25573a {

    /* renamed from: a */
    public static final C25573a f67678a = new C25573a();

    private C25573a() {
    }

    /* renamed from: a */
    public static Long m62093a(Integer num) {
        if (num == null || num.intValue() != 0) {
            return null;
        }
        C22930ah a = C22930ah.m56380a();
        C52711k.m112236a((Object) a, "FeedCountHelper.inst()");
        return Long.valueOf(a.mo47705b());
    }

    /* renamed from: a */
    public static String m62094a(Aweme aweme, Integer num) {
        if (num != null && num.intValue() == 0) {
            return C23198ae.m56854b(aweme, num.intValue());
        }
        return null;
    }
}

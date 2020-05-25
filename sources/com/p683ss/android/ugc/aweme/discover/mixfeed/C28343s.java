package com.p683ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.discover.abtest.DynamicTypeExperiment;
import com.p683ss.android.ugc.aweme.discover.abtest.EpidemicCardTypeExperiment;
import com.p683ss.android.ugc.aweme.discover.abtest.GeneralSearchRefreshCount;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchMixCardOrderSynthesis;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchMixFilterAladdinCards;
import com.p683ss.android.ugc.aweme.search.p2126f.C41423a;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.s */
public final class C28343s {

    /* renamed from: a */
    static String f74421a = "";

    /* renamed from: b */
    static int f74422b;

    /* renamed from: c */
    static int f74423c = C41423a.f104991a;

    /* renamed from: d */
    static int f74424d = C10181b.m20511a().mo18168a(SearchMixCardOrderSynthesis.class, true, "search_mix_order_disable_synthesis", 31744, 0);

    /* renamed from: e */
    static int f74425e = C10181b.m20511a().mo18168a(SearchMixFilterAladdinCards.class, true, "search_mix_filter_aladdin", 31744, 0);

    /* renamed from: f */
    static int f74426f = C10181b.m20511a().mo18168a(DynamicTypeExperiment.class, true, "dynamic_type", 31744, 0);

    /* renamed from: g */
    static int f74427g = C10181b.m20511a().mo18168a(EpidemicCardTypeExperiment.class, true, "epidemic_card_type", 31744, 0);

    /* renamed from: h */
    private static final int f74428h;

    /* renamed from: a */
    public static final String m67286a() {
        return f74421a;
    }

    /* renamed from: b */
    public static final int m67287b() {
        return f74422b;
    }

    /* renamed from: c */
    public static final int m67288c() {
        return f74428h;
    }

    static {
        boolean z;
        int i = 10;
        Integer valueOf = Integer.valueOf(C10193n.m20607a().mo18200a(GeneralSearchRefreshCount.class, "general_search_refresh_count", C10181b.m20511a().mo18175c().getGeneralSearchRefreshCount(), 10));
        if (valueOf.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        }
        f74428h = i;
    }
}

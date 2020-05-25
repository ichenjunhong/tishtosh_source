package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bm */
public final class C26428bm {

    /* renamed from: a */
    public static final LinkedHashMap<String, C26138s> f69676a = new LinkedHashMap<>(12, 0.75f, true);

    /* renamed from: b */
    public static final C26428bm f69677b = new C26428bm();

    private C26428bm() {
    }

    /* renamed from: a */
    public static C26138s m63902a(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getLinkAdData() == null && aweme.needPreloadAdLink()) {
            aweme.setLinkAdData((C26138s) f69676a.get(aweme.getAid()));
        }
        return aweme.getLinkAdData();
    }

    /* renamed from: a */
    public static void m63903a(Aweme aweme, C26138s sVar) {
        if (aweme != null) {
            aweme.setLinkAdData(sVar);
            Map map = f69676a;
            String aid = aweme.getAid();
            C52711k.m112236a((Object) aid, "aweme.aid");
            map.put(aid, sVar);
        }
    }
}

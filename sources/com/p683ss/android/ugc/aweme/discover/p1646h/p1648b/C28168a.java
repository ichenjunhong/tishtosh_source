package com.p683ss.android.ugc.aweme.discover.p1646h.p1648b;

import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.p683ss.android.ugc.aweme.discover.model.BannerList;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1711f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.h.b.a */
public final class C28168a {

    /* renamed from: a */
    public static final C28168a f73962a = new C28168a();

    /* renamed from: com.ss.android.ugc.aweme.discover.h.b.a$a */
    static final class C28169a<T, R> implements C1711f<T, C2206z<? extends R>> {

        /* renamed from: a */
        public static final C28169a f73963a = new C28169a();

        C28169a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            BannerList bannerList = (BannerList) obj;
            C52711k.m112240b(bannerList, "it");
            LogPbBean logPbBean = bannerList.logPb;
            C52711k.m112236a((Object) logPbBean, "it.logPb");
            String imprId = logPbBean.getImprId();
            for (Banner banner : bannerList.items) {
                C52711k.m112236a((Object) banner, "banner");
                banner.setRequestId(imprId);
            }
            return C2201v.m6614b(bannerList.items);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.h.b.a$b */
    static final class C28170b<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C28170b f73964a = new C28170b();

        C28170b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "it");
            DiscoverItemData discoverItemData = new DiscoverItemData(4);
            discoverItemData.setBannerList(list);
            return discoverItemData;
        }
    }

    private C28168a() {
    }
}

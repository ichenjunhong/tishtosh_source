package com.p683ss.android.ugc.aweme.favorites.api;

import com.p683ss.android.ugc.aweme.favorites.p1701a.C29658a;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.MixCollectionApi */
public interface MixCollectionApi {

    /* renamed from: a */
    public static final C29680a f77584a = C29680a.f77585a;

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.MixCollectionApi$a */
    public static final class C29680a {

        /* renamed from: a */
        static final /* synthetic */ C29680a f77585a = new C29680a();

        private C29680a() {
        }
    }

    @C53075f(mo110603a = "/aweme/v1/mix/listcollection/")
    C2201v<C29658a> getMixCollection(@C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "mix_ids") String str);

    @C53075f(mo110603a = "/aweme/v1/mix/list/")
    C2201v<C29658a> getProfileVideoMixList(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "cursor") long j);

    @C53075f(mo110603a = "/aweme/v1/mix/multi/details/")
    C2201v<C29658a> getSearchMixCollection(@C53089t(mo110619a = "mix_ids") String str);
}

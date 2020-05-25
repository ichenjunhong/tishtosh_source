package com.p683ss.android.ugc.aweme.favorites.repository;

import com.p683ss.android.ugc.aweme.favorites.p1701a.C29659b;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.favorites.repository.PoiCollectionJediApi */
public interface PoiCollectionJediApi {

    /* renamed from: a */
    public static final C29712a f77625a = C29712a.f77626a;

    /* renamed from: com.ss.android.ugc.aweme.favorites.repository.PoiCollectionJediApi$a */
    public static final class C29712a {

        /* renamed from: a */
        static final /* synthetic */ C29712a f77626a = new C29712a();

        private C29712a() {
        }
    }

    @C53075f(mo110603a = "/aweme/v1/poi/listcollection/")
    C2201v<C29659b> getPoiCollection(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "longitude") String str, @C53089t(mo110619a = "latitude") String str2);
}

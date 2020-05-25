package com.p683ss.android.ugc.aweme.discover.api;

import com.p683ss.android.ugc.aweme.discover.model.SearchPOIAwemeList;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SearchPOIApi */
public interface SearchPOIApi {

    /* renamed from: a */
    public static final C28058a f73718a = C28058a.f73719a;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchPOIApi$a */
    public static final class C28058a {

        /* renamed from: a */
        static final /* synthetic */ C28058a f73719a = new C28058a();

        private C28058a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchPOIApi$b */
    public static final class C28059b {

        /* renamed from: a */
        public String f73720a;

        /* renamed from: b */
        public String f73721b;

        /* renamed from: c */
        public String f73722c;

        /* renamed from: d */
        public long f73723d;

        /* renamed from: e */
        public long f73724e;
    }

    @C53075f(mo110603a = "/common/aladdin/openApi")
    C2201v<SearchPOIAwemeList> getMixListAweme(@C53089t(mo110619a = "alasrc") String str, @C53089t(mo110619a = "keyword") String str2, @C53089t(mo110619a = "group_id") String str3, @C53089t(mo110619a = "count") long j, @C53089t(mo110619a = "cursor") long j2);
}

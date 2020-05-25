package com.p683ss.android.ugc.aweme.discover.mixfeed;

import com.p683ss.android.ugc.aweme.discover.api.SearchPOIApi;
import com.p683ss.android.ugc.aweme.discover.api.SearchPOIApi.C28059b;
import com.p683ss.android.ugc.aweme.discover.model.SearchPOIAwemeList;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.u */
public final class C28345u extends C28299a<SearchPOIAwemeList> {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f74434b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28345u.class), "param", "getParam()Lcom/ss/android/ugc/aweme/discover/api/SearchPOIApi$Param;"))};

    /* renamed from: c */
    public static final C28346a f74435c = new C28346a(null);

    /* renamed from: d */
    private final SearchPOIApi f74436d = ((SearchPOIApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("http://search-lf.amemv.com/").create(SearchPOIApi.class));

    /* renamed from: e */
    private final C52668f f74437e = C52732g.m112285a(C28347b.f74438a);

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.u$a */
    public static final class C28346a {
        private C28346a() {
        }

        public /* synthetic */ C28346a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.u$b */
    static final class C28347b extends C52712l implements C52670a<C28059b> {

        /* renamed from: a */
        public static final C28347b f74438a = new C28347b();

        C28347b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C28059b bVar = new C28059b();
            bVar.f73723d = 20;
            return bVar;
        }
    }

    /* renamed from: b */
    public final C28059b mo56760b() {
        return (C28059b) this.f74437e.getValue();
    }

    /* renamed from: a */
    public final C2201v<SearchPOIAwemeList> mo56688a() {
        return this.f74436d.getMixListAweme(mo56760b().f73720a, mo56760b().f73721b, mo56760b().f73722c, mo56760b().f73723d, mo56760b().f73724e);
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        C52711k.m112240b(objArr, "params");
        C28059b b = mo56760b();
        SearchPOIAwemeList searchPOIAwemeList = (SearchPOIAwemeList) this.mData;
        if (searchPOIAwemeList != null) {
            j = searchPOIAwemeList.getCursor();
        } else {
            j = 0;
        }
        b.f73724e = j;
        super.loadMoreList(objArr);
    }
}

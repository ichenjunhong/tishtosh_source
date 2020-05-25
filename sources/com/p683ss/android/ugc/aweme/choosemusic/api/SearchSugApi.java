package com.p683ss.android.ugc.aweme.choosemusic.api;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24867w;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.api.SearchSugApi */
public interface SearchSugApi {

    /* renamed from: a */
    public static final C24831a f65731a = C24831a.f65733b;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.api.SearchSugApi$a */
    public static final class C24831a {

        /* renamed from: a */
        public static final SearchSugApi f65732a;

        /* renamed from: b */
        static final /* synthetic */ C24831a f65733b = new C24831a();

        private C24831a() {
        }

        static {
            Object a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(TutorialVideoApiManager.f96873a).mo19925a().mo19930a(SearchSugApi.class);
            C52711k.m112236a(a, "ServiceManager.get().get…SearchSugApi::class.java)");
            f65732a = (SearchSugApi) a;
        }
    }

    @C53075f(mo110603a = "/aweme/v1/search/sug/")
    C17832m<C24867w> getSearchSugList(@C53089t(mo110619a = "keyword") String str, @C53089t(mo110619a = "source") String str2);
}

package com.p683ss.android.ugc.aweme.discover.api;

import com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi */
public interface SuggestWordsApi {

    /* renamed from: a */
    public static final C28060a f73730a = C28060a.f73732b;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi$a */
    public static final class C28060a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f73731a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28060a.class), "API", "getAPI()Lcom/ss/android/ugc/aweme/discover/api/SuggestWordsApi;"))};

        /* renamed from: b */
        static final /* synthetic */ C28060a f73732b = new C28060a();

        /* renamed from: c */
        private static final C52668f f73733c = C52732g.m112285a(C28061a.f73734a);

        /* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi$a$a */
        static final class C28061a extends C52712l implements C52670a<SuggestWordsApi> {

            /* renamed from: a */
            public static final C28061a f73734a = new C28061a();

            C28061a() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return (SuggestWordsApi) C28063a.m66839a().create(SuggestWordsApi.class);
            }
        }

        private C28060a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SuggestWordsApi$b */
    public static final class C28062b {
    }

    @C53075f(mo110603a = "/api/suggest_words/")
    C0013i<SuggestWordResponse> getRecommendWords(@C53089t(mo110619a = "from_group_id") String str, @C53089t(mo110619a = "query") String str2, @C53089t(mo110619a = "business_id") String str3);

    @C53075f(mo110603a = "/api/suggest_words/")
    C0013i<SuggestWordResponse> getSuggestWords(@C53089t(mo110619a = "business_id") String str, @C53089t(mo110619a = "from_group_id") String str2, @C53089t(mo110619a = "word_in_box") String str3);

    @C53075f(mo110603a = "/api/suggest_words/")
    C0013i<String> getSuggestWordsWithRawString(@C53089t(mo110619a = "business_id") String str, @C53089t(mo110619a = "from_group_id") String str2, @C53089t(mo110619a = "word_in_box") String str3);
}

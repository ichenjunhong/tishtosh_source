package com.p683ss.android.ugc.aweme.discover.mixfeed;

import android.arch.lifecycle.C0209x;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchRecomWordsSpanCountABTest;
import java.util.HashSet;
import java.util.Set;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.SearchRecomWordModel */
public final class SearchRecomWordModel extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f74212a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchRecomWordModel.class), "updatedResult", "getUpdatedResult()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchRecomWordModel.class), "fetchState", "getFetchState()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchRecomWordModel.class), "resumePlayFromDetailPage", "getResumePlayFromDetailPage()Lcom/bytedance/ies/sdk/widgets/NextLiveData;"))};

    /* renamed from: b */
    public final int f74213b = C10181b.m20511a().mo18168a(SearchRecomWordsSpanCountABTest.class, true, "search_recom_word_row_count", 31744, 0);

    /* renamed from: c */
    private final C52668f f74214c = C52732g.m112285a(C28298c.f74220a);

    /* renamed from: d */
    private final C52668f f74215d = C52732g.m112285a(C28296a.f74218a);

    /* renamed from: e */
    private final C52668f f74216e = C52732g.m112285a(C28297b.f74219a);

    /* renamed from: f */
    private final Set<Integer> f74217f = new HashSet();

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.SearchRecomWordModel$a */
    static final class C28296a extends C52712l implements C52670a<NextLiveData<Object>> {

        /* renamed from: a */
        public static final C28296a f74218a = new C28296a();

        C28296a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.SearchRecomWordModel$b */
    static final class C28297b extends C52712l implements C52670a<NextLiveData<Boolean>> {

        /* renamed from: a */
        public static final C28297b f74219a = new C28297b();

        C28297b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            NextLiveData nextLiveData = new NextLiveData();
            nextLiveData.setValue(Boolean.valueOf(false));
            return nextLiveData;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.SearchRecomWordModel$c */
    static final class C28298c extends C52712l implements C52670a<NextLiveData<Object>> {

        /* renamed from: a */
        public static final C28298c f74220a = new C28298c();

        C28298c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new NextLiveData();
        }
    }
}

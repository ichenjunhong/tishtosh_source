package com.p683ss.android.ugc.aweme.search.performance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.discover.abtest.AsyncInflateSearchExperiment;
import com.p683ss.android.ugc.aweme.p1402b.C23346d;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.search.performance.i */
public final class C41457i {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f105089a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C41457i.class), "enableSearchRefreshShowPerformanceOptimize", "getEnableSearchRefreshShowPerformanceOptimize()Z")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C41457i.class), "enableAsyncInflate", "getEnableAsyncInflate()Z"))};

    /* renamed from: b */
    public static final C41457i f105090b = new C41457i();

    /* renamed from: c */
    private static final C52668f f105091c = C52732g.m112285a(C41459b.f105094a);

    /* renamed from: d */
    private static final C52668f f105092d = C52732g.m112285a(C41458a.f105093a);

    /* renamed from: com.ss.android.ugc.aweme.search.performance.i$a */
    static final class C41458a extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C41458a f105093a = new C41458a();

        C41458a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(C10181b.m20511a().mo18172a(AsyncInflateSearchExperiment.class, true, "is_async_search", 31744, true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.performance.i$b */
    static final class C41459b extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C41459b f105094a = new C41459b();

        C41459b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(C10181b.m20511a().mo18172a(SearchRefreshShowPerformanceOptimize.class, true, "search_refresh_show_performance_optimize", 31744, true));
        }
    }

    private C41457i() {
    }

    /* renamed from: a */
    public final boolean mo84197a() {
        return ((Boolean) f105091c.getValue()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo84198b() {
        return ((Boolean) f105092d.getValue()).booleanValue();
    }

    /* renamed from: a */
    public final View mo84196a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "container");
        if (!(viewGroup.getContext() instanceof C23346d) || !mo84198b()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…youtId, container, false)");
            return inflate;
        }
        Context context = viewGroup.getContext();
        if (context != null) {
            return ((C23346d) context).getInflater().mo48401a(i);
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.ainflate.AsyncInflaterOwner");
    }
}

package com.p683ss.android.ugc.aweme.experiment;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
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

/* renamed from: com.ss.android.ugc.aweme.experiment.FeedRefreshViewModel */
public final class FeedRefreshViewModel extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f77244a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(FeedRefreshViewModel.class), "refreshType", "getRefreshType()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(FeedRefreshViewModel.class), "refreshWithType", "getRefreshWithType()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(FeedRefreshViewModel.class), "refreshResult", "getRefreshResult()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    public static final C29491a f77245d = new C29491a(null);

    /* renamed from: b */
    public final C52668f f77246b = C52732g.m112285a(C29493c.f77250a);

    /* renamed from: c */
    public final C52668f f77247c = C52732g.m112285a(C29494d.f77251a);

    /* renamed from: e */
    private final C52668f f77248e = C52732g.m112285a(C29492b.f77249a);

    /* renamed from: com.ss.android.ugc.aweme.experiment.FeedRefreshViewModel$a */
    public static final class C29491a {
        private C29491a() {
        }

        public /* synthetic */ C29491a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static FeedRefreshViewModel m69593a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(FeedRefreshViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…eshViewModel::class.java)");
            return (FeedRefreshViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.FeedRefreshViewModel$b */
    static final class C29492b extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C29492b f77249a = new C29492b();

        C29492b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.FeedRefreshViewModel$c */
    static final class C29493c extends C52712l implements C52670a<C0198r<Integer>> {

        /* renamed from: a */
        public static final C29493c f77250a = new C29493c();

        C29493c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.FeedRefreshViewModel$d */
    static final class C29494d extends C52712l implements C52670a<C0198r<String>> {

        /* renamed from: a */
        public static final C29494d f77251a = new C29494d();

        C29494d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: a */
    public final C0198r<Boolean> mo59600a() {
        return (C0198r) this.f77248e.getValue();
    }

    /* renamed from: a */
    public static final FeedRefreshViewModel m69591a(Activity activity) {
        C29491a aVar = f77245d;
        C52711k.m112240b(activity, "activity");
        if (activity instanceof FragmentActivity) {
            return C29491a.m69593a((FragmentActivity) activity);
        }
        return null;
    }
}

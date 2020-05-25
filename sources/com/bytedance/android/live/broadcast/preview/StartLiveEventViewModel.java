package com.bytedance.android.live.broadcast.preview;

import android.arch.lifecycle.C0209x;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

public final class StartLiveEventViewModel extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f9907a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveEventViewModel.class), "closeStatus", "getCloseStatus()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveEventViewModel.class), "selectTagEvent", "getSelectTagEvent()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveEventViewModel.class), "selectGameEvent", "getSelectGameEvent()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveEventViewModel.class), "selectCoverEvent", "getSelectCoverEvent()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveEventViewModel.class), "broadcastPrepareEvent", "getBroadcastPrepareEvent()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(StartLiveEventViewModel.class), "hideView", "getHideView()Lcom/bytedance/ies/sdk/widgets/NextLiveData;"))};

    /* renamed from: c */
    public static final C3464a f9908c = new C3464a(null);

    /* renamed from: b */
    public final C52668f f9909b = C52732g.m112285a(C3469f.f9919a);

    /* renamed from: d */
    private final C52668f f9910d = C52732g.m112285a(C3466c.f9916a);

    /* renamed from: e */
    private final C52668f f9911e = C52732g.m112285a(C3470g.f9920a);

    /* renamed from: f */
    private final C52668f f9912f = C52732g.m112285a(C3468e.f9918a);

    /* renamed from: g */
    private final C52668f f9913g = C52732g.m112285a(C3465b.f9915a);

    /* renamed from: h */
    private final C52668f f9914h = C52732g.m112285a(C3467d.f9917a);

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel$a */
    public static final class C3464a {
        private C3464a() {
        }

        public /* synthetic */ C3464a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel$b */
    static final class C3465b extends C52712l implements C52670a<NextLiveData<Integer>> {

        /* renamed from: a */
        public static final C3465b f9915a = new C3465b();

        C3465b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel$c */
    static final class C3466c extends C52712l implements C52670a<NextLiveData<Integer>> {

        /* renamed from: a */
        public static final C3466c f9916a = new C3466c();

        C3466c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel$d */
    static final class C3467d extends C52712l implements C52670a<NextLiveData<Integer>> {

        /* renamed from: a */
        public static final C3467d f9917a = new C3467d();

        C3467d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel$e */
    static final class C3468e extends C52712l implements C52670a<NextLiveData<Integer>> {

        /* renamed from: a */
        public static final C3468e f9918a = new C3468e();

        C3468e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel$f */
    static final class C3469f extends C52712l implements C52670a<NextLiveData<Integer>> {

        /* renamed from: a */
        public static final C3469f f9919a = new C3469f();

        C3469f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel$g */
    static final class C3470g extends C52712l implements C52670a<NextLiveData<Integer>> {

        /* renamed from: a */
        public static final C3470g f9920a = new C3470g();

        C3470g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new NextLiveData();
        }
    }

    /* renamed from: a */
    public final NextLiveData<Integer> mo8867a() {
        return (NextLiveData) this.f9910d.getValue();
    }

    /* renamed from: b */
    public final NextLiveData<Integer> mo8868b() {
        return (NextLiveData) this.f9912f.getValue();
    }

    /* renamed from: c */
    public final NextLiveData<Integer> mo8869c() {
        return (NextLiveData) this.f9913g.getValue();
    }

    /* renamed from: d */
    public final NextLiveData<Integer> mo8870d() {
        return (NextLiveData) this.f9914h.getValue();
    }

    public final void onCleared() {
        super.onCleared();
    }
}

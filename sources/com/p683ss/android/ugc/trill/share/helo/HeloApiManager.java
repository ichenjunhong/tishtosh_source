package com.p683ss.android.ugc.trill.share.helo;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.trill.share.helo.p2528c.C50484a;
import p064c.p065a.C2201v;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.trill.share.helo.HeloApiManager */
public final class HeloApiManager {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f126513a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(HeloApiManager.class), "heloApi", "getHeloApi()Lcom/ss/android/ugc/trill/share/helo/HeloApiManager$HeloShareApi;"))};

    /* renamed from: b */
    public static final C52668f f126514b = C52732g.m112285a(C50458b.f126518a);

    /* renamed from: c */
    public static final C50457a f126515c = new C50457a(null);

    /* renamed from: d */
    private final C52668f f126516d;

    /* renamed from: com.ss.android.ugc.trill.share.helo.HeloApiManager$HeloShareApi */
    public interface HeloShareApi {
        @C53075f(mo110603a = "/aweme/v1/user/settings/")
        C2201v<C50484a> fetchUserHeloConfiguration();
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.HeloApiManager$a */
    public static final class C50457a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f126517a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50457a.class), "instance", "getInstance()Lcom/ss/android/ugc/trill/share/helo/HeloApiManager;"))};

        private C50457a() {
        }

        /* renamed from: a */
        public static HeloApiManager m108791a() {
            return (HeloApiManager) HeloApiManager.f126514b.getValue();
        }

        public /* synthetic */ C50457a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.HeloApiManager$b */
    static final class C50458b extends C52712l implements C52670a<HeloApiManager> {

        /* renamed from: a */
        public static final C50458b f126518a = new C50458b();

        C50458b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new HeloApiManager(null);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.HeloApiManager$c */
    static final class C50459c extends C52712l implements C52670a<HeloShareApi> {

        /* renamed from: a */
        public static final C50459c f126519a = new C50459c();

        C50459c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (HeloShareApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(HeloShareApi.class);
        }
    }

    /* renamed from: a */
    public final HeloShareApi mo98368a() {
        return (HeloShareApi) this.f126516d.getValue();
    }

    private HeloApiManager() {
        this.f126516d = C52732g.m112285a(C50459c.f126519a);
    }

    public /* synthetic */ HeloApiManager(C52707g gVar) {
        this();
    }
}

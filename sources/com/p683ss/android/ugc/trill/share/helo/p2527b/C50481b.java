package com.p683ss.android.ugc.trill.share.helo.p2527b;

import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
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

/* renamed from: com.ss.android.ugc.trill.share.helo.b.b */
public final class C50481b {

    /* renamed from: a */
    public static final C52668f f126549a = C52732g.m112285a(C50483b.f126552a);

    /* renamed from: b */
    public static final C50482a f126550b = new C50482a(null);

    /* renamed from: com.ss.android.ugc.trill.share.helo.b.b$a */
    public static final class C50482a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f126551a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50482a.class), "instance", "getInstance()Lcom/ss/android/ugc/trill/share/helo/helper/UserHeloCache;"))};

        private C50482a() {
        }

        /* renamed from: a */
        public static C50481b m108825a() {
            return (C50481b) C50481b.f126549a.getValue();
        }

        public /* synthetic */ C50482a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.b.b$b */
    static final class C50483b extends C52712l implements C52670a<C50481b> {

        /* renamed from: a */
        public static final C50483b f126552a = new C50483b();

        C50483b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C50481b(null);
        }
    }

    private C50481b() {
    }

    /* renamed from: c */
    public static final C50481b m108818c() {
        return C50482a.m108825a();
    }

    /* renamed from: d */
    private static String m108819d() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        StringBuilder sb = new StringBuilder("user_bind_and_accredit_helo");
        C52711k.m112236a((Object) baseUserService_Monster, "service");
        sb.append(baseUserService_Monster.getCurrentUserID());
        return sb.toString();
    }

    /* renamed from: e */
    private static String m108820e() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        StringBuilder sb = new StringBuilder("last_selected_helo");
        C52711k.m112236a((Object) baseUserService_Monster, "service");
        sb.append(baseUserService_Monster.getCurrentUserID());
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo98379a() {
        return C23542f.m57715a().mo48705a(m108819d(), false);
    }

    /* renamed from: b */
    public final boolean mo98381b() {
        return C23542f.m57715a().mo48705a(m108820e(), false);
    }

    public /* synthetic */ C50481b(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final void mo98378a(boolean z) {
        C23542f.m57715a().mo48710b(m108819d(), z);
    }

    /* renamed from: b */
    public final void mo98380b(boolean z) {
        C23542f.m57715a().mo48710b(m108820e(), z);
    }
}

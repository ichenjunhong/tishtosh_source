package com.p683ss.ugc.aweme.performance.core.monitor;

import android.app.Application;
import com.p683ss.ugc.aweme.performance.core.monitor.p2587a.C51529a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2587a.C51530b;
import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51533b;
import com.p683ss.ugc.aweme.performance.core.monitor.printer.C51549a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.a */
public final class C51526a {

    /* renamed from: g */
    public static final C52668f f128709g = C52732g.m112286a(C52757k.SYNCHRONIZED, C51528b.f128718a);

    /* renamed from: h */
    public static final C51527a f128710h = new C51527a(null);

    /* renamed from: a */
    public Application f128711a;

    /* renamed from: b */
    public boolean f128712b;

    /* renamed from: c */
    public C51529a f128713c;

    /* renamed from: d */
    public C51549a<C51533b> f128714d;

    /* renamed from: e */
    public boolean f128715e;

    /* renamed from: f */
    public C51530b f128716f;

    /* renamed from: com.ss.ugc.aweme.performance.core.monitor.a$a */
    public static final class C51527a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f128717a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C51527a.class), "INSTANCE", "getINSTANCE()Lcom/ss/ugc/aweme/performance/core/monitor/JankKillerImpl;"))};

        private C51527a() {
        }

        /* renamed from: a */
        public static C51526a m110658a() {
            return (C51526a) C51526a.f128709g.getValue();
        }

        public /* synthetic */ C51527a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.core.monitor.a$b */
    static final class C51528b extends C52712l implements C52670a<C51526a> {

        /* renamed from: a */
        public static final C51528b f128718a = new C51528b();

        C51528b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C51526a(null);
        }
    }

    private C51526a() {
    }

    public /* synthetic */ C51526a(C52707g gVar) {
        this();
    }
}

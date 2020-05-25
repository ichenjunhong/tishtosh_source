package com.p683ss.android.ugc.trill.share.helo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.opensdk.core.grant.model.GrantInfo;
import com.bytedance.opensdk.p799a.C12449a;
import com.bytedance.opensdk.p799a.C12450b;
import com.bytedance.opensdk.p799a.C12451c;
import com.bytedance.opensdk.p799a.C12452d.C12453a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import com.p683ss.android.ugc.trill.share.C50412a;
import com.p683ss.android.ugc.trill.share.helo.HeloApiManager.C50457a;
import com.p683ss.android.ugc.trill.share.helo.p2526a.C50475a;
import com.p683ss.android.ugc.trill.share.helo.p2526a.C50476b;
import com.p683ss.android.ugc.trill.share.helo.p2527b.C50478a;
import com.p683ss.android.ugc.trill.share.helo.p2527b.C50481b.C50482a;
import com.p683ss.android.ugc.trill.share.helo.p2528c.C50484a;
import com.p683ss.android.ugc.trill.share.helo.p2529d.C50485a;
import com.p683ss.android.ugc.trill.share.helo.p2529d.C50486b;
import com.p683ss.android.ugc.trill.share.p2525a.C50413a;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p092j.C2161b;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.trill.share.helo.a */
public final class C50460a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f126520a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50460a.class), "emptyHeloApi", "getEmptyHeloApi()Lcom/ss/android/ugc/trill/share/helo/IOpenAuth;"))};

    /* renamed from: e */
    public static final C52668f f126521e = C52732g.m112285a(C50462b.f126530a);

    /* renamed from: f */
    public static final C52668f f126522f = C52732g.m112285a(C50463c.f126531a);

    /* renamed from: g */
    public static final C50461a f126523g = new C50461a(null);

    /* renamed from: b */
    public C12451c f126524b;

    /* renamed from: c */
    public C50484a f126525c;

    /* renamed from: d */
    public C1690c f126526d;

    /* renamed from: h */
    private final C52668f f126527h;

    /* renamed from: i */
    private C50477b<C50485a, C50475a> f126528i;

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$a */
    public static final class C50461a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f126529a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50461a.class), "instance", "getInstance()Lcom/ss/android/ugc/trill/share/helo/HeloProxyService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50461a.class), "sp", "getSp()Lcom/ss/android/ugc/trill/share/model/IVideoPublishShareCache;"))};

        private C50461a() {
        }

        /* renamed from: a */
        public static C50460a m108799a() {
            return (C50460a) C50460a.f126521e.getValue();
        }

        /* renamed from: b */
        public static C50413a m108800b() {
            return (C50413a) C50460a.f126522f.getValue();
        }

        public /* synthetic */ C50461a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$b */
    static final class C50462b extends C52712l implements C52670a<C50460a> {

        /* renamed from: a */
        public static final C50462b f126530a = new C50462b();

        C50462b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C50460a(null);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$c */
    static final class C50463c extends C52712l implements C52670a<C50413a> {

        /* renamed from: a */
        public static final C50463c f126531a = new C50463c();

        C50463c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (C50413a) C23540d.m57713a(AwemeApplication.m56199a(), C50413a.class);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$d */
    public static final class C50464d implements C12449a {

        /* renamed from: a */
        final /* synthetic */ C50475a f126532a;

        /* renamed from: com.ss.android.ugc.trill.share.helo.a$d$a */
        static final class C50465a<V> implements Callable<Void> {

            /* renamed from: a */
            final /* synthetic */ C50464d f126533a;

            /* renamed from: b */
            final /* synthetic */ C12450b f126534b;

            C50465a(C50464d dVar, C12450b bVar) {
                this.f126533a = dVar;
                this.f126534b = bVar;
            }

            public final /* synthetic */ Object call() {
                switch (this.f126534b.f32739a) {
                    case 0:
                        this.f126533a.f126532a.mo98324a();
                        break;
                    case 1:
                        this.f126533a.f126532a.mo98325a(this.f126534b.f32739a, this.f126534b.f32740b, this.f126534b.f32741c);
                        break;
                    default:
                        this.f126533a.f126532a.mo98325a(this.f126534b.f32739a, this.f126534b.f32740b, this.f126534b.f32741c);
                        break;
                }
                return null;
            }
        }

        C50464d(C50475a aVar) {
            this.f126532a = aVar;
        }

        /* renamed from: a */
        public final void mo23494a(C12450b bVar) {
            C52711k.m112240b(bVar, "result");
            C0013i.m18a((Callable<TResult>) new C50465a<TResult>(this, bVar), C0013i.f25b);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$e */
    static final class C50466e extends C52712l implements C52670a<C504671> {

        /* renamed from: a */
        public static final C50466e f126535a = new C50466e();

        C50466e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C50477b<C50485a, C50475a>() {
                /* renamed from: a */
                public final void mo98375a() {
                }

                /* renamed from: a */
                public final void mo98376a(int i, int i2, Intent intent) {
                }

                /* renamed from: a */
                public final /* synthetic */ void mo98377a(Activity activity, Object obj, Object obj2) {
                    C50485a aVar = (C50485a) obj;
                    C50475a aVar2 = (C50475a) obj2;
                    C52711k.m112240b(activity, "activity");
                    C52711k.m112240b(aVar, "param");
                    C52711k.m112240b(aVar2, "callback");
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$f */
    public static final class C50468f implements C50477b<C50485a, C50475a> {

        /* renamed from: a */
        final /* synthetic */ C50460a f126536a;

        /* renamed from: a */
        public final void mo98375a() {
            C1690c cVar = this.f126536a.f126526d;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f126536a.f126526d = null;
            C12451c cVar2 = this.f126536a.f126524b;
            if (cVar2 != null) {
                cVar2.mo23495a();
            }
        }

        C50468f(C50460a aVar) {
            this.f126536a = aVar;
        }

        /* renamed from: a */
        public final void mo98376a(int i, int i2, Intent intent) {
            C12451c cVar = this.f126536a.f126524b;
            if (cVar != null) {
                cVar.mo23496a(i, i2, intent);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo98377a(Activity activity, Object obj, Object obj2) {
            C50485a aVar = (C50485a) obj;
            C50475a aVar2 = (C50475a) obj2;
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(aVar, "param");
            C52711k.m112240b(aVar2, "callback");
            if (activity instanceof AppCompatActivity) {
                C50460a aVar3 = this.f126536a;
                AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
                if (aVar3.f126525c == null) {
                    C2201v a = C50457a.m108791a().mo98368a().fetchUserHeloConfiguration().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
                    C52711k.m112236a((Object) a, "HeloApiManager.instance.…dSchedulers.mainThread())");
                    aVar3.f126526d = C2161b.m6513a(a, new C50473k(aVar2), C50474l.f126546a, new C50472j(aVar3, appCompatActivity, aVar, aVar2));
                    return;
                }
                C50484a aVar4 = aVar3.f126525c;
                if (aVar4 == null) {
                    C52711k.m112234a();
                }
                aVar3.mo98371a(appCompatActivity, aVar, aVar4, aVar2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$g */
    static final class C50469g extends C52712l implements C52671b<C50484a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C50460a f126537a;

        /* renamed from: b */
        final /* synthetic */ C50476b f126538b;

        C50469g(C50460a aVar, C50476b bVar) {
            this.f126537a = aVar;
            this.f126538b = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C50484a aVar = (C50484a) obj;
            C50461a.m108800b().mo48485c(aVar.mo98382a());
            C50461a.m108800b().mo48486d(aVar.mo98383b());
            this.f126537a.f126525c = aVar;
            this.f126538b.mo98326a(aVar.mo98382a(), aVar.mo98383b());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$h */
    static final class C50470h extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C50476b f126539a;

        C50470h(C50476b bVar) {
            this.f126539a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112240b(th, "it");
            th.getMessage();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$i */
    static final class C50471i extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C50471i f126540a = new C50471i();

        C50471i() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$j */
    static final class C50472j extends C52712l implements C52671b<C50484a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C50460a f126541a;

        /* renamed from: b */
        final /* synthetic */ AppCompatActivity f126542b;

        /* renamed from: c */
        final /* synthetic */ C50485a f126543c;

        /* renamed from: d */
        final /* synthetic */ C50475a f126544d;

        C50472j(C50460a aVar, AppCompatActivity appCompatActivity, C50485a aVar2, C50475a aVar3) {
            this.f126541a = aVar;
            this.f126542b = appCompatActivity;
            this.f126543c = aVar2;
            this.f126544d = aVar3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C50484a aVar = (C50484a) obj;
            C50460a aVar2 = this.f126541a;
            AppCompatActivity appCompatActivity = this.f126542b;
            C50485a aVar3 = this.f126543c;
            C52711k.m112236a((Object) aVar, "config");
            aVar2.mo98371a(appCompatActivity, aVar3, aVar, this.f126544d);
            this.f126541a.f126525c = aVar;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$k */
    static final class C50473k extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C50475a f126545a;

        C50473k(C50475a aVar) {
            this.f126545a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112240b(th, "it");
            this.f126545a.mo98325a(-1, th.getMessage(), th.getMessage());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.a$l */
    static final class C50474l extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C50474l f126546a = new C50474l();

        C50474l() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: c */
    public static final C50460a m108793c() {
        return C50461a.m108799a();
    }

    /* renamed from: d */
    private final C50477b<C50485a, C50475a> m108794d() {
        return (C50477b) this.f126527h.getValue();
    }

    private C50460a() {
        this.f126527h = C52732g.m112285a(C50466e.f126535a);
    }

    /* renamed from: a */
    public static boolean m108792a() {
        return C50482a.m108825a().mo98379a();
    }

    /* renamed from: b */
    public final C50477b<C50485a, C50475a> mo98373b() {
        if (this.f126528i != null) {
            C50477b<C50485a, C50475a> bVar = this.f126528i;
            if (bVar == null) {
                C52711k.m112234a();
            }
            return bVar;
        } else if (!C50412a.m108715a()) {
            this.f126528i = m108794d();
            C50477b<C50485a, C50475a> bVar2 = this.f126528i;
            if (bVar2 == null) {
                C52711k.m112234a();
            }
            return bVar2;
        } else {
            this.f126528i = new C50468f(this);
            C50477b<C50485a, C50475a> bVar3 = this.f126528i;
            if (bVar3 == null) {
                C52711k.m112234a();
            }
            return bVar3;
        }
    }

    public /* synthetic */ C50460a(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final void mo98372a(C50476b bVar) {
        C52711k.m112240b(bVar, "callback");
        C2201v a = C50457a.m108791a().mo98368a().fetchUserHeloConfiguration().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
        C52711k.m112236a((Object) a, "HeloApiManager.instance.…dSchedulers.mainThread())");
        this.f126526d = C2161b.m6513a(a, new C50470h(bVar), C50471i.f126540a, new C50469g(this, bVar));
    }

    /* renamed from: a */
    public final void mo98370a(Context context, C50486b bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bVar, "param");
        C50478a.m108814a(context);
        C12453a aVar = new C12453a();
        aVar.mo23501b(bVar.mo98392b());
        aVar.mo23500a(bVar.mo98391a());
        this.f126524b = aVar.mo23499a();
    }

    /* renamed from: a */
    public final void mo98371a(AppCompatActivity appCompatActivity, C50485a aVar, C50484a aVar2, C50475a aVar3) {
        C50464d dVar = new C50464d(aVar3);
        C12451c cVar = this.f126524b;
        if (cVar != null) {
            cVar.mo23497a(new GrantInfo(aVar.mo98386a(), aVar.mo98387b(), aVar2.f126553a, aVar2.f126554b), appCompatActivity, (C12449a) dVar);
        }
    }
}

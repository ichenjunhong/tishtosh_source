package com.p683ss.android.ugc.aweme.net;

import android.app.Application;
import android.content.Context;
import com.bytedance.apm.ttnet.TTNetSampleInterceptor;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.p621b.p623b.C10203a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.util.C22265g;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.net.corenet.IESNetDepend;
import com.p683ss.android.ugc.aweme.net.experiment.ApiLibraExperiment;
import com.p683ss.android.ugc.aweme.net.experiment.LinkSelectorTypeExperiment;
import com.p683ss.android.ugc.aweme.net.interceptor.SecUidInterceptorTTNet;
import com.p683ss.android.ugc.aweme.net.interceptor.UrlTransformInterceptorTTNet;
import com.p683ss.android.ugc.aweme.net.p1991d.C37765f;
import com.p683ss.android.ugc.aweme.net.p1992e.C37769a;
import com.p683ss.android.ugc.aweme.network.C37819a;
import com.p683ss.android.ugc.aweme.network.C37826b;
import com.p683ss.android.ugc.aweme.network.C37834c;
import com.p683ss.android.ugc.aweme.network.INetwork;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.secapi.C41484b;
import com.p683ss.android.ugc.aweme.utils.InterceptorHolder;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.net.p */
public final class C37798p implements Runnable {

    /* renamed from: com.ss.android.ugc.aweme.net.p$a */
    public static final class C37799a implements C41484b {
        C37799a() {
        }

        /* renamed from: a */
        public final String mo77260a() {
            try {
                return C22265g.m55114c();
            } catch (Throwable unused) {
                return "";
            }
        }

        /* renamed from: b */
        public final String mo77261b() {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            return g.getCurUserId();
        }

        /* renamed from: c */
        public final String mo77262c() {
            String a = C37807q.m84407a();
            if (a != null) {
                if (a != null) {
                    String lowerCase = a.toLowerCase();
                    C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (lowerCase != null) {
                        return lowerCase;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$b */
    public static final class C37800b extends C37810a {
        C37800b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo77263a() {
            C37797o.m84398a().waitTTNetInit();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$c */
    static final class C37801c extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C37801c f96266a = new C37801c();

        C37801c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C35837h.m80980e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$d */
    static final class C37802d extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C37802d f96267a = new C37802d();

        C37802d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z = true;
            if (C10181b.m20511a().mo18168a(LinkSelectorTypeExperiment.class, true, "link_selector_type", 31744, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$e */
    static final class C37803e extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C37803e f96268a = new C37803e();

        C37803e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C10181b.m20511a().mo18168a(ApiLibraExperiment.class, true, "enable_api_libra", 31744, 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$f */
    static final class C37804f extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C37804f f96269a = new C37804f();

        C37804f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$g */
    static final class C37805g extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C37805g f96270a = new C37805g();

        C37805g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(-1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$h */
    public static final class C37806h implements C37834c {

        /* renamed from: a */
        final /* synthetic */ C37798p f96271a;

        /* renamed from: d */
        public final void mo77267d(C37819a aVar) {
            C52711k.m112240b(aVar, "config");
        }

        C37806h(C37798p pVar) {
            this.f96271a = pVar;
        }

        /* renamed from: a */
        public final void mo77264a(C37819a aVar) {
            C52711k.m112240b(aVar, "config");
            C22574a.m55738f().mo46917a("feed_network_init_to_init_ttnet", false);
        }

        /* renamed from: b */
        public final void mo77265b(C37819a aVar) {
            C52711k.m112240b(aVar, "config");
            C22574a.m55738f().mo46921b("feed_network_init_to_init_ttnet", false);
            C22574a.m55738f().mo46917a("feed_network_init_ttnet_duration", false);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
            if (r3 == null) goto L_0x0052;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo77266c(com.p683ss.android.ugc.aweme.network.C37819a r12) {
            /*
                r11 = this;
                java.lang.String r0 = "config"
                p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
                com.ss.android.ugc.aweme.an.a r0 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
                java.lang.String r1 = "feed_network_init_ttnet_duration"
                r2 = 0
                r0.mo46921b(r1, r2)
                com.ss.android.ugc.aweme.an.a r0 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
                java.lang.String r1 = "feed_network_init_sec_duration"
                r0.mo46917a(r1, r2)
                com.ss.android.ugc.aweme.net.p r0 = r11.f96271a
                android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                long r0 = android.os.SystemClock.elapsedRealtime()
                boolean r3 = com.p683ss.android.common.util.C18920g.m46048a(r4)
                if (r3 == 0) goto L_0x0069
                java.lang.String r3 = r12.f96289e
                if (r3 != 0) goto L_0x002e
                java.lang.String r3 = ""
            L_0x002e:
                r7 = r3
                java.lang.String r3 = r12.f96290f
                if (r3 != 0) goto L_0x0035
                java.lang.String r3 = ""
            L_0x0035:
                r8 = r3
                java.lang.String r3 = com.p683ss.android.ugc.aweme.net.C37807q.m84407a()
                if (r3 == 0) goto L_0x0052
                if (r3 == 0) goto L_0x004a
                java.lang.String r3 = r3.toLowerCase()
                java.lang.String r5 = "(this as java.lang.String).toLowerCase()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
                if (r3 != 0) goto L_0x0054
                goto L_0x0052
            L_0x004a:
                d.u r12 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r12.<init>(r0)
                throw r12
            L_0x0052:
                java.lang.String r3 = ""
            L_0x0054:
                r5 = r3
                com.ss.android.ugc.aweme.secapi.ISecApi r3 = com.p683ss.android.ugc.aweme.sec.SecApiImpl.createISecApibyMonsterPlugin()
                com.ss.android.ugc.aweme.secapi.ISecApi r3 = (com.p683ss.android.ugc.aweme.secapi.ISecApi) r3
                int r6 = r12.f96288d
                r9 = 1
                com.ss.android.ugc.aweme.net.p$a r12 = new com.ss.android.ugc.aweme.net.p$a
                r12.<init>()
                r10 = r12
                com.ss.android.ugc.aweme.secapi.b r10 = (com.p683ss.android.ugc.aweme.secapi.C41484b) r10
                r3.initSec(r4, r5, r6, r7, r8, r9, r10)
            L_0x0069:
                long r3 = android.os.SystemClock.elapsedRealtime()
                long r3 = r3 - r0
                org.json.JSONObject r12 = new org.json.JSONObject
                r12.<init>()
                java.lang.String r0 = "sec_init_time"
                r12.put(r0, r3)     // Catch:{ JSONException -> 0x0078 }
            L_0x0078:
                java.lang.String r0 = "sec_init_time"
                java.lang.String r1 = ""
                com.p683ss.android.ugc.aweme.base.C23569o.m57783b(r0, r1, r12)
                com.ss.android.ugc.aweme.an.a r12 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
                java.lang.String r0 = "feed_network_init_sec_duration"
                r12.mo46921b(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.net.C37798p.C37806h.mo77266c(com.ss.android.ugc.aweme.network.a):void");
        }
    }

    public final void run() {
        C10203a.m20664a(new C37765f(C11010c.m22280a()));
        C37810a.m84412a(new C37800b());
        INetwork a = C37797o.m84398a();
        Context a2 = C11010c.m22280a();
        if (a2 != null) {
            C37826b bVar = new C37826b((Application) a2);
            bVar.f96309a = new IESNetDepend();
            bVar.f96310b = C37768e.f96231b;
            bVar.f96313e = C11010c.m22295p();
            bVar.f96312d = C11010c.m22283d();
            bVar.f96311c = C11010c.m22289j();
            bVar.f96324p = new C37769a(C11010c.m22280a());
            bVar.f96314f = C24076h.m58902c();
            bVar.f96315g = C18845b.f52036a;
            bVar.mo77273a(new SyncCommonParameterIntercepter());
            bVar.mo77273a(new SecUidInterceptorTTNet());
            bVar.mo77273a(new UrlTransformInterceptorTTNet());
            InterceptorProvider createInterceptorProviderbyMonsterPlugin = InterceptorHolder.createInterceptorProviderbyMonsterPlugin();
            C52711k.m112236a((Object) createInterceptorProviderbyMonsterPlugin, "ServiceManager.get().get…ptorProvider::class.java)");
            List<C12727a> interceptors = createInterceptorProviderbyMonsterPlugin.getInterceptors();
            if (!C9376b.m18558a((Collection<T>) interceptors)) {
                for (C12727a aVar : interceptors) {
                    C52711k.m112236a((Object) aVar, "interceptor");
                    bVar.mo77273a(aVar);
                }
            }
            new TTNetSampleInterceptor();
            C52670a<String> aVar2 = C37801c.f96266a;
            C52711k.m112240b(aVar2, "<set-?>");
            bVar.f96318j = aVar2;
            C52670a<Boolean> aVar3 = C37802d.f96267a;
            C52711k.m112240b(aVar3, "<set-?>");
            bVar.f96319k = aVar3;
            C52670a<Integer> aVar4 = C37803e.f96268a;
            C52711k.m112240b(aVar4, "<set-?>");
            bVar.f96321m = aVar4;
            C52670a<Boolean> aVar5 = C37804f.f96269a;
            C52711k.m112240b(aVar5, "<set-?>");
            bVar.f96322n = aVar5;
            C52670a<Integer> aVar6 = C37805g.f96270a;
            C52711k.m112240b(aVar6, "<set-?>");
            bVar.f96323o = aVar6;
            a.init(new C37819a(bVar), new C37806h(this));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.app.Application");
    }
}

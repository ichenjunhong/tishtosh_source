package com.p683ss.android.jank;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.p546f.C9585b;
import com.bytedance.crash.p554m.C9672d;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.ugc.aweme.performance.core.monitor.C51526a;
import com.p683ss.ugc.aweme.performance.core.monitor.C51526a.C51527a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2587a.C51529a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51532a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51533b;
import com.p683ss.ugc.aweme.performance.core.monitor.p2589c.C51536a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2591e.C51544a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2591e.C51545b;
import com.p683ss.ugc.aweme.performance.core.monitor.printer.C51549a;
import com.p683ss.ugc.aweme.performance.p2586a.C51518a.C51519a;
import com.p683ss.ugc.aweme.performance.p2586a.C51521b.C51522a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.jank.SatanInitTask */
public final class SatanInitTask implements LegoTask {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SatanInitTask.class), "config", "getConfig()Lcom/ss/android/jank/SatanInitTask$Config;"))};
    public static final C19192a Companion = new C19192a(null);
    private final C52668f config$delegate = C52732g.m112285a(new C19194c(this));

    /* renamed from: com.ss.android.jank.SatanInitTask$a */
    public static final class C19192a {
        private C19192a() {
        }

        public /* synthetic */ C19192a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.jank.SatanInitTask$b */
    public final class C19193b implements C51529a {

        /* renamed from: a */
        public boolean f52893a = true;

        /* renamed from: a */
        public final boolean mo39166a() {
            return SatanSampleConfig.getParameters().isOnline();
        }

        /* renamed from: e */
        public final long mo39170e() {
            return SatanSampleConfig.getParameters().getJankThreshold();
        }

        /* renamed from: b */
        public final boolean mo39167b() {
            if (C11010c.m22295p().equals("douyin_outer_test")) {
                return true;
            }
            return C10181b.m20511a().mo18172a(SatanStackAB.class, true, "satan_collect_open", 31744, false);
        }

        /* renamed from: c */
        public final boolean mo39168c() {
            if (C11010c.m22295p().equals("douyin_outer_test")) {
                return true;
            }
            return C10181b.m20511a().mo18172a(SatanStackAB.class, true, "satan_collect_open", 31744, false);
        }

        /* renamed from: d */
        public final boolean mo39169d() {
            if (C11010c.m22295p().equals("local_test")) {
                return true;
            }
            return C19197b.m46789a();
        }

        public C19193b() {
        }
    }

    /* renamed from: com.ss.android.jank.SatanInitTask$c */
    static final class C19194c extends C52712l implements C52670a<C19193b> {

        /* renamed from: a */
        final /* synthetic */ SatanInitTask f52895a;

        C19194c(SatanInitTask satanInitTask) {
            this.f52895a = satanInitTask;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C19193b();
        }
    }

    /* renamed from: com.ss.android.jank.SatanInitTask$d */
    public static final class C19195d implements C51549a<C51532a> {
        C19195d() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo39171a(C51533b bVar) {
            String str;
            String str2;
            String str3;
            C51532a aVar = (C51532a) bVar;
            C52711k.m112240b(aVar, C42311c.f106865i);
            if (TextUtils.isEmpty(aVar.f128726d)) {
                str = "applicaiton";
            } else {
                str = aVar.f128726d;
            }
            if (aVar.f128731i == 1) {
                str2 = str;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(aVar.f128723a);
                sb.append("\n");
                sb.append(aVar.f128730h);
                str2 = sb.toString();
            }
            C9585b b = C9585b.m19046b(str2);
            C52711k.m112236a((Object) b, "EventBody.wrapBlock(blockInfo)");
            b.mo17390a("jankStack", "true");
            b.mo17390a("phase", str);
            if (str.equals("errorJank")) {
                b.mo17390a("errorJank", "true");
            }
            b.mo17390a("page", aVar.f128727e);
            String str4 = "totalData";
            if (aVar.f128730h.equals("phase")) {
                str3 = "true";
            } else {
                str3 = "false";
            }
            b.mo17390a(str4, str3);
            b.mo17395a("log_type", (Object) "jankStack");
            b.mo17395a("block_duration", (Object) Long.valueOf(aVar.f128725c));
            b.mo17397b("pointName ", str);
            b.mo17397b("jankCount ", String.valueOf(aVar.f128724b));
            C9672d.m19295a(b);
        }
    }

    public final C19193b getConfig() {
        return (C19193b) this.config$delegate.getValue();
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    public final void run(Context context) {
        C51519a.m110651a();
        C51529a config = getConfig();
        C52711k.m112240b(config, "config");
        C51526a a = C51527a.m110658a();
        C52711k.m112240b(config, "config");
        a.f128713c = config;
        a.f128712b = !config.mo39166a();
        C51549a<C51533b> dVar = new C19195d<>();
        C52711k.m112240b(dVar, "printer");
        C51526a a2 = C51527a.m110658a();
        C52711k.m112240b(dVar, "printer");
        a2.f128714d = dVar;
        C51544a aVar = C19196a.f52896a;
        C52711k.m112240b(aVar, "theadPool");
        C51527a.m110658a();
        C52711k.m112240b(aVar, "theadPool");
        C52711k.m112240b(aVar, "theadPool");
        C51545b.f128761a = aVar;
        if (context != null) {
            Application application = (Application) context;
            C52711k.m112240b(application, "application");
            C51526a a3 = C51527a.m110658a();
            C52711k.m112240b(application, "application");
            a3.f128711a = application;
            application.registerActivityLifecycleCallbacks(C51536a.f128747c);
            a3.f128715e = true;
            C11010c.m22295p().equals("local_test");
            synchronized (C51519a.m110651a()) {
                C51522a.m110657b().mo103702a();
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.app.Application");
    }
}

package com.p683ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.I18nManagerService;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import okhttp3.C53673t;
import okhttp3.C53673t.C53674a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.MvNetInterceptor */
public final class MvNetInterceptor implements C12727a {
    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) {
        return C47283c.m102639a(this, aVar);
    }

    /* renamed from: b */
    public static C12799u<?> m102631b(C12728a aVar) {
        C52711k.m112240b(aVar, "chain");
        C12686c a = aVar.mo23899a();
        C52711k.m112236a((Object) a, "request");
        C53673t f = C53673t.m114180f(a.f33321b);
        if (f != null) {
            C53674a j = f.mo111624j();
            j.mo111629a("access_key", C39629l.m88232a().mo58575f().mo58630a());
            j.mo111629a("app_version", C39629l.m88232a().mo58588s().mo74163i());
            I18nManagerService createI18nManagerServicebyMonsterPlugin = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin();
            C52711k.m112236a((Object) createI18nManagerServicebyMonsterPlugin, "ServiceManager.get().get…nagerService::class.java)");
            j.mo111629a("app_language", createI18nManagerServicebyMonsterPlugin.getAppLanguage());
            j.mo111629a("region", C39629l.m88232a().mo58590u().mo74214a());
            C52711k.m112236a((Object) j, "httpUrl.newBuilder().app…ice.region)\n            }");
            String tVar = j.mo111632b().toString();
            C52711k.m112236a((Object) tVar, "urlBuilder.build().toString()");
            a = a.mo23858b().mo23861a(tVar).mo23864a();
        }
        C12799u<?> a2 = aVar.mo23900a(a);
        C52711k.m112236a((Object) a2, "chain.proceed(request)");
        return a2;
    }
}

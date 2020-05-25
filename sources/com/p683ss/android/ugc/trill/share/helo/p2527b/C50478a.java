package com.p683ss.android.ugc.trill.share.helo.p2527b;

import android.content.Context;
import com.bytedance.common.utility.C9423k;
import com.bytedance.common.utility.C9423k.C9424a;
import com.bytedance.opensdk.core.base.C12497a;
import com.bytedance.opensdk.core.base.config.AppConfig;
import com.bytedance.opensdk.core.base.config.C12504a;
import com.bytedance.opensdk.core.base.p808c.C12502a;
import com.bytedance.opensdk.core.p805b.C12496a;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.utils.C47789cu;
import java.util.Locale;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

/* renamed from: com.ss.android.ugc.trill.share.helo.b.a */
public final class C50478a {

    /* renamed from: a */
    public static final C50478a f126547a = new C50478a();

    /* renamed from: com.ss.android.ugc.trill.share.helo.b.a$a */
    public static final class C50479a implements C12496a {
        C50479a() {
        }

        /* renamed from: a */
        public final void mo23518a(String str, Map<String, String> map) {
            C52711k.m112240b(str, "eventName");
            C52711k.m112240b(map, "params");
            C26890h.m65011a(str, map);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.b.a$b */
    public static final class C50480b implements C12502a {

        /* renamed from: a */
        final /* synthetic */ C9423k f126548a;

        C50480b(C9423k kVar) {
            this.f126548a = kVar;
        }

        /* renamed from: a */
        public final String mo23527a(String str, Map<String, String> map, Map<String, String> map2) {
            C52711k.m112240b(str, "url");
            C52711k.m112240b(map, "requestHeaderMap");
            C52711k.m112240b(map2, "respHeaderMap");
            return this.f126548a.mo17022a(str, map, null);
        }

        /* renamed from: a */
        public final String mo23526a(String str, String str2, Map<String, String> map, Map<String, String> map2) {
            C52711k.m112240b(str, "url");
            C52711k.m112240b(str2, "body");
            C52711k.m112240b(map, "requestHeaderMap");
            C52711k.m112240b(map2, "respHeaderMap");
            C9423k kVar = this.f126548a;
            byte[] bytes = str2.getBytes(C52808d.f131043a);
            C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return kVar.mo17023a(str, bytes, map, (C9424a) null);
        }
    }

    private C50478a() {
    }

    /* renamed from: a */
    public static void m108814a(Context context) {
        C52711k.m112240b(context, "context");
        String c = C19034d.m46323c();
        C52711k.m112236a((Object) c, "DeviceRegisterManager.getDeviceId()");
        Locale b = C47789cu.m103419b();
        C52711k.m112236a((Object) b, "LocaleUtils.getCurrentLocale()");
        AppConfig appConfig = new AppConfig(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString(), "http://p16-tiktokcdn-com.akamaized.net/obj/tiktok-obj/1633413036164097.PNG", C23018b.f61359a, "487", "tiktok", c, b);
        C50480b bVar = new C50480b(C9423k.m18637a());
        C50479a aVar = new C50479a();
        String q = C24095a.m58960q();
        C52711k.m112236a((Object) q, "BuildConfigDiff.getHeloHostClientKey()");
        C12504a aVar2 = new C12504a("awa1298a2d0150f3", q, appConfig, bVar, aVar);
        C12497a.f32821b.mo23521a(aVar2, context).mo23520a(64206);
    }
}

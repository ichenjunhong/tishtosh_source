package com.p683ss.android.ugc.aweme.bullet.business;

import android.app.Activity;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.bullet.p628b.p643i.C10391l;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.p683ss.android.sdk.webview.C19761i.C19762a;
import com.p683ss.android.sdk.webview.C19763j;
import com.p683ss.android.sdk.webview.C19767n;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business;
import com.p683ss.android.ugc.aweme.bullet.business.p1474a.C24253a;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24336d;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.p1320f.C22412b;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.web.C48264a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness */
public final class AdWebStatBusiness extends Business {

    /* renamed from: a */
    private final C24253a f64309a = new C24253a();

    /* renamed from: b */
    private long f64310b;

    /* renamed from: c */
    private boolean f64311c;

    /* renamed from: d */
    private final boolean f64312d;

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness$a */
    static final class C24237a<T> implements ValueCallback<String> {

        /* renamed from: a */
        public static final C24237a f64313a = new C24237a();

        C24237a() {
        }

        public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
        }
    }

    /* renamed from: f */
    private final int m59325f() {
        C10578a b = this.f64316k.mo50019b();
        if (!(b instanceof C24336d)) {
            b = null;
        }
        C24336d dVar = (C24336d) b;
        if (dVar != null) {
            return dVar.mo50129j();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo49970a() {
        this.f64310b = System.currentTimeMillis();
        this.f64311c = false;
        C24253a aVar = this.f64309a;
        aVar.f64375i = false;
        aVar.f64371e = false;
        aVar.f64372f = false;
        aVar.f64374h = null;
        aVar.f64369c = 0;
        aVar.f64367a = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r0 == null) goto L_0x0015;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m59322c() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.bullet.business.a r0 = r2.f64316k
            com.bytedance.ies.bullet.ui.common.d.a r0 = r0.mo50019b()
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h
            if (r1 != 0) goto L_0x000b
            r0 = 0
        L_0x000b:
            com.ss.android.ugc.aweme.bullet.module.ad.h r0 = (com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h) r0
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.mo50064b()
            if (r0 != 0) goto L_0x0017
        L_0x0015:
            java.lang.String r0 = ""
        L_0x0017:
            boolean r1 = r2.f64312d
            if (r1 == 0) goto L_0x0021
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            android.text.TextUtils.isEmpty(r1)
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.m59322c():java.lang.String");
    }

    /* renamed from: d */
    private final long m59323d() {
        C10578a b = this.f64316k.mo50019b();
        if (!(b instanceof C24310h)) {
            b = null;
        }
        C24310h hVar = (C24310h) b;
        if (hVar != null) {
            C10391l lVar = hVar.f64502e;
            if (lVar != null) {
                Long l = (Long) lVar.mo18457b();
                if (l != null) {
                    return l.longValue();
                }
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r0 == null) goto L_0x0015;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m59324e() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.bullet.business.a r0 = r2.f64316k
            com.bytedance.ies.bullet.ui.common.d.a r0 = r0.mo50019b()
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.bullet.module.base.C24336d
            if (r1 != 0) goto L_0x000b
            r0 = 0
        L_0x000b:
            com.ss.android.ugc.aweme.bullet.module.base.d r0 = (com.p683ss.android.ugc.aweme.bullet.module.base.C24336d) r0
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.mo50127h()
            if (r0 != 0) goto L_0x0017
        L_0x0015:
            java.lang.String r0 = ""
        L_0x0017:
            boolean r1 = r2.f64312d
            if (r1 == 0) goto L_0x0021
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            android.text.TextUtils.isEmpty(r1)
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.m59324e():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 == null) goto L_0x0034;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject m59320b() {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r5.m59322c()     // Catch:{ Exception -> 0x0044 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0044 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0044 }
            if (r1 != 0) goto L_0x0017
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0044 }
            java.lang.String r2 = r5.m59322c()     // Catch:{ Exception -> 0x0044 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0044 }
            goto L_0x001c
        L_0x0017:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0044 }
            r1.<init>()     // Catch:{ Exception -> 0x0044 }
        L_0x001c:
            java.lang.String r2 = "log_extra"
            com.ss.android.ugc.aweme.bullet.business.a r3 = r5.f64316k     // Catch:{ Exception -> 0x0045 }
            com.bytedance.ies.bullet.ui.common.d.a r3 = r3.mo50019b()     // Catch:{ Exception -> 0x0045 }
            boolean r4 = r3 instanceof com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h     // Catch:{ Exception -> 0x0045 }
            if (r4 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = r3
        L_0x002a:
            com.ss.android.ugc.aweme.bullet.module.ad.h r0 = (com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h) r0     // Catch:{ Exception -> 0x0045 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.mo50065c()     // Catch:{ Exception -> 0x0045 }
            if (r0 != 0) goto L_0x0036
        L_0x0034:
            java.lang.String r0 = ""
        L_0x0036:
            boolean r3 = r5.f64312d     // Catch:{ Exception -> 0x0045 }
            if (r3 == 0) goto L_0x0040
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x0045 }
            android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0045 }
        L_0x0040:
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0045 }
            goto L_0x0045
        L_0x0044:
            r1 = r0
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.m59320b():org.json.JSONObject");
    }

    public AdWebStatBusiness(C24252a aVar) {
        C52711k.m112240b(aVar, "bulletBusiness");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49974a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str == null || C52830p.m112411b(str, "bytedance://log_event_v3", false, 2, null)) {
            C10578a b = this.f64316k.mo50019b();
            if (b != null && (b instanceof C24310h)) {
                try {
                    Uri parse = Uri.parse(str);
                    C52711k.m112236a((Object) parse, "uri");
                    if (!(!C52711k.m112239a((Object) "log_event_v3", (Object) parse.getHost()))) {
                        C26890h.m65012a(parse.getQueryParameter("event"), new JSONObject(parse.getQueryParameter("params")));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private final JSONObject m59321b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_web_url", m59325f());
            if (!TextUtils.isEmpty(m59324e()) && m59325f() == 1) {
                jSONObject.put("channel_name", m59324e());
                jSONObject.put("landing_type", AdServiceImpl.createIAdServicebyMonsterPlugin().getAdLandPagePreloadService().mo46651a(m59324e()));
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("fail_reason", str);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo49975a(List<Pattern> list) {
        C10578a b = this.f64316k.mo50019b();
        if (b != null) {
            if (b instanceof C24336d) {
                C24336d dVar = (C24336d) b;
                if (TextUtils.isEmpty(dVar.mo50127h()) || dVar.mo50128i() != 4) {
                    return;
                }
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            try {
                IESSettingsProxy b2 = C32816h.m75716b();
                C52711k.m112236a((Object) b2, "SettingsReader.get()");
                AdLandingPageConfig adLandingPageConfig = b2.getAdLandingPageConfig();
                C52711k.m112236a((Object) adLandingPageConfig, "SettingsReader.get().adLandingPageConfig");
                List<String> adLandingPagePreloadCommonPrefix = adLandingPageConfig.getAdLandingPagePreloadCommonPrefix();
                if (!C9376b.m18558a((Collection<T>) adLandingPagePreloadCommonPrefix)) {
                    for (String compile : adLandingPagePreloadCommonPrefix) {
                        Pattern compile2 = Pattern.compile(compile);
                        C52711k.m112236a((Object) compile2, "Pattern.compile(prefix)");
                        list.add(compile2);
                    }
                }
            } catch (C10174a unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo49976a(boolean z) {
        JSONObject jSONObject;
        Activity a = this.f64316k.mo50010a();
        if (a != null) {
            JSONObject b = m59320b();
            long currentTimeMillis = System.currentTimeMillis() - this.f64310b;
            this.f64310b = 0;
            if (m59323d() > 0) {
                if (currentTimeMillis > 0 && !this.f64311c) {
                    C24253a aVar = this.f64309a;
                    long d = m59323d();
                    JSONObject b2 = m59321b(null);
                    if (d > 0 && aVar.f64373g != null) {
                        if (b == null) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = b;
                        }
                        try {
                            jSONObject.put("is_ad_event", "1");
                            jSONObject.put("tag", "draw_ad");
                            if (b2 == null) {
                                b2 = new JSONObject();
                            }
                            b2.put("present_url", aVar.f64373g);
                            b2.put("container_type", "bullet");
                            jSONObject.put("ad_extra_data", b2.toString());
                        } catch (JSONException unused) {
                        }
                        C26890h.onEvent(MobClick.obtain().setLabelName("stay_page").setEventName("ad_wap_stat").setValue(String.valueOf(d)).setExtValueLong(currentTimeMillis).setJsonObject(jSONObject));
                    }
                    this.f64311c = true;
                }
                if (z || a.isFinishing()) {
                    this.f64309a.mo50023a(a, null, m59323d(), b, m59321b(null));
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo49978c(WebView webView, String str) {
        boolean z;
        C24253a aVar = this.f64309a;
        long d = m59323d();
        JSONObject b = m59320b();
        JSONObject b2 = m59321b(null);
        if (webView != null && !TextUtils.isEmpty(str)) {
            if (aVar.f64374h == null) {
                aVar.f64374h = aVar.f64373g;
            }
            if (TextUtils.isEmpty(webView.getOriginalUrl()) || TextUtils.equals(webView.getOriginalUrl(), str) || aVar.f64371e) {
                z = false;
            } else {
                z = true;
            }
            aVar.f64370d = z;
            aVar.mo50024a(str, d, b, b2);
            aVar.f64374h = str;
        }
    }

    /* renamed from: a */
    public final void mo49971a(WebView webView, String str) {
        String str2;
        C24253a aVar = this.f64309a;
        C10578a b = this.f64316k.mo50019b();
        String str3 = null;
        if (!(b instanceof C24336d)) {
            b = null;
        }
        C24336d dVar = (C24336d) b;
        boolean z = true;
        if (!(webView == null || TextUtils.isEmpty(str) || dVar == null)) {
            if (aVar.f64373g == null) {
                aVar.f64373g = str;
            }
            if (aVar.f64367a == 0) {
                aVar.f64367a = System.currentTimeMillis();
            }
            String h = dVar.mo50127h();
            if (dVar.mo50128i() == 7) {
                aVar.f64368b = 5;
            } else if (!TextUtils.isEmpty(h) && dVar.mo50129j() == 1) {
                aVar.f64368b = C25899b.f68430b.mo53226b(h);
            }
        }
        C10578a b2 = this.f64316k.mo50019b();
        if (b2 != null && (b2 instanceof C24310h)) {
            if (!C52711k.m112239a((Object) str, (Object) QuickShopBusiness.f64351b)) {
                C25899b bVar = C25899b.f68430b;
                C24310h hVar = (C24310h) b2;
                String h2 = hVar.mo50127h();
                int i = hVar.mo50128i();
                int f = m59325f();
                String c = hVar.mo50065c();
                String str4 = (String) hVar.f64485V.mo18457b();
                if (TextUtils.isEmpty(str4)) {
                    Long l = (Long) hVar.f64502e.mo18457b();
                    if (l != null) {
                        str3 = String.valueOf(l.longValue());
                    }
                    str2 = str3;
                } else {
                    str2 = str4;
                }
                bVar.mo53222a(h2, i, f, c, str2);
            }
            if (VERSION.SDK_INT < 21) {
                z = false;
            }
            if (z) {
                try {
                    String analytics = C32816h.m75716b().getAdLandingPageConfig().getAnalytics();
                    IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
                    if (createIAdServicebyMonsterPlugin != null) {
                        C22412b adLandPagePreloadService = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService();
                        if (adLandPagePreloadService != null) {
                            adLandPagePreloadService.mo46657c(analytics);
                        }
                    }
                } catch (C10174a unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo49973a(C19763j jVar, C19767n nVar) {
        C52711k.m112240b(jVar, "intercept");
        C52711k.m112240b(nVar, "offlineBundleConfig");
        C10578a b = this.f64316k.mo50019b();
        if (b != null && (b instanceof C24336d)) {
            C24336d dVar = (C24336d) b;
            if (!TextUtils.isEmpty(dVar.mo50127h()) && dVar.mo50128i() == 4 && dVar.mo50129j() == 1) {
                try {
                    if (C52711k.m112239a((Object) C32816h.m75716b().getAdLandingPageConfig().getAdLandingPagePreloadEnabled(), (Object) Boolean.valueOf(false))) {
                        return;
                    }
                } catch (Exception unused) {
                }
                IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
                if (createIAdServicebyMonsterPlugin != null) {
                    C22412b adLandPagePreloadService = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService();
                    if (adLandPagePreloadService != null) {
                        String e = adLandPagePreloadService.mo46659e(C22858c.f61207c);
                        if (!TextUtils.isEmpty(e)) {
                            String a = nVar.mo41206a(e);
                            C52711k.m112236a((Object) a, "offlineBundleConfig.offl…ir(feedLandPageAccessKey)");
                            jVar.mo41195a((C19762a) new C48264a(a, dVar.mo50127h(), C22858c.f61207c));
                        }
                        String e2 = adLandPagePreloadService.mo46659e("splash");
                        if (!TextUtils.isEmpty(e2)) {
                            String a2 = nVar.mo41206a(e2);
                            C52711k.m112236a((Object) a2, "offlineBundleConfig.offl…(splashLandPageAccessKey)");
                            jVar.mo41195a((C19762a) new C48264a(a2, dVar.mo50127h(), "splash"));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo49977b(WebView webView, String str) {
        C24253a aVar = this.f64309a;
        long d = m59323d();
        JSONObject b = m59320b();
        String str2 = null;
        JSONObject b2 = m59321b(null);
        boolean z = true;
        if (webView != null && !TextUtils.isEmpty(str) && !aVar.f64370d && !aVar.f64371e) {
            aVar.f64369c = System.currentTimeMillis();
            aVar.f64371e = true;
            aVar.mo50023a(webView.getContext(), str, d, b, b2);
        }
        C10578a b3 = this.f64316k.mo50019b();
        if (b3 != null && (b3 instanceof C24310h)) {
            if (VERSION.SDK_INT < 21) {
                z = false;
            }
            if (z) {
                String jSONObject = ((C24310h) b3).mo50066d().toString();
                C52711k.m112236a((Object) jSONObject, "it.getAdInfoMethodObj().toString()");
                if (!TextUtils.isEmpty(jSONObject) && webView != null) {
                    IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
                    if (createIAdServicebyMonsterPlugin != null) {
                        C22412b adLandPagePreloadService = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService();
                        if (adLandPagePreloadService != null) {
                            str2 = adLandPagePreloadService.mo46658d(jSONObject);
                        }
                    }
                    if (VERSION.SDK_INT >= 21 && !TextUtils.isEmpty(str2)) {
                        webView.evaluateJavascript(str2, C24237a.f64313a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo49972a(WebView webView, String str, String str2) {
        C24253a aVar = this.f64309a;
        long d = m59323d();
        JSONObject b = m59320b();
        JSONObject b2 = m59321b(str2);
        aVar.f64372f = true;
        aVar.mo50023a(webView.getContext(), str, d, b, b2);
    }
}

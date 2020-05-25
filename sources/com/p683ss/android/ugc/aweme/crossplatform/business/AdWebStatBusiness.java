package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.ies.C10174a;
import com.p683ss.android.sdk.webview.C19761i.C19762a;
import com.p683ss.android.sdk.webview.C19763j;
import com.p683ss.android.sdk.webview.C19767n;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.commercialize.C25944j;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25898a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p683ss.android.ugc.aweme.crossplatform.business.p1614a.C27170a;
import com.p683ss.android.ugc.aweme.crossplatform.business.p1614a.C27170a.C27171a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27192b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.web.C48264a;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness */
public class AdWebStatBusiness extends Business {

    /* renamed from: a */
    private static ConcurrentHashMap<String, String> f71625a;

    /* renamed from: b */
    private long f71626b;

    /* renamed from: c */
    private boolean f71627c;

    /* renamed from: d */
    private final C27170a f71628d = new C27170a();

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0048 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[Catch:{ a -> 0x0073 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55479a(java.util.List<java.util.regex.Pattern> r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.crossplatform.c.a.a r0 = r3.f71633j
            com.ss.android.ugc.aweme.crossplatform.c.b r0 = r0.f71719b
            java.lang.String r1 = r0.f71766u
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0074
            int r1 = r0.f71767v
            r2 = 4
            if (r1 == r2) goto L_0x0012
            goto L_0x0074
        L_0x0012:
            boolean r0 = r0.f71743G
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            if (r4 != 0) goto L_0x001e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001e:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x0048 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig r0 = r0.getAdLandingPageConfig()     // Catch:{ a -> 0x0048 }
            java.util.List r0 = r0.getAdLandingPagePreloadCommonPrefix()     // Catch:{ a -> 0x0048 }
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)     // Catch:{ a -> 0x0048 }
            if (r1 != 0) goto L_0x0048
            java.util.Iterator r0 = r0.iterator()     // Catch:{ a -> 0x0048 }
        L_0x0034:
            boolean r1 = r0.hasNext()     // Catch:{ a -> 0x0048 }
            if (r1 == 0) goto L_0x0048
            java.lang.Object r1 = r0.next()     // Catch:{ a -> 0x0048 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ a -> 0x0048 }
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch:{ a -> 0x0048 }
            r4.add(r1)     // Catch:{ a -> 0x0048 }
            goto L_0x0034
        L_0x0048:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x0073 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig r0 = r0.getAdLandingPageConfig()     // Catch:{ a -> 0x0073 }
            java.util.List r0 = r0.getAdCardPreloadCommonPrefix()     // Catch:{ a -> 0x0073 }
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)     // Catch:{ a -> 0x0073 }
            if (r1 != 0) goto L_0x0072
            java.util.Iterator r0 = r0.iterator()     // Catch:{ a -> 0x0073 }
        L_0x005e:
            boolean r1 = r0.hasNext()     // Catch:{ a -> 0x0073 }
            if (r1 == 0) goto L_0x0072
            java.lang.Object r1 = r0.next()     // Catch:{ a -> 0x0073 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ a -> 0x0073 }
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch:{ a -> 0x0073 }
            r4.add(r1)     // Catch:{ a -> 0x0073 }
            goto L_0x005e
        L_0x0072:
            return
        L_0x0073:
            return
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness.mo55479a(java.util.List):void");
    }

    /* renamed from: a */
    public final void mo55480a(boolean z) {
        Activity a = C23729p.m58248a(this.f71631h.getContext());
        C27192b bVar = this.f71633j.f71719b;
        if (a != null) {
            JSONObject a2 = m65519a(bVar);
            long currentTimeMillis = System.currentTimeMillis() - this.f71626b;
            this.f71626b = 0;
            if (bVar.f71746a > 0) {
                if (currentTimeMillis > 0 && !this.f71627c) {
                    C27170a aVar = this.f71628d;
                    long j = bVar.f71746a;
                    JSONObject a3 = m65520a(bVar, (String) null);
                    if (j > 0 && aVar.f71681f != null) {
                        JSONObject jSONObject = a2 == null ? new JSONObject() : a2;
                        try {
                            jSONObject.put("is_ad_event", "1");
                            jSONObject.put("tag", "draw_ad");
                            if (a3 == null) {
                                a3 = new JSONObject();
                            }
                            a3.put("present_url", aVar.f71681f);
                            jSONObject.put("ad_extra_data", a3.toString());
                        } catch (JSONException unused) {
                        }
                        C26890h.onEvent(MobClick.obtain().setLabelName("stay_page").setEventName("ad_wap_stat").setValue(String.valueOf(j)).setExtValueLong(currentTimeMillis).setJsonObject(jSONObject));
                    }
                    this.f71627c = true;
                }
                if (z || a.isFinishing()) {
                    this.f71628d.mo55519a(this.f71631h.getContext(), (String) null, bVar.f71746a, a2, m65520a(bVar, (String) null));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo55473a() {
        this.f71626b = System.currentTimeMillis();
        this.f71627c = false;
        this.f71628d.mo55518a();
    }

    public AdWebStatBusiness(C27173c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    private static JSONObject m65519a(C27192b bVar) {
        JSONObject jSONObject;
        try {
            if (!TextUtils.isEmpty(bVar.f71756k)) {
                jSONObject = new JSONObject(bVar.f71756k);
            } else {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("log_extra", bVar.f71754i);
                return jSONObject;
            } catch (Exception unused) {
                return jSONObject;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo55478a(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("bytedance://log_event_v3")) {
            try {
                Uri parse = Uri.parse(str);
                if ("log_event_v3".equals(parse.getHost())) {
                    C26890h.m65012a(parse.getQueryParameter("event"), new JSONObject(parse.getQueryParameter("params")));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m65520a(C27192b bVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_web_url", bVar.f71768w);
            if (!TextUtils.isEmpty(bVar.f71766u) && bVar.f71768w == 1) {
                jSONObject.put("channel_name", bVar.f71766u);
                jSONObject.put("landing_type", AdServiceImpl.createIAdServicebyMonsterPlugin().getAdLandPagePreloadService().mo46651a(bVar.f71766u));
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("fail_reason", str);
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo55481b(WebView webView, String str) {
        C27192b bVar = this.f71633j.f71719b;
        C27170a aVar = this.f71628d;
        long j = bVar.f71746a;
        JSONObject a = m65519a(bVar);
        JSONObject a2 = m65520a(bVar, (String) null);
        boolean z = true;
        if (webView != null && !TextUtils.isEmpty(str) && !aVar.f71679d && !aVar.f71680e) {
            aVar.f71678c = System.currentTimeMillis();
            aVar.f71680e = true;
            aVar.mo55519a(webView.getContext(), str, j, a, a2);
        }
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        if (!(!z || createIAdServicebyMonsterPlugin == null || createIAdServicebyMonsterPlugin.getAdLandPagePreloadService() == null)) {
            String jSONObject = bVar.mo55536a().toString();
            if (!TextUtils.isEmpty(jSONObject) && webView != null) {
                String d = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46658d(jSONObject);
                if (VERSION.SDK_INT >= 21 && !TextUtils.isEmpty(d)) {
                    webView.evaluateJavascript(d, C27172b.f71691a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo55475a(WebView webView, String str) {
        String str2;
        f71625a = null;
        C27192b bVar = this.f71633j.f71719b;
        C27170a aVar = this.f71628d;
        boolean z = true;
        if (!(webView == null || TextUtils.isEmpty(str) || bVar == null)) {
            if (aVar.f71681f == null) {
                aVar.f71681f = str;
            }
            if (aVar.f71676a == 0) {
                aVar.f71676a = System.currentTimeMillis();
            }
            String str3 = bVar.f71766u;
            if (bVar.f71767v == 7) {
                aVar.f71677b = 5;
            } else if (!TextUtils.isEmpty(str3) && bVar.f71768w == 1) {
                aVar.f71677b = C25944j.m62908a().getPreloadAdWebHelper().mo53226b(str3);
            }
        }
        if (!str.equals(QuickShopBusiness.f64351b)) {
            C25898a preloadAdWebHelper = C25944j.m62908a().getPreloadAdWebHelper();
            String str4 = bVar.f71766u;
            int i = bVar.f71767v;
            int i2 = bVar.f71768w;
            String str5 = bVar.f71754i;
            if (bVar == null) {
                str2 = "";
            } else {
                str2 = bVar.f71758m;
                if (TextUtils.isEmpty(str2)) {
                    str2 = String.valueOf(bVar.f71746a);
                }
            }
            preloadAdWebHelper.mo53222a(str4, i, i2, str5, str2);
        }
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        if (!(!z || createIAdServicebyMonsterPlugin == null || createIAdServicebyMonsterPlugin.getAdLandPagePreloadService() == null)) {
            try {
                createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46657c(C32816h.m75716b().getAdLandingPageConfig().getAnalytics());
            } catch (C10174a unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo55482c(WebView webView, String str) {
        boolean z;
        C27192b bVar = this.f71633j.f71719b;
        C27170a aVar = this.f71628d;
        long j = bVar.f71746a;
        JSONObject a = m65519a(bVar);
        JSONObject a2 = m65520a(bVar, (String) null);
        boolean z2 = false;
        if (webView != null && !TextUtils.isEmpty(str)) {
            if (aVar.f71682g == null) {
                aVar.f71682g = aVar.f71681f;
            }
            if (TextUtils.isEmpty(webView.getOriginalUrl()) || TextUtils.equals(webView.getOriginalUrl(), str) || aVar.f71680e) {
                z = false;
            } else {
                z = true;
            }
            aVar.f71679d = z;
            aVar.mo55521a(str, j, a, a2);
            aVar.f71682g = str;
        }
        C27170a aVar2 = this.f71628d;
        if (!TextUtils.isEmpty(webView.getUrl()) && !TextUtils.equals(webView.getUrl(), str) && !aVar2.f71680e) {
            z2 = true;
        }
        if (z2 && !TextUtils.isEmpty(C27171a.f71686a) && !aVar2.f71683h) {
            aVar2.f71683h = true;
            if (C27171a.f71688c) {
                C26077e.m63190a().mo53605j(C27171a.f71686a).mo53582a("redirect").mo53601f(C27171a.f71690e).mo53600e(C27171a.f71689d).mo53580a(Long.valueOf(bVar.f71746a)).mo53604i(bVar.f71754i).mo53599d();
                return;
            }
            C26077e.m63190a().mo53582a(C27171a.f71686a).mo53593b("redirect").mo53602g(C27171a.f71687b).mo53580a(Long.valueOf(bVar.f71746a)).mo53604i(bVar.f71754i).mo53597c();
        }
    }

    /* renamed from: a */
    public final void mo55477a(C19763j jVar, C19767n nVar) {
        C27192b bVar = this.f71633j.f71719b;
        if (!TextUtils.isEmpty(bVar.f71766u) && bVar.f71767v == 4 && bVar.f71768w == 1) {
            try {
                if (!C32816h.m75716b().getAdLandingPageConfig().getAdLandingPagePreloadEnabled().booleanValue()) {
                    return;
                }
            } catch (Exception unused) {
            }
            IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
            if (!(createIAdServicebyMonsterPlugin == null || createIAdServicebyMonsterPlugin.getAdLandPagePreloadService() == null)) {
                String e = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46659e(C22858c.f61207c);
                String str = bVar.f71766u;
                if (!TextUtils.isEmpty(e)) {
                    jVar.mo41195a((C19762a) new C48264a(nVar.mo41206a(e), str, C22858c.f61207c));
                }
                String e2 = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46659e("splash");
                if (!TextUtils.isEmpty(e2)) {
                    jVar.mo41195a((C19762a) new C48264a(nVar.mo41206a(e2), str, "splash"));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo55474a(WebView webView, WebResourceRequest webResourceRequest, String str) {
        if (webView != null && webResourceRequest != null && VERSION.SDK_INT >= 23 && webResourceRequest.isForMainFrame()) {
            mo55476a(webView, webResourceRequest.getUrl().toString(), str);
        }
    }

    /* renamed from: a */
    public final void mo55476a(WebView webView, String str, String str2) {
        C27192b bVar = this.f71633j.f71719b;
        this.f71628d.mo55520a(webView, str, bVar.f71746a, m65519a(bVar), m65520a(bVar, str2));
    }
}

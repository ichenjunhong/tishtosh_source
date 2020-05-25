package com.p683ss.android.ugc.aweme.bullet.module.p1477ad;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.C10524g;
import com.bytedance.ies.bullet.kit.web.C10529l;
import com.bytedance.ies.bullet.kit.web.C10530m;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p641h.C10345a;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.newmedia.eplatform.C19550a;
import com.p683ss.android.newmedia.eplatform.C19550a.C19551a;
import com.p683ss.android.ugc.aweme.C22787ap;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.C24254b;
import com.p683ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness.C24249a;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.XpathBusiness;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24336d;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24337e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22534w;
import java.net.URISyntaxException;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.a */
public final class C24295a extends C24337e implements C19551a {

    /* renamed from: c */
    private final Set<String> f64428c = new LinkedHashSet();

    /* renamed from: d */
    private long f64429d = -1;

    /* renamed from: a */
    public final void mo18608a(C10524g gVar, String str, Bitmap bitmap) {
        C52711k.m112240b(gVar, "kitContainerApi");
        this.f64429d = SystemClock.elapsedRealtime();
        super.mo18608a(gVar, str, bitmap);
        SSWebView a = m59684a(gVar);
        C24249a.m59360a(this.f64624a);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f64624a.mo50011a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo49971a((WebView) a, str);
        }
    }

    /* renamed from: a */
    public final void mo18607a(C10524g gVar, String str) {
        C52711k.m112240b(gVar, "kitContainerApi");
        super.mo18607a(gVar, str);
        SSWebView a = m59684a(gVar);
        XpathBusiness xpathBusiness = (XpathBusiness) this.f64624a.mo50011a(XpathBusiness.class);
        if (xpathBusiness != null) {
            xpathBusiness.xpathDirect(a);
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f64624a.mo50011a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo49977b(a, str);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f64624a.mo50011a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.mo49999a(str);
        }
        C10578a b = this.f64624a.mo50019b();
        String str2 = null;
        if (!(b instanceof C24336d)) {
            b = null;
        }
        C24336d dVar = (C24336d) b;
        if (dVar != null) {
            str2 = dVar.mo50132m();
        }
        QuickShopBusiness quickShopBusiness = (QuickShopBusiness) this.f64624a.mo50011a(QuickShopBusiness.class);
        if (quickShopBusiness != null && !TextUtils.equals(str, QuickShopBusiness.f64351b)) {
            quickShopBusiness.f64353a = true;
            quickShopBusiness.mo50006a(str2);
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f64624a.mo50011a(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.mo49988a((WebView) a);
        }
    }

    /* renamed from: a */
    public final void mo50035a(JSONObject jSONObject, boolean z) {
        C52711k.m112240b(jSONObject, "data");
        C10578a b = this.f64624a.mo50019b();
        if (!(b instanceof C24310h)) {
            b = null;
        }
        C24310h hVar = (C24310h) b;
        if (hVar != null) {
            Long l = (Long) hVar.f64502e.mo18457b();
            if ((l != null ? l.longValue() : 0) > 0) {
                m59686a(jSONObject, "creativeId", hVar.f64502e.mo18457b());
                if (!z) {
                    C23569o.m57776a("aweme_ad_landingpage_open_error", 1, jSONObject);
                } else if (this.f64429d > 0) {
                    m59686a(jSONObject, "duration", (Object) Long.valueOf(SystemClock.elapsedRealtime() - this.f64429d));
                }
                C23569o.m57776a("aweme_ad_landingpage_open_error_rate", z ^ true ? 1 : 0, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo40801a(String str) {
        return C52575l.m112125a((Iterable<? extends T>) this.f64428c, str);
    }

    /* renamed from: b */
    public final void mo40802b(String str) {
        if (!C52575l.m112125a((Iterable<? extends T>) this.f64428c, str) && !TextUtils.isEmpty(str) && str != null) {
            this.f64428c.add(str);
        }
    }

    /* renamed from: a */
    private static void m59506a(String str, C10524g gVar) {
        if (!TextUtils.isEmpty(str)) {
            C10345a g = gVar.mo18349g();
            if (g != null) {
                Uri parse = Uri.parse(str);
                C52711k.m112236a((Object) parse, "Uri.parse(rawUrl)");
                C22534w wVar = new C22534w(parse, "intent_scheme_", null, 4, null);
                g.mo18409a("webview_safe_log", "filter_scheme", wVar.getFormatData(), null, null);
            }
        }
    }

    /* renamed from: b */
    public final WebResourceResponse mo18611b(C10524g gVar, C10529l lVar) {
        Uri uri;
        C52711k.m112240b(gVar, "kitContainerApi");
        if (VERSION.SDK_INT >= 21) {
            if (lVar != null) {
                uri = lVar.mo18565a();
            } else {
                uri = null;
            }
            if (uri != null && (!lVar.mo18567c().isEmpty())) {
                PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f64624a.mo50011a(PassBackWebInfoBusiness.class);
                if (passBackWebInfoBusiness != null) {
                    passBackWebInfoBusiness.mo49990a(String.valueOf(lVar.mo18565a()), lVar.mo18567c());
                }
            }
        }
        return super.mo18611b(gVar, lVar);
    }

    /* renamed from: b */
    public final boolean mo18612b(C10524g gVar, String str) {
        boolean z;
        C52711k.m112240b(gVar, "kitContainerApi");
        WebView a = m59684a(gVar);
        C10578a b = this.f64624a.mo50019b();
        if (!(b instanceof C24310h)) {
            b = null;
        }
        C24310h hVar = (C24310h) b;
        if (hVar == null || !C19550a.m47847a(hVar.mo50130k())) {
            z = false;
        } else {
            z = true;
        }
        Boolean a2 = C19550a.m47846a(a, str, Boolean.valueOf(z), this);
        C52711k.m112236a((Object) a2, "BlockPolicy.ePlatformFil…Platform() == true, this)");
        if (a2.booleanValue()) {
            return true;
        }
        C10578a b2 = this.f64624a.mo50019b();
        if (!(b2 instanceof C24336d)) {
            b2 = null;
        }
        C24336d dVar = (C24336d) b2;
        if (dVar == null || !C52711k.m112239a((Object) (Boolean) dVar.f64614am.mo18457b(), (Object) Boolean.valueOf(true)) || str == null || !C52830p.m112413c(str, ".apk", false, 2, null)) {
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence) && str != null && C52830p.m112456b(charSequence, (CharSequence) "__back_url__", false, 2, (Object) null)) {
                StringBuilder sb = new StringBuilder(C23057c.f61424b);
                sb.append(C23018b.f61359a);
                sb.append("://adx");
                String encode = Uri.encode(sb.toString());
                C52711k.m112236a((Object) encode, "Uri.encode(AbsConstants.…Constants.AID + \"://adx\")");
                str = C52830p.m112401a(str, "__back_url__", encode, false, 4, (Object) null);
            }
            return m59509f(gVar, str);
        }
        Context a3 = C11010c.m22280a();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        a3.startActivity(intent);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x01ff A[Catch:{ Exception -> 0x02a1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0209 A[Catch:{ Exception -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0264 A[Catch:{ Exception -> 0x02a1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0265 A[Catch:{ Exception -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x029c A[Catch:{ Exception -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b A[SYNTHETIC, Splitter:B:22:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e1 A[Catch:{ Exception -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e6 A[Catch:{ Exception -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ed A[Catch:{ Exception -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0101 A[ADDED_TO_REGION, Catch:{ Exception -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0128 A[Catch:{ Exception -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x012d A[Catch:{ Exception -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0157 A[Catch:{ Exception -> 0x02a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0164 A[Catch:{ Exception -> 0x02a1 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m59509f(com.bytedance.ies.bullet.kit.web.C10524g r17, java.lang.String r18) {
        /*
            r16 = this;
            r9 = r16
            r2 = r18
            com.ss.android.ugc.aweme.bullet.business.b r0 = r9.f64624a
            android.app.Activity r0 = r0.mo50010a()
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r9.mo50133a(r0, r2)
            r10 = 1
            if (r0 == 0) goto L_0x0014
            return r10
        L_0x0014:
            boolean r0 = m59687e(r17, r18)
            if (r0 == 0) goto L_0x001b
            return r10
        L_0x001b:
            com.ss.android.ugc.aweme.bullet.business.b r0 = r9.f64624a
            android.app.Activity r0 = r0.mo50010a()
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64256d(r0, r2)
            if (r0 == 0) goto L_0x002a
            return r10
        L_0x002a:
            r11 = 0
            if (r2 != 0) goto L_0x002f
        L_0x002d:
            r0 = 0
            goto L_0x0068
        L_0x002f:
            android.net.Uri r0 = android.net.Uri.parse(r18)
            java.lang.String r1 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r1 = r0.getScheme()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r3 = "bytedance"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = r0.getHost()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r3 = "adPageHtmlContent"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.bullet.business.b r1 = r9.f64624a
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness> r3 = com.p683ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r1 = r1.mo50011a(r3)
            com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness r1 = (com.p683ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness) r1
            if (r1 == 0) goto L_0x0067
            r1.mo49987a(r0)
        L_0x0067:
            r0 = 1
        L_0x0068:
            if (r0 == 0) goto L_0x006b
            return r10
        L_0x006b:
            android.net.Uri r3 = android.net.Uri.parse(r18)     // Catch:{ Exception -> 0x02a1 }
            java.lang.String r0 = "uri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)     // Catch:{ Exception -> 0x02a1 }
            java.lang.String r0 = r3.getScheme()     // Catch:{ Exception -> 0x02a1 }
            r12 = 0
            if (r0 == 0) goto L_0x0099
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x02a1 }
            java.lang.String r4 = "Locale.getDefault()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)     // Catch:{ Exception -> 0x02a1 }
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch:{ Exception -> 0x02a1 }
            java.lang.String r1 = "(this as java.lang.String).toLowerCase(locale)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Exception -> 0x02a1 }
            r4 = r0
            goto L_0x009a
        L_0x0091:
            d.u r0 = new d.u     // Catch:{ Exception -> 0x02a1 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)     // Catch:{ Exception -> 0x02a1 }
            throw r0     // Catch:{ Exception -> 0x02a1 }
        L_0x0099:
            r4 = r12
        L_0x009a:
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x02a1 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x02a1 }
            if (r0 == 0) goto L_0x00a4
            return r11
        L_0x00a4:
            java.lang.String r0 = "about"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r4)     // Catch:{ Exception -> 0x02a1 }
            if (r0 == 0) goto L_0x00ad
            return r11
        L_0x00ad:
            com.ss.android.sdk.activity.a.a r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26529n.m64186a()     // Catch:{ Exception -> 0x02a1 }
            com.bytedance.ies.bullet.ui.common.view.SSWebView r7 = m59684a(r17)     // Catch:{ Exception -> 0x02a1 }
            if (r7 == 0) goto L_0x00bd
            boolean r1 = r7.mo18792a()     // Catch:{ Exception -> 0x02a1 }
            r5 = r1
            goto L_0x00be
        L_0x00bd:
            r5 = 1
        L_0x00be:
            com.ss.android.ugc.aweme.bullet.business.b r1 = r9.f64624a     // Catch:{ Exception -> 0x02a1 }
            com.bytedance.ies.bullet.ui.common.d.a r1 = r1.mo50019b()     // Catch:{ Exception -> 0x02a1 }
            boolean r6 = r1 instanceof com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h     // Catch:{ Exception -> 0x02a1 }
            if (r6 != 0) goto L_0x00c9
            r1 = r12
        L_0x00c9:
            com.ss.android.ugc.aweme.bullet.module.ad.h r1 = (com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h) r1     // Catch:{ Exception -> 0x02a1 }
            if (r1 == 0) goto L_0x00de
            com.bytedance.ies.bullet.b.i.b r1 = r1.f64506i     // Catch:{ Exception -> 0x02a1 }
            if (r1 == 0) goto L_0x00de
            java.lang.Object r1 = r1.mo18457b()     // Catch:{ Exception -> 0x02a1 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x02a1 }
            if (r1 == 0) goto L_0x00de
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x02a1 }
            goto L_0x00df
        L_0x00de:
            r1 = 0
        L_0x00df:
            if (r0 == 0) goto L_0x00e6
            java.util.List r6 = r0.getClickJumpAllowList()     // Catch:{ Exception -> 0x02a1 }
            goto L_0x00e7
        L_0x00e6:
            r6 = r12
        L_0x00e7:
            boolean r6 = com.p683ss.android.newmedia.C19562j.m47866a(r2, r4, r6)     // Catch:{ Exception -> 0x02a1 }
            if (r6 != 0) goto L_0x00fe
            if (r0 == 0) goto L_0x00f4
            java.util.List r6 = r0.getAutoJumpAllowList()     // Catch:{ Exception -> 0x02a1 }
            goto L_0x00f5
        L_0x00f4:
            r6 = r12
        L_0x00f5:
            boolean r6 = com.p683ss.android.newmedia.C19562j.m47866a(r2, r4, r6)     // Catch:{ Exception -> 0x02a1 }
            if (r6 == 0) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            r6 = 0
            goto L_0x00ff
        L_0x00fe:
            r6 = 1
        L_0x00ff:
            if (r0 == 0) goto L_0x010d
            if (r1 == 0) goto L_0x010d
            boolean r8 = r0.isJumpControlEnabled()     // Catch:{ Exception -> 0x02a1 }
            if (r8 == 0) goto L_0x010d
            if (r6 != 0) goto L_0x010d
            if (r5 == 0) goto L_0x0115
        L_0x010d:
            if (r0 != 0) goto L_0x0117
            if (r1 == 0) goto L_0x0117
            if (r6 != 0) goto L_0x0117
            if (r5 != 0) goto L_0x0117
        L_0x0115:
            r1 = 1
            goto L_0x0118
        L_0x0117:
            r1 = 0
        L_0x0118:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r8 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()     // Catch:{ Exception -> 0x02a1 }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r8 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r8     // Catch:{ Exception -> 0x02a1 }
            com.ss.android.ugc.aweme.bullet.business.b r13 = r9.f64624a     // Catch:{ Exception -> 0x02a1 }
            com.bytedance.ies.bullet.ui.common.d.a r13 = r13.mo50019b()     // Catch:{ Exception -> 0x02a1 }
            boolean r14 = r13 instanceof com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h     // Catch:{ Exception -> 0x02a1 }
            if (r14 != 0) goto L_0x0129
            r13 = r12
        L_0x0129:
            com.ss.android.ugc.aweme.bullet.module.ad.h r13 = (com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h) r13     // Catch:{ Exception -> 0x02a1 }
            if (r13 == 0) goto L_0x0142
            com.bytedance.ies.bullet.b.i.l r13 = r13.f64502e     // Catch:{ Exception -> 0x02a1 }
            if (r13 == 0) goto L_0x0142
            java.lang.Object r13 = r13.mo18457b()     // Catch:{ Exception -> 0x02a1 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ Exception -> 0x02a1 }
            if (r13 == 0) goto L_0x0142
            long r13 = r13.longValue()     // Catch:{ Exception -> 0x02a1 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x02a1 }
            goto L_0x0143
        L_0x0142:
            r13 = r12
        L_0x0143:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r8.getRawAdAwemeByAdId(r13)     // Catch:{ Exception -> 0x02a1 }
            if (r1 == 0) goto L_0x0155
            boolean r13 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64022c(r8)     // Catch:{ Exception -> 0x02a1 }
            if (r13 != 0) goto L_0x0155
            boolean r13 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64023d(r8)     // Catch:{ Exception -> 0x02a1 }
            if (r13 == 0) goto L_0x0200
        L_0x0155:
            if (r4 != 0) goto L_0x015a
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x02a1 }
        L_0x015a:
            com.ss.android.ugc.aweme.bullet.business.b r13 = r9.f64624a     // Catch:{ Exception -> 0x02a1 }
            android.app.Activity r13 = r13.mo50010a()     // Catch:{ Exception -> 0x02a1 }
            android.content.Context r13 = (android.content.Context) r13     // Catch:{ Exception -> 0x02a1 }
            if (r13 == 0) goto L_0x01fc
            java.lang.String r14 = r3.getScheme()     // Catch:{ Exception -> 0x02a1 }
            java.lang.String r15 = "market"
            boolean r14 = p2628d.p2639f.p2641b.C52711k.m112239a(r14, r15)     // Catch:{ Exception -> 0x02a1 }
            if (r14 == 0) goto L_0x0186
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26456b.m63968a(r13)     // Catch:{ Exception -> 0x02a1 }
            if (r6 == 0) goto L_0x0180
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26456b.m63969a(r13, r3)     // Catch:{ Exception -> 0x02a1 }
            if (r6 == 0) goto L_0x0183
            com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a.m63954b(r13, r8, r2)     // Catch:{ Exception -> 0x02a1 }
            goto L_0x0183
        L_0x0180:
            com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a.m63952a(r13, r8, r2)     // Catch:{ Exception -> 0x02a1 }
        L_0x0183:
            r6 = 1
            goto L_0x01fd
        L_0x0186:
            boolean r14 = com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26456b.m63971a(r3)     // Catch:{ Exception -> 0x02a1 }
            if (r14 == 0) goto L_0x019c
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26456b.m63968a(r13)     // Catch:{ Exception -> 0x02a1 }
            if (r6 == 0) goto L_0x01fc
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26456b.m63972b(r13, r3)     // Catch:{ Exception -> 0x02a1 }
            if (r6 == 0) goto L_0x0183
            com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a.m63954b(r13, r8, r2)     // Catch:{ Exception -> 0x02a1 }
            goto L_0x0183
        L_0x019c:
            boolean r14 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64227a(r3)     // Catch:{ Exception -> 0x02a1 }
            if (r14 == 0) goto L_0x01c4
            boolean r14 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64022c(r8)     // Catch:{ Exception -> 0x02a1 }
            if (r14 != 0) goto L_0x01ae
            boolean r14 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64023d(r8)     // Catch:{ Exception -> 0x02a1 }
            if (r14 == 0) goto L_0x01fc
        L_0x01ae:
            boolean r14 = com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a.m63957c(r13, r3)     // Catch:{ Exception -> 0x02a1 }
            if (r14 == 0) goto L_0x01fc
            if (r6 != 0) goto L_0x01ba
            com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a.m63956c(r13, r8, r2)     // Catch:{ Exception -> 0x02a1 }
            goto L_0x01fc
        L_0x01ba:
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a.m63953a(r13, r3)     // Catch:{ Exception -> 0x02a1 }
            if (r6 == 0) goto L_0x0183
            com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a.m63954b(r13, r8, r2)     // Catch:{ Exception -> 0x02a1 }
            goto L_0x0183
        L_0x01c4:
            boolean r14 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64022c(r8)     // Catch:{ Exception -> 0x02a1 }
            if (r14 != 0) goto L_0x01d0
            boolean r14 = com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64023d(r8)     // Catch:{ Exception -> 0x02a1 }
            if (r14 == 0) goto L_0x01fc
        L_0x01d0:
            boolean r14 = com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a.m63958d(r13, r3)     // Catch:{ Exception -> 0x02a1 }
            if (r14 == 0) goto L_0x01e6
            if (r6 != 0) goto L_0x01dc
            com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a.m63956c(r13, r8, r2)     // Catch:{ Exception -> 0x02a1 }
            goto L_0x01fc
        L_0x01dc:
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a.m63955b(r13, r3)     // Catch:{ Exception -> 0x02a1 }
            if (r6 == 0) goto L_0x0183
            com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a.m63954b(r13, r8, r2)     // Catch:{ Exception -> 0x02a1 }
            goto L_0x0183
        L_0x01e6:
            java.lang.String r6 = "sslocal"
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r4)     // Catch:{ Exception -> 0x02a1 }
            r6 = r6 ^ r10
            if (r6 == 0) goto L_0x01fc
            java.lang.String r6 = "localsdk"
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r4)     // Catch:{ Exception -> 0x02a1 }
            r6 = r6 ^ r10
            if (r6 == 0) goto L_0x01fc
            com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26450a.m63952a(r13, r8, r2)     // Catch:{ Exception -> 0x02a1 }
            goto L_0x0183
        L_0x01fc:
            r6 = 0
        L_0x01fd:
            if (r6 == 0) goto L_0x0200
            return r10
        L_0x0200:
            java.lang.String r6 = "http"
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r4)     // Catch:{ Exception -> 0x02a1 }
            r6 = r6 ^ r10
            if (r6 == 0) goto L_0x0290
            java.lang.String r6 = "https"
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r4)     // Catch:{ Exception -> 0x02a1 }
            r6 = r6 ^ r10
            if (r6 == 0) goto L_0x0290
            boolean r6 = m59508a(r4, r5, r2, r7)     // Catch:{ Exception -> 0x02a1 }
            if (r6 == 0) goto L_0x0219
            return r10
        L_0x0219:
            if (r1 == 0) goto L_0x021f
            com.p683ss.android.ugc.aweme.crossplatform.platform.C27202a.m65622a(r2, r5, r10)     // Catch:{ Exception -> 0x02a1 }
            return r10
        L_0x021f:
            if (r0 == 0) goto L_0x0227
            boolean r0 = r0.isClickControlEnabled()     // Catch:{ Exception -> 0x02a1 }
            if (r0 == 0) goto L_0x023b
        L_0x0227:
            if (r5 != 0) goto L_0x023b
            if (r2 != 0) goto L_0x022e
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x02a1 }
        L_0x022e:
            java.lang.String r0 = ".apk"
            r1 = 2
            boolean r0 = p2628d.p2650m.C52830p.m112413c(r2, r0, r11, r1, r12)     // Catch:{ Exception -> 0x02a1 }
            if (r0 == 0) goto L_0x023b
            com.p683ss.android.ugc.aweme.crossplatform.platform.C27202a.m65623b(r2, r5, r10)     // Catch:{ Exception -> 0x02a1 }
            return r10
        L_0x023b:
            com.p683ss.android.ugc.aweme.crossplatform.platform.C27202a.m65624c(r2, r5, r10)     // Catch:{ Exception -> 0x02a1 }
            java.lang.String r0 = "sslocal"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r4)     // Catch:{ Exception -> 0x02a1 }
            if (r0 != 0) goto L_0x0251
            java.lang.String r0 = "localsdk"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r4)     // Catch:{ Exception -> 0x02a1 }
            if (r0 == 0) goto L_0x024f
            goto L_0x0251
        L_0x024f:
            r13 = r2
            goto L_0x0256
        L_0x0251:
            java.lang.String r0 = com.p683ss.android.newmedia.p1196b.C19543a.m47829a(r18)     // Catch:{ Exception -> 0x02a1 }
            r13 = r0
        L_0x0256:
            r0 = r16
            r1 = r8
            r2 = r18
            r6 = r13
            r8 = r17
            boolean r0 = r0.m59507a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x02a1 }
            if (r0 == 0) goto L_0x0265
            return r10
        L_0x0265:
            com.ss.android.ugc.aweme.bullet.business.b r0 = r9.f64624a     // Catch:{ Exception -> 0x02a1 }
            android.app.Activity r0 = r0.mo50010a()     // Catch:{ Exception -> 0x02a1 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ Exception -> 0x02a1 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x02a1 }
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r3 = android.net.Uri.parse(r13)     // Catch:{ Exception -> 0x02a1 }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x02a1 }
            boolean r0 = com.p683ss.android.common.util.C18920g.m46049a(r0, r1)     // Catch:{ Exception -> 0x02a1 }
            if (r0 == 0) goto L_0x0284
            com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba.m63878b()     // Catch:{ Exception -> 0x02a1 }
            com.p683ss.android.ugc.aweme.commercialize.utils.C26415ba.m63875a()     // Catch:{ Exception -> 0x02a1 }
        L_0x0284:
            com.ss.android.ugc.aweme.bullet.business.b r0 = r9.f64624a     // Catch:{ Exception -> 0x028f }
            android.app.Activity r0 = r0.mo50010a()     // Catch:{ Exception -> 0x028f }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ Exception -> 0x028f }
            com.p683ss.android.newmedia.p1196b.C19543a.m47830a(r0, r13, r12)     // Catch:{ Exception -> 0x028f }
        L_0x028f:
            return r10
        L_0x0290:
            com.ss.android.ugc.aweme.bullet.business.b r0 = r9.f64624a     // Catch:{ Exception -> 0x02a1 }
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness> r1 = com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r0 = r0.mo50011a(r1)     // Catch:{ Exception -> 0x02a1 }
            com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness r0 = (com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness) r0     // Catch:{ Exception -> 0x02a1 }
            if (r0 == 0) goto L_0x02a1
            android.webkit.WebView r7 = (android.webkit.WebView) r7     // Catch:{ Exception -> 0x02a1 }
            r0.mo49978c(r7, r2)     // Catch:{ Exception -> 0x02a1 }
        L_0x02a1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24295a.m59509f(com.bytedance.ies.bullet.kit.web.g, java.lang.String):boolean");
    }

    public C24295a(C10326b bVar, C24254b bVar2, C10530m mVar) {
        C52711k.m112240b(bVar, "ctx");
        C52711k.m112240b(bVar2, "bulletBusiness");
        super(bVar, bVar2, mVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18605a(com.bytedance.ies.bullet.kit.web.C10524g r3, android.webkit.WebResourceRequest r4, android.webkit.WebResourceResponse r5) {
        /*
            r2 = this;
            java.lang.String r0 = "kitContainerApi"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            super.mo18605a(r3, r4, r5)
            com.bytedance.ies.bullet.ui.common.view.SSWebView r3 = m59684a(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0039
            com.ss.android.ugc.aweme.bullet.business.b r0 = r2.f64624a
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness> r1 = com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r0 = r0.mo50011a(r1)
            com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness r0 = (com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness) r0
            if (r0 == 0) goto L_0x0039
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            r1 = 0
            if (r4 == 0) goto L_0x002e
            android.net.Uri r4 = r4.getUrl()
            if (r4 == 0) goto L_0x002e
            java.lang.String r4 = r4.toString()
            goto L_0x002f
        L_0x002e:
            r4 = r1
        L_0x002f:
            if (r5 == 0) goto L_0x0035
            java.lang.String r1 = r5.getReasonPhrase()
        L_0x0035:
            r0.mo49972a(r3, r4, r1)
            return
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24295a.mo18605a(com.bytedance.ies.bullet.kit.web.g, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18606a(com.bytedance.ies.bullet.kit.web.C10524g r3, com.bytedance.ies.bullet.kit.web.C10529l r4, com.bytedance.ies.bullet.kit.web.C10528k r5) {
        /*
            r2 = this;
            java.lang.String r0 = "kitContainerApi"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            super.mo18606a(r3, r4, r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x003e
            com.bytedance.ies.bullet.ui.common.view.SSWebView r3 = m59684a(r3)
            com.ss.android.ugc.aweme.bullet.business.b r0 = r2.f64624a
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness> r1 = com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r0 = r0.mo50011a(r1)
            com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness r0 = (com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness) r0
            if (r0 == 0) goto L_0x003e
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            r1 = 0
            if (r4 == 0) goto L_0x002e
            android.net.Uri r4 = r4.mo18565a()
            if (r4 == 0) goto L_0x002e
            java.lang.String r4 = r4.toString()
            goto L_0x002f
        L_0x002e:
            r4 = r1
        L_0x002f:
            if (r5 == 0) goto L_0x003b
            java.lang.CharSequence r5 = r5.mo18569b()
            if (r5 == 0) goto L_0x003b
            java.lang.String r1 = r5.toString()
        L_0x003b:
            r0.mo49972a(r3, r4, r1)
        L_0x003e:
            com.ss.android.ugc.aweme.bullet.business.b r3 = r2.f64624a
            java.lang.Class<com.ss.android.ugc.aweme.bullet.business.QuickShopBusiness> r4 = com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness.class
            com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business r3 = r3.mo50011a(r4)
            com.ss.android.ugc.aweme.bullet.business.QuickShopBusiness r3 = (com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness) r3
            if (r3 == 0) goto L_0x004e
            r3.mo50005a()
            return
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24295a.mo18606a(com.bytedance.ies.bullet.kit.web.g, com.bytedance.ies.bullet.kit.web.l, com.bytedance.ies.bullet.kit.web.k):void");
    }

    /* renamed from: a */
    private static boolean m59508a(String str, boolean z, String str2, SSWebView sSWebView) {
        Intent intent;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !C52711k.m112239a((Object) "intent", (Object) str) || z) {
            return false;
        }
        String str3 = null;
        try {
            intent = Intent.parseUri(str2, 1);
        } catch (URISyntaxException unused) {
            intent = null;
        }
        if (intent != null) {
            str3 = intent.getStringExtra("browser_fallback_url");
        }
        if (str3 == null) {
            return false;
        }
        if (sSWebView != null) {
            sSWebView.loadUrl(str3);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo18602a(C10524g gVar, int i, String str, String str2) {
        C52711k.m112240b(gVar, "kitContainerApi");
        super.mo18602a(gVar, i, str, str2);
        SSWebView a = m59684a(gVar);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f64624a.mo50011a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo49972a(a, str2, String.valueOf(i));
        }
        QuickShopBusiness quickShopBusiness = (QuickShopBusiness) this.f64624a.mo50011a(QuickShopBusiness.class);
        if (quickShopBusiness != null) {
            quickShopBusiness.mo50005a();
        }
    }

    /* renamed from: a */
    private final boolean m59507a(Aweme aweme, String str, Uri uri, String str2, boolean z, String str3, SSWebView sSWebView, C10524g gVar) {
        Intent intent;
        PackageManager packageManager;
        String str4;
        ComponentName componentName;
        if (TextUtils.isEmpty(str) || uri == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        C10578a b = this.f64624a.mo50019b();
        String str5 = null;
        if (!(b instanceof C24310h)) {
            b = null;
        }
        C24310h hVar = (C24310h) b;
        if (!(hVar == null || hVar.f64502e == null || hVar.f64502e.mo18457b() == null)) {
            Object b2 = hVar.f64502e.mo18457b();
            if (b2 == null) {
                C52711k.m112234a();
            }
            ((Number) b2).longValue();
        }
        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) awemeRawAd, "aweme.awemeRawAd!!");
            if (awemeRawAd.getGroupId() != null) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) awemeRawAd2, "aweme.awemeRawAd!!");
                String.valueOf(awemeRawAd2.getGroupId().longValue());
            }
        }
        if (C52711k.m112239a((Object) "market", (Object) str2)) {
            StringBuilder sb = new StringBuilder("【filterUrl】 = ");
            sb.append(str);
            sb.append(" 【market】 special handle");
            C18778a.m45848b("commerce_jump", sb.toString());
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(uri);
            intent2.addFlags(268435456);
            m59506a(str3, gVar);
            Activity a = this.f64624a.mo50010a();
            if (a != null) {
                a.startActivity(intent2);
            }
            return true;
        } else if (!C52711k.m112239a((Object) "intent", (Object) str2) || !z) {
            return false;
        } else {
            StringBuilder sb2 = new StringBuilder("【filterUrl】 = ");
            sb2.append(str);
            sb2.append(" 【intent】 special handle");
            C18778a.m45848b("commerce_jump", sb2.toString());
            C22787ap I = C23794bh.m58383I();
            C52711k.m112236a((Object) I, "LegacyServiceUtils.getCrossPlatformLegacyService()");
            try {
                intent = Intent.parseUri(str3, 1);
            } catch (URISyntaxException unused) {
                intent = null;
            }
            Activity a2 = this.f64624a.mo50010a();
            if (a2 != null) {
                packageManager = a2.getPackageManager();
            } else {
                packageManager = null;
            }
            if (packageManager != null) {
                if (intent != null) {
                    componentName = intent.resolveActivity(packageManager);
                } else {
                    componentName = null;
                }
                if (componentName != null) {
                    intent.addFlags(268435456);
                    m59506a(str3, gVar);
                    Activity a3 = this.f64624a.mo50010a();
                    if (a3 != null) {
                        a3.startActivity(intent);
                    }
                    return true;
                }
            }
            Intent intent3 = new Intent("android.intent.action.VIEW");
            if (intent != null && I.hasGP(this.f64624a.mo50010a())) {
                StringBuilder sb3 = new StringBuilder("market://details?id=");
                sb3.append(intent.getPackage());
                intent3.setData(Uri.parse(sb3.toString()));
                if (!(packageManager == null || intent3.resolveActivity(packageManager) == null)) {
                    intent.addFlags(268435456);
                    m59506a(str3, gVar);
                    Activity a4 = this.f64624a.mo50010a();
                    if (a4 != null) {
                        a4.startActivity(intent3);
                    }
                    return true;
                }
            }
            if (intent != null) {
                str4 = intent.getStringExtra("browser_fallback_url");
            } else {
                str4 = null;
            }
            if (str4 != null) {
                if (sSWebView != null) {
                    sSWebView.loadUrl(str4);
                }
                return true;
            } else if (I.hasGP(this.f64624a.mo50010a())) {
                return false;
            } else {
                Context a5 = this.f64624a.mo50010a();
                if (intent != null) {
                    str5 = intent.getPackage();
                }
                return I.openGPWebPage(a5, str5);
            }
        }
    }
}

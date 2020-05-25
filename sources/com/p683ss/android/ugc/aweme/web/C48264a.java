package com.p683ss.android.ugc.aweme.web;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.ies.geckoclient.C10878c;
import com.bytedance.ies.geckoclient.C10885e;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.p1320f.C22412b;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.web.p2398b.C48268a;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.web.a */
public final class C48264a extends C48268a {

    /* renamed from: a */
    public String f121465a;

    /* renamed from: b */
    public String f121466b;

    /* renamed from: c */
    public String f121467c;

    /* renamed from: e */
    private List<String> f121468e;

    /* renamed from: f */
    private final String f121469f = "shadow_landing";

    /* renamed from: a */
    public final String mo95775a() {
        return "";
    }

    /* renamed from: b */
    public final InputStream mo95776b(String str) {
        return null;
    }

    /* renamed from: b */
    private static List<String> m104545b() {
        try {
            return C32816h.m75716b().getAdLandingPageConfig().getAdLandingPagePreloadCommonPrefix();
        } catch (Throwable unused) {
            return C52575l.m112097a();
        }
    }

    /* renamed from: e */
    private static String m104547e(String str) {
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            return str;
        }
        int a = C52830p.m112415a(charSequence, '?', 0, false, 6, (Object) null);
        if (a == -1) {
            return str;
        }
        if (str != null) {
            String substring = str.substring(0, a);
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    public final String mo95777c(String str) {
        if ((str != null && C52830p.m112413c(str, ".shtml", false, 2, null)) || (str != null && C52830p.m112413c(str, ".do", false, 2, null))) {
            return "text/html";
        }
        String c = super.mo95777c(str);
        C52711k.m112236a((Object) c, "super.getMimeType(baseUrl)");
        return c;
    }

    /* renamed from: d */
    private final WebResourceResponse m104546d(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        if (createIAdServicebyMonsterPlugin != null) {
            C22412b adLandPagePreloadService = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService();
            if (adLandPagePreloadService != null && adLandPagePreloadService.mo46651a(this.f121466b) == 2) {
                return null;
            }
        }
        String e = m104547e(str);
        String c = mo95777c(e);
        if (C47731bq.m103352f()) {
            C48380q e2 = C48380q.m104672e();
            C52711k.m112236a((Object) e2, "WebOfflineConfig.getInstance()");
            str2 = C47731bq.m103346d(e2.mo41210d(), this.f121469f);
        } else {
            StringBuilder sb = new StringBuilder();
            C10885e e3 = C47731bq.m103348e();
            C52711k.m112236a((Object) e3, "GeckoUtils.getNormalGeckoClient()");
            sb.append(e3.f29209c);
            sb.append("/");
            sb.append(this.f121469f);
            str2 = sb.toString();
        }
        try {
            return m104557a(c, "", new FileInputStream(new File(str2, C10878c.m22048a(e))));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (r7.mo46651a(r0) == 2) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.webkit.WebResourceResponse mo41194a(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f121466b
            r1 = r9
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 != 0) goto L_0x00f5
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0017
            goto L_0x00f5
        L_0x0017:
            java.util.List<java.lang.String> r2 = r8.f121468e
            if (r2 != 0) goto L_0x0021
            java.util.List r2 = m104545b()
            r8.f121468e = r2
        L_0x0021:
            java.util.List<java.lang.String> r2 = r8.f121468e
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x0050
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = com.bytedance.common.utility.p522b.C9376b.m18558a(r7)
            if (r7 != 0) goto L_0x0050
            java.util.Iterator r2 = r2.iterator()
        L_0x0035:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0050
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r9 == 0) goto L_0x0035
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = p2628d.p2650m.C52830p.m112456b(r1, r7, r6, r5, r3)
            if (r7 != r4) goto L_0x0035
            android.webkit.WebResourceResponse r9 = r8.m104546d(r9)
            return r9
        L_0x0050:
            java.lang.String r1 = r8.f121467c
            com.ss.android.ugc.aweme.ad.services.IAdService r2 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.ad.services.IAdService r2 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r2
            if (r2 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.ad.f.b r2 = r2.getAdLandPagePreloadService()
            if (r2 == 0) goto L_0x0065
            java.lang.String r2 = r2.mo46656b(r0)
            goto L_0x0066
        L_0x0065:
            r2 = r3
        L_0x0066:
            boolean r1 = com.bytedance.common.utility.C9431p.m18665a(r1, r2)
            if (r1 != 0) goto L_0x006d
            return r3
        L_0x006d:
            boolean r1 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103352f()
            if (r1 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.ad.services.IAdService r1 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.ad.services.IAdService r1 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r1
            if (r1 == 0) goto L_0x008e
            com.ss.android.ugc.aweme.ad.f.b r1 = r1.getAdLandPagePreloadService()
            if (r1 == 0) goto L_0x008e
            java.lang.String r2 = r1.mo46656b(r0)
            java.lang.String r1 = r1.mo46659e(r2)
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103346d(r1, r0)
            goto L_0x00a6
        L_0x008e:
            r1 = r3
            goto L_0x00a6
        L_0x0090:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.f121465a
            r1.append(r2)
            r2 = 47
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
        L_0x00a6:
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00b0
            return r3
        L_0x00b0:
            if (r9 == 0) goto L_0x00f4
            java.lang.String r9 = m104547e(r9)
            java.lang.String r2 = r8.mo95777c(r9)
            com.ss.android.ugc.aweme.ad.services.IAdService r7 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.ad.services.IAdService r7 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r7
            if (r7 == 0) goto L_0x00cf
            com.ss.android.ugc.aweme.ad.f.b r7 = r7.getAdLandPagePreloadService()
            if (r7 == 0) goto L_0x00cf
            int r0 = r7.mo46651a(r0)
            if (r0 != r5) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r4 = 0
        L_0x00d0:
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00dc
            if (r4 == 0) goto L_0x00dc
            return r3
        L_0x00dc:
            java.lang.String r9 = com.bytedance.ies.geckoclient.C10878c.m22048a(r9)     // Catch:{ Throwable -> 0x00f3 }
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x00f3 }
            r0.<init>(r1, r9)     // Catch:{ Throwable -> 0x00f3 }
            java.lang.String r9 = ""
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x00f3 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x00f3 }
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ Throwable -> 0x00f3 }
            android.webkit.WebResourceResponse r9 = m104557a(r2, r9, r1)     // Catch:{ Throwable -> 0x00f3 }
            return r9
        L_0x00f3:
            return r3
        L_0x00f4:
            return r3
        L_0x00f5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.C48264a.mo41194a(java.lang.String):android.webkit.WebResourceResponse");
    }

    public C48264a(String str, String str2, String str3) {
        C52711k.m112240b(str, "geckoDir");
        C52711k.m112240b(str3, "scene");
        super(true);
        this.f121465a = str;
        this.f121466b = str2;
        this.f121467c = str3;
    }
}

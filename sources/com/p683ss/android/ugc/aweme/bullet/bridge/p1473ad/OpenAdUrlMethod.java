package com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26116c;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdUrlMethod */
public final class OpenAdUrlMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24123a f64008b = new C24123a(null);

    /* renamed from: c */
    private final String f64009c = "openAdUrl";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdUrlMethod$a */
    public static final class C24123a {
        private C24123a() {
        }

        public /* synthetic */ C24123a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdUrlMethod$b */
    static final class C24124b implements C26534a {

        /* renamed from: a */
        final /* synthetic */ C26116c f64010a;

        /* renamed from: b */
        final /* synthetic */ OpenAdUrlMethod f64011b;

        C24124b(C26116c cVar, OpenAdUrlMethod openAdUrlMethod) {
            this.f64010a = cVar;
            this.f64011b = openAdUrlMethod;
        }

        /* renamed from: a */
        public final void mo49915a(boolean z) {
            String str;
            C26080b a = C26077e.m63190a().mo53582a("draw_ad");
            if (z) {
                str = "deeplink_success";
            } else {
                str = "deeplink_failed";
            }
            a.mo53593b(str).mo53580a(Long.valueOf(this.f64010a.f68955a)).mo53604i(this.f64010a.f68956b).mo53592b(Long.valueOf(this.f64010a.f68957c)).mo53586a(this.f64011b.mo18743e());
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64009c;
    }

    public OpenAdUrlMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r8 != true) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0059, code lost:
        if (r8 != true) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49906a(org.json.JSONObject r12, com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a r13) {
        /*
            r11 = this;
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.String r0 = "iReturn"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            java.lang.String r0 = "func"
            java.lang.String r2 = r12.optString(r0)
            com.ss.android.ugc.aweme.commercialize.model.c r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26408az.m63874a()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "open_status"
            r4 = 0
            r1.put(r3, r4)
            java.lang.String r3 = "web_status"
            r1.put(r3, r4)
            java.lang.String r3 = "code"
            r5 = 1
            r1.put(r3, r5)
            java.lang.String r3 = "open_url"
            java.lang.String r3 = r12.optString(r3)
            java.lang.String r6 = "web_url"
            java.lang.String r6 = r12.optString(r6)
            java.lang.String r7 = "web_title"
            java.lang.String r7 = r12.optString(r7)
            java.lang.String r8 = "use_packaged_open_url"
            boolean r8 = r12.optBoolean(r8, r4)
            java.lang.String r9 = "use_packaged_web_url"
            boolean r9 = r12.optBoolean(r9, r4)
            r10 = 0
            if (r8 == 0) goto L_0x006d
            if (r3 == 0) goto L_0x005b
            r8 = r3
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x0058
            r8 = 1
            goto L_0x0059
        L_0x0058:
            r8 = 0
        L_0x0059:
            if (r8 == r5) goto L_0x006d
        L_0x005b:
            if (r0 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f68966l
            if (r3 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x006c
            java.lang.String r3 = r3.getOpenUrl()
            goto L_0x006d
        L_0x006c:
            r3 = r10
        L_0x006d:
            if (r9 == 0) goto L_0x00a3
            if (r6 == 0) goto L_0x007f
            r8 = r6
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x007c
            r8 = 1
            goto L_0x007d
        L_0x007c:
            r8 = 0
        L_0x007d:
            if (r8 == r5) goto L_0x00a3
        L_0x007f:
            if (r0 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r0.f68966l
            if (r6 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r6.getAwemeRawAd()
            if (r6 == 0) goto L_0x0090
            java.lang.String r6 = r6.getWebUrl()
            goto L_0x0091
        L_0x0090:
            r6 = r10
        L_0x0091:
            if (r0 == 0) goto L_0x00a2
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f68966l
            if (r7 == 0) goto L_0x00a2
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r7.getAwemeRawAd()
            if (r7 == 0) goto L_0x00a2
            java.lang.String r7 = r7.getWebTitle()
            goto L_0x00a3
        L_0x00a2:
            r7 = r10
        L_0x00a3:
            android.content.Context r8 = r11.mo18743e()
            if (r0 == 0) goto L_0x00ac
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r0.f68966l
            goto L_0x00ad
        L_0x00ac:
            r9 = r10
        L_0x00ad:
            boolean r8 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64220a(r8, r3, r9, r4)
            if (r8 == 0) goto L_0x00ba
            java.lang.String r0 = "open_status"
            r1.put(r0, r5)
            goto L_0x0163
        L_0x00ba:
            android.content.Context r8 = r11.mo18743e()
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64226a(r8, r3, r4)
            if (r3 == 0) goto L_0x0107
            java.lang.String r3 = "open_status"
            r1.put(r3, r5)
            if (r0 == 0) goto L_0x0163
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            java.lang.String r4 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r3.mo53582a(r4)
            java.lang.String r4 = "open_url_app"
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r3.mo53593b(r4)
            long r4 = r0.f68955a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r3.mo53580a(r4)
            java.lang.String r4 = r0.f68956b
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r3.mo53604i(r4)
            long r4 = r0.f68957c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r3.mo53592b(r4)
            android.content.Context r4 = r11.mo18743e()
            r3.mo53586a(r4)
            com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdUrlMethod$b r3 = new com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdUrlMethod$b
            r3.<init>(r0, r11)
            com.ss.android.ugc.aweme.commercialize.utils.q$a r3 = (com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a) r3
            com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64208a(r3)
            goto L_0x0163
        L_0x0107:
            android.content.Context r3 = r11.mo18743e()
            if (r0 == 0) goto L_0x010f
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r0.f68966l
        L_0x010f:
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64214a(r3, r10, r6, r7)
            if (r3 == 0) goto L_0x011b
            java.lang.String r0 = "web_status"
            r1.put(r0, r5)
            goto L_0x0163
        L_0x011b:
            android.content.Context r3 = r11.mo18743e()
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64222a(r3, r6, r7)
            if (r3 == 0) goto L_0x015e
            java.lang.String r3 = "web_status"
            r1.put(r3, r5)
            if (r0 == 0) goto L_0x0163
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            java.lang.String r4 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r3.mo53582a(r4)
            java.lang.String r4 = "open_url_h5"
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r3.mo53593b(r4)
            long r4 = r0.f68955a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r3.mo53580a(r4)
            java.lang.String r4 = r0.f68956b
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r3.mo53604i(r4)
            long r4 = r0.f68957c
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r3.mo53592b(r0)
            android.content.Context r3 = r11.mo18743e()
            r0.mo53586a(r3)
            goto L_0x0163
        L_0x015e:
            java.lang.String r0 = "code"
            r1.put(r0, r4)
        L_0x0163:
            if (r13 == 0) goto L_0x0168
            r13.mo49913a(r1)
        L_0x0168:
            com.ss.android.ugc.aweme.commercialize.d.j r13 = new com.ss.android.ugc.aweme.commercialize.d.j
            java.lang.String r0 = "func"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r0)
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r1 = r13
            r3 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.OpenAdUrlMethod.mo49906a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}

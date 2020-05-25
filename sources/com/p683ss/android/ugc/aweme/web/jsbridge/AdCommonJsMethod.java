package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26116c;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod */
public final class AdCommonJsMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C48281a f121495b = new C48281a(null);

    /* renamed from: a */
    public final WeakReference<Context> f121496a;

    /* renamed from: c */
    private final C10757a f121497c;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$a */
    public static final class C48281a {
        private C48281a() {
        }

        public /* synthetic */ C48281a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$b */
    static final class C48282b implements C26534a {

        /* renamed from: a */
        final /* synthetic */ C26116c f121498a;

        /* renamed from: b */
        final /* synthetic */ AdCommonJsMethod f121499b;

        C48282b(C26116c cVar, AdCommonJsMethod adCommonJsMethod) {
            this.f121498a = cVar;
            this.f121499b = adCommonJsMethod;
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
            a.mo53593b(str).mo53580a(Long.valueOf(this.f121498a.f68955a)).mo53604i(this.f121498a.f68956b).mo53592b(Long.valueOf(this.f121498a.f68957c)).mo53586a((Context) this.f121499b.f121496a.get());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$c */
    static final class C48283c extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        final /* synthetic */ C26116c f121500a;

        C48283c(C26116c cVar) {
            this.f121500a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            if (booleanValue) {
                C26080b b = bVar.mo53590b(this.f121500a.f68966l);
                C52711k.m112236a((Object) b, "fill(adInfo.aweme)");
                return b;
            }
            C26080b a = bVar.mo53578a(this.f121500a.f68966l);
            C52711k.m112236a((Object) a, "adId(adInfo.aweme)");
            return a;
        }
    }

    private AdCommonJsMethod(WeakReference<Context> weakReference, C10757a aVar) {
        super(aVar);
        this.f121496a = weakReference;
        this.f121497c = aVar;
        C10757a aVar2 = this.f121497c;
        if (aVar2 != null) {
            C10762d dVar = this;
            aVar2.mo19450a("sendAdLog", dVar);
            aVar2.mo19450a("messageTip", dVar);
            aVar2.mo19450a("openAdUrl", dVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        if (r12 != true) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (r12 != true) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49914a(org.json.JSONObject r19, com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a r20) {
        /*
            r18 = this;
            r1 = r18
            r4 = r19
            r2 = r20
            if (r4 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r0 = "func"
            java.lang.String r3 = r4.optString(r0)
            com.ss.android.ugc.aweme.commercialize.model.c r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26408az.m63874a()
            if (r3 != 0) goto L_0x0017
            goto L_0x0300
        L_0x0017:
            int r5 = r3.hashCode()
            r6 = -1690732780(0xffffffff9b397714, float:-1.5341318E-22)
            r7 = -1
            r8 = 0
            if (r5 == r6) goto L_0x02ce
            r6 = -1491591(0xffffffffffe93d79, float:NaN)
            r9 = 1
            r10 = 0
            if (r5 == r6) goto L_0x01a3
            r6 = 1518137890(0x5a7cf222, float:1.77994805E16)
            if (r5 == r6) goto L_0x0030
            goto L_0x0300
        L_0x0030:
            java.lang.String r5 = "openAdUrl"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0300
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "open_status"
            r5.put(r6, r10)
            java.lang.String r6 = "web_status"
            r5.put(r6, r10)
            java.lang.String r6 = "code"
            r5.put(r6, r9)
            java.lang.String r6 = "open_url"
            java.lang.String r6 = r4.optString(r6)
            java.lang.String r7 = "web_url"
            java.lang.String r7 = r4.optString(r7)
            java.lang.String r11 = "web_title"
            java.lang.String r11 = r4.optString(r11)
            java.lang.String r12 = "use_packaged_open_url"
            boolean r12 = r4.optBoolean(r12, r10)
            java.lang.String r13 = "use_packaged_web_url"
            boolean r13 = r4.optBoolean(r13, r10)
            if (r12 == 0) goto L_0x008e
            if (r6 == 0) goto L_0x007c
            r12 = r6
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x0079
            r12 = 1
            goto L_0x007a
        L_0x0079:
            r12 = 0
        L_0x007a:
            if (r12 == r9) goto L_0x008e
        L_0x007c:
            if (r0 == 0) goto L_0x008d
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r0.f68966l
            if (r6 == 0) goto L_0x008d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r6.getAwemeRawAd()
            if (r6 == 0) goto L_0x008d
            java.lang.String r6 = r6.getOpenUrl()
            goto L_0x008e
        L_0x008d:
            r6 = r8
        L_0x008e:
            if (r13 == 0) goto L_0x00c4
            if (r7 == 0) goto L_0x00a0
            r12 = r7
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x009d
            r12 = 1
            goto L_0x009e
        L_0x009d:
            r12 = 0
        L_0x009e:
            if (r12 == r9) goto L_0x00c4
        L_0x00a0:
            if (r0 == 0) goto L_0x00b1
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f68966l
            if (r7 == 0) goto L_0x00b1
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r7.getAwemeRawAd()
            if (r7 == 0) goto L_0x00b1
            java.lang.String r7 = r7.getWebUrl()
            goto L_0x00b2
        L_0x00b1:
            r7 = r8
        L_0x00b2:
            if (r0 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r0.f68966l
            if (r11 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r11.getAwemeRawAd()
            if (r11 == 0) goto L_0x00c3
            java.lang.String r11 = r11.getWebTitle()
            goto L_0x00c4
        L_0x00c3:
            r11 = r8
        L_0x00c4:
            java.lang.ref.WeakReference<android.content.Context> r12 = r1.f121496a
            java.lang.Object r12 = r12.get()
            android.content.Context r12 = (android.content.Context) r12
            if (r0 == 0) goto L_0x00d1
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r0.f68966l
            goto L_0x00d2
        L_0x00d1:
            r13 = r8
        L_0x00d2:
            boolean r12 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64220a(r12, r6, r13, r10)
            if (r12 == 0) goto L_0x00df
            java.lang.String r0 = "open_status"
            r5.put(r0, r9)
            goto L_0x019c
        L_0x00df:
            java.lang.ref.WeakReference<android.content.Context> r12 = r1.f121496a
            java.lang.Object r12 = r12.get()
            android.content.Context r12 = (android.content.Context) r12
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64226a(r12, r6, r10)
            if (r6 == 0) goto L_0x0134
            java.lang.String r6 = "open_status"
            r5.put(r6, r9)
            if (r0 == 0) goto L_0x019c
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            java.lang.String r7 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53582a(r7)
            java.lang.String r7 = "open_url_app"
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53593b(r7)
            long r7 = r0.f68955a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53580a(r7)
            java.lang.String r7 = r0.f68956b
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53604i(r7)
            long r7 = r0.f68957c
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53592b(r7)
            java.lang.ref.WeakReference<android.content.Context> r7 = r1.f121496a
            java.lang.Object r7 = r7.get()
            android.content.Context r7 = (android.content.Context) r7
            r6.mo53586a(r7)
            com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$b r6 = new com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$b
            r6.<init>(r0, r1)
            com.ss.android.ugc.aweme.commercialize.utils.q$a r6 = (com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a) r6
            com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64208a(r6)
            goto L_0x019c
        L_0x0134:
            java.lang.ref.WeakReference<android.content.Context> r6 = r1.f121496a
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r0 == 0) goto L_0x0140
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r0.f68966l
        L_0x0140:
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64214a(r6, r8, r7, r11)
            if (r6 == 0) goto L_0x014c
            java.lang.String r0 = "web_status"
            r5.put(r0, r9)
            goto L_0x019c
        L_0x014c:
            java.lang.ref.WeakReference<android.content.Context> r6 = r1.f121496a
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64222a(r6, r7, r11)
            if (r6 == 0) goto L_0x0197
            java.lang.String r6 = "web_status"
            r5.put(r6, r9)
            if (r0 == 0) goto L_0x019c
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            java.lang.String r7 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53582a(r7)
            java.lang.String r7 = "open_url_h5"
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53593b(r7)
            long r7 = r0.f68955a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53580a(r7)
            java.lang.String r7 = r0.f68956b
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53604i(r7)
            long r7 = r0.f68957c
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r6.mo53592b(r0)
            java.lang.ref.WeakReference<android.content.Context> r6 = r1.f121496a
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            r0.mo53586a(r6)
            goto L_0x019c
        L_0x0197:
            java.lang.String r0 = "code"
            r5.put(r0, r10)
        L_0x019c:
            if (r2 == 0) goto L_0x0300
            r2.mo60041a(r5)
            goto L_0x0300
        L_0x01a3:
            java.lang.String r5 = "sendAdLog"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0300
            java.lang.String r5 = "tag"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r6 = "label"
            java.lang.String r6 = r4.optString(r6)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r11 = "extParam"
            org.json.JSONObject r11 = r4.optJSONObject(r11)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r12 = "has_ad_info"
            boolean r12 = r4.optBoolean(r12, r10)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r13 = "tag"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r13)     // Catch:{ Exception -> 0x02c2 }
            r13 = r5
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13     // Catch:{ Exception -> 0x02c2 }
            int r13 = r13.length()     // Catch:{ Exception -> 0x02c2 }
            if (r13 <= 0) goto L_0x01d3
            r13 = 1
            goto L_0x01d4
        L_0x01d3:
            r13 = 0
        L_0x01d4:
            if (r13 == 0) goto L_0x0267
            java.lang.String r13 = "label"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r13)     // Catch:{ Exception -> 0x02c2 }
            r13 = r6
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13     // Catch:{ Exception -> 0x02c2 }
            int r13 = r13.length()     // Catch:{ Exception -> 0x02c2 }
            if (r13 <= 0) goto L_0x01e5
            goto L_0x01e6
        L_0x01e5:
            r9 = 0
        L_0x01e6:
            if (r9 == 0) goto L_0x0267
            if (r0 == 0) goto L_0x0267
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53582a(r5)     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53593b(r6)     // Catch:{ Exception -> 0x02c2 }
            long r12 = r0.f68955a     // Catch:{ Exception -> 0x02c2 }
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53580a(r10)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r10 = r0.f68956b     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53604i(r10)     // Catch:{ Exception -> 0x02c2 }
            long r12 = r0.f68957c     // Catch:{ Exception -> 0x02c2 }
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53592b(r10)     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53594b(r11)     // Catch:{ Exception -> 0x02c2 }
            java.lang.ref.WeakReference<android.content.Context> r10 = r1.f121496a     // Catch:{ Exception -> 0x02c2 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x02c2 }
            android.content.Context r10 = (android.content.Context) r10     // Catch:{ Exception -> 0x02c2 }
            r9.mo53586a(r10)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r9 = "draw_ad"
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r9)     // Catch:{ Exception -> 0x02c2 }
            if (r5 == 0) goto L_0x0260
            java.lang.String r5 = "click"
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r5)     // Catch:{ Exception -> 0x02c2 }
            if (r5 == 0) goto L_0x0260
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.f68966l     // Catch:{ Exception -> 0x02c2 }
            if (r5 == 0) goto L_0x0255
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r5.getAwemeRawAd()     // Catch:{ Exception -> 0x02c2 }
            if (r5 == 0) goto L_0x0255
            com.ss.android.ugc.aweme.commercialize.log.ay r12 = com.p683ss.android.ugc.aweme.commercialize.log.C26060ay.f68819a     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r13 = "click"
            com.ss.android.ugc.aweme.base.model.UrlModel r14 = r5.getClickTrackUrlList()     // Catch:{ Exception -> 0x02c2 }
            java.lang.Long r15 = r5.getCreativeId()     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r16 = r5.getLogExtra()     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$c r5 = new com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod$c     // Catch:{ Exception -> 0x02c2 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x02c2 }
            r17 = r5
            d.f.a.m r17 = (p2628d.p2639f.p2640a.C52682m) r17     // Catch:{ Exception -> 0x02c2 }
            r12.mo53545a(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x02c2 }
        L_0x0255:
            java.lang.String r0 = "draw_ad"
            java.lang.String r5 = "refer"
            java.lang.String r5 = r11.getString(r5)     // Catch:{ Exception -> 0x02c2 }
            com.p683ss.android.ugc.aweme.crossplatform.business.p1614a.C27170a.m65583a(r0, r5)     // Catch:{ Exception -> 0x02c2 }
        L_0x0260:
            if (r2 == 0) goto L_0x0300
            r2.mo60039a(r8)     // Catch:{ Exception -> 0x02c2 }
            goto L_0x0300
        L_0x0267:
            if (r12 == 0) goto L_0x02ba
            java.lang.String r0 = "creative_id"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r9 = "log_extra"
            java.lang.String r9 = r4.optString(r9)     // Catch:{ Exception -> 0x02c2 }
            java.lang.String r10 = "group_id"
            java.lang.String r10 = r4.optString(r10)     // Catch:{ Exception -> 0x02c2 }
            r12 = r0
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x02c2 }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x02c2 }
            if (r12 == 0) goto L_0x028d
            if (r2 == 0) goto L_0x0300
            java.lang.String r0 = "empty creativeId"
            r2.mo60038a(r7, r0)     // Catch:{ Exception -> 0x02c2 }
            goto L_0x0300
        L_0x028d:
            com.ss.android.ugc.aweme.commercialize.log.e$b r12 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r12.mo53582a(r5)     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r5 = r5.mo53593b(r6)     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r5.mo53596c(r0)     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53604i(r9)     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53598d(r10)     // Catch:{ Exception -> 0x02c2 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53594b(r11)     // Catch:{ Exception -> 0x02c2 }
            java.lang.ref.WeakReference<android.content.Context> r5 = r1.f121496a     // Catch:{ Exception -> 0x02c2 }
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x02c2 }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ Exception -> 0x02c2 }
            r0.mo53586a(r5)     // Catch:{ Exception -> 0x02c2 }
            if (r2 == 0) goto L_0x0300
            r2.mo60039a(r8)     // Catch:{ Exception -> 0x02c2 }
            goto L_0x0300
        L_0x02ba:
            if (r2 == 0) goto L_0x0300
            java.lang.String r0 = "empty tag or label"
            r2.mo60038a(r7, r0)     // Catch:{ Exception -> 0x02c2 }
            goto L_0x0300
        L_0x02c2:
            r0 = move-exception
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r0)
            if (r2 == 0) goto L_0x0300
            java.lang.String r0 = "unknown error"
            r2.mo60038a(r7, r0)
            goto L_0x0300
        L_0x02ce:
            java.lang.String r0 = "messageTip"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0300
            java.lang.String r0 = "msg"
            boolean r0 = r4.has(r0)
            if (r0 == 0) goto L_0x02f9
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.f121496a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r5 = "msg"
            java.lang.String r5 = r4.getString(r5)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21537a(r0, r5)
            r0.mo19066a()
            if (r2 == 0) goto L_0x0300
            r2.mo60039a(r8)
            goto L_0x0300
        L_0x02f9:
            if (r2 == 0) goto L_0x0300
            java.lang.String r0 = "empty msg"
            r2.mo60038a(r7, r0)
        L_0x0300:
            com.ss.android.ugc.aweme.commercialize.d.j r0 = new com.ss.android.ugc.aweme.commercialize.d.j
            java.lang.String r2 = "func"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r2)
            r5 = 0
            r6 = 0
            r7 = 12
            r8 = 0
            r2 = r0
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod.mo49914a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    public /* synthetic */ AdCommonJsMethod(WeakReference weakReference, C10757a aVar, C52707g gVar) {
        this(weakReference, aVar);
    }
}

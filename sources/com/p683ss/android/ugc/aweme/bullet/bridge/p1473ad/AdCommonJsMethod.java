package com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad;

import android.content.Context;
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

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdCommonJsMethod */
public final class AdCommonJsMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C24115a f63992b = new C24115a(null);

    /* renamed from: a */
    public final WeakReference<Context> f63993a;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdCommonJsMethod$a */
    public static final class C24115a {
        private C24115a() {
        }

        public /* synthetic */ C24115a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdCommonJsMethod$b */
    static final class C24116b implements C26534a {

        /* renamed from: a */
        final /* synthetic */ C26116c f63994a;

        /* renamed from: b */
        final /* synthetic */ AdCommonJsMethod f63995b;

        C24116b(C26116c cVar, AdCommonJsMethod adCommonJsMethod) {
            this.f63994a = cVar;
            this.f63995b = adCommonJsMethod;
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
            a.mo53593b(str).mo53580a(Long.valueOf(this.f63994a.f68955a)).mo53604i(this.f63994a.f68956b).mo53592b(Long.valueOf(this.f63994a.f68957c)).mo53586a((Context) this.f63995b.f63993a.get());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdCommonJsMethod$c */
    static final class C24117c extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        final /* synthetic */ C26116c f63996a;

        C24117c(C26116c cVar) {
            this.f63996a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            if (booleanValue) {
                C26080b b = bVar.mo53590b(this.f63996a.f68966l);
                C52711k.m112236a((Object) b, "fill(adInfo.aweme)");
                return b;
            }
            C26080b a = bVar.mo53578a(this.f63996a.f68966l);
            C52711k.m112236a((Object) a, "adId(adInfo.aweme)");
            return a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (r9 != true) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
        if (r9 != true) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ae  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49914a(org.json.JSONObject r13, com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a r14) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "func"
            java.lang.String r2 = r13.optString(r0)
            com.ss.android.ugc.aweme.commercialize.model.c r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26408az.m63874a()
            if (r2 != 0) goto L_0x0011
            goto L_0x02ee
        L_0x0011:
            int r1 = r2.hashCode()
            r3 = -1690732780(0xffffffff9b397714, float:-1.5341318E-22)
            r4 = -1
            r5 = 0
            if (r1 == r3) goto L_0x02bc
            r3 = -1491591(0xffffffffffe93d79, float:NaN)
            r6 = 1
            r7 = 0
            if (r1 == r3) goto L_0x019d
            r3 = 1518137890(0x5a7cf222, float:1.77994805E16)
            if (r1 == r3) goto L_0x002a
            goto L_0x02ee
        L_0x002a:
            java.lang.String r1 = "openAdUrl"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x02ee
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "open_status"
            r1.put(r3, r7)
            java.lang.String r3 = "web_status"
            r1.put(r3, r7)
            java.lang.String r3 = "code"
            r1.put(r3, r6)
            java.lang.String r3 = "open_url"
            java.lang.String r3 = r13.optString(r3)
            java.lang.String r4 = "web_url"
            java.lang.String r4 = r13.optString(r4)
            java.lang.String r8 = "web_title"
            java.lang.String r8 = r13.optString(r8)
            java.lang.String r9 = "use_packaged_open_url"
            boolean r9 = r13.optBoolean(r9, r7)
            java.lang.String r10 = "use_packaged_web_url"
            boolean r10 = r13.optBoolean(r10, r7)
            if (r9 == 0) goto L_0x0088
            if (r3 == 0) goto L_0x0076
            r9 = r3
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0073
            r9 = 1
            goto L_0x0074
        L_0x0073:
            r9 = 0
        L_0x0074:
            if (r9 == r6) goto L_0x0088
        L_0x0076:
            if (r0 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f68966l
            if (r3 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x0087
            java.lang.String r3 = r3.getOpenUrl()
            goto L_0x0088
        L_0x0087:
            r3 = r5
        L_0x0088:
            if (r10 == 0) goto L_0x00be
            if (r4 == 0) goto L_0x009a
            r9 = r4
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0097
            r9 = 1
            goto L_0x0098
        L_0x0097:
            r9 = 0
        L_0x0098:
            if (r9 == r6) goto L_0x00be
        L_0x009a:
            if (r0 == 0) goto L_0x00ab
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.f68966l
            if (r4 == 0) goto L_0x00ab
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r4.getAwemeRawAd()
            if (r4 == 0) goto L_0x00ab
            java.lang.String r4 = r4.getWebUrl()
            goto L_0x00ac
        L_0x00ab:
            r4 = r5
        L_0x00ac:
            if (r0 == 0) goto L_0x00bd
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r0.f68966l
            if (r8 == 0) goto L_0x00bd
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r8 = r8.getAwemeRawAd()
            if (r8 == 0) goto L_0x00bd
            java.lang.String r8 = r8.getWebTitle()
            goto L_0x00be
        L_0x00bd:
            r8 = r5
        L_0x00be:
            java.lang.ref.WeakReference<android.content.Context> r9 = r12.f63993a
            java.lang.Object r9 = r9.get()
            android.content.Context r9 = (android.content.Context) r9
            if (r0 == 0) goto L_0x00cb
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r0.f68966l
            goto L_0x00cc
        L_0x00cb:
            r10 = r5
        L_0x00cc:
            boolean r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64220a(r9, r3, r10, r7)
            if (r9 == 0) goto L_0x00d9
            java.lang.String r0 = "open_status"
            r1.put(r0, r6)
            goto L_0x0196
        L_0x00d9:
            java.lang.ref.WeakReference<android.content.Context> r9 = r12.f63993a
            java.lang.Object r9 = r9.get()
            android.content.Context r9 = (android.content.Context) r9
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64226a(r9, r3, r7)
            if (r3 == 0) goto L_0x012e
            java.lang.String r3 = "open_status"
            r1.put(r3, r6)
            if (r0 == 0) goto L_0x0196
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
            java.lang.ref.WeakReference<android.content.Context> r4 = r12.f63993a
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            r3.mo53586a(r4)
            com.ss.android.ugc.aweme.bullet.bridge.ad.AdCommonJsMethod$b r3 = new com.ss.android.ugc.aweme.bullet.bridge.ad.AdCommonJsMethod$b
            r3.<init>(r0, r12)
            com.ss.android.ugc.aweme.commercialize.utils.q$a r3 = (com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a) r3
            com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64208a(r3)
            goto L_0x0196
        L_0x012e:
            java.lang.ref.WeakReference<android.content.Context> r3 = r12.f63993a
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            if (r0 == 0) goto L_0x013a
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.f68966l
        L_0x013a:
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64214a(r3, r5, r4, r8)
            if (r3 == 0) goto L_0x0146
            java.lang.String r0 = "web_status"
            r1.put(r0, r6)
            goto L_0x0196
        L_0x0146:
            java.lang.ref.WeakReference<android.content.Context> r3 = r12.f63993a
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64222a(r3, r4, r8)
            if (r3 == 0) goto L_0x0191
            java.lang.String r3 = "web_status"
            r1.put(r3, r6)
            if (r0 == 0) goto L_0x0196
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
            java.lang.ref.WeakReference<android.content.Context> r3 = r12.f63993a
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            r0.mo53586a(r3)
            goto L_0x0196
        L_0x0191:
            java.lang.String r0 = "code"
            r1.put(r0, r7)
        L_0x0196:
            if (r14 == 0) goto L_0x02ee
            r14.mo60041a(r1)
            goto L_0x02ee
        L_0x019d:
            java.lang.String r1 = "sendAdLog"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x02ee
            java.lang.String r1 = "tag"
            java.lang.String r1 = r13.optString(r1)     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r3 = "label"
            java.lang.String r3 = r13.optString(r3)     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r8 = "extParam"
            org.json.JSONObject r8 = r13.optJSONObject(r8)     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r9 = "has_ad_info"
            boolean r9 = r13.optBoolean(r9, r7)     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r10 = "tag"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r10)     // Catch:{ Exception -> 0x02b0 }
            r10 = r1
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Exception -> 0x02b0 }
            int r10 = r10.length()     // Catch:{ Exception -> 0x02b0 }
            if (r10 <= 0) goto L_0x01cd
            r10 = 1
            goto L_0x01ce
        L_0x01cd:
            r10 = 0
        L_0x01ce:
            if (r10 == 0) goto L_0x0255
            java.lang.String r10 = "label"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r10)     // Catch:{ Exception -> 0x02b0 }
            r10 = r3
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Exception -> 0x02b0 }
            int r10 = r10.length()     // Catch:{ Exception -> 0x02b0 }
            if (r10 <= 0) goto L_0x01df
            goto L_0x01e0
        L_0x01df:
            r6 = 0
        L_0x01e0:
            if (r6 == 0) goto L_0x0255
            if (r0 == 0) goto L_0x0255
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53582a(r1)     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53593b(r3)     // Catch:{ Exception -> 0x02b0 }
            long r9 = r0.f68955a     // Catch:{ Exception -> 0x02b0 }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53580a(r7)     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r7 = r0.f68956b     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53604i(r7)     // Catch:{ Exception -> 0x02b0 }
            long r9 = r0.f68957c     // Catch:{ Exception -> 0x02b0 }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53592b(r7)     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r6 = r6.mo53594b(r8)     // Catch:{ Exception -> 0x02b0 }
            java.lang.ref.WeakReference<android.content.Context> r7 = r12.f63993a     // Catch:{ Exception -> 0x02b0 }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x02b0 }
            android.content.Context r7 = (android.content.Context) r7     // Catch:{ Exception -> 0x02b0 }
            r6.mo53586a(r7)     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r6 = "draw_ad"
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r6)     // Catch:{ Exception -> 0x02b0 }
            if (r1 == 0) goto L_0x024e
            java.lang.String r1 = "click"
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r1)     // Catch:{ Exception -> 0x02b0 }
            if (r1 == 0) goto L_0x024e
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f68966l     // Catch:{ Exception -> 0x02b0 }
            if (r1 == 0) goto L_0x024e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()     // Catch:{ Exception -> 0x02b0 }
            if (r1 == 0) goto L_0x024e
            com.ss.android.ugc.aweme.commercialize.log.ay r6 = com.p683ss.android.ugc.aweme.commercialize.log.C26060ay.f68819a     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r7 = "click"
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = r1.getClickTrackUrlList()     // Catch:{ Exception -> 0x02b0 }
            java.lang.Long r9 = r1.getCreativeId()     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r10 = r1.getLogExtra()     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.bullet.bridge.ad.AdCommonJsMethod$c r1 = new com.ss.android.ugc.aweme.bullet.bridge.ad.AdCommonJsMethod$c     // Catch:{ Exception -> 0x02b0 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x02b0 }
            r11 = r1
            d.f.a.m r11 = (p2628d.p2639f.p2640a.C52682m) r11     // Catch:{ Exception -> 0x02b0 }
            r6.mo53545a(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x02b0 }
        L_0x024e:
            if (r14 == 0) goto L_0x02ee
            r14.mo60039a(r5)     // Catch:{ Exception -> 0x02b0 }
            goto L_0x02ee
        L_0x0255:
            if (r9 == 0) goto L_0x02a8
            java.lang.String r0 = "creative_id"
            java.lang.String r0 = r13.optString(r0)     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r6 = "log_extra"
            java.lang.String r6 = r13.optString(r6)     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r7 = "group_id"
            java.lang.String r7 = r13.optString(r7)     // Catch:{ Exception -> 0x02b0 }
            r9 = r0
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Exception -> 0x02b0 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x02b0 }
            if (r9 == 0) goto L_0x027b
            if (r14 == 0) goto L_0x02ee
            java.lang.String r0 = "empty creativeId"
            r14.mo60038a(r4, r0)     // Catch:{ Exception -> 0x02b0 }
            goto L_0x02ee
        L_0x027b:
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r1 = r9.mo53582a(r1)     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r1 = r1.mo53593b(r3)     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r1.mo53596c(r0)     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53604i(r6)     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53598d(r7)     // Catch:{ Exception -> 0x02b0 }
            com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53594b(r8)     // Catch:{ Exception -> 0x02b0 }
            java.lang.ref.WeakReference<android.content.Context> r1 = r12.f63993a     // Catch:{ Exception -> 0x02b0 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x02b0 }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ Exception -> 0x02b0 }
            r0.mo53586a(r1)     // Catch:{ Exception -> 0x02b0 }
            if (r14 == 0) goto L_0x02ee
            r14.mo60039a(r5)     // Catch:{ Exception -> 0x02b0 }
            goto L_0x02ee
        L_0x02a8:
            if (r14 == 0) goto L_0x02ee
            java.lang.String r0 = "empty tag or label"
            r14.mo60038a(r4, r0)     // Catch:{ Exception -> 0x02b0 }
            goto L_0x02ee
        L_0x02b0:
            r0 = move-exception
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r0)
            if (r14 == 0) goto L_0x02ee
            java.lang.String r0 = "unknown error"
            r14.mo60038a(r4, r0)
            goto L_0x02ee
        L_0x02bc:
            java.lang.String r0 = "messageTip"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02ee
            java.lang.String r0 = "msg"
            boolean r0 = r13.has(r0)
            if (r0 == 0) goto L_0x02e7
            java.lang.ref.WeakReference<android.content.Context> r0 = r12.f63993a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "msg"
            java.lang.String r1 = r13.getString(r1)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21537a(r0, r1)
            r0.mo19066a()
            if (r14 == 0) goto L_0x02ee
            r14.mo60039a(r5)
            goto L_0x02ee
        L_0x02e7:
            if (r14 == 0) goto L_0x02ee
            java.lang.String r0 = "empty msg"
            r14.mo60038a(r4, r0)
        L_0x02ee:
            com.ss.android.ugc.aweme.commercialize.d.j r14 = new com.ss.android.ugc.aweme.commercialize.d.j
            java.lang.String r0 = "func"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r0)
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r1 = r14
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.AdCommonJsMethod.mo49914a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}

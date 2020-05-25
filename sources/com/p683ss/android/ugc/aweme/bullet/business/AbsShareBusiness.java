package com.p683ss.android.ugc.aweme.bullet.business;

import android.text.TextUtils;
import com.google.gson.p1077b.C17956a;
import com.google.p1057b.p1060c.C17593ar;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24336d;
import com.p683ss.android.ugc.aweme.setting.model.WebShareMode;
import com.p683ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p064c.p065a.p066a.p068b.C1667a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness */
public abstract class AbsShareBusiness extends Business {

    /* renamed from: j */
    public static final C24232a f64297j = new C24232a(null);

    /* renamed from: a */
    public List<WebShareMode> f64298a;

    /* renamed from: b */
    public WebSharePackage f64299b;

    /* renamed from: c */
    public List<String> f64300c;

    /* renamed from: d */
    public String f64301d;

    /* renamed from: e */
    public boolean f64302e;

    /* renamed from: f */
    public String f64303f;

    /* renamed from: g */
    public String f64304g;

    /* renamed from: h */
    public C24233b f64305h = new C24233b();

    /* renamed from: i */
    C24336d f64306i;

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$a */
    public static final class C24232a {
        private C24232a() {
        }

        public /* synthetic */ C24232a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$b */
    public final class C24233b {
        public C24233b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
            if (r5 == null) goto L_0x0063;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00f0  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0106  */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void showSource(java.lang.String r10, java.lang.String r11) {
            /*
                r9 = this;
                java.lang.String r0 = "title"
                p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
                java.lang.String r0 = "html"
                p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
                org.json.JSONObject r4 = new org.json.JSONObject
                r4.<init>()
                java.lang.String r0 = "title"
                r4.put(r0, r10)     // Catch:{ JSONException -> 0x0014 }
            L_0x0014:
                com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness r0 = com.p683ss.android.ugc.aweme.bullet.business.AbsShareBusiness.this
                com.ss.android.ugc.aweme.bullet.business.a r0 = r0.f64316k
                com.bytedance.ies.bullet.b.h.a r1 = r0.f64359a
                if (r1 == 0) goto L_0x0028
                java.lang.String r2 = "webview_safe_log"
                java.lang.String r3 = "abs_share_business_jsb"
                r5 = 0
                r6 = 0
                r7 = 24
                r8 = 0
                r1.mo18409a(r2, r3, r4, null, null)
            L_0x0028:
                r0 = 0
                r1 = r11
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ JSONException -> 0x0038 }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0038 }
                if (r1 != 0) goto L_0x0038
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0038 }
                r1.<init>(r11)     // Catch:{ JSONException -> 0x0038 }
                goto L_0x0039
            L_0x0038:
                r1 = r0
            L_0x0039:
                com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness r11 = com.p683ss.android.ugc.aweme.bullet.business.AbsShareBusiness.this
                android.content.Context r2 = com.p683ss.android.common.applog.GlobalContext.getContext()
                java.lang.String r3 = "GlobalContext.getContext()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                if (r1 != 0) goto L_0x004c
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                goto L_0x004d
            L_0x004c:
                r3 = r1
            L_0x004d:
                java.lang.String r4 = r11.f64301d
                if (r4 != 0) goto L_0x0053
                java.lang.String r4 = ""
            L_0x0053:
                com.ss.android.ugc.aweme.bullet.module.base.d r5 = r11.f64306i
                if (r5 == 0) goto L_0x0063
                com.bytedance.ies.bullet.b.i.f<java.lang.String> r5 = r5.f28119x
                if (r5 == 0) goto L_0x0063
                java.lang.Object r5 = r5.mo18457b()
                java.lang.String r5 = (java.lang.String) r5
                if (r5 != 0) goto L_0x0065
            L_0x0063:
                java.lang.String r5 = ""
            L_0x0065:
                com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage r10 = com.p683ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.C42198a.m92604a(r2, r10, r3, r4, r5)
                r11.f64299b = r10
                java.lang.String r10 = "qrcode"
                java.lang.String r10 = com.p683ss.android.ugc.aweme.bullet.business.AbsShareBusiness.m59315a(r1, r10)
                java.lang.String r2 = "sharetips"
                java.lang.String r2 = com.p683ss.android.ugc.aweme.bullet.business.AbsShareBusiness.m59315a(r1, r2)
                r11.f64304g = r2
                com.google.gson.f r2 = new com.google.gson.f
                r2.<init>()
                java.lang.String r3 = "aweme:shareChannels"
                java.lang.String r3 = com.p683ss.android.ugc.aweme.bullet.business.AbsShareBusiness.m59315a(r1, r3)
                com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$c r4 = new com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$c
                r4.<init>()
                java.lang.reflect.Type r4 = r4.f49843c
                java.lang.Object r2 = r2.mo34885a(r3, r4)
                java.util.List r2 = (java.util.List) r2
                r11.f64298a = r2
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                boolean r2 = android.text.TextUtils.isEmpty(r10)
                if (r2 != 0) goto L_0x00af
                java.lang.String r2 = "1"
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.equals(r2, r10)
                if (r2 != 0) goto L_0x00b6
                java.lang.String r2 = "true"
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r10 = android.text.TextUtils.equals(r10, r2)
                if (r10 != 0) goto L_0x00b6
            L_0x00af:
                java.util.List<java.lang.String> r10 = r11.f64300c
                java.lang.String r2 = "qrcode"
                r10.remove(r2)
            L_0x00b6:
                java.lang.String r10 = "innerUrl"
                java.lang.String r10 = com.p683ss.android.ugc.aweme.bullet.business.AbsShareBusiness.m59315a(r1, r10)
                r11.f64303f = r10
                com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage r10 = r11.f64299b
                if (r10 == 0) goto L_0x00c5
                java.lang.String r10 = r10.f106899h
                goto L_0x00c6
            L_0x00c5:
                r10 = r0
            L_0x00c6:
                java.lang.String r2 = r11.f64303f
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x00d3
                java.lang.String r10 = r11.f64303f
                goto L_0x00df
            L_0x00d3:
                java.lang.String r2 = r11.f64301d
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x00df
                java.lang.String r10 = r11.f64301d
            L_0x00df:
                r2 = r10
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage r3 = r11.f64299b
                if (r3 == 0) goto L_0x00e8
                java.lang.String r0 = r3.f106899h
            L_0x00e8:
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.equals(r2, r0)
                if (r0 != 0) goto L_0x00fd
                com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage r0 = r11.f64299b
                if (r0 == 0) goto L_0x00fd
                android.os.Bundle r0 = r0.f106900i
                if (r0 == 0) goto L_0x00fd
                java.lang.String r2 = "url_for_im_share"
                r0.putString(r2, r10)
            L_0x00fd:
                java.lang.String r10 = "shareitems"
                java.lang.String r10 = com.p683ss.android.ugc.aweme.bullet.business.AbsShareBusiness.m59315a(r1, r10)
                if (r10 != 0) goto L_0x0106
                goto L_0x0127
            L_0x0106:
                com.google.gson.f r0 = new com.google.gson.f
                r0.<init>()
                com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$e r1 = new com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$e
                r1.<init>()
                java.lang.reflect.Type r1 = r1.f49843c
                java.lang.Object r10 = r0.mo34885a(r10, r1)
                java.util.List r10 = (java.util.List) r10
                if (r10 != 0) goto L_0x011b
                goto L_0x0127
            L_0x011b:
                java.util.List<java.lang.String> r0 = r11.f64300c
                r0.clear()
                java.util.List<java.lang.String> r0 = r11.f64300c
                java.util.Collection r10 = (java.util.Collection) r10
                r0.addAll(r10)
            L_0x0127:
                r11.mo49966b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.business.AbsShareBusiness.C24233b.showSource(java.lang.String, java.lang.String):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$c */
    public static final class C24234c extends C17956a<List<? extends WebShareMode>> {
        C24234c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$d */
    static final class C24235d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbsShareBusiness f64308a;

        C24235d(AbsShareBusiness absShareBusiness) {
            this.f64308a = absShareBusiness;
        }

        public final void run() {
            this.f64308a.mo49964a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness$e */
    public static final class C24236e extends C17956a<List<? extends String>> {
        C24236e() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo49964a();

    /* renamed from: b */
    public final void mo49966b() {
        C1667a.m5940a().mo6139a(new C24235d(this));
    }

    /* renamed from: a */
    public final void mo49965a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f64299b = null;
            this.f64301d = str;
        }
    }

    public AbsShareBusiness(C24252a aVar) {
        C52711k.m112240b(aVar, "bulletBusiness");
        super(aVar);
        ArrayList a = C17593ar.m43277a((E[]) new String[]{"copylink", "qrcode", "browser", "refresh"});
        C52711k.m112236a((Object) a, "Lists.newArrayList(\n    …\n            KEY_REFRESH)");
        this.f64300c = a;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r1 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r1 == null) goto L_0x0035;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49967b(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "channelKey"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "h5_page"
            r0.put(r1, r2)
            java.lang.String r1 = "platform"
            r0.put(r1, r4)
            java.lang.String r4 = "previous_page"
            com.ss.android.ugc.aweme.bullet.module.base.d r1 = r3.f64306i
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = r1.mo50125f()
            if (r1 != 0) goto L_0x0026
        L_0x0024:
            java.lang.String r1 = ""
        L_0x0026:
            r0.put(r4, r1)
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.bullet.module.base.d r1 = r3.f64306i
            if (r1 == 0) goto L_0x0035
            java.lang.String r1 = r1.mo50126g()
            if (r1 != 0) goto L_0x0037
        L_0x0035:
            java.lang.String r1 = ""
        L_0x0037:
            r0.put(r4, r1)
            java.lang.String r4 = "webview_type"
            com.ss.android.ugc.aweme.bullet.module.base.d r1 = r3.f64306i
            r2 = 0
            if (r1 == 0) goto L_0x0046
            java.lang.String r1 = r1.mo50126g()
            goto L_0x0047
        L_0x0046:
            r1 = r2
        L_0x0047:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = ""
            goto L_0x0054
        L_0x0052:
            java.lang.String r1 = "article"
        L_0x0054:
            r0.put(r4, r1)
            java.lang.String r4 = "url"
            com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage r1 = r3.f64299b
            if (r1 == 0) goto L_0x005f
            java.lang.String r2 = r1.f106899h
        L_0x005f:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x006e
            java.lang.String r1 = r3.f64301d
            if (r1 != 0) goto L_0x0077
            java.lang.String r1 = ""
            goto L_0x0077
        L_0x006e:
            com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage r1 = r3.f64299b
            if (r1 != 0) goto L_0x0075
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0075:
            java.lang.String r1 = r1.f106899h
        L_0x0077:
            r0.put(r4, r1)
            java.lang.String r4 = "h5_share"
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.business.AbsShareBusiness.mo49967b(java.lang.String):void");
    }

    /* renamed from: a */
    static String m59315a(JSONObject jSONObject, String str) {
        String str2;
        if (jSONObject != null) {
            str2 = jSONObject.optString(str);
        } else {
            str2 = null;
        }
        if (str2 == null || TextUtils.equals(str2, TEVideoRecorder.FACE_BEAUTY_NULL)) {
            return null;
        }
        return str2;
    }
}

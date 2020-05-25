package com.p683ss.android.ugc.aweme.discover.p1659ui.search;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a;
import com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.discover.abtest.IntermediateMonitorExperiment;
import com.p683ss.android.ugc.aweme.discover.abtest.RNViewDestroyExperiment;
import com.p683ss.android.ugc.aweme.discover.abtest.RNViewPrerenderExperiment;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchFragmentReactNativeExperiment;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22528r;
import com.p683ss.android.ugc.aweme.search.C41416e;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2645i.C52744c;
import p2628d.p2647j.C52751c;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.d */
public final class C28668d implements C41416e {

    /* renamed from: a */
    public static HashMap<String, Long> f75241a;

    /* renamed from: b */
    public static HashMap<String, Long> f75242b;

    /* renamed from: c */
    public static long f75243c = -1;

    /* renamed from: d */
    public static long f75244d = -1;

    /* renamed from: e */
    public static long f75245e = -1;

    /* renamed from: f */
    public static final C28668d f75246f = new C28668d();

    /* renamed from: h */
    private static long f75247h = -1;

    /* renamed from: i */
    private static long f75248i = -1;

    /* renamed from: j */
    private static String f75249j;

    /* renamed from: k */
    private static boolean f75250k;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.d$a */
    static final class C28669a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f75251a;

        /* renamed from: b */
        final /* synthetic */ boolean f75252b;

        /* renamed from: c */
        final /* synthetic */ int f75253c;

        C28669a(String str, boolean z, int i) {
            this.f75251a = str;
            this.f75252b = z;
            this.f75253c = i;
        }

        public final /* synthetic */ Object call() {
            String str;
            String str2;
            C27131c a = C27132a.m65458a();
            String str3 = this.f75251a;
            JSONObject jSONObject = new JSONObject();
            String str4 = "container_type";
            if (this.f75252b) {
                str = "rn";
            } else {
                str = "native";
            }
            jSONObject.put(str4, str);
            String str5 = "experiment";
            if (this.f75253c == 2) {
                str2 = "rn";
            } else {
                str2 = "native";
            }
            jSONObject.put(str5, str2);
            String a2 = C28668d.m67930a(false);
            if (a2 != null) {
                jSONObject.put("experiment_type", a2);
            }
            C27131c.m65450a(a, str3, "search_click", jSONObject, null, null, 24, null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.d$b */
    static final class C28670b<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f75254a;

        /* renamed from: b */
        final /* synthetic */ long f75255b;

        /* renamed from: c */
        final /* synthetic */ boolean f75256c;

        /* renamed from: d */
        final /* synthetic */ int f75257d;

        C28670b(String str, long j, boolean z, int i) {
            this.f75254a = str;
            this.f75255b = j;
            this.f75256c = z;
            this.f75257d = i;
        }

        public final /* synthetic */ Object call() {
            String str;
            String str2;
            C27131c a = C27132a.m65458a();
            String str3 = this.f75254a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", this.f75255b);
            JSONObject jSONObject2 = new JSONObject();
            String str4 = "container_type";
            if (this.f75256c) {
                str = "rn";
            } else {
                str = "native";
            }
            jSONObject2.put(str4, str);
            String str5 = "experiment";
            if (this.f75257d == 2) {
                str2 = "rn";
            } else {
                str2 = "native";
            }
            jSONObject2.put(str5, str2);
            String a2 = C28668d.m67930a(false);
            if (a2 != null) {
                jSONObject2.put("experiment_type", a2);
            }
            C27131c.m65450a(a, str3, "search_time", jSONObject2, jSONObject, null, 16, null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.d$c */
    public static final class C28671c<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ long f75258a;

        /* renamed from: b */
        final /* synthetic */ long f75259b;

        /* renamed from: c */
        final /* synthetic */ long f75260c;

        /* renamed from: d */
        final /* synthetic */ String f75261d;

        /* renamed from: e */
        final /* synthetic */ String f75262e;

        public C28671c(long j, long j2, long j3, String str, String str2) {
            this.f75258a = j;
            this.f75259b = j2;
            this.f75260c = j3;
            this.f75261d = str;
            this.f75262e = str2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pageLoadCostTime", this.f75258a);
                jSONObject.put("renderCostTime", this.f75259b);
                jSONObject.put("totalCostTime", this.f75260c);
                jSONObject.put("pageName", this.f75261d);
                jSONObject.put("feFlag", this.f75262e);
                C23131p.m57776a("rn_page_load_time_mills", 0, C23088c.m56632a(jSONObject).mo47825b());
            } catch (Exception unused) {
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.d$d */
    public static final class C28672d<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f75263a;

        public C28672d(CrossPlatformWebView crossPlatformWebView) {
            this.f75263a = crossPlatformWebView;
        }

        public final /* synthetic */ Object call() {
            String a = C28668d.m67930a(false);
            if (a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("experiment_type", a);
            jSONObject.put("is_cached_view", String.valueOf(C27278a.m65731a(this.f75263a)));
            C27131c.m65450a(C27132a.m65458a(), "search_transfer_rn_preload", "preload_view_fetch", jSONObject, null, null, 24, null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.d$e */
    public static final class C28673e<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C22528r f75264a;

        /* renamed from: b */
        final /* synthetic */ Object f75265b;

        public C28673e(C22528r rVar, Object obj) {
            this.f75264a = rVar;
            this.f75265b = obj;
        }

        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", ((CrossPlatformWebView) this.f75265b).getLoadRNViewCompleteTimestamp() - C28668d.m67933b());
                jSONObject.put("launch_time", C28668d.m67933b());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("status_code", "0");
                C27131c.m65449a(C27132a.m65458a(), this.f75264a, "search_transfer_rn_create_monitor", "search_intermindate", jSONObject2, jSONObject, null, 32, null);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("duration", C28668d.f75245e - ((CrossPlatformWebView) this.f75265b).getLoadRNViewCompleteTimestamp());
                jSONObject3.put("launch_time", ((CrossPlatformWebView) this.f75265b).getLoadRNViewCompleteTimestamp());
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("status_code", "0");
                C28668d.f75246f.mo58334a(jSONObject4);
                C27131c.m65449a(C27132a.m65458a(), this.f75264a, "search_transfer_rn_business_didmount", "search_intermindate", jSONObject4, jSONObject3, null, 32, null);
            } catch (Exception unused) {
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.d$f */
    static final class C28674f<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ boolean f75266a;

        C28674f(boolean z) {
            this.f75266a = z;
        }

        public final /* synthetic */ Object call() {
            String a = C28668d.m67930a(this.f75266a);
            if (a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("experiment_type", a);
            C27131c.m65450a(C27132a.m65458a(), "search_transfer_rn_search_transfer", "open_search_square", jSONObject, null, null, 24, null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.d$g */
    public static final class C28675g<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C22528r f75267a;

        /* renamed from: b */
        final /* synthetic */ CrossPlatformWebView f75268b;

        public C28675g(C22528r rVar, CrossPlatformWebView crossPlatformWebView) {
            this.f75267a = rVar;
            this.f75268b = crossPlatformWebView;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|(1:4)(1:5)|6|(2:8|(1:10))|(3:14|(1:16)(1:17)|18)|19|20|21|(1:23)(1:24)|25|(11:27|(2:29|(9:31|33|(2:35|(6:37|39|(1:41)(1:42)|43|(1:45)|46))|38|39|(0)(0)|43|(0)|46))|32|33|(0)|38|39|(0)(0)|43|(0)|46)|47|48|50) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00a6 */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00cf A[Catch:{ Exception -> 0x012e }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00d2 A[Catch:{ Exception -> 0x012e }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00dd A[Catch:{ Exception -> 0x012e }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00f6 A[Catch:{ Exception -> 0x012e }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0107 A[Catch:{ Exception -> 0x012e }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x010e A[Catch:{ Exception -> 0x012e }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0116 A[Catch:{ Exception -> 0x012e }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r19 = this;
                r0 = r19
                com.ss.android.ugc.aweme.crossplatform.b.c r1 = com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a.m65458a()     // Catch:{ Exception -> 0x00a6 }
                com.ss.android.ugc.aweme.af.a.r r2 = r0.f75267a     // Catch:{ Exception -> 0x00a6 }
                com.ss.android.ugc.aweme.af.a.t r2 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22530t) r2     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r3 = "search_transfer_rn_base_download"
                java.lang.String r4 = "search_intermindate"
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a6 }
                r5.<init>()     // Catch:{ Exception -> 0x00a6 }
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r6 = r0.f75268b     // Catch:{ Exception -> 0x00a6 }
                com.ss.android.ugc.aweme.crossplatform.c.a.a r6 = r6.getCrossPlatformParams()     // Catch:{ Exception -> 0x00a6 }
                boolean r6 = com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d.m67934b(r6)     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r7 = "is_gecko_base_package_ready"
                java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00a6 }
                r5.put(r7, r8)     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r7 = "status_code"
                if (r6 == 0) goto L_0x002d
                java.lang.String r6 = "0"
                goto L_0x002f
            L_0x002d:
                java.lang.String r6 = "1"
            L_0x002f:
                r5.put(r7, r6)     // Catch:{ Exception -> 0x00a6 }
                com.bytedance.ies.geckoclient.e r6 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103348e()     // Catch:{ Exception -> 0x00a6 }
                r7 = 0
                if (r6 == 0) goto L_0x0063
                java.lang.String r8 = "rn_base_android"
                com.bytedance.ies.geckoclient.model.d r6 = r6.mo19651a(r8)     // Catch:{ Exception -> 0x00a6 }
                if (r6 == 0) goto L_0x0063
                java.lang.String r7 = "channel"
                java.lang.String r8 = r6.f29403c     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00a6 }
                r5.put(r7, r8)     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r7 = "gecko_version"
                int r8 = r6.f29401a     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00a6 }
                r5.put(r7, r8)     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r7 = "error_code"
                int r6 = r6.f29412l     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00a6 }
                r5.put(r7, r6)     // Catch:{ Exception -> 0x00a6 }
                r7 = 1
            L_0x0063:
                if (r7 != 0) goto L_0x0099
                com.ss.android.ugc.aweme.crossplatform.platform.rn.c r6 = com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.C27207c.C27208a.m65631a()     // Catch:{ Exception -> 0x00a6 }
                boolean r6 = r6.mo55544c()     // Catch:{ Exception -> 0x00a6 }
                if (r6 == 0) goto L_0x0099
                java.lang.String r6 = "channel"
                com.ss.android.ugc.aweme.crossplatform.platform.rn.c r7 = com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.C27207c.C27208a.m65631a()     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r8 = r7.mo55543b()     // Catch:{ Exception -> 0x00a6 }
                boolean r8 = com.p683ss.android.ugc.aweme.utils.C47682ar.m103195a(r8)     // Catch:{ Exception -> 0x00a6 }
                if (r8 == 0) goto L_0x0084
                java.lang.String r7 = r7.mo55543b()     // Catch:{ Exception -> 0x00a6 }
                goto L_0x0088
            L_0x0084:
                java.lang.String r7 = r7.mo55542a()     // Catch:{ Exception -> 0x00a6 }
            L_0x0088:
                r5.put(r6, r7)     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r6 = "gecko_version"
                java.lang.String r7 = "2.0.0"
                r5.put(r6, r7)     // Catch:{ Exception -> 0x00a6 }
                java.lang.String r6 = "error_code"
                java.lang.String r7 = "0"
                r5.put(r6, r7)     // Catch:{ Exception -> 0x00a6 }
            L_0x0099:
                com.ss.android.ugc.aweme.discover.ui.search.d r6 = com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d.f75246f     // Catch:{ Exception -> 0x00a6 }
                r6.mo58334a(r5)     // Catch:{ Exception -> 0x00a6 }
                r6 = 0
                r7 = 0
                r8 = 48
                r9 = 0
                com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.m65449a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00a6 }
            L_0x00a6:
                com.ss.android.ugc.aweme.crossplatform.b.c r10 = com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a.m65458a()     // Catch:{ Exception -> 0x012e }
                com.ss.android.ugc.aweme.af.a.r r1 = r0.f75267a     // Catch:{ Exception -> 0x012e }
                r11 = r1
                com.ss.android.ugc.aweme.af.a.t r11 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22530t) r11     // Catch:{ Exception -> 0x012e }
                java.lang.String r12 = "search_transfer_rn_business_download"
                java.lang.String r13 = "search_intermindate"
                org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x012e }
                r14.<init>()     // Catch:{ Exception -> 0x012e }
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r0.f75268b     // Catch:{ Exception -> 0x012e }
                com.ss.android.ugc.aweme.crossplatform.c.a.a r1 = r1.getCrossPlatformParams()     // Catch:{ Exception -> 0x012e }
                boolean r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d.m67932a(r1)     // Catch:{ Exception -> 0x012e }
                java.lang.String r2 = "is_gecko_business_package_ready"
                java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x012e }
                r14.put(r2, r3)     // Catch:{ Exception -> 0x012e }
                java.lang.String r2 = "status_code"
                if (r1 == 0) goto L_0x00d2
                java.lang.String r1 = "0"
                goto L_0x00d4
            L_0x00d2:
                java.lang.String r1 = "1"
            L_0x00d4:
                r14.put(r2, r1)     // Catch:{ Exception -> 0x012e }
                com.bytedance.ies.geckoclient.e r1 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103348e()     // Catch:{ Exception -> 0x012e }
                if (r1 == 0) goto L_0x011f
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = r0.f75268b     // Catch:{ Exception -> 0x012e }
                com.ss.android.ugc.aweme.crossplatform.c.a.a r2 = r2.getCrossPlatformParams()     // Catch:{ Exception -> 0x012e }
                r3 = 0
                if (r2 == 0) goto L_0x00ed
                com.ss.android.ugc.aweme.crossplatform.c.d r2 = r2.f71720c     // Catch:{ Exception -> 0x012e }
                if (r2 == 0) goto L_0x00ed
                java.lang.String r2 = r2.f71775b     // Catch:{ Exception -> 0x012e }
                goto L_0x00ee
            L_0x00ed:
                r2 = r3
            L_0x00ee:
                com.bytedance.ies.geckoclient.model.d r1 = r1.mo19651a(r2)     // Catch:{ Exception -> 0x012e }
                java.lang.String r2 = "channel"
                if (r1 == 0) goto L_0x00ff
                java.lang.String r4 = r1.f29403c     // Catch:{ Exception -> 0x012e }
                if (r4 == 0) goto L_0x00ff
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x012e }
                goto L_0x0100
            L_0x00ff:
                r4 = r3
            L_0x0100:
                r14.put(r2, r4)     // Catch:{ Exception -> 0x012e }
                java.lang.String r2 = "gecko_version"
                if (r1 == 0) goto L_0x010e
                int r4 = r1.f29401a     // Catch:{ Exception -> 0x012e }
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x012e }
                goto L_0x010f
            L_0x010e:
                r4 = r3
            L_0x010f:
                r14.put(r2, r4)     // Catch:{ Exception -> 0x012e }
                java.lang.String r2 = "error_code"
                if (r1 == 0) goto L_0x011c
                int r1 = r1.f29412l     // Catch:{ Exception -> 0x012e }
                java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x012e }
            L_0x011c:
                r14.put(r2, r3)     // Catch:{ Exception -> 0x012e }
            L_0x011f:
                com.ss.android.ugc.aweme.discover.ui.search.d r1 = com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d.f75246f     // Catch:{ Exception -> 0x012e }
                r1.mo58334a(r14)     // Catch:{ Exception -> 0x012e }
                r15 = 0
                r16 = 0
                r17 = 48
                r18 = 0
                com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.m65449a(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x012e }
            L_0x012e:
                d.x r1 = p2628d.C52860x.f131107a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d.C28675g.call():java.lang.Object");
        }
    }

    private C28668d() {
    }

    /* renamed from: b */
    public static long m67933b() {
        return f75243c;
    }

    /* renamed from: a */
    public final HashMap<String, Long> mo58331a() {
        if (f75242b == null) {
            f75242b = new HashMap<>();
        }
        HashMap<String, Long> hashMap = f75242b;
        if (hashMap == null) {
            C52711k.m112234a();
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo58334a(JSONObject jSONObject) {
        String a = m67930a(false);
        if (a != null) {
            jSONObject.put("experiment_type", a);
        }
    }

    /* renamed from: b */
    public final void mo58335b(boolean z) {
        f75243c = System.currentTimeMillis();
        C0013i.m18a((Callable<TResult>) new C28674f<TResult>(z), (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public static String m67930a(boolean z) {
        String str;
        boolean z2;
        boolean z3 = true;
        if (z) {
            if (C10181b.m20511a().mo18168a(RNViewDestroyExperiment.class, true, "search_transfer_is_not_destroy", 31744, 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C10181b.m20511a().mo18168a(RNViewPrerenderExperiment.class, true, "search_transfer_is_prerender", 31744, 0) != 1) {
                z3 = false;
            }
            if (z2 && z3) {
                return "rn_preload_not_destroy";
            }
            if (z2) {
                return "rn_not_destroy";
            }
            if (z3) {
                return "rn_preload_view";
            }
            return "rn_common";
        } else if (f75250k) {
            return f75249j;
        } else {
            if (C52753d.m112316a(new C52751c(1, 90), (C52744c) C52744c.f130992c) <= 5) {
                str = "native_common";
            } else {
                str = null;
            }
            f75249j = str;
            f75250k = true;
            return f75249j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m67932a(com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a r10) {
        /*
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103352f()
            r1 = 0
            if (r0 == 0) goto L_0x0014
            if (r10 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.crossplatform.c.d r10 = r10.f71720c
            if (r10 == 0) goto L_0x000f
            java.lang.String r1 = r10.f71775b
        L_0x000f:
            boolean r10 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103360j(r1)
            return r10
        L_0x0014:
            com.bytedance.ies.geckoclient.e r0 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103348e()
            r2 = 0
            if (r0 != 0) goto L_0x001c
            return r2
        L_0x001c:
            if (r10 == 0) goto L_0x0025
            com.ss.android.ugc.aweme.crossplatform.c.d r3 = r10.f71720c
            if (r3 == 0) goto L_0x0025
            java.lang.String r3 = r3.f71775b
            goto L_0x0026
        L_0x0025:
            r3 = r1
        L_0x0026:
            com.bytedance.ies.geckoclient.model.d r0 = r0.mo19651a(r3)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r3 = "$this$getOfflineGeckoPath"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            java.io.File r3 = com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.C27203a.m65625a(r0)
            if (r3 == 0) goto L_0x006b
            boolean r4 = r3.exists()
            if (r4 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r3 = r1
        L_0x003f:
            if (r3 == 0) goto L_0x006b
            java.io.File[] r3 = r3.listFiles()
            if (r3 == 0) goto L_0x006b
            int r4 = r3.length
            r5 = 0
        L_0x0049:
            if (r5 >= r4) goto L_0x0063
            r6 = r3[r5]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "name"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.lang.String r8 = "gecko_activate_done"
            r9 = 2
            boolean r7 = p2628d.p2650m.C52830p.m112413c(r7, r8, r2, r9, r1)
            if (r7 == 0) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            int r5 = r5 + 1
            goto L_0x0049
        L_0x0063:
            r6 = r1
        L_0x0064:
            if (r6 == 0) goto L_0x006b
            java.lang.String r3 = r6.getAbsolutePath()
            goto L_0x006c
        L_0x006b:
            r3 = r1
        L_0x006c:
            if (r3 == 0) goto L_0x00a0
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r4 = r4.exists()
            if (r4 == 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = r1
        L_0x007b:
            if (r3 == 0) goto L_0x00a0
            com.ss.android.ugc.aweme.app.f.c r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r5 = "gecko_channel"
            java.lang.String r6 = r0.f29403c
            com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47824a(r5, r6)
            java.lang.String r5 = "file_path"
            com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47824a(r5, r3)
            org.json.JSONObject r4 = r4.mo47825b()
            java.lang.String r5 = "rn_get_offline_bundle"
            r6 = r3
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            com.p683ss.android.ugc.aweme.app.C23131p.m57776a(r5, r6, r4)
            goto L_0x00a1
        L_0x00a0:
            r3 = r1
        L_0x00a1:
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00dd
            java.io.File r4 = new java.io.File
            if (r3 != 0) goto L_0x00b1
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00b1:
            r4.<init>(r3)
            boolean r3 = r4.exists()
            if (r3 != 0) goto L_0x00bb
            goto L_0x00dd
        L_0x00bb:
            if (r0 == 0) goto L_0x00c8
            com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo r0 = com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.C27203a.m65626b(r0)
            if (r0 == 0) goto L_0x00c8
            java.util.List r0 = r0.getModules()
            goto L_0x00c9
        L_0x00c8:
            r0 = r1
        L_0x00c9:
            if (r0 == 0) goto L_0x00dc
            if (r10 == 0) goto L_0x00d3
            com.ss.android.ugc.aweme.crossplatform.c.d r10 = r10.f71720c
            if (r10 == 0) goto L_0x00d3
            java.lang.String r1 = r10.f71778e
        L_0x00d3:
            boolean r10 = r0.contains(r1)
            if (r10 != 0) goto L_0x00da
            goto L_0x00dc
        L_0x00da:
            r10 = 1
            return r10
        L_0x00dc:
            return r2
        L_0x00dd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d.m67932a(com.ss.android.ugc.aweme.crossplatform.c.a.a):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m67934b(com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a r10) {
        /*
            boolean r10 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103352f()
            if (r10 == 0) goto L_0x000d
            java.lang.String r10 = "rn_base_android"
            boolean r10 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103360j(r10)
            return r10
        L_0x000d:
            com.bytedance.ies.geckoclient.e r10 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103348e()
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x00ba
            java.lang.String r2 = "rn_base_android"
            com.bytedance.ies.geckoclient.model.d r10 = r10.mo19651a(r2)
            r2 = 0
            if (r10 == 0) goto L_0x00a0
            java.lang.String r3 = "$this$getOfflineBundlePath"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r3)
            java.io.File r3 = com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.C27203a.m65625a(r10)
            if (r3 == 0) goto L_0x006b
            boolean r4 = r3.exists()
            if (r4 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r3 = r2
        L_0x0031:
            if (r3 == 0) goto L_0x006b
            java.io.File[] r3 = r3.listFiles()
            if (r3 == 0) goto L_0x006b
            int r4 = r3.length
            r5 = 0
        L_0x003b:
            if (r5 >= r4) goto L_0x0063
            r6 = r3[r5]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "name"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            r8 = r2
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x0054
            java.lang.String r8 = ".jsbundle"
            goto L_0x0058
        L_0x0054:
            p2628d.p2639f.p2641b.C52711k.m112234a()
            r8 = r2
        L_0x0058:
            r9 = 2
            boolean r7 = p2628d.p2650m.C52830p.m112413c(r7, r8, r0, r9, r2)
            if (r7 == 0) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            int r5 = r5 + 1
            goto L_0x003b
        L_0x0063:
            r6 = r2
        L_0x0064:
            if (r6 == 0) goto L_0x006b
            java.lang.String r3 = r6.getAbsolutePath()
            goto L_0x006c
        L_0x006b:
            r3 = r2
        L_0x006c:
            if (r3 == 0) goto L_0x00a0
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r4 = r4.exists()
            if (r4 == 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = r2
        L_0x007b:
            if (r3 == 0) goto L_0x00a0
            com.ss.android.ugc.aweme.app.f.c r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r4 = "gecko_channel"
            java.lang.String r10 = r10.f29403c
            com.ss.android.ugc.aweme.app.f.c r10 = r2.mo47824a(r4, r10)
            java.lang.String r2 = "file_path"
            com.ss.android.ugc.aweme.app.f.c r10 = r10.mo47824a(r2, r3)
            org.json.JSONObject r10 = r10.mo47825b()
            java.lang.String r2 = "rn_get_offline_bundle"
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            com.p683ss.android.ugc.aweme.app.C23131p.m57776a(r2, r4, r10)
            r2 = r3
        L_0x00a0:
            r10 = r2
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x00ba
            java.io.File r10 = new java.io.File
            if (r2 != 0) goto L_0x00b0
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00b0:
            r10.<init>(r2)
            boolean r10 = r10.exists()
            if (r10 == 0) goto L_0x00ba
            return r1
        L_0x00ba:
            com.ss.android.ugc.aweme.crossplatform.platform.rn.c r10 = com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.C27207c.C27208a.m65631a()
            boolean r10 = r10.mo55544c()
            if (r10 == 0) goto L_0x00c5
            return r1
        L_0x00c5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d.m67934b(com.ss.android.ugc.aweme.crossplatform.c.a.a):boolean");
    }

    /* renamed from: a */
    public final void mo58332a(String str) {
        C52711k.m112240b(str, "serviceName");
        int a = C10181b.m20511a().mo18168a(IntermediateMonitorExperiment.class, true, "intermediate_monitor", 31744, 0);
        boolean a2 = C10181b.m20511a().mo18172a(SearchFragmentReactNativeExperiment.class, true, "search_native_fragment", 31744, false);
        if (a != 0) {
            C0013i.m18a((Callable<TResult>) new C28669a<TResult>(str, a2, a), (Executor) C26890h.m65003a());
        }
    }

    /* renamed from: a */
    public static void m67931a(Exception exc, String str) {
        C52711k.m112240b(exc, "e");
        C52711k.m112240b(str, "bridgeType");
        Throwable th = exc;
        C9220a.m18312a(th, str);
        C32458a.m75148a(th);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_message", exc.getMessage());
            jSONObject.put("bridge_type", str);
            C23131p.m57776a("get_search_history_exception", 0, C23088c.m56632a(jSONObject).mo47825b());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo58333a(String str, long j) {
        String str2 = str;
        C52711k.m112240b(str, "serviceName");
        int a = C10181b.m20511a().mo18168a(IntermediateMonitorExperiment.class, true, "intermediate_monitor", 31744, 0);
        boolean a2 = C10181b.m20511a().mo18172a(SearchFragmentReactNativeExperiment.class, true, "search_native_fragment", 31744, false);
        if (a != 0) {
            C28670b bVar = new C28670b(str, j, a2, a);
            C0013i.m18a((Callable<TResult>) bVar, (Executor) C26890h.m65003a());
        }
    }
}

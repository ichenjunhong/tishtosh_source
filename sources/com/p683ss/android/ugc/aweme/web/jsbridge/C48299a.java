package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a */
public final class C48299a implements C10762d {

    /* renamed from: c */
    public static CardStruct f121529c;

    /* renamed from: d */
    public static CardStruct f121530d;

    /* renamed from: e */
    public static int f121531e;

    /* renamed from: f */
    public static Aweme f121532f;

    /* renamed from: g */
    public static final C48301b f121533g = new C48301b(null);

    /* renamed from: a */
    public int f121534a;

    /* renamed from: b */
    public final WeakReference<Context> f121535b;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$a */
    public static final class C48300a {

        /* renamed from: a */
        public final JSONObject f121536a;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f121536a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.web.jsbridge.C48299a.C48300a) r2).f121536a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.web.jsbridge.C48299a.C48300a
                if (r0 == 0) goto L_0x0013
                com.ss.android.ugc.aweme.web.jsbridge.a$a r2 = (com.p683ss.android.ugc.aweme.web.jsbridge.C48299a.C48300a) r2
                org.json.JSONObject r0 = r1.f121536a
                org.json.JSONObject r2 = r2.f121536a
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.jsbridge.C48299a.C48300a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            JSONObject jSONObject = this.f121536a;
            if (jSONObject != null) {
                return jSONObject.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChooseLogAdExtraData(adExtraData=");
            sb.append(this.f121536a);
            sb.append(")");
            return sb.toString();
        }

        public C48300a(JSONObject jSONObject) {
            C52711k.m112240b(jSONObject, "adExtraData");
            this.f121536a = jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$b */
    public static final class C48301b {
        private C48301b() {
        }

        /* renamed from: a */
        public static Aweme m104630a() {
            return C48299a.f121532f;
        }

        public /* synthetic */ C48301b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m104631a(int i) {
            C48299a.f121531e = i;
        }

        /* renamed from: a */
        public static void m104632a(Aweme aweme) {
            C48299a.f121532f = aweme;
        }

        /* renamed from: a */
        public static void m104633a(CardStruct cardStruct) {
            C48299a.f121529c = cardStruct;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$c */
    static final class C48302c implements C26534a {

        /* renamed from: a */
        final /* synthetic */ C48299a f121537a;

        C48302c(C48299a aVar) {
            this.f121537a = aVar;
        }

        /* renamed from: a */
        public final void mo49915a(boolean z) {
            if (z) {
                Context context = (Context) this.f121537a.f121535b.get();
                if (context == null) {
                    context = C11010c.m22280a();
                }
                C26088l.m63346e(context, C48301b.m104630a());
                return;
            }
            Context context2 = (Context) this.f121537a.f121535b.get();
            if (context2 == null) {
                context2 = C11010c.m22280a();
            }
            C26088l.m63352f(context2, C48301b.m104630a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$d */
    static final class C48303d extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        public static final C48303d f121538a = new C48303d();

        C48303d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            if (booleanValue) {
                C26080b b = bVar.mo53590b(C48301b.m104630a());
                C52711k.m112236a((Object) b, "fill(aweme)");
                return b;
            }
            C26080b a = bVar.mo53578a(C48301b.m104630a());
            C52711k.m112236a((Object) a, "adId(aweme)");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$e */
    static final class C48304e extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        public static final C48304e f121539a = new C48304e();

        C48304e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            if (booleanValue) {
                C26080b b = bVar.mo53590b(C48301b.m104630a());
                C52711k.m112236a((Object) b, "fill(aweme)");
                return b;
            }
            C26080b a = bVar.mo53578a(C48301b.m104630a());
            C52711k.m112236a((Object) a, "adId(aweme)");
            return a;
        }
    }

    public C48299a(WeakReference<Context> weakReference) {
        C52711k.m112240b(weakReference, "contextRef");
        this.f121535b = weakReference;
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.ss.android.ugc.aweme.feed.model.AwemeRawAd] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.ss.android.ugc.aweme.feed.model.AwemeRawAd] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0356, code lost:
        if (r3 == null) goto L_0x0358;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.feed.model.AwemeRawAd, java.util.List]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], ?[OBJECT, ARRAY], com.ss.android.ugc.aweme.feed.model.AwemeRawAd]
      mth insns count: 478
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0469  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.p675g.p676a.C10766h r11, org.json.JSONObject r12) throws java.lang.Exception {
        /*
            r10 = this;
            java.lang.String r0 = "msg"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            java.lang.String r0 = "res"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.String r0 = r11.f28946c
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            int r1 = r0.hashCode()
            r2 = 25
            r3 = -1
            r4 = 0
            r5 = 1
            r6 = 0
            switch(r1) {
                case -1547174390: goto L_0x04b8;
                case -1358093233: goto L_0x0422;
                case -585801204: goto L_0x03f6;
                case -271137704: goto L_0x02a0;
                case -160920371: goto L_0x026b;
                case -32695719: goto L_0x020e;
                case 473850877: goto L_0x01e3;
                case 649898786: goto L_0x01a2;
                case 714964112: goto L_0x017f;
                case 972450577: goto L_0x006d;
                case 1528366175: goto L_0x005a;
                case 1780854578: goto L_0x0049;
                case 1984473746: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x050b
        L_0x001e:
            java.lang.String r1 = "setCard"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x050b
            java.lang.String r0 = "code"
            r12.put(r0, r6)
            org.json.JSONObject r0 = r11.f28947d
            java.lang.String r1 = "width"
            int r0 = r0.optInt(r1, r6)
            org.json.JSONObject r11 = r11.f28947d
            java.lang.String r1 = "height"
            int r11 = r11.optInt(r1, r6)
            com.ss.android.ugc.aweme.commercialize.views.cards.c r1 = new com.ss.android.ugc.aweme.commercialize.views.cards.c
            r1.<init>(r11, r0)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r1)
            java.lang.String r11 = "code"
            r12.put(r11, r5)
            return
        L_0x0049:
            java.lang.String r11 = "closeAdModal"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L_0x050b
            com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a r11 = new com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a
            r11.<init>(r3)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r11)
            return
        L_0x005a:
            java.lang.String r11 = "showModalPage"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L_0x050b
            com.ss.android.ugc.aweme.commercialize.d.g r11 = new com.ss.android.ugc.aweme.commercialize.d.g
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = f121532f
            r11.<init>(r12, r2)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r11)
            return
        L_0x006d:
            java.lang.String r1 = "download_click"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x050b
            java.lang.String r0 = "code"
            r12.put(r0, r6)
            org.json.JSONObject r0 = r11.f28947d
            java.lang.String r1 = "app_id"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L_0x050b
            org.json.JSONObject r0 = r11.f28947d
            java.lang.String r1 = "extParam"
            java.lang.Object r0 = r0.opt(r1)
            boolean r1 = r0 instanceof org.json.JSONObject
            if (r1 != 0) goto L_0x0091
            r0 = r4
        L_0x0091:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.ref.WeakReference<android.content.Context> r1 = r10.f121535b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = f121532f
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64211a(r1, r2)
            if (r1 == 0) goto L_0x00f0
            java.lang.String r11 = "code"
            r12.put(r11, r5)
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            java.lang.String r12 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = r11.mo53582a(r12)
            java.lang.String r12 = "click"
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = r11.mo53593b(r12)
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = r11.mo53594b(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = f121532f
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = r11.mo53590b(r12)
            r11.mo53597c()
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = f121532f
            if (r11 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r11.getAwemeRawAd()
            if (r11 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.commercialize.log.ay r4 = com.p683ss.android.ugc.aweme.commercialize.log.C26060ay.f68819a
            java.lang.String r5 = "click"
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r11.getClickTrackUrlList()
            java.lang.Long r7 = r11.getCreativeId()
            java.lang.String r8 = r11.getLogExtra()
            com.ss.android.ugc.aweme.web.jsbridge.a$d r11 = com.p683ss.android.ugc.aweme.web.jsbridge.C48299a.C48303d.f121538a
            r9 = r11
            d.f.a.m r9 = (p2628d.p2639f.p2640a.C52682m) r9
            r4.mo53545a(r5, r6, r7, r8, r9)
        L_0x00e7:
            com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a r11 = new com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a
            r11.<init>(r3)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r11)
            return
        L_0x00f0:
            java.lang.ref.WeakReference<android.content.Context> r1 = r10.f121535b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = f121532f
            boolean r1 = com.p683ss.android.ugc.aweme.miniapp.utils.C36917d.m83053a(r1, r2)
            if (r1 == 0) goto L_0x0101
            return
        L_0x0101:
            org.json.JSONObject r11 = r11.f28947d
            java.lang.String r1 = "app_id"
            java.lang.String r11 = r11.getString(r1)
            java.lang.String r1 = "code"
            java.lang.ref.WeakReference<android.content.Context> r2 = r10.f121535b
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            boolean r11 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64255c(r2, r11)
            r12.put(r1, r11)
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            java.lang.String r12 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = r11.mo53582a(r12)
            java.lang.String r12 = "click"
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = r11.mo53593b(r12)
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = r11.mo53594b(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = f121532f
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = r11.mo53590b(r12)
            r11.mo53597c()
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = f121532f
            if (r11 == 0) goto L_0x0159
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r11.getAwemeRawAd()
            if (r11 == 0) goto L_0x0159
            com.ss.android.ugc.aweme.commercialize.log.ay r4 = com.p683ss.android.ugc.aweme.commercialize.log.C26060ay.f68819a
            java.lang.String r5 = "click"
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r11.getClickTrackUrlList()
            java.lang.Long r7 = r11.getCreativeId()
            java.lang.String r8 = r11.getLogExtra()
            com.ss.android.ugc.aweme.web.jsbridge.a$e r11 = com.p683ss.android.ugc.aweme.web.jsbridge.C48299a.C48304e.f121539a
            r9 = r11
            d.f.a.m r9 = (p2628d.p2639f.p2640a.C52682m) r9
            r4.mo53545a(r5, r6, r7, r8, r9)
        L_0x0159:
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            java.lang.String r12 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = r11.mo53582a(r12)
            java.lang.String r12 = "click_start"
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = r11.mo53593b(r12)
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = r11.mo53594b(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = f121532f
            com.ss.android.ugc.aweme.commercialize.log.e$b r11 = r11.mo53590b(r12)
            r11.mo53597c()
            com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a r11 = new com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a
            r11.<init>(r3)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r11)
            return
        L_0x017f:
            java.lang.String r12 = "closeCardDialog"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x050b
            org.json.JSONObject r12 = r11.f28947d
            java.lang.String r0 = "cardStatus"
            boolean r12 = r12.has(r0)
            if (r12 == 0) goto L_0x050b
            com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a r12 = new com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a
            org.json.JSONObject r11 = r11.f28947d
            java.lang.String r0 = "cardStatus"
            int r11 = r11.getInt(r0)
            r12.<init>(r11)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r12)
            return
        L_0x01a2:
            java.lang.String r12 = "cardStatus"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x050b
            org.json.JSONObject r12 = r11.f28947d
            java.lang.String r0 = "status"
            boolean r12 = r12.has(r0)
            if (r12 == 0) goto L_0x050b
            org.json.JSONObject r12 = r11.f28947d
            java.lang.String r0 = "from"
            int r12 = r12.optInt(r0, r5)
            com.ss.android.ugc.aweme.commercialize.views.cards.d r0 = new com.ss.android.ugc.aweme.commercialize.views.cards.d
            org.json.JSONObject r11 = r11.f28947d
            java.lang.String r1 = "status"
            int r11 = r11.getInt(r1)
            int r1 = f121531e
            r0.<init>(r11, r12, r1)
            int r11 = r10.f121534a
            r0.f70337d = r11
            java.lang.ref.WeakReference<android.content.Context> r11 = r10.f121535b
            java.lang.Object r11 = r11.get()
            android.content.Context r11 = (android.content.Context) r11
            if (r11 == 0) goto L_0x01dd
            int r6 = r11.hashCode()
        L_0x01dd:
            r0.f70338e = r6
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            return
        L_0x01e3:
            java.lang.String r1 = "cardInteriorShow"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x050b
            java.lang.String r0 = "code"
            r12.put(r0, r6)
            com.ss.android.ugc.aweme.web.jsbridge.a$a r0 = new com.ss.android.ugc.aweme.web.jsbridge.a$a
            org.json.JSONObject r1 = new org.json.JSONObject
            org.json.JSONObject r11 = r11.f28947d
            java.lang.String r2 = "ad_extra_data"
            java.lang.String r3 = ""
            java.lang.String r11 = r11.optString(r2, r3)
            r1.<init>(r11)
            r0.<init>(r1)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            java.lang.String r11 = "code"
            r12.put(r11, r5)
            goto L_0x050b
        L_0x020e:
            java.lang.String r1 = "callNativePhone"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x050b
            java.lang.String r0 = "code"
            r12.put(r0, r6)
            org.json.JSONObject r0 = r11.f28947d
            java.lang.String r1 = "tel_num"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L_0x050b
            org.json.JSONObject r11 = r11.f28947d
            java.lang.String r0 = "tel_num"
            java.lang.String r11 = r11.getString(r0)
            java.lang.String r0 = "code"
            java.lang.ref.WeakReference<android.content.Context> r1 = r10.f121535b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L_0x0262
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 == 0) goto L_0x0240
            goto L_0x0262
        L_0x0240:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "tel:"
            r2.<init>(r3)
            java.lang.String r11 = android.net.Uri.encode(r11)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            android.net.Uri r11 = android.net.Uri.parse(r11)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.DIAL"
            r2.<init>(r3, r11)
            boolean r11 = com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.m64210a(r1, r2)
            goto L_0x0263
        L_0x0262:
            r11 = 0
        L_0x0263:
            if (r11 == 0) goto L_0x0266
            goto L_0x0267
        L_0x0266:
            r5 = 0
        L_0x0267:
            r12.put(r0, r5)
            return
        L_0x026b:
            java.lang.String r1 = "openHalfScreenForm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x050b
            java.lang.String r0 = "code"
            r12.put(r0, r6)
            org.json.JSONObject r0 = r11.f28947d
            java.lang.String r1 = "form_url"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L_0x050b
            org.json.JSONObject r11 = r11.f28947d
            java.lang.String r0 = "form_url"
            java.lang.String r11 = r11.getString(r0)
            java.lang.String r0 = "code"
            java.lang.ref.WeakReference<android.content.Context> r1 = r10.f121535b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = f121532f
            r3 = 10
            boolean r11 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64219a(r1, r11, r2, r3)
            r12.put(r0, r11)
            return
        L_0x02a0:
            java.lang.String r1 = "cardClick"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x050b
            java.lang.String r0 = "open_status"
            r12.put(r0, r6)
            java.lang.String r0 = "web_status"
            r12.put(r0, r6)
            org.json.JSONObject r0 = r11.f28947d
            java.lang.String r1 = "open_url"
            java.lang.String r0 = r0.optString(r1)
            java.lang.ref.WeakReference<android.content.Context> r1 = r10.f121535b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = f121532f
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64220a(r1, r0, r3, r6)
            if (r1 == 0) goto L_0x02d1
            java.lang.String r11 = "open_status"
            r12.put(r11, r5)
            goto L_0x039e
        L_0x02d1:
            java.lang.ref.WeakReference<android.content.Context> r1 = r10.f121535b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64226a(r1, r0, r6)
            if (r0 == 0) goto L_0x02fd
            java.lang.String r11 = "open_status"
            r12.put(r11, r5)
            java.lang.ref.WeakReference<android.content.Context> r11 = r10.f121535b
            java.lang.Object r11 = r11.get()
            android.content.Context r11 = (android.content.Context) r11
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = f121532f
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63338d(r11, r12)
            com.ss.android.ugc.aweme.web.jsbridge.a$c r11 = new com.ss.android.ugc.aweme.web.jsbridge.a$c
            r11.<init>(r10)
            com.ss.android.ugc.aweme.commercialize.utils.q$a r11 = (com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a) r11
            com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64208a(r11)
            goto L_0x039e
        L_0x02fd:
            org.json.JSONObject r0 = r11.f28947d
            java.lang.String r1 = "web_url"
            java.lang.String r0 = r0.optString(r1)
            org.json.JSONObject r11 = r11.f28947d
            java.lang.String r1 = "web_title"
            java.lang.String r11 = r11.optString(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = f121532f
            if (r1 == 0) goto L_0x037e
            boolean r1 = r1.isAd()
            if (r1 != r5) goto L_0x037e
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.c$a r1 = new com.ss.android.ugc.aweme.commercialize.views.popupwebpage.c$a
            r1.<init>()
            java.lang.ref.WeakReference<android.content.Context> r3 = r10.f121535b
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.c$a r1 = r1.mo54668a(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = f121532f
            if (r3 == 0) goto L_0x0330
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r3.getAwemeRawAd()
        L_0x0330:
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.c$a r1 = r1.mo54669a(r4)
            java.lang.String r3 = "url"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            java.lang.String r3 = "webUrl"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.c$a r1 = (com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26780c.C26781a) r1
            r1.f70555e = r0
            java.lang.String r3 = "webTitle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r3)
            java.lang.String r3 = "webTitle"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r3)
            r1.f70556f = r11
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = f121532f
            if (r3 == 0) goto L_0x0358
            java.lang.String r3 = r3.getAid()
            if (r3 != 0) goto L_0x035a
        L_0x0358:
            java.lang.String r3 = ""
        L_0x035a:
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.c$a r1 = r1.mo54670a(r3)
            com.ss.android.ugc.aweme.commercialize.views.popupwebpage.c$a r1 = r1.mo54667a(r2)
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64228a(r1)
            if (r1 != 0) goto L_0x0378
            java.lang.ref.WeakReference<android.content.Context> r1 = r10.f121535b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = f121532f
            boolean r11 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64214a(r1, r2, r0, r11)
            if (r11 == 0) goto L_0x039e
        L_0x0378:
            java.lang.String r11 = "web_status"
            r12.put(r11, r5)
            goto L_0x039e
        L_0x037e:
            java.lang.ref.WeakReference<android.content.Context> r1 = r10.f121535b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            boolean r11 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64222a(r1, r0, r11)
            if (r11 == 0) goto L_0x039e
            java.lang.String r11 = "web_status"
            r12.put(r11, r5)
            java.lang.ref.WeakReference<android.content.Context> r11 = r10.f121535b
            java.lang.Object r11 = r11.get()
            android.content.Context r11 = (android.content.Context) r11
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = f121532f
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63359g(r11, r12)
        L_0x039e:
            java.lang.ref.WeakReference<android.content.Context> r11 = r10.f121535b     // Catch:{ Exception -> 0x03f5 }
            java.lang.Object r11 = r11.get()     // Catch:{ Exception -> 0x03f5 }
            if (r11 == 0) goto L_0x03ed
            android.app.Activity r11 = (android.app.Activity) r11     // Catch:{ Exception -> 0x03f5 }
            android.view.Window r11 = r11.getWindow()     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r12 = "(contextRef.get() as Activity).window"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)     // Catch:{ Exception -> 0x03f5 }
            android.view.View r11 = r11.getDecorView()     // Catch:{ Exception -> 0x03f5 }
            android.view.View r11 = r11.findFocus()     // Catch:{ Exception -> 0x03f5 }
            java.lang.ref.WeakReference<android.content.Context> r12 = r10.f121535b     // Catch:{ Exception -> 0x03f5 }
            java.lang.Object r12 = r12.get()     // Catch:{ Exception -> 0x03f5 }
            if (r12 == 0) goto L_0x03e5
            android.app.Activity r12 = (android.app.Activity) r12     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r0 = "input_method"
            java.lang.Object r12 = r12.getSystemService(r0)     // Catch:{ Exception -> 0x03f5 }
            if (r12 == 0) goto L_0x03dd
            android.view.inputmethod.InputMethodManager r12 = (android.view.inputmethod.InputMethodManager) r12     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r0 = "focused"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)     // Catch:{ Exception -> 0x03f5 }
            android.os.IBinder r0 = r11.getWindowToken()     // Catch:{ Exception -> 0x03f5 }
            r12.hideSoftInputFromWindow(r0, r6)     // Catch:{ Exception -> 0x03f5 }
            r11.clearFocus()     // Catch:{ Exception -> 0x03f5 }
            return
        L_0x03dd:
            d.u r11 = new d.u     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r12 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            r11.<init>(r12)     // Catch:{ Exception -> 0x03f5 }
            throw r11     // Catch:{ Exception -> 0x03f5 }
        L_0x03e5:
            d.u r11 = new d.u     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r12 = "null cannot be cast to non-null type android.app.Activity"
            r11.<init>(r12)     // Catch:{ Exception -> 0x03f5 }
            throw r11     // Catch:{ Exception -> 0x03f5 }
        L_0x03ed:
            d.u r11 = new d.u     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r12 = "null cannot be cast to non-null type android.app.Activity"
            r11.<init>(r12)     // Catch:{ Exception -> 0x03f5 }
            throw r11     // Catch:{ Exception -> 0x03f5 }
        L_0x03f5:
            return
        L_0x03f6:
            java.lang.String r1 = "setModalSize"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x050b
            java.lang.String r0 = "code"
            r12.put(r0, r6)
            org.json.JSONObject r0 = r11.f28947d
            java.lang.String r1 = "width"
            int r0 = r0.optInt(r1, r6)
            org.json.JSONObject r11 = r11.f28947d
            java.lang.String r1 = "height"
            int r11 = r11.optInt(r1, r6)
            com.ss.android.ugc.aweme.commercialize.views.cards.c r1 = new com.ss.android.ugc.aweme.commercialize.views.cards.c
            r2 = 2
            r1.<init>(r11, r0, r2)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r1)
            java.lang.String r11 = "code"
            r12.put(r11, r5)
            return
        L_0x0422:
            java.lang.String r1 = "getPageData"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x050b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getPageData "
            r0.<init>(r1)
            com.ss.android.ugc.aweme.feed.model.CardStruct r1 = f121529c
            if (r1 == 0) goto L_0x043a
            org.json.JSONObject r1 = r1.getCardData()
            goto L_0x043b
        L_0x043a:
            r1 = r4
        L_0x043b:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.append(r1)
            org.json.JSONObject r11 = r11.f28947d
            java.lang.String r0 = "type"
            java.lang.String r1 = ""
            java.lang.String r11 = r11.optString(r0, r1)
            java.lang.String r0 = "4"
            boolean r11 = p2628d.p2639f.p2641b.C52711k.m112239a(r11, r0)
            if (r11 == 0) goto L_0x045f
            com.ss.android.ugc.aweme.feed.model.CardStruct r11 = f121530d
            if (r11 == 0) goto L_0x045d
            org.json.JSONObject r11 = r11.getCardData()
            goto L_0x0467
        L_0x045d:
            r11 = r4
            goto L_0x0467
        L_0x045f:
            com.ss.android.ugc.aweme.feed.model.CardStruct r11 = f121529c
            if (r11 == 0) goto L_0x045d
            org.json.JSONObject r11 = r11.getCardData()
        L_0x0467:
            if (r11 == 0) goto L_0x04ae
            java.lang.ref.WeakReference<android.content.Context> r0 = r10.f121535b
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47918gj.m103682a(r0)
            if (r5 != r0) goto L_0x047c
            java.lang.String r0 = "webview_layout_direction"
            r11.put(r0, r5)
        L_0x047c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = f121532f
            if (r0 == 0) goto L_0x0484
            java.util.List r4 = r0.getRawAdClickTrackUrlList()
        L_0x0484:
            if (r4 == 0) goto L_0x04ae
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ r5
            if (r0 != r5) goto L_0x04ae
            java.lang.String r0 = "app_data"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            if (r0 == 0) goto L_0x04ae
            java.lang.String r1 = "click_track_url_list"
            boolean r1 = r0.has(r1)
            if (r1 != 0) goto L_0x04a9
            java.lang.String r1 = "click_track_url_list"
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>(r4)
            r0.put(r1, r2)
        L_0x04a9:
            java.lang.String r1 = "app_data"
            r11.put(r1, r0)
        L_0x04ae:
            java.lang.String r0 = "card_data"
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r12.put(r0, r11)
            return
        L_0x04b8:
            java.lang.String r12 = "modalInteractionURL"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x050b
            org.json.JSONObject r11 = r11.f28947d
            java.lang.String r12 = "card_url"
            java.lang.String r11 = r11.optString(r12)
            if (r11 == 0) goto L_0x050a
            r12 = r11
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x04d5
            r12 = 1
            goto L_0x04d6
        L_0x04d5:
            r12 = 0
        L_0x04d6:
            if (r12 != r5) goto L_0x050b
            com.ss.android.ugc.aweme.feed.model.CardStruct r12 = new com.ss.android.ugc.aweme.feed.model.CardStruct
            r12.<init>()
            r12.setCardUrl(r11)
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = f121532f
            if (r11 != 0) goto L_0x04e5
            goto L_0x0502
        L_0x04e5:
            boolean r0 = r11.isAd()
            if (r0 == 0) goto L_0x0502
            r0 = 1001(0x3e9, float:1.403E-42)
            r12.setCardType(r0)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r11 = r11.getAwemeRawAd()
            if (r11 == 0) goto L_0x0501
            java.util.Map r11 = r11.getCardInfos()
            if (r11 == 0) goto L_0x0501
            java.lang.String r0 = "4"
            r11.put(r0, r12)
        L_0x0501:
            r6 = 1
        L_0x0502:
            if (r6 == 0) goto L_0x050b
            f121530d = r12
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r12)
            return
        L_0x050a:
            return
        L_0x050b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.jsbridge.C48299a.call(com.bytedance.ies.g.a.h, org.json.JSONObject):void");
    }
}

package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25628h;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import java.util.List;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.ac */
public final class C23646ac extends C23649b {

    /* renamed from: a */
    public C30313ae<C30332aw> f63049a;

    /* renamed from: b */
    public final Activity f63050b;

    /* renamed from: s */
    public final String f63051s;

    /* renamed from: u */
    private List<AnchorCommonStruct> f63052u;

    /* renamed from: v */
    private C25628h f63053v;

    /* renamed from: w */
    private JSONObject f63054w;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.ac$a */
    static final class C23647a extends C52712l implements C52671b<WikipediaInfo, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C23646ac f63055a;

        C23647a(C23646ac acVar) {
            this.f63055a = acVar;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
            if (r2 == null) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
            if (r2 == null) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.feed.model.WikipediaInfo r5 = (com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo) r5
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
                java.lang.String r0 = "enter_wiki_detail"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "enter_from"
                com.ss.android.ugc.aweme.base.ui.anchor.ac r3 = r4.f63055a
                java.lang.String r3 = r3.f63051s
                if (r3 != 0) goto L_0x0017
                java.lang.String r3 = ""
            L_0x0017:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "language"
                java.lang.String r3 = r5.getLang()
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "wiki_entry"
                java.lang.String r5 = r5.getKeyword()
                com.ss.android.ugc.aweme.app.f.d r5 = r1.mo47829a(r2, r5)
                java.lang.String r1 = "author_id"
                com.ss.android.ugc.aweme.base.ui.anchor.ac r2 = r4.f63055a
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f63071q
                if (r2 == 0) goto L_0x003d
                java.lang.String r2 = r2.getAuthorUid()
                if (r2 != 0) goto L_0x003f
            L_0x003d:
                java.lang.String r2 = ""
            L_0x003f:
                com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r1, r2)
                java.lang.String r1 = "group_id"
                com.ss.android.ugc.aweme.base.ui.anchor.ac r2 = r4.f63055a
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f63071q
                if (r2 == 0) goto L_0x0051
                java.lang.String r2 = r2.getAid()
                if (r2 != 0) goto L_0x0053
            L_0x0051:
                java.lang.String r2 = ""
            L_0x0053:
                com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r5)
                d.x r5 = p2628d.C52860x.f131107a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23646ac.C23647a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.ac$b */
    static final class C23648b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C23646ac f63056a;

        C23648b(C23646ac acVar) {
            this.f63056a = acVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C30313ae<C30332aw> aeVar = this.f63056a.f63049a;
            if (aeVar != null) {
                aeVar.mo60714a(new C30332aw(48));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo49074a() {
        C26890h.m65012a("anchor_entrance_show", m58004g());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r2 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r2 == null) goto L_0x0039;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map<java.lang.String, java.lang.String> m58003f() {
        /*
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "close"
            java.lang.String r2 = "false"
            r0.put(r1, r2)
            java.lang.String r1 = "back"
            java.lang.String r2 = "true"
            r0.put(r1, r2)
            java.lang.String r1 = "hide_nav_bar"
            java.lang.String r2 = "false"
            r0.put(r1, r2)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x0028
            java.lang.String r2 = r2.getAuthorUid()
            if (r2 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r2 = ""
        L_0x002a:
            r0.put(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63071q
            if (r2 == 0) goto L_0x0039
            java.lang.String r2 = r2.getAid()
            if (r2 != 0) goto L_0x003b
        L_0x0039:
            java.lang.String r2 = ""
        L_0x003b:
            r0.put(r1, r2)
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r3.f63051s
            if (r2 != 0) goto L_0x0046
            java.lang.String r2 = ""
        L_0x0046:
            r0.put(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23646ac.m58003f():java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 == null) goto L_0x000c;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject m58004g() {
        /*
            r6 = this;
            org.json.JSONObject r0 = r6.f63054w
            if (r0 == 0) goto L_0x000c
            java.lang.String r1 = "request_id"
            java.lang.String r0 = r0.optString(r1)
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            java.lang.String r0 = ""
        L_0x000e:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f63071q
            java.lang.String r1 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56861e(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f63071q
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56877m(r2)
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r3.<init>()
            r3.setImprId(r0)
            com.ss.android.ugc.aweme.common.j r0 = new com.ss.android.ugc.aweme.common.j
            r0.<init>()
            java.lang.String r4 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r5 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r3 = r5.mo60160a(r3)
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r4, r3)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.f63071q
            if (r4 == 0) goto L_0x0040
            java.lang.String r4 = r4.getAuthorUid()
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r3, r2)
            java.lang.String r2 = "impr_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f63071q
            java.lang.String r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56883s(r3)
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r2, r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r6.f63051s
            if (r3 != 0) goto L_0x005f
            java.lang.String r3 = ""
        L_0x005f:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r2, r3)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r2, r1)
            java.lang.String r1 = "anchor_type"
            java.lang.String r2 = "wiki"
            com.ss.android.ugc.aweme.common.j r0 = r0.mo54849a(r1, r2)
            org.json.JSONObject r0 = r0.mo54850a()
            java.lang.String r1 = "MobJsonHelper()\n        …\n                .build()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23646ac.m58004g():org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49077b() {
        /*
            r7 = this;
            java.lang.String r0 = "anchor_entrance_click"
            org.json.JSONObject r1 = r7.m58004g()
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f63071q
            if (r0 == 0) goto L_0x001e
            com.ss.android.ugc.aweme.feed.model.Anchor r0 = r0.getAnchor()
            if (r0 == 0) goto L_0x001e
            java.lang.Integer r0 = r0.getBusinessType()
            if (r0 == 0) goto L_0x001e
            int r0 = r0.intValue()
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            com.ss.android.ugc.aweme.commercialize.anchor.a r1 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.WIKIPEDIA
            int r1 = r1.getTYPE()
            r2 = 0
            if (r0 != r1) goto L_0x0090
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f63071q
            if (r0 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.feed.model.Anchor r0 = r0.getAnchor()
            if (r0 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r0 = r0.getWikipediaInfo()
            goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            if (r0 == 0) goto L_0x008f
            java.lang.String r1 = r0.getLang()
            java.lang.String r0 = r0.getKeyword()
            java.lang.String r3 = "enter_wiki_detail"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "enter_from"
            java.lang.String r6 = r7.f63051s
            if (r6 != 0) goto L_0x0050
            java.lang.String r6 = ""
        L_0x0050:
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "language"
            com.ss.android.ugc.aweme.app.f.d r1 = r4.mo47829a(r5, r1)
            java.lang.String r4 = "wiki_entry"
            com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r4, r0)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f63071q
            if (r4 == 0) goto L_0x006b
            java.lang.String r4 = r4.getAuthorUid()
            goto L_0x006c
        L_0x006b:
            r4 = r2
        L_0x006c:
            if (r4 != 0) goto L_0x0071
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0071:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r4)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f63071q
            if (r4 == 0) goto L_0x007f
            java.lang.String r2 = r4.getAid()
        L_0x007f:
            if (r2 != 0) goto L_0x0084
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0084:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r0)
            goto L_0x010f
        L_0x008f:
            return
        L_0x0090:
            com.ss.android.ugc.aweme.commercialize.anchor.a r1 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.YELP
            int r1 = r1.getTYPE()
            if (r0 == r1) goto L_0x00a0
            com.ss.android.ugc.aweme.commercialize.anchor.a r1 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.TRIP_ADVISOR
            int r1 = r1.getTYPE()
            if (r0 != r1) goto L_0x010f
        L_0x00a0:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f63071q
            if (r1 == 0) goto L_0x00af
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r1.getAnchor()
            if (r1 == 0) goto L_0x00af
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = r1.getAnchorInfo()
            goto L_0x00b0
        L_0x00af:
            r1 = r2
        L_0x00b0:
            if (r1 == 0) goto L_0x010f
            java.lang.String r1 = r1.getKeyword()
            com.ss.android.ugc.aweme.commercialize.anchor.a r3 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.YELP
            int r3 = r3.getTYPE()
            if (r0 != r3) goto L_0x00c1
            java.lang.String r0 = "Yelp"
            goto L_0x00c3
        L_0x00c1:
            java.lang.String r0 = "TripAdvisor"
        L_0x00c3:
            java.lang.String r3 = "enter_anchor_detail"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "enter_from"
            java.lang.String r6 = r7.f63051s
            if (r6 != 0) goto L_0x00d1
            java.lang.String r6 = ""
        L_0x00d1:
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "anchor_type"
            com.ss.android.ugc.aweme.app.f.d r0 = r4.mo47829a(r5, r0)
            java.lang.String r4 = "anchor_entry"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r1)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f63071q
            if (r4 == 0) goto L_0x00ec
            java.lang.String r4 = r4.getAuthorUid()
            goto L_0x00ed
        L_0x00ec:
            r4 = r2
        L_0x00ed:
            if (r4 != 0) goto L_0x00f2
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00f2:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r4)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f63071q
            if (r4 == 0) goto L_0x0100
            java.lang.String r2 = r4.getAid()
        L_0x0100:
            if (r2 != 0) goto L_0x0105
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0105:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r0)
            return
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23646ac.mo49077b():void");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct] */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct] */
    /* JADX WARNING: type inference failed for: r1v7, types: [com.ss.android.ugc.aweme.feed.model.WikipediaInfo] */
    /* JADX WARNING: type inference failed for: r1v13, types: [com.ss.android.ugc.aweme.feed.model.WikipediaInfo] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x017d, code lost:
        if (r4 == null) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018e, code lost:
        if (r4 == null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0210, code lost:
        if (r4 == null) goto L_0x0212;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.feed.model.WikipediaInfo, com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, com.ss.android.ugc.aweme.feed.model.WikipediaInfo]
      mth insns count: 222
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
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ba  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49075a(android.view.View r8) {
        /*
            r7 = this;
            super.mo49075a(r8)
            java.util.List<com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct> r8 = r7.f63052u
            r0 = 1
            r1 = 0
            r2 = 0
            if (r8 == 0) goto L_0x00da
            r3 = r8
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r8 = r1
        L_0x0016:
            if (r8 == 0) goto L_0x00da
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p2628d.p2629a.C52575l.m112104a(r8, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r8 = r8.iterator()
        L_0x002b:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r8.next()
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r4 = (com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r4
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r5 = new com.ss.android.ugc.aweme.feed.model.WikipediaInfo
            r5.<init>()
            java.lang.String r6 = r4.getKeyword()
            r5.setKeyword(r6)
            java.lang.String r4 = r4.getLanguage()
            r5.setLang(r4)
            r3.add(r5)
            goto L_0x002b
        L_0x004e:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r8 = p2628d.p2629a.C52575l.m112143g(r3)
            if (r8 == 0) goto L_0x00da
            int r3 = r8.size()
            if (r3 != r0) goto L_0x00d1
            android.app.Activity r3 = r7.f63050b
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r8.get(r2)
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r4 = (com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo) r4
            java.util.Map r5 = r7.m58003f()
            com.p683ss.android.ugc.aweme.commercialize.anchor.C25625f.m62154a(r3, r4, r5)
            java.lang.String r3 = "enter_wiki_detail"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "enter_from"
            java.lang.String r6 = r7.f63051s
            if (r6 != 0) goto L_0x007d
            java.lang.String r6 = ""
        L_0x007d:
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "language"
            java.lang.Object r6 = r8.get(r2)
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r6 = (com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo) r6
            java.lang.String r6 = r6.getLang()
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "wiki_entry"
            java.lang.Object r8 = r8.get(r2)
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r8 = (com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo) r8
            java.lang.String r8 = r8.getKeyword()
            com.ss.android.ugc.aweme.app.f.d r8 = r4.mo47829a(r5, r8)
            java.lang.String r4 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r7.f63071q
            if (r5 == 0) goto L_0x00ac
            java.lang.String r5 = r5.getAuthorUid()
            goto L_0x00ad
        L_0x00ac:
            r5 = r1
        L_0x00ad:
            if (r5 != 0) goto L_0x00b2
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00b2:
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r4, r5)
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r7.f63071q
            if (r5 == 0) goto L_0x00c1
            java.lang.String r5 = r5.getAid()
            goto L_0x00c2
        L_0x00c1:
            r5 = r1
        L_0x00c2:
            if (r5 != 0) goto L_0x00c7
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00c7:
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r8 = r8.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r8)
            goto L_0x00d8
        L_0x00d1:
            java.util.Map r3 = r7.m58003f()
            r7.m58002a(r8, r3)
        L_0x00d8:
            r8 = 1
            goto L_0x00db
        L_0x00da:
            r8 = 0
        L_0x00db:
            if (r8 != 0) goto L_0x0247
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f63071q
            if (r8 == 0) goto L_0x00f2
            com.ss.android.ugc.aweme.feed.model.Anchor r8 = r8.getAnchor()
            if (r8 == 0) goto L_0x00f2
            java.lang.Integer r8 = r8.getBusinessType()
            if (r8 == 0) goto L_0x00f2
            int r8 = r8.intValue()
            goto L_0x00f3
        L_0x00f2:
            r8 = 0
        L_0x00f3:
            com.ss.android.ugc.aweme.commercialize.anchor.a r3 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.WIKIPEDIA
            int r3 = r3.getTYPE()
            if (r8 != r3) goto L_0x01ba
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f63071q
            if (r8 == 0) goto L_0x0109
            com.ss.android.ugc.aweme.feed.model.Anchor r8 = r8.getAnchor()
            if (r8 == 0) goto L_0x0109
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r1 = r8.getWikipediaInfo()
        L_0x0109:
            if (r1 == 0) goto L_0x01b9
            java.lang.String r8 = r1.getLang()
            java.lang.String r1 = r1.getKeyword()
            r3 = r8
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x01b8
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0127
            goto L_0x01b8
        L_0x0127:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r3 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()
            java.lang.String r4 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r3 = r3.getWikipediaAnchorUrlPlaceholder()
            java.lang.String r4 = "SettingsReader.get().wikipediaAnchorUrlPlaceholder"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r2] = r8
            r5[r0] = r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r0 = com.C2240a.m6772a(r3, r0)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "title"
            if (r1 != 0) goto L_0x015b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x015b:
            r2.put(r3, r1)
            java.lang.String r3 = "close"
            java.lang.String r4 = "false"
            r2.put(r3, r4)
            java.lang.String r3 = "back"
            java.lang.String r4 = "true"
            r2.put(r3, r4)
            java.lang.String r3 = "hide_nav_bar"
            java.lang.String r4 = "false"
            r2.put(r3, r4)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f63071q
            if (r4 == 0) goto L_0x017f
            java.lang.String r4 = r4.getAuthorUid()
            if (r4 != 0) goto L_0x0181
        L_0x017f:
            java.lang.String r4 = ""
        L_0x0181:
            r2.put(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f63071q
            if (r4 == 0) goto L_0x0190
            java.lang.String r4 = r4.getAid()
            if (r4 != 0) goto L_0x0192
        L_0x0190:
            java.lang.String r4 = ""
        L_0x0192:
            r2.put(r3, r4)
            java.lang.String r3 = "wiki_entry"
            r2.put(r3, r1)
            java.lang.String r1 = "language"
            if (r8 != 0) goto L_0x01a1
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01a1:
            r2.put(r1, r8)
            java.lang.String r8 = "enter_from"
            java.lang.String r1 = r7.f63051s
            if (r1 != 0) goto L_0x01ac
            java.lang.String r1 = ""
        L_0x01ac:
            r2.put(r8, r1)
            android.app.Activity r8 = r7.f63050b
            android.content.Context r8 = (android.content.Context) r8
            com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.C48397a.m104727a(r8, r0, r2)
            goto L_0x0247
        L_0x01b8:
            return
        L_0x01b9:
            return
        L_0x01ba:
            com.ss.android.ugc.aweme.commercialize.anchor.a r0 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.YELP
            int r0 = r0.getTYPE()
            if (r8 == r0) goto L_0x01ca
            com.ss.android.ugc.aweme.commercialize.anchor.a r0 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.TRIP_ADVISOR
            int r0 = r0.getTYPE()
            if (r8 != r0) goto L_0x0247
        L_0x01ca:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f63071q
            if (r0 == 0) goto L_0x01d8
            com.ss.android.ugc.aweme.feed.model.Anchor r0 = r0.getAnchor()
            if (r0 == 0) goto L_0x01d8
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = r0.getAnchorInfo()
        L_0x01d8:
            if (r1 == 0) goto L_0x0247
            java.lang.String r0 = r1.getUrl()
            java.lang.String r1 = r1.getKeyword()
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0246
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x01f5
            goto L_0x0246
        L_0x01f5:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "title"
            if (r1 != 0) goto L_0x0203
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0203:
            r2.put(r3, r1)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f63071q
            if (r4 == 0) goto L_0x0212
            java.lang.String r4 = r4.getAuthorUid()
            if (r4 != 0) goto L_0x0214
        L_0x0212:
            java.lang.String r4 = ""
        L_0x0214:
            r2.put(r3, r4)
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = r7.f63051s
            if (r4 != 0) goto L_0x021f
            java.lang.String r4 = ""
        L_0x021f:
            r2.put(r3, r4)
            java.lang.String r3 = "anchor_entry"
            r2.put(r3, r1)
            com.ss.android.ugc.aweme.commercialize.anchor.a r1 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.YELP
            int r1 = r1.getTYPE()
            if (r8 != r1) goto L_0x0232
            java.lang.String r8 = "Yelp"
            goto L_0x0234
        L_0x0232:
            java.lang.String r8 = "TripAdvisor"
        L_0x0234:
            java.lang.String r1 = "anchor_type"
            r2.put(r1, r8)
            android.app.Activity r8 = r7.f63050b
            android.content.Context r8 = (android.content.Context) r8
            if (r0 != 0) goto L_0x0242
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0242:
            com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.C48397a.m104727a(r8, r0, r2)
            return
        L_0x0246:
            return
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23646ac.mo49075a(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if ((!p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r0, (java.lang.Object) r8)) != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (r1 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        if (r4 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        if (r3 == null) goto L_0x00d5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m58002a(java.util.List<com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo> r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.h.ae<com.ss.android.ugc.aweme.feed.h.aw> r0 = r7.f63049a
            if (r0 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.feed.h.aw r1 = new com.ss.android.ugc.aweme.feed.h.aw
            r2 = 47
            r1.<init>(r2)
            r0.mo60714a(r1)
        L_0x000e:
            com.ss.android.ugc.aweme.feed.h.l r0 = new com.ss.android.ugc.aweme.feed.h.l
            r0.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            com.ss.android.ugc.aweme.commercialize.anchor.h r0 = r7.f63053v
            if (r0 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.commercialize.anchor.h r0 = r7.f63053v
            if (r0 == 0) goto L_0x0021
            java.util.List<com.ss.android.ugc.aweme.feed.model.WikipediaInfo> r0 = r0.f67844d
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r8)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0049
        L_0x002a:
            com.ss.android.ugc.aweme.commercialize.anchor.h r0 = new com.ss.android.ugc.aweme.commercialize.anchor.h
            android.app.Activity r1 = r7.f63050b
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
            com.ss.android.ugc.aweme.base.ui.anchor.ac$a r1 = new com.ss.android.ugc.aweme.base.ui.anchor.ac$a
            r1.<init>(r7)
            r5 = r1
            d.f.a.b r5 = (p2628d.p2639f.p2640a.C52671b) r5
            com.ss.android.ugc.aweme.base.ui.anchor.ac$b r1 = new com.ss.android.ugc.aweme.base.ui.anchor.ac$b
            r1.<init>(r7)
            r6 = r1
            d.f.a.a r6 = (p2628d.p2639f.p2640a.C52670a) r6
            r1 = r0
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f63053v = r0
        L_0x0049:
            com.ss.android.ugc.aweme.commercialize.anchor.h r9 = r7.f63053v
            if (r9 == 0) goto L_0x0050
            r9.show()
        L_0x0050:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = ""
            r9.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0064:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0083
            java.lang.Object r1 = r8.next()
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r1 = (com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo) r1
            java.lang.String r2 = "wiki,"
            r9.append(r2)
            java.lang.String r1 = r1.getKeyword()
            java.lang.String r2 = ","
            java.lang.String r1 = p2628d.p2639f.p2641b.C52711k.m112231a(r1, r2)
            r0.append(r1)
            goto L_0x0064
        L_0x0083:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r8 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r8.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f63071q
            if (r1 == 0) goto L_0x0092
            java.lang.String r1 = r1.getRequestId()
            if (r1 != 0) goto L_0x0094
        L_0x0092:
            java.lang.String r1 = ""
        L_0x0094:
            r8.setImprId(r1)
            java.lang.String r1 = "anchor_multiple_show"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = r7.f63051s
            if (r4 != 0) goto L_0x00a5
            java.lang.String r4 = ""
        L_0x00a5:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f63071q
            if (r4 == 0) goto L_0x00b5
            java.lang.String r4 = r4.getAid()
            if (r4 != 0) goto L_0x00b7
        L_0x00b5:
            java.lang.String r4 = ""
        L_0x00b7:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r4 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r8 = r4.mo60160a(r8)
            com.ss.android.ugc.aweme.app.f.d r8 = r2.mo47829a(r3, r8)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f63071q
            if (r3 == 0) goto L_0x00d5
            java.lang.String r3 = r3.getAuthorUid()
            if (r3 != 0) goto L_0x00d7
        L_0x00d5:
            java.lang.String r3 = ""
        L_0x00d7:
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r2, r3)
            java.lang.String r2 = "sticker_type"
            java.lang.String r3 = "wiki"
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r2, r3)
            java.lang.String r2 = "anchor_types"
            java.lang.String r9 = r9.toString()
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r2, r9)
            java.lang.String r9 = "anchor_names"
            java.lang.String r0 = r0.toString()
            com.ss.android.ugc.aweme.app.f.d r8 = r8.mo47829a(r9, r0)
            java.util.Map<java.lang.String, java.lang.String> r8 = r8.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23646ac.m58002a(java.util.List, java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49076a(com.p683ss.android.ugc.aweme.feed.model.Aweme r8, org.json.JSONObject r9) {
        /*
            r7 = this;
            super.mo49076a(r8, r9)
            r7.f63054w = r9
            r9 = 0
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x0043
            java.util.List r2 = r8.getAnchors()
            if (r2 == 0) goto L_0x0043
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L_0x001d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x003f
            java.lang.Object r4 = r2.next()
            r5 = r4
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r5 = (com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r5
            int r5 = r5.getType()
            com.ss.android.ugc.aweme.commercialize.anchor.a r6 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.WIKIPEDIA
            int r6 = r6.getTYPE()
            if (r5 != r6) goto L_0x0038
            r5 = 1
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x001d
            r3.add(r4)
            goto L_0x001d
        L_0x003f:
            r2 = r3
            java.util.List r2 = (java.util.List) r2
            goto L_0x0044
        L_0x0043:
            r2 = r1
        L_0x0044:
            r7.f63052u = r2
            java.util.List<com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct> r2 = r7.f63052u
            r3 = 2131953134(0x7f1305ee, float:1.954273E38)
            if (r2 == 0) goto L_0x009e
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r0
            if (r4 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r2 = r1
        L_0x0059:
            if (r2 == 0) goto L_0x009e
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r7.f63057c
            r4.setImageResource(r3)
            int r4 = r2.size()
            if (r4 != r0) goto L_0x0069
            java.lang.String r0 = ""
            goto L_0x007c
        L_0x0069:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = " +"
            r4.<init>(r5)
            int r5 = r2.size()
            int r5 = r5 - r0
            r4.append(r5)
            java.lang.String r0 = r4.toString()
        L_0x007c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r7.f63058d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Object r6 = r2.get(r9)
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r6 = (com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r6
            java.lang.String r6 = r6.getKeyword()
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setText(r0)
            if (r2 != 0) goto L_0x0122
        L_0x009e:
            if (r8 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.feed.model.Anchor r0 = r8.getAnchor()
            if (r0 == 0) goto L_0x00b0
            java.lang.Integer r0 = r0.getBusinessType()
            if (r0 == 0) goto L_0x00b0
            int r9 = r0.intValue()
        L_0x00b0:
            com.ss.android.ugc.aweme.commercialize.anchor.a r0 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.WIKIPEDIA
            int r0 = r0.getTYPE()
            if (r9 != r0) goto L_0x00d7
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r9 = r7.f63057c
            r9.setImageResource(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r7.f63058d
            if (r8 == 0) goto L_0x00d1
            com.ss.android.ugc.aweme.feed.model.Anchor r8 = r8.getAnchor()
            if (r8 == 0) goto L_0x00d1
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r8 = r8.getWikipediaInfo()
            if (r8 == 0) goto L_0x00d1
            java.lang.String r1 = r8.getKeyword()
        L_0x00d1:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r9.setText(r1)
            goto L_0x0122
        L_0x00d7:
            com.ss.android.ugc.aweme.commercialize.anchor.a r0 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.YELP
            int r0 = r0.getTYPE()
            if (r9 != r0) goto L_0x0101
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r9 = r7.f63057c
            r0 = 2131953136(0x7f1305f0, float:1.9542734E38)
            r9.setImageResource(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r7.f63058d
            if (r8 == 0) goto L_0x00fb
            com.ss.android.ugc.aweme.feed.model.Anchor r8 = r8.getAnchor()
            if (r8 == 0) goto L_0x00fb
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r8 = r8.getAnchorInfo()
            if (r8 == 0) goto L_0x00fb
            java.lang.String r1 = r8.getKeyword()
        L_0x00fb:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r9.setText(r1)
            goto L_0x0122
        L_0x0101:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r9 = r7.f63057c
            r0 = 2131953132(0x7f1305ec, float:1.9542726E38)
            r9.setImageResource(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r7.f63058d
            if (r8 == 0) goto L_0x011d
            com.ss.android.ugc.aweme.feed.model.Anchor r8 = r8.getAnchor()
            if (r8 == 0) goto L_0x011d
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r8 = r8.getAnchorInfo()
            if (r8 == 0) goto L_0x011d
            java.lang.String r1 = r8.getKeyword()
        L_0x011d:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r9.setText(r1)
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23646ac.mo49076a(com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }

    public C23646ac(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(activity, "activity");
        super(viewGroup);
        this.f63050b = activity;
        this.f63051s = str;
    }
}

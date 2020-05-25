package com.p683ss.android.ugc.aweme.poi.adapter;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31749e;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31782a;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31846h;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39016f;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39017g;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39024l;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39028m;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39029n;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39032o;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39037s;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateMoreViewHolder;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateTitleViewHolder;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiCommonBannerViewHolder;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductInfoViewHolder;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C38999a;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendViewHolder;
import com.p683ss.android.ugc.aweme.poi.model.C39106al;
import com.p683ss.android.ugc.aweme.poi.model.C39123g;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38958c;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38959d;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38964i;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38968l;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.C39319a;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.e */
public final class C38973e extends C31749e<C37859b> {

    /* renamed from: E */
    public PoiOptimizedDetailViewHolder f99258E;

    /* renamed from: F */
    public C39067g f99259F;

    /* renamed from: G */
    public C11079a f99260G;

    /* renamed from: H */
    public C38971c f99261H;

    /* renamed from: I */
    public int f99262I = 3;

    /* renamed from: J */
    public C38999a f99263J;

    /* renamed from: K */
    public C38974a f99264K;

    /* renamed from: L */
    public int f99265L;

    /* renamed from: M */
    public int f99266M;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.e$a */
    public interface C38974a {
    }

    /* renamed from: m */
    public final boolean mo64649m() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r8v14, types: [android.widget.LinearLayout] */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r9v4, types: [android.widget.LinearLayout] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v7, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v8, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v9, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x055b, code lost:
        if ((r11 != null ? r11.booleanValue() : false) != false) goto L_0x0560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x088c, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], java.lang.String]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.widget.LinearLayout, java.lang.String]
      mth insns count: 791
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0567  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48222a(android.support.p043v7.widget.RecyclerView.C1352v r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r2 = r19
            int r3 = r0.mo48641a(r2)
            r4 = 112(0x70, float:1.57E-43)
            if (r3 != r4) goto L_0x0024
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder r1 = r0.f99258E
            if (r1 == 0) goto L_0x0023
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder r1 = r0.f99258E
            java.util.List r3 = r0.f70670n
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.newfollow.e.b r2 = (com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b) r2
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99259F
            r1.f99371d = r3
            com.ss.android.ugc.aweme.poi.model.PoiDetail r2 = (com.p683ss.android.ugc.aweme.poi.model.PoiDetail) r2
            r1.mo79156a(r2)
        L_0x0023:
            return
        L_0x0024:
            int r3 = r0.mo48641a(r2)
            r4 = 144(0x90, float:2.02E-43)
            if (r3 != r4) goto L_0x0040
            r1 = r18
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateTitleViewHolder r1 = (com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateTitleViewHolder) r1
            java.util.List r3 = r0.f70670n
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.poi.a.d r2 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38959d) r2
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99259F
            com.ss.android.ugc.aweme.poi.adapter.c r4 = r0.f99261H
            r1.mo79141a(r2, r3, r4)
            return
        L_0x0040:
            int r3 = r0.mo48641a(r2)
            r4 = 145(0x91, float:2.03E-43)
            r5 = 1
            if (r3 != r4) goto L_0x0063
            java.util.List r3 = r0.f70670n
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.ugc.aweme.poi.a.c r3 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38958c) r3
            com.ss.android.ugc.aweme.poi.g r4 = r0.f99259F
            java.lang.String r4 = r4.getAwemeId()
            r3.aid = r4
            r1 = r18
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateMoreViewHolder r1 = (com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateMoreViewHolder) r1
            com.ss.android.ugc.aweme.poi.adapter.c r4 = r0.f99261H
            r1.mo79139a(r3, r5, r2, r4)
            return
        L_0x0063:
            int r3 = r0.mo48641a(r2)
            r4 = 160(0xa0, float:2.24E-43)
            if (r3 != r4) goto L_0x007f
            r1 = r18
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateTitleViewHolder r1 = (com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateTitleViewHolder) r1
            java.util.List r3 = r0.f70670n
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.poi.a.d r2 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38959d) r2
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99259F
            com.ss.android.ugc.aweme.poi.adapter.c r4 = r0.f99261H
            r1.mo79141a(r2, r3, r4)
            return
        L_0x007f:
            int r3 = r0.mo48641a(r2)
            r4 = 161(0xa1, float:2.26E-43)
            r6 = 0
            if (r3 != r4) goto L_0x009a
            r1 = r18
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateMoreViewHolder r1 = (com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateMoreViewHolder) r1
            java.util.List r3 = r0.f70670n
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.ugc.aweme.poi.a.c r3 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38958c) r3
            com.ss.android.ugc.aweme.poi.adapter.c r4 = r0.f99261H
            r1.mo79139a(r3, r6, r2, r4)
            return
        L_0x009a:
            int r3 = r0.mo48641a(r2)
            r4 = 163(0xa3, float:2.28E-43)
            r7 = 2131886643(0x7f120233, float:1.940787E38)
            r8 = -1
            r9 = 0
            r10 = 8
            if (r3 != r4) goto L_0x019b
            r1 = r18
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendViewHolder r1 = (com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendViewHolder) r1
            java.util.List r3 = r0.f70670n
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.poi.a.i r2 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38964i) r2
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99259F
            com.ss.android.ugc.aweme.poi.a.i r4 = r1.f99404b
            if (r4 != 0) goto L_0x019a
            r1.f99405c = r3
            r1.f99404b = r2
            int r3 = r2.f99239c
            com.ss.android.ugc.aweme.poi.model.at r3 = com.p683ss.android.ugc.aweme.poi.model.C39114at.getPoiType(r3)
            java.util.List<com.ss.android.ugc.aweme.poi.model.ag> r4 = r2.f99238b
            boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r4)
            r5 = 2132021701(0x7f1411c5, float:1.96818E38)
            r11 = 2132021700(0x7f1411c4, float:1.9681799E38)
            r12 = -2
            if (r4 != 0) goto L_0x014c
            java.lang.String r3 = r2.f99240d
            java.util.List<com.ss.android.ugc.aweme.poi.model.ag> r2 = r2.f99238b
            android.content.Context r4 = r1.f99403a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r13 = 2132215481(0x7f1706b9, float:2.0074833E38)
            android.view.View r4 = r4.inflate(r13, r9, r6)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r8, r12)
            android.widget.LinearLayout r8 = r1.mRecommendLayout
            r8.addView(r4, r9)
            android.view.View r8 = r4.findViewById(r11)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            com.ss.android.ugc.aweme.poi.a.i r9 = r1.f99404b
            boolean r9 = r9.f99241e
            if (r9 != 0) goto L_0x010b
            r8.setVisibility(r10)
            r5.setVisibility(r6)
            r5.setText(r3)
            goto L_0x010e
        L_0x010b:
            r8.setText(r3)
        L_0x010e:
            r3 = 2132021698(0x7f1411c2, float:1.9681795E38)
            android.view.View r3 = r4.findViewById(r3)
            android.support.v7.widget.RecyclerView r3 = (android.support.p043v7.widget.RecyclerView) r3
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r4 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            android.content.Context r5 = r1.f99403a
            r4.<init>(r5, r6, r6)
            r3.setLayoutManager(r4)
            android.content.Context r4 = r1.f99403a
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelOffset(r7)
            com.ss.android.ugc.aweme.poi.ui.af r5 = new com.ss.android.ugc.aweme.poi.ui.af
            r5.<init>(r4)
            r3.mo4798a(r5)
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendViewHolder$2 r4 = new com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendViewHolder$2
            r4.<init>()
            r3.mo4801a(r4)
            com.ss.android.ugc.aweme.poi.adapter.k r4 = new com.ss.android.ugc.aweme.poi.adapter.k
            android.content.Context r5 = r1.f99403a
            com.ss.android.ugc.aweme.poi.g r6 = r1.f99405c
            r4.<init>(r5, r3, r2, r6)
            r1.f99406d = r4
            com.ss.android.ugc.aweme.poi.adapter.k r1 = r1.f99406d
            r3.setAdapter(r1)
            return
        L_0x014c:
            com.ss.android.ugc.aweme.poi.model.at r4 = com.p683ss.android.ugc.aweme.poi.model.C39114at.POI_TYPE_RESTAURANT
            if (r4 != r3) goto L_0x019a
            java.util.List<java.lang.String> r3 = r2.f99237a
            boolean r3 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)
            if (r3 != 0) goto L_0x019a
            java.util.List<java.lang.String> r2 = r2.f99237a
            android.content.Context r3 = r1.f99403a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2132215482(0x7f1706ba, float:2.0074835E38)
            android.view.View r3 = r3.inflate(r4, r9, r6)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r8, r12)
            android.widget.LinearLayout r7 = r1.mRecommendLayout
            r7.addView(r3, r4)
            android.view.View r4 = r3.findViewById(r11)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            com.ss.android.ugc.aweme.poi.a.i r7 = r1.f99404b
            boolean r7 = r7.f99241e
            if (r7 != 0) goto L_0x0189
            r4.setVisibility(r10)
            r5.setVisibility(r6)
        L_0x0189:
            r4 = 2132021699(0x7f1411c3, float:1.9681797E38)
            android.view.View r3 = r3.findViewById(r4)
            com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout r3 = (com.p683ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout) r3
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendViewHolder$1 r4 = new com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendViewHolder$1
            r4.<init>(r2, r3)
            r3.setAdapter(r4)
        L_0x019a:
            return
        L_0x019b:
            int r3 = r0.mo48641a(r2)
            r4 = 165(0xa5, float:2.31E-43)
            if (r3 != r4) goto L_0x01b5
            r1 = r18
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductInfoViewHolder r1 = (com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductInfoViewHolder) r1
            java.util.List r3 = r0.f70670n
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.poi.a.e r2 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38960e) r2
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99259F
            r1.mo79145a(r2, r3)
            return
        L_0x01b5:
            int r3 = r0.mo48641a(r2)
            r4 = 166(0xa6, float:2.33E-43)
            if (r3 != r4) goto L_0x01cf
            r1 = r18
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCommonBannerViewHolder r1 = (com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiCommonBannerViewHolder) r1
            java.util.List r3 = r0.f70670n
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.poi.a.b r2 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38957b) r2
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99259F
            r1.mo79143a(r2, r3)
            return
        L_0x01cf:
            int r3 = r0.mo48641a(r2)
            r4 = 168(0xa8, float:2.35E-43)
            if (r3 != r4) goto L_0x02a5
            r1 = r18
            com.ss.android.ugc.aweme.poi.adapter.viewholder.n r1 = (com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39029n) r1
            java.util.List r3 = r0.f70670n
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.poi.a.j r2 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38965j) r2
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99259F
            java.lang.String r4 = "poiRecommendItem"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r1.f99479b
            java.lang.String r8 = r2.title()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r4.setText(r8)
            boolean r4 = r2.hasMore()
            if (r4 != 0) goto L_0x0201
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r1.f99480c
            r4.setVisibility(r10)
            goto L_0x0212
        L_0x0201:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r1.f99480c
            r4.setVisibility(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r1.f99480c
            com.ss.android.ugc.aweme.poi.adapter.viewholder.n$a r8 = new com.ss.android.ugc.aweme.poi.adapter.viewholder.n$a
            r8.<init>(r2, r3)
            android.view.View$OnClickListener r8 = (android.view.View.OnClickListener) r8
            r4.setOnClickListener(r8)
        L_0x0212:
            java.util.List r4 = r2.list()
            r1.f99487j = r4
            java.lang.Integer r4 = r2.getRecommendType()
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.f99488k = r4
            r1.f99489l = r3
            boolean r4 = r1.f99485h
            if (r4 != 0) goto L_0x025c
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r4 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            android.content.Context r8 = r1.f99478a
            r4.<init>(r8, r6, r6)
            r1.f99486i = r4
            android.support.v7.widget.RecyclerView r4 = r1.f99481d
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r8 = r1.f99486i
            android.support.v7.widget.RecyclerView$i r8 = (android.support.p043v7.widget.RecyclerView.C1332i) r8
            r4.setLayoutManager(r8)
            android.content.Context r4 = r1.f99478a
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelOffset(r7)
            android.support.v7.widget.RecyclerView r7 = r1.f99481d
            com.ss.android.ugc.aweme.poi.ui.af r8 = new com.ss.android.ugc.aweme.poi.ui.af
            r11 = 4618441417868443648(0x4018000000000000, double:6.0)
            int r9 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r11)
            r8.<init>(r4, r9)
            android.support.v7.widget.RecyclerView$h r8 = (android.support.p043v7.widget.RecyclerView.C1331h) r8
            r7.mo4798a(r8)
            r1.f99485h = r5
        L_0x025c:
            android.support.v7.widget.RecyclerView r4 = r1.f99481d
            com.ss.android.ugc.aweme.poi.adapter.viewholder.n$b r5 = new com.ss.android.ugc.aweme.poi.adapter.viewholder.n$b
            r5.<init>(r3, r2)
            android.support.v7.widget.RecyclerView$m r5 = (android.support.p043v7.widget.RecyclerView.C1340m) r5
            r4.mo4801a(r5)
            com.ss.android.ugc.aweme.poi.adapter.l r4 = new com.ss.android.ugc.aweme.poi.adapter.l
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct> r5 = r1.f99487j
            java.lang.Integer r7 = r2.getRecommendType()
            java.lang.String r8 = r2.title()
            r4.<init>(r5, r3, r7, r8)
            r1.f99484g = r4
            android.support.v7.widget.RecyclerView r3 = r1.f99481d
            com.ss.android.ugc.aweme.poi.adapter.l r4 = r1.f99484g
            android.support.v7.widget.RecyclerView$a r4 = (android.support.p043v7.widget.RecyclerView.C1322a) r4
            r3.setAdapter(r4)
            boolean r3 = r2.getHideDivider()
            if (r3 == 0) goto L_0x028e
            android.view.View r3 = r1.f99483f
            r3.setVisibility(r10)
            goto L_0x0293
        L_0x028e:
            android.view.View r3 = r1.f99483f
            r3.setVisibility(r6)
        L_0x0293:
            boolean r2 = r2.getHideTopDivider()
            if (r2 == 0) goto L_0x029f
            android.view.View r1 = r1.f99482e
            r1.setVisibility(r10)
            return
        L_0x029f:
            android.view.View r1 = r1.f99482e
            r1.setVisibility(r6)
            return
        L_0x02a5:
            int r3 = r0.mo48641a(r2)
            r4 = 169(0xa9, float:2.37E-43)
            if (r3 != r4) goto L_0x030b
            r1 = r18
            com.ss.android.ugc.aweme.poi.adapter.viewholder.o r1 = (com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39032o) r1
            java.util.List r3 = r0.f70670n
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.poi.a.l r2 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38968l) r2
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99259F
            java.lang.String r4 = "ad"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            android.view.View r4 = r1.f99496c
            boolean r7 = r2.f99255c
            if (r7 == 0) goto L_0x02c7
            r10 = 0
        L_0x02c7:
            r4.setVisibility(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r1.f99495b
            java.lang.String r7 = r2.f99254b
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r4.setText(r7)
            com.ss.android.ugc.aweme.poi.adapter.viewholder.q r4 = r1.f99498e
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r7 = r2.f99253a
            if (r7 != 0) goto L_0x02dc
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x02dc:
            java.lang.Object r6 = r7.get(r6)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = (com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd) r6
            r4.mo79170a(r6, r3)
            boolean r4 = r1.f99497d
            if (r4 != 0) goto L_0x030a
            if (r3 == 0) goto L_0x02f0
            java.lang.String r4 = r3.getAwemeId()
            goto L_0x02f1
        L_0x02f0:
            r4 = r9
        L_0x02f1:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0308
            android.content.Context r4 = r1.f99494a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.mo79126b()
            if (r3 == 0) goto L_0x0305
            java.lang.String r9 = r3.getPoiId()
        L_0x0305:
            com.p683ss.android.ugc.aweme.poi.utils.C39443d.m87703a(r4, r2, r9)
        L_0x0308:
            r1.f99497d = r5
        L_0x030a:
            return
        L_0x030b:
            int r3 = r0.mo48641a(r2)
            r4 = 170(0xaa, float:2.38E-43)
            if (r3 != r4) goto L_0x03b1
            r1 = r18
            com.ss.android.ugc.aweme.poi.adapter.viewholder.g r1 = (com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39017g) r1
            java.util.List r3 = r0.f70670n
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.poi.a.l r2 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38968l) r2
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99259F
            java.lang.String r4 = "ad"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            com.ss.android.ugc.aweme.poi.a.l r4 = r1.f99440e
            if (r4 != 0) goto L_0x03b0
            r1.f99442g = r3
            r1.f99440e = r2
            android.view.View r4 = r1.f99437b
            boolean r5 = r2.f99255c
            if (r5 == 0) goto L_0x0335
            r10 = 0
        L_0x0335:
            r4.setVisibility(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r1.f99438c
            java.lang.String r5 = r2.f99254b
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            android.support.v7.widget.LinearLayoutManager r4 = new android.support.v7.widget.LinearLayoutManager
            android.content.Context r5 = r1.f99436a
            r4.<init>(r5, r6, r6)
            r1.f99441f = r4
            android.support.v7.widget.RecyclerView r4 = r1.f99439d
            android.support.v7.widget.LinearLayoutManager r5 = r1.f99441f
            android.support.v7.widget.RecyclerView$i r5 = (android.support.p043v7.widget.RecyclerView.C1332i) r5
            r4.setLayoutManager(r5)
            android.content.Context r4 = r1.f99436a
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelOffset(r7)
            android.support.v7.widget.RecyclerView r5 = r1.f99439d
            com.ss.android.ugc.aweme.poi.ui.af r6 = new com.ss.android.ugc.aweme.poi.ui.af
            r6.<init>(r4, r4)
            android.support.v7.widget.RecyclerView$h r6 = (android.support.p043v7.widget.RecyclerView.C1331h) r6
            r5.mo4798a(r6)
            android.support.v7.widget.RecyclerView r4 = r1.f99439d
            com.ss.android.ugc.aweme.poi.adapter.viewholder.p r5 = new com.ss.android.ugc.aweme.poi.adapter.viewholder.p
            android.content.Context r6 = r1.f99436a
            com.ss.android.ugc.aweme.poi.a.l r7 = r1.f99440e
            if (r7 != 0) goto L_0x0376
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0376:
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r7 = r7.f99253a
            if (r7 != 0) goto L_0x037d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x037d:
            r5.<init>(r6, r7, r3)
            android.support.v7.widget.RecyclerView$a r5 = (android.support.p043v7.widget.RecyclerView.C1322a) r5
            r4.setAdapter(r5)
            android.support.v7.widget.RecyclerView r4 = r1.f99439d
            com.ss.android.ugc.aweme.poi.adapter.viewholder.g$a r5 = new com.ss.android.ugc.aweme.poi.adapter.viewholder.g$a
            r5.<init>(r1, r3)
            android.support.v7.widget.RecyclerView$m r5 = (android.support.p043v7.widget.RecyclerView.C1340m) r5
            r4.mo4801a(r5)
            if (r3 == 0) goto L_0x0398
            java.lang.String r4 = r3.getAwemeId()
            goto L_0x0399
        L_0x0398:
            r4 = r9
        L_0x0399:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x03b0
            android.content.Context r1 = r1.f99436a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.mo79126b()
            if (r3 == 0) goto L_0x03ad
            java.lang.String r9 = r3.getPoiId()
        L_0x03ad:
            com.p683ss.android.ugc.aweme.poi.utils.C39443d.m87703a(r1, r2, r9)
        L_0x03b0:
            return
        L_0x03b1:
            int r3 = r0.mo48641a(r2)
            r4 = 171(0xab, float:2.4E-43)
            if (r3 != r4) goto L_0x0659
            r1 = r18
            com.ss.android.ugc.aweme.poi.adapter.viewholder.l r1 = (com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39024l) r1
            java.util.List r3 = r0.f70670n
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.poi.a.g r2 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38962g) r2
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99259F
            java.lang.String r4 = "poiDetailQuestion"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            com.ss.android.ugc.aweme.poi.model.al r4 = r1.f99469n
            if (r4 != 0) goto L_0x0658
            r1.f99470o = r3
            com.ss.android.ugc.aweme.poi.model.al r3 = r2.f99234a
            r1.f99469n = r3
            long r2 = r2.f99235b
            r1.f99471p = r2
            com.bytedance.ies.abmock.b r11 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.poi.experiment.PoiQuestionPosExperiment> r12 = com.p683ss.android.ugc.aweme.poi.experiment.PoiQuestionPosExperiment.class
            r13 = 1
            java.lang.String r14 = "poi_question_answering_position"
            r15 = 31744(0x7c00, float:4.4483E-41)
            r16 = 0
            int r2 = r11.mo18168a(r12, r13, r14, r15, r16)
            if (r2 != 0) goto L_0x03f3
            android.view.View r2 = r1.f99457b
            r2.setVisibility(r10)
            goto L_0x03f8
        L_0x03f3:
            android.view.View r2 = r1.f99457b
            r2.setVisibility(r6)
        L_0x03f8:
            long r2 = r1.f99471p
            r11 = 0
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0638
            com.ss.android.ugc.aweme.poi.model.al r2 = r1.f99469n
            if (r2 == 0) goto L_0x0638
            com.ss.android.ugc.aweme.poi.model.al r2 = r1.f99469n
            if (r2 == 0) goto L_0x064c
            android.support.constraint.ConstraintLayout r3 = r1.f99460e
            r3.setVisibility(r6)
            android.widget.LinearLayout r3 = r1.f99468m
            r3.setVisibility(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f99458c
            r3.setVisibility(r6)
            android.widget.ImageView r3 = r1.f99459d
            r3.setVisibility(r6)
            android.widget.ImageView r3 = r1.f99465j
            r3.setVisibility(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f99461f
            r3.setVisibility(r6)
            long r3 = r1.f99471p
            r11 = 10000(0x2710, double:4.9407E-320)
            r7 = 10000(0x2710, float:1.4013E-41)
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x045d
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f99458c
            android.content.Context r4 = r1.f99456a
            r11 = 2132547613(0x7f1c181d, float:2.0748477E38)
            java.lang.String r4 = r4.getString(r11)
            java.lang.String r11 = "mContext.getString(R.string.poi_question_more)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r11)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            long r12 = r1.f99471p
            java.lang.String r12 = com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39024l.m86862a(r12, r7)
            r11[r6] = r12
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r5)
            java.lang.String r4 = com.C2240a.m6772a(r4, r11)
            java.lang.String r11 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r11)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            goto L_0x0489
        L_0x045d:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f99458c
            android.content.Context r4 = r1.f99456a
            r11 = 2132547610(0x7f1c181a, float:2.074847E38)
            java.lang.String r4 = r4.getString(r11)
            java.lang.String r11 = "mContext.getString(R.string.poi_question)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r11)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            long r12 = r1.f99471p
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r11[r6] = r12
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r5)
            java.lang.String r4 = com.C2240a.m6772a(r4, r11)
            java.lang.String r11 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r11)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
        L_0x0489:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f99461f
            java.lang.String r4 = r2.getContent()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            java.lang.Integer r3 = r2.getFollowCount()
            if (r3 == 0) goto L_0x049e
            int r8 = r3.intValue()
        L_0x049e:
            if (r8 > 0) goto L_0x04a6
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f99463h
            r3.setVisibility(r10)
            goto L_0x0503
        L_0x04a6:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f99463h
            r3.setVisibility(r6)
            if (r8 <= r7) goto L_0x04d9
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f99463h
            android.content.Context r4 = r1.f99456a
            r11 = 2132547612(0x7f1c181c, float:2.0748475E38)
            java.lang.String r4 = r4.getString(r11)
            java.lang.String r11 = "mContext.getString(R.str…poi_question_follow_more)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r11)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            long r12 = (long) r8
            java.lang.String r8 = com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39024l.m86862a(r12, r7)
            r11[r6] = r8
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r11, r5)
            java.lang.String r4 = com.C2240a.m6772a(r4, r8)
            java.lang.String r8 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r8)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            goto L_0x0503
        L_0x04d9:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f99463h
            android.content.Context r4 = r1.f99456a
            r11 = 2132547611(0x7f1c181b, float:2.0748473E38)
            java.lang.String r4 = r4.getString(r11)
            java.lang.String r11 = "mContext.getString(R.string.poi_question_follow)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r11)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r11[r6] = r8
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r11, r5)
            java.lang.String r4 = com.C2240a.m6772a(r4, r8)
            java.lang.String r8 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r8)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
        L_0x0503:
            java.util.List r3 = r2.getAnswers()
            int r4 = r2.getAnswerAmounts()
            r8 = 2132020582(0x7f140d66, float:1.9679531E38)
            if (r4 <= 0) goto L_0x0602
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r4)
            if (r4 != 0) goto L_0x0602
            java.lang.Object r3 = r3.get(r6)
            com.ss.android.ugc.aweme.poi.model.g r3 = (com.p683ss.android.ugc.aweme.poi.model.C39123g) r3
            android.widget.ImageView r4 = r1.f99466k
            r4.setVisibility(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r1.f99462g
            r4.setVisibility(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r1.f99462g
            java.lang.String r10 = r3.getContent()
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r4.setText(r10)
            java.lang.String r4 = r2.getQuestionId()
            java.lang.Integer r10 = r3.getLikeAmounts()
            if (r10 == 0) goto L_0x059d
            r11 = r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            java.lang.Boolean r12 = r3.isUserLike()
            if (r12 == 0) goto L_0x0560
            if (r11 < 0) goto L_0x0560
            if (r11 != 0) goto L_0x055e
            java.lang.Boolean r11 = r3.isUserLike()
            if (r11 == 0) goto L_0x055a
            boolean r11 = r11.booleanValue()
            goto L_0x055b
        L_0x055a:
            r11 = 0
        L_0x055b:
            if (r11 == 0) goto L_0x055e
            goto L_0x0560
        L_0x055e:
            r11 = 0
            goto L_0x0561
        L_0x0560:
            r11 = 1
        L_0x0561:
            if (r11 != 0) goto L_0x0564
            goto L_0x0565
        L_0x0564:
            r10 = r9
        L_0x0565:
            if (r10 == 0) goto L_0x059d
            java.lang.Number r10 = (java.lang.Number) r10
            r10.intValue()
            android.view.View r10 = r1.itemView
            android.view.View r8 = r10.findViewById(r8)
            java.lang.String r10 = "itemView.findViewById(R.id.like_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r10)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            com.ss.android.ugc.aweme.poi.d.a r10 = new com.ss.android.ugc.aweme.poi.d.a
            r11 = r8
            android.view.View r11 = (android.view.View) r11
            com.ss.android.ugc.aweme.poi.g r12 = r1.f99470o
            r10.<init>(r11, r3, r4, r12)
            r1.f99472q = r10
            int r10 = r8.getVisibility()
            if (r10 != 0) goto L_0x058d
            r10 = 1
            goto L_0x058e
        L_0x058d:
            r10 = 0
        L_0x058e:
            if (r10 == 0) goto L_0x0591
            r9 = r8
        L_0x0591:
            if (r9 == 0) goto L_0x059d
            com.ss.android.ugc.aweme.poi.adapter.viewholder.l$c r10 = new com.ss.android.ugc.aweme.poi.adapter.viewholder.l$c
            r10.<init>(r8, r1, r3, r4)
            java.lang.Runnable r10 = (java.lang.Runnable) r10
            r9.post(r10)
        L_0x059d:
            int r2 = r2.getAnswerAmounts()
            int r2 = r2 - r5
            if (r2 <= 0) goto L_0x064c
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f99464i
            r3.setVisibility(r6)
            if (r2 <= r7) goto L_0x05d7
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f99464i
            android.content.Context r4 = r1.f99456a
            r8 = 2132547529(0x7f1c17c9, float:2.0748307E38)
            java.lang.String r4 = r4.getString(r8)
            java.lang.String r8 = "mContext.getString(R.string.poi_answer_more)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r8)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            long r9 = (long) r2
            java.lang.String r2 = com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39024l.m86862a(r9, r7)
            r8[r6] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r8, r5)
            java.lang.String r2 = com.C2240a.m6772a(r4, r2)
            java.lang.String r4 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
            goto L_0x064c
        L_0x05d7:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f99464i
            android.content.Context r4 = r1.f99456a
            r7 = 2132547528(0x7f1c17c8, float:2.0748305E38)
            java.lang.String r4 = r4.getString(r7)
            java.lang.String r7 = "mContext.getString(R.string.poi_answer)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r7)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r7[r6] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r7, r5)
            java.lang.String r2 = com.C2240a.m6772a(r4, r2)
            java.lang.String r4 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
            goto L_0x064c
        L_0x0602:
            android.widget.ImageView r2 = r1.f99466k
            r3 = 4
            r2.setVisibility(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r1.f99462g
            r2.setVisibility(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r1.f99464i
            r2.setVisibility(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r1.f99464i
            android.content.Context r3 = r1.f99456a
            r4 = 2132547602(0x7f1c1812, float:2.0748455E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            android.view.View r2 = r1.itemView
            java.lang.String r3 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.view.View r2 = r2.findViewById(r8)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.String r3 = "itemView.like_container"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setVisibility(r10)
            goto L_0x064c
        L_0x0638:
            android.widget.LinearLayout r2 = r1.f99468m
            r2.setVisibility(r6)
            android.support.constraint.ConstraintLayout r2 = r1.f99460e
            r2.setVisibility(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r1.f99458c
            r2.setVisibility(r10)
            android.widget.ImageView r2 = r1.f99459d
            r2.setVisibility(r10)
        L_0x064c:
            android.view.View r2 = r1.itemView
            com.ss.android.ugc.aweme.poi.adapter.viewholder.l$b r3 = new com.ss.android.ugc.aweme.poi.adapter.viewholder.l$b
            r3.<init>(r1)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
        L_0x0658:
            return
        L_0x0659:
            int r3 = r0.mo48641a(r2)
            r4 = 172(0xac, float:2.41E-43)
            if (r3 != r4) goto L_0x088e
            r1 = r18
            com.ss.android.ugc.aweme.poi.adapter.viewholder.m r1 = (com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39028m) r1
            java.util.List r3 = r0.f70670n
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.poi.a.h r2 = (com.p683ss.android.ugc.aweme.poi.p2058a.C38963h) r2
            com.ss.android.ugc.aweme.poi.g r3 = r0.f99259F
            java.lang.String r3 = "poiRate"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            com.ss.android.ugc.aweme.poi.rate.api.b r2 = r2.f99236a
            if (r2 == 0) goto L_0x088d
            int r3 = r2.f100163c
            r4 = 2132021624(0x7f141178, float:1.9681645E38)
            r7 = 2132021625(0x7f141179, float:1.9681647E38)
            switch(r3) {
                case 1: goto L_0x072c;
                case 2: goto L_0x06af;
                default: goto L_0x0683;
            }
        L_0x0683:
            android.view.View r2 = r1.itemView
            java.lang.String r3 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.view.View r2 = r2.findViewById(r7)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            java.lang.String r3 = "itemView.poiRateHeader"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setVisibility(r10)
            android.view.View r1 = r1.itemView
            java.lang.String r2 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.view.View r1 = r1.findViewById(r4)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            java.lang.String r2 = "itemView.poiRateContent"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setVisibility(r10)
            goto L_0x088c
        L_0x06af:
            android.view.View r3 = r1.itemView
            java.lang.String r8 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            android.view.View r3 = r3.findViewById(r7)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            java.lang.String r7 = "itemView.poiRateHeader"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)
            r3.setVisibility(r6)
            android.view.View r3 = r1.itemView
            java.lang.String r7 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            java.lang.String r4 = "itemView.poiRateContent"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r3.setVisibility(r10)
            int r2 = r2.f100162b
            android.view.View r3 = r1.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r4 = 2132018342(0x7f1404a6, float:1.9674988E38)
            android.view.View r3 = r3.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r3
            java.lang.String r4 = "itemView.count"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.view.View r1 = r1.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.content.Context r1 = r1.getContext()
            java.lang.String r4 = "itemView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2132547625(0x7f1c1829, float:2.0748501E38)
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r4 = "itemView.context.resourc….string.poi_rate_novideo)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r6] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r1 = com.C2240a.m6772a(r1, r2)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3.setText(r1)
            goto L_0x088d
        L_0x072c:
            android.view.View r3 = r1.itemView
            java.lang.String r8 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            android.view.View r3 = r3.findViewById(r7)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            java.lang.String r7 = "itemView.poiRateHeader"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)
            r3.setVisibility(r10)
            android.view.View r3 = r1.itemView
            java.lang.String r7 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            java.lang.String r4 = "itemView.poiRateContent"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r3.setVisibility(r6)
            com.ss.android.ugc.aweme.poi.rate.api.c r2 = r2.f100161a
            if (r2 == 0) goto L_0x088d
            android.view.View r3 = r1.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r4 = 2132017511(0x7f140167, float:1.9673302E38)
            android.view.View r3 = r3.findViewById(r4)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r3 = (com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView) r3
            com.ss.android.ugc.aweme.profile.model.User r4 = r2.f100167d
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getAvatarThumb()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r3, r4)
            android.view.View r3 = r1.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r4 = 2132024370(0x7f141c32, float:1.9687214E38)
            android.view.View r3 = r3.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r3
            java.lang.String r4 = "itemView.userName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.view.View r4 = r1.itemView
            java.lang.String r7 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r7)
            android.content.Context r4 = r4.getContext()
            java.lang.String r7 = "itemView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r7)
            android.content.res.Resources r4 = r4.getResources()
            r7 = 2132544633(0x7f1c0c79, float:2.0742433E38)
            java.lang.String r4 = r4.getString(r7)
            java.lang.String r7 = "itemView.context.resourc…ring(R.string.feed_title)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r7)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            com.ss.android.ugc.aweme.profile.model.User r8 = r2.f100167d
            java.lang.String r8 = r8.getNickname()
            r7[r6] = r8
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r5)
            java.lang.String r4 = com.C2240a.m6772a(r4, r5)
            java.lang.String r5 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            android.view.View r3 = r1.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r4 = 2132022948(0x7f1416a4, float:1.968433E38)
            android.view.View r3 = r3.findViewById(r4)
            com.ss.android.ugc.aweme.poi.widget.RatingBar r3 = (com.p683ss.android.ugc.aweme.poi.widget.RatingBar) r3
            java.lang.String r4 = r2.f100165b
            float r4 = java.lang.Float.parseFloat(r4)
            r3.setStar(r4)
            android.view.View r3 = r1.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r4 = 2132018450(0x7f140512, float:1.9675207E38)
            android.view.View r3 = r3.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r3
            java.lang.String r4 = "itemView.dateText"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            long r4 = r2.f100166c
            r7 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r7
            long r7 = java.lang.System.currentTimeMillis()
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat
            java.lang.String r11 = "yyyy"
            java.util.Locale r12 = java.util.Locale.getDefault()
            r9.<init>(r11, r12)
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
            java.lang.String r11 = r9.format(r11)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = r9.format(r7)
            java.lang.String r8 = "yyyy.MM.dd"
            boolean r7 = android.text.TextUtils.equals(r11, r7)
            if (r7 == 0) goto L_0x0821
            java.lang.String r8 = "MM.dd"
        L_0x0821:
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
            java.util.Locale r9 = java.util.Locale.getDefault()
            r7.<init>(r8, r9)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = r7.format(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            com.ss.android.ugc.aweme.poi.rate.a.a r2 = r2.f100169f
            if (r2 == 0) goto L_0x088d
            java.lang.String r3 = r2.f100140b
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 2132022929(0x7f141691, float:1.9684291E38)
            if (r3 == 0) goto L_0x085e
            android.view.View r1 = r1.itemView
            java.lang.String r2 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.view.View r1 = r1.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r2 = "itemView.spuName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setVisibility(r10)
            goto L_0x088d
        L_0x085e:
            android.view.View r3 = r1.itemView
            java.lang.String r5 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            android.view.View r3 = r3.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r3
            java.lang.String r5 = "itemView.spuName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            r3.setVisibility(r6)
            android.view.View r1 = r1.itemView
            java.lang.String r3 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.view.View r1 = r1.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r3 = "itemView.spuName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.String r2 = r2.f100140b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
        L_0x088c:
            return
        L_0x088d:
            return
        L_0x088e:
            super.mo48222a(r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.adapter.C38973e.mo48222a(android.support.v7.widget.RecyclerView$v, int):void");
    }

    public final void ba_() {
        super.ba_();
        if (this.f99258E != null) {
            this.f99258E.mo79154a();
        }
    }

    public final void bb_() {
        super.bb_();
        if (this.f99258E != null) {
            this.f99258E.mo79157b();
        }
    }

    /* renamed from: n */
    public final boolean mo64650n() {
        if (this.f99264K != null) {
            return true;
        }
        return super.mo64650n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1 >= getItemCount()) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50303a(java.util.List<com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b> r5) {
        /*
            r4 = this;
            java.util.List r5 = r4.mo64644e(r5)
            super.mo50303a(r5)
            int r5 = r4.getItemCount()
            r0 = 0
            if (r5 != 0) goto L_0x000f
            goto L_0x002f
        L_0x000f:
            r5 = 0
            r1 = 0
        L_0x0011:
            int r2 = r4.getItemCount()
            if (r5 >= r2) goto L_0x002e
            int r2 = r4.getItemViewType(r5)
            r3 = 16
            if (r2 != r3) goto L_0x0026
            int r5 = r4.getItemCount()
            if (r1 < r5) goto L_0x002e
            goto L_0x002f
        L_0x0026:
            r3 = -1
            if (r2 == r3) goto L_0x002b
            int r1 = r1 + 1
        L_0x002b:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x002e:
            r0 = r1
        L_0x002f:
            r4.f99266M = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.adapter.C38973e.mo50303a(java.util.List):void");
    }

    /* renamed from: b */
    public final C31782a mo64634b(ViewGroup viewGroup) {
        C39016f fVar = new C39016f((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f99259F, this.f82940k, this.f82934e, this.f82938i, this.f99265L, this.f82942m);
        return fVar;
    }

    /* renamed from: c */
    public final C31782a mo64637c(ViewGroup viewGroup) {
        C39037s sVar = new C39037s((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b_n, viewGroup, false), this.f99259F, this.f82940k, this.f82934e, this.f82938i, this.f99265L, this.f82942m);
        sVar.f83111aP = this;
        return sVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo64647f(int r6) {
        /*
            r5 = this;
            int r0 = r5.getItemCount()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 17
            r4 = 16
            if (r6 >= r0) goto L_0x0027
            int r0 = r5.getItemViewType(r6)
            if (r0 == r4) goto L_0x0019
            int r0 = r5.getItemViewType(r6)
            if (r0 != r3) goto L_0x003b
        L_0x0019:
            int r6 = r6 + r1
            int r0 = r5.getItemViewType(r6)
            if (r0 == r4) goto L_0x003b
            int r6 = r5.getItemViewType(r6)
            if (r6 == r3) goto L_0x003b
            return r2
        L_0x0027:
            int r0 = r5.getItemCount()
            int r0 = r0 - r1
            if (r6 != r0) goto L_0x003b
            int r0 = r5.getItemViewType(r6)
            if (r0 == r4) goto L_0x003a
            int r6 = r5.getItemViewType(r6)
            if (r6 != r3) goto L_0x003b
        L_0x003a:
            return r2
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.adapter.C38973e.mo64647f(int):boolean");
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        int a = super.mo48641a(i);
        if (a != -1) {
            return a;
        }
        C37859b bVar = (C37859b) this.f70670n.get(i);
        if (bVar.getFeedType() == 65441) {
            return 112;
        }
        if (bVar.getFeedType() != 65443 || !(bVar instanceof C38959d)) {
            if (bVar.getFeedType() != 65444 || !(bVar instanceof C38958c)) {
                if (bVar.getFeedType() == 65446 && (bVar instanceof C38964i)) {
                    return 163;
                }
                if (bVar.getFeedType() == 65448) {
                    return 165;
                }
                if (bVar.getFeedType() == 65449) {
                    return 166;
                }
                if (bVar.getFeedType() == 65451) {
                    return 168;
                }
                if (bVar.getFeedType() == 65452) {
                    if (((C38968l) mo64635b(i)).mo79125a().intValue() == 1) {
                        return 169;
                    }
                    return 170;
                } else if (bVar.getFeedType() == 65453) {
                    return 171;
                } else {
                    if (bVar.getFeedType() == 65454) {
                        return 172;
                    }
                    return -1;
                }
            } else if (((C38958c) bVar).isAweme) {
                return 145;
            } else {
                return 161;
            }
        } else if (((C38959d) bVar).isAweme) {
            return 144;
        } else {
            return 160;
        }
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        String str;
        String str2;
        String str3;
        Collection collection;
        Integer num;
        Integer num2;
        String str4;
        Integer num3;
        Integer num4;
        String str5;
        super.onViewAttachedToWindow(vVar);
        String str6 = null;
        if (vVar instanceof C39029n) {
            C39029n nVar = (C39029n) vVar;
            if (!(nVar.f99488k == null || nVar.f99487j == null)) {
                WrapLinearLayoutManager wrapLinearLayoutManager = nVar.f99486i;
                if (wrapLinearLayoutManager != null) {
                    num3 = Integer.valueOf(wrapLinearLayoutManager.mo4749j());
                } else {
                    num3 = null;
                }
                if (num3 != null) {
                    int intValue = num3.intValue();
                    WrapLinearLayoutManager wrapLinearLayoutManager2 = nVar.f99486i;
                    if (wrapLinearLayoutManager2 != null) {
                        num4 = Integer.valueOf(wrapLinearLayoutManager2.mo4751l());
                    } else {
                        num4 = null;
                    }
                    if (num4 != null) {
                        int intValue2 = num4.intValue();
                        int i = intValue2 - 1;
                        if (intValue >= 0 && i >= intValue) {
                            List<? extends SimplePoiInfoStruct> list = nVar.f99487j;
                            if (list == null) {
                                C52711k.m112234a();
                            }
                            if (intValue2 < list.size() && intValue <= intValue2) {
                                while (true) {
                                    C39067g gVar = nVar.f99489l;
                                    if (gVar != null) {
                                        str5 = gVar.getPoiId();
                                    } else {
                                        str5 = null;
                                    }
                                    Integer num5 = nVar.f99488k;
                                    if (num5 == null) {
                                        C52711k.m112234a();
                                    }
                                    C39452l.m87730a(nVar.f99489l, "poi_explore_card", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "show").mo47829a("poi_channel", C23198ae.m56852b()).mo47829a("poi_id", str5).mo47829a("city_info", C23198ae.m56845a()).mo47829a("content_type", C39452l.m87726a(num5.intValue())));
                                    if (intValue == intValue2) {
                                        break;
                                    }
                                    intValue++;
                                }
                            }
                        }
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Int");
            }
        } else if (vVar instanceof C39017g) {
            C39017g gVar2 = (C39017g) vVar;
            C38968l lVar = gVar2.f99440e;
            if (!(lVar == null || lVar.f99253a == null)) {
                LinearLayoutManager linearLayoutManager = gVar2.f99441f;
                if (linearLayoutManager != null) {
                    num = Integer.valueOf(linearLayoutManager.mo4749j());
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue3 = num.intValue();
                    LinearLayoutManager linearLayoutManager2 = gVar2.f99441f;
                    if (linearLayoutManager2 != null) {
                        num2 = Integer.valueOf(linearLayoutManager2.mo4751l());
                    } else {
                        num2 = null;
                    }
                    if (num2 != null) {
                        int intValue4 = num2.intValue();
                        int i2 = intValue4 - 1;
                        if (intValue3 >= 0 && i2 >= intValue3) {
                            C38968l lVar2 = gVar2.f99440e;
                            if (lVar2 == null) {
                                C52711k.m112234a();
                            }
                            List<? extends AwemeRawAd> list2 = lVar2.f99253a;
                            if (list2 == null) {
                                C52711k.m112234a();
                            }
                            if (intValue4 < list2.size() && intValue3 <= intValue4) {
                                while (true) {
                                    C39067g gVar3 = gVar2.f99442g;
                                    if (gVar3 != null) {
                                        str4 = gVar3.getPoiId();
                                    } else {
                                        str4 = null;
                                    }
                                    C38968l lVar3 = gVar2.f99440e;
                                    if (lVar3 == null) {
                                        C52711k.m112234a();
                                    }
                                    List<? extends AwemeRawAd> list3 = lVar3.f99253a;
                                    if (list3 == null) {
                                        C52711k.m112234a();
                                    }
                                    String creativeIdStr = ((AwemeRawAd) list3.get(intValue3)).getCreativeIdStr();
                                    C52711k.m112236a((Object) creativeIdStr, "mAd!!.products!![i].creativeIdStr");
                                    if (str4 != null) {
                                        C39452l.m87730a(gVar2.f99442g, "show_poi_product", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "show").mo47829a("poi_id", str4).mo47829a("poi_posititon", "poi_page").mo47829a("product_id", creativeIdStr));
                                    }
                                    if (intValue3 == intValue4) {
                                        break;
                                    }
                                    intValue3++;
                                }
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                }
            }
        } else if (vVar instanceof C39024l) {
            C39024l lVar4 = (C39024l) vVar;
            C39067g gVar4 = lVar4.f99470o;
            String str7 = "poi_question_section_show";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page");
            String str8 = "content_type";
            if (lVar4.f99471p <= 0) {
                str = "no_question";
            } else {
                C39106al alVar = lVar4.f99469n;
                if (alVar != null) {
                    collection = alVar.getAnswers();
                } else {
                    collection = null;
                }
                if (C9376b.m18558a(collection)) {
                    str = "q_without_a";
                } else {
                    str = "q_with_a";
                }
            }
            C23089d a2 = a.mo47829a(str8, str);
            String str9 = "poi_id";
            C39067g gVar5 = lVar4.f99470o;
            if (gVar5 != null) {
                str2 = gVar5.getPoiId();
            } else {
                str2 = null;
            }
            C39452l.m87730a(gVar4, str7, a2.mo47829a(str9, str2));
            C39106al alVar2 = lVar4.f99469n;
            if (alVar2 != null) {
                if (lVar4.f99471p > 0) {
                    C52711k.m112240b(alVar2, "question");
                    C39067g gVar6 = lVar4.f99470o;
                    String str10 = "poi_question_show";
                    C23089d a3 = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("author_id", alVar2.getUserId()).mo47829a("question_id", alVar2.getQuestionId());
                    String str11 = "poi_id";
                    C39067g gVar7 = lVar4.f99470o;
                    if (gVar7 != null) {
                        str3 = gVar7.getPoiId();
                    } else {
                        str3 = null;
                    }
                    C39452l.m87730a(gVar6, str10, a3.mo47829a(str11, str3));
                }
                if (alVar2.getAnswerAmounts() > 0 && !C9376b.m18558a((Collection<T>) alVar2.getAnswers())) {
                    String answerId = ((C39123g) alVar2.getAnswers().get(0)).getAnswerId();
                    C52711k.m112240b(alVar2, "question");
                    C52711k.m112240b(answerId, "answerId");
                    C39067g gVar8 = lVar4.f99470o;
                    String str12 = "poi_answer_show";
                    C23089d a4 = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("author_id", alVar2.getUserId()).mo47829a("answer_id", answerId).mo47829a("question_id", alVar2.getQuestionId());
                    String str13 = "poi_id";
                    C39067g gVar9 = lVar4.f99470o;
                    if (gVar9 != null) {
                        str6 = gVar9.getPoiId();
                    }
                    C39452l.m87730a(gVar8, str12, a4.mo47829a(str13, str6));
                }
            }
        }
    }

    public C38973e(RecyclerView recyclerView, C31846h hVar) {
        super(recyclerView, hVar);
    }

    /* renamed from: a */
    public final void mo64624a(Aweme aweme, String str) {
        if (aweme != null && TextUtils.equals(str, this.f82944z) && ((LinearLayoutManager) this.f82941l.getLayoutManager()) != null) {
            Iterator it = this.f70670n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C37859b bVar = (C37859b) it.next();
                Aweme aweme2 = bVar.getAweme();
                if (bVar.getFeedType() == 65280 && aweme2 != null && TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                    if (this.f99260G != null && (this.f99260G instanceof C39319a)) {
                        ((C39319a) this.f99260G).mo80142f_(this.f70670n.indexOf(bVar));
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (i == 112) {
            if (this.f99258E == null) {
                this.f99258E = new PoiOptimizedDetailViewHolder(this.f99260G, this.f99263J, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bn3, viewGroup, false));
            }
            return this.f99258E;
        } else if (i == 144 || i == 160) {
            return new PoiCateTitleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bn8, viewGroup, false));
        } else {
            if (i == 145 || i == 161) {
                return new PoiCateMoreViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bn7, viewGroup, false));
            }
            if (i == 163) {
                return new PoiRecommendViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bn4, viewGroup, false));
            }
            if (i == 165) {
                return new PoiDcdProductInfoViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bn_, viewGroup, false));
            }
            if (i == 166) {
                return new PoiCommonBannerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bn9, viewGroup, false));
            }
            if (i == 168) {
                return new C39029n(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bn5, viewGroup, false));
            }
            if (i == 169) {
                return new C39032o(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bn6, viewGroup, false));
            }
            if (i == 170) {
                return new C39017g(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bn2, viewGroup, false));
            }
            if (i == 171) {
                return new C39024l(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bnq, viewGroup, false));
            }
            if (i == 172) {
                return new C39028m(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bn0, viewGroup, false));
            }
            return super.mo48221a(viewGroup, i);
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i, List list) {
        if (list == null || list.size() == 0) {
            onBindViewHolder(vVar, i);
            return;
        }
        if (mo48641a(i) == 112) {
            ((PoiOptimizedDetailViewHolder) vVar).mo79158c();
        }
    }
}

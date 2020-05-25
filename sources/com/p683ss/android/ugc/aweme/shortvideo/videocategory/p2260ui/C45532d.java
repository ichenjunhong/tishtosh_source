package com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui;

import android.content.Context;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2256a.C45490b;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.d */
public final class C45532d extends C26840g<C45490b> {

    /* renamed from: a */
    private final C45529b f115049a;

    /* renamed from: b */
    private final C52682m<Integer, VideoCategoryParam, C52860x> f115050b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.d$a */
    public static final class C45533a extends C1302b {

        /* renamed from: c */
        final /* synthetic */ C45532d f115051c;

        /* renamed from: d */
        final /* synthetic */ GridLayoutManager f115052d;

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
            if (r6 != false) goto L_0x0027;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo4690a(int r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.d r0 = r5.f115051c
                java.util.List r1 = r0.f70670n
                java.lang.Object r1 = r1.get(r6)
                com.ss.android.ugc.aweme.shortvideo.videocategory.a.b r1 = (com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2256a.C45490b) r1
                int r1 = r1.f114944a
                r2 = 0
                r3 = 1
                r4 = 3
                if (r1 != r4) goto L_0x0013
                r1 = 1
                goto L_0x0014
            L_0x0013:
                r1 = 0
            L_0x0014:
                if (r1 != 0) goto L_0x0027
                java.util.List r0 = r0.f70670n
                java.lang.Object r6 = r0.get(r6)
                com.ss.android.ugc.aweme.shortvideo.videocategory.a.b r6 = (com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2256a.C45490b) r6
                int r6 = r6.f114944a
                if (r6 != r3) goto L_0x0024
                r6 = 1
                goto L_0x0025
            L_0x0024:
                r6 = 0
            L_0x0025:
                if (r6 == 0) goto L_0x0028
            L_0x0027:
                r2 = 1
            L_0x0028:
                if (r2 == 0) goto L_0x002f
                android.support.v7.widget.GridLayoutManager r6 = r5.f115052d
                int r6 = r6.f4521b
                return r6
            L_0x002f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui.C45532d.C45533a.mo4690a(int):int");
        }

        C45533a(C45532d dVar, GridLayoutManager gridLayoutManager) {
            this.f115051c = dVar;
            this.f115052d = gridLayoutManager;
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        return ((C45490b) this.f70670n.get(i)).f114944a;
    }

    /* renamed from: a */
    public final void mo50303a(List<C45490b> list) {
        boolean z;
        C45529b bVar = this.f115049a;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            bVar.f115046a = list;
        }
        super.mo50303a(list);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4526g = new C45533a(this, gridLayoutManager);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
    }

    public C45532d(C45529b bVar, C52682m<? super Integer, ? super VideoCategoryParam, C52860x> mVar) {
        C52711k.m112240b(bVar, "itemDecoration");
        C52711k.m112240b(mVar, "onSelected");
        this.f115049a = bVar;
        this.f115050b = mVar;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        Context context = null;
        switch (i) {
            case 0:
            case 2:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                View inflate = LayoutInflater.from(context).inflate(R.layout.bj5, viewGroup, false);
                C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…_category, parent, false)");
                return new C45535f(inflate);
            case 1:
            case 3:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.bj6, viewGroup, false);
                C52711k.m112236a((Object) inflate2, "LayoutInflater.from(pare…ory_title, parent, false)");
                return new C45534e(inflate2);
            default:
                StringBuilder sb = new StringBuilder("Unsupported viewType, viewType = ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r6 == null) goto L_0x0040;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48222a(android.support.p043v7.widget.RecyclerView.C1352v r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.getItemViewType(r6)
            switch(r0) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0009;
                case 2: goto L_0x0052;
                case 3: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0098
        L_0x0009:
            if (r5 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.shortvideo.videocategory.ui.e r5 = (com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui.C45534e) r5
            java.util.List r0 = r4.f70670n
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r0 = "mItems[position]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            com.ss.android.ugc.aweme.shortvideo.videocategory.a.b r6 = (com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2256a.C45490b) r6
            java.lang.String r0 = "model"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.Object r0 = r6.f114947d
            boolean r1 = r0 instanceof p2628d.C52847n
            if (r1 == 0) goto L_0x0037
            java.lang.Object r6 = r6.f114947d
            d.n r6 = (p2628d.C52847n) r6
            java.lang.Object r6 = r6.getFirst()
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto L_0x0032
            r6 = 0
        L_0x0032:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x0042
            goto L_0x0040
        L_0x0037:
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x0040
            java.lang.Object r6 = r6.f114947d
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0042
        L_0x0040:
            java.lang.String r6 = ""
        L_0x0042:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r5.f115053a
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
            return
        L_0x004a:
            d.u r5 = new d.u
            java.lang.String r6 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.videocategory.ui.VideoCategoryTitleViewHolder"
            r5.<init>(r6)
            throw r5
        L_0x0052:
            if (r5 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.shortvideo.videocategory.ui.f r5 = (com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui.C45535f) r5
            java.util.List r0 = r4.f70670n
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r0 = "mItems[position]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            com.ss.android.ugc.aweme.shortvideo.videocategory.a.b r6 = (com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2256a.C45490b) r6
            d.f.a.m<java.lang.Integer, com.ss.android.ugc.aweme.draft.model.VideoCategoryParam, d.x> r0 = r4.f115050b
            java.lang.String r1 = "model"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r1)
            java.lang.String r1 = "onSelected"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            com.ss.android.ugc.aweme.draft.model.VideoCategoryParam r1 = r6.f114946c
            if (r1 != 0) goto L_0x0074
            return
        L_0x0074:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r5.f115054a
            com.ss.android.ugc.aweme.draft.model.VideoCategoryParam r2 = r6.f114946c
            java.lang.String r2 = r2.getCategoryName()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r5.f115054a
            com.ss.android.ugc.aweme.shortvideo.videocategory.ui.f$a r2 = new com.ss.android.ugc.aweme.shortvideo.videocategory.ui.f$a
            r3 = 600(0x258, float:8.41E-43)
            r2.<init>(r5, r0, r6, r3)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            goto L_0x0098
        L_0x0090:
            d.u r5 = new d.u
            java.lang.String r6 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.videocategory.ui.VideoCategoryViewHolder"
            r5.<init>(r6)
            throw r5
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui.C45532d.mo48222a(android.support.v7.widget.RecyclerView$v, int):void");
    }
}

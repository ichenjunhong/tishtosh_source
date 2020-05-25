package com.p683ss.android.ugc.aweme.notification.newstyle.p2021a;

import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38276d;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.g */
public final class C38264g extends C26840g<BaseNotice> {

    /* renamed from: b */
    public static final C38265a f97405b = new C38265a(null);

    /* renamed from: a */
    public int f97406a;

    /* renamed from: c */
    private final HashMap<String, BaseNotice> f97407c = new HashMap<>(this.f97406a);

    /* renamed from: d */
    private final int f97408d = ((int) C9432q.m18687b(C11010c.m22280a(), 8.0f));

    /* renamed from: e */
    private final C38276d f97409e;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.g$a */
    public static final class C38265a {
        private C38265a() {
        }

        public /* synthetic */ C38265a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo50304b(List<BaseNotice> list) {
        if (list != null) {
            list = this.f97409e.mo78248a(list);
        }
        super.mo50304b(list);
    }

    /* renamed from: a */
    public final void mo50303a(List<BaseNotice> list) {
        if (list != null) {
            list = this.f97409e.mo78248a(list);
        }
        super.mo50303a(list);
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        int c = C0726c.m2098c(viewGroup.getContext(), R.color.a1a);
        this.f70682s = c;
        C1352v a_ = super.mo49730a_(viewGroup);
        DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
        dmtTextView.setGravity(17);
        dmtTextView.setTextColor(c);
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setText(R.string.bk9);
        DmtTextView dmtTextView2 = new DmtTextView(viewGroup.getContext());
        dmtTextView2.setGravity(17);
        dmtTextView2.setTextColor(c);
        dmtTextView2.setTextSize(13.0f);
        dmtTextView2.setText(R.string.blg);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            dmtStatusView.setBuilder(dmtStatusView.mo19207c().mo19231b((View) dmtTextView2));
            C52711k.m112236a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C38276d dVar = this.f97409e;
        if (viewGroup == null) {
            C52711k.m112234a();
        }
        return dVar.mo78246a(viewGroup, i);
    }

    public C38264g(C38276d dVar, int i) {
        C52711k.m112240b(dVar, "mDetailProxy");
        this.f97409e = dVar;
        this.f97406a = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48222a(android.support.p043v7.widget.RecyclerView.C1352v r8, int r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.f70670n
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r3 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice) r3
            int r0 = r7.f97406a
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            if (r9 <= r0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 != 0) goto L_0x0028
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice> r4 = r7.f97407c
            java.lang.String r5 = "notice"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            java.lang.String r5 = r3.getNid()
            java.lang.Object r4 = r4.get(r5)
            if (r4 == 0) goto L_0x0028
            r6 = 1
            goto L_0x0029
        L_0x0028:
            r6 = r0
        L_0x0029:
            if (r8 == 0) goto L_0x0050
            android.view.View r0 = r8.itemView
            java.lang.String r1 = "holder.itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x0048
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            if (r9 != 0) goto L_0x0040
            int r2 = r7.f97408d
        L_0x0040:
            int r4 = r0.rightMargin
            int r5 = r0.bottomMargin
            r0.setMargins(r1, r2, r4, r5)
            goto L_0x0050
        L_0x0048:
            d.u r8 = new d.u
            java.lang.String r9 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r8.<init>(r9)
            throw r8
        L_0x0050:
            com.ss.android.ugc.aweme.notification.newstyle.b.d r1 = r7.f97409e
            if (r8 != 0) goto L_0x0057
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0057:
            java.lang.String r0 = "notice"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice> r5 = r7.f97407c
            r2 = r8
            r4 = r9
            r1.mo78249a(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38264g.mo48222a(android.support.v7.widget.RecyclerView$v, int):void");
    }
}

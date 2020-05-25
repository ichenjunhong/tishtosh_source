package com.p683ss.android.ugc.aweme.feed.panel;

import android.os.Bundle;
import android.support.p043v7.widget.C1506w;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24633ag;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1593e.C26866a;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27718c;
import com.p683ss.android.ugc.aweme.feed.adapter.C30078e;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.utils.C47843ee;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.AbsCellFeedFragmentPanel */
public abstract class AbsCellFeedFragmentPanel extends C30647p {

    /* renamed from: g */
    private static int f79878g;

    /* renamed from: a */
    protected C24579d f79879a;

    /* renamed from: b */
    protected C30462o f79880b;

    /* renamed from: c */
    protected C26866a f79881c;

    /* renamed from: d */
    protected C30078e f79882d;

    /* renamed from: e */
    public C27718c f79883e;

    /* renamed from: f */
    public boolean f79884f;
    public RecyclerView mListView;
    protected DmtStatusView mStatusView;

    /* renamed from: b */
    public abstract C1332i mo62766b();

    /* renamed from: c */
    public abstract C1331h mo62768c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C30078e mo62769d();

    /* renamed from: h */
    public final boolean mo58030h() {
        return true;
    }

    /* renamed from: a */
    public final void mo62764a(C1340m mVar) {
        if (this.mListView != null) {
            this.mListView.mo4801a(mVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo62767b(int i) {
        this.mListView.post(new C30592a(this, 0));
    }

    /* renamed from: a */
    public final void mo62765a(C26846a aVar) {
        if (this.f79882d != null) {
            this.f79882d.mo54788a(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        if (r3.top > (r3.bottom - 0)) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
        if (r7 <= r0) goto L_0x00d2;
     */
    @org.greenrobot.eventbus.C53771m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onVideoEvent(com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw r7) {
        /*
            r6 = this;
            boolean r0 = r6.mo62868bh()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r7.f79228a
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L_0x00f4
            r1 = 13
            if (r0 == r1) goto L_0x00d3
            switch(r0) {
                case 21: goto L_0x0034;
                case 22: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0145
        L_0x0016:
            com.ss.android.ugc.aweme.feed.adapter.e r7 = r6.f79882d
            r7.notifyDataSetChanged()
            com.ss.android.ugc.aweme.feed.adapter.e r7 = r6.f79882d
            int r7 = r7.getItemCount()
            if (r7 != 0) goto L_0x0145
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r7 = r6.mStatusView
            r7.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r7 = r6.mStatusView
            r7.mo19213g()
            com.ss.android.ugc.aweme.feed.adapter.e r7 = r6.f79882d
            r7.an_()
            goto L_0x0145
        L_0x0034:
            java.lang.Object r7 = r7.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r7
            if (r7 != 0) goto L_0x003b
            return
        L_0x003b:
            com.ss.android.ugc.aweme.feed.adapter.e r0 = r6.f79882d
            java.lang.String r7 = r7.getAid()
            int r7 = r0.mo54772a(r7)
            int r0 = f79878g
            if (r0 != 0) goto L_0x005a
            android.content.Context r0 = r6.mo96010bw()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131886531(0x7f1201c3, float:1.9407643E38)
            int r0 = r0.getDimensionPixelOffset(r1)
            f79878g = r0
        L_0x005a:
            r0 = -1
            if (r7 == r0) goto L_0x00d2
            android.support.v7.widget.RecyclerView r0 = r6.mListView
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.views.C48201l
            if (r0 == 0) goto L_0x00d2
            android.support.v7.widget.RecyclerView r0 = r6.mListView
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            boolean r0 = r0 instanceof android.support.p043v7.widget.StaggeredGridLayoutManager
            r1 = 1
            if (r0 == 0) goto L_0x00a7
            android.support.v7.widget.RecyclerView r0 = r6.mListView
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            android.support.v7.widget.StaggeredGridLayoutManager r0 = (android.support.p043v7.widget.StaggeredGridLayoutManager) r0
            r3 = 0
            int[] r4 = r0.mo5240a(r3)
            int[] r3 = r0.mo5242c(r3)
            r5 = r4[r2]
            if (r7 >= r5) goto L_0x008b
            r4 = r4[r1]
            if (r7 < r4) goto L_0x00c5
        L_0x008b:
            r4 = r3[r2]
            if (r7 <= r4) goto L_0x0093
            r3 = r3[r1]
            if (r7 > r3) goto L_0x00c5
        L_0x0093:
            android.view.View r0 = r0.mo4736c(r7)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r0.getGlobalVisibleRect(r3)
            int r0 = r3.top
            int r3 = r3.bottom
            int r3 = r3 - r2
            if (r0 <= r3) goto L_0x00d2
            goto L_0x00c5
        L_0x00a7:
            android.support.v7.widget.RecyclerView r0 = r6.mListView
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            boolean r0 = r0 instanceof android.support.p043v7.widget.GridLayoutManager
            if (r0 == 0) goto L_0x00c5
            android.support.v7.widget.RecyclerView r0 = r6.mListView
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            android.support.v7.widget.GridLayoutManager r0 = (android.support.p043v7.widget.GridLayoutManager) r0
            int r3 = r0.mo4749j()
            int r0 = r0.mo4751l()
            if (r7 < r3) goto L_0x00c5
            if (r7 <= r0) goto L_0x00d2
        L_0x00c5:
            android.support.v7.widget.RecyclerView r0 = r6.mListView
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            com.ss.android.ugc.aweme.views.l r0 = (com.p683ss.android.ugc.aweme.views.C48201l) r0
            r0.mo95630a(r7, r2)
            r6.f79884f = r1
        L_0x00d2:
            return
        L_0x00d3:
            android.support.v7.widget.RecyclerView r7 = r6.mListView
            int r7 = r7.getChildCount()
        L_0x00d9:
            if (r2 >= r7) goto L_0x00f3
            android.support.v7.widget.RecyclerView r0 = r6.mListView
            android.view.View r0 = r0.getChildAt(r2)
            android.support.v7.widget.RecyclerView r1 = r6.mListView
            android.support.v7.widget.RecyclerView$v r0 = r1.mo4812b(r0)
            int r1 = r0.mItemViewType
            if (r1 != 0) goto L_0x00f0
            com.ss.android.ugc.aweme.feed.adapter.a r0 = (com.p683ss.android.ugc.aweme.feed.adapter.C30009a) r0
            r0.mo58503n()
        L_0x00f0:
            int r2 = r2 + 1
            goto L_0x00d9
        L_0x00f3:
            return
        L_0x00f4:
            java.lang.Object r7 = r7.f79229b
            java.lang.String r7 = (java.lang.String) r7
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0146
            com.ss.android.ugc.aweme.feed.adapter.e r0 = r6.f79882d
            int r7 = r0.mo54772a(r7)
            if (r7 < 0) goto L_0x0145
            com.ss.android.ugc.aweme.feed.adapter.e r0 = r6.f79882d
            java.util.List r0 = r0.f70670n
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            if (r0 == 0) goto L_0x0111
            goto L_0x0145
        L_0x0111:
            com.ss.android.ugc.aweme.feed.adapter.e r0 = r6.f79882d
            android.view.View r0 = r0.f63324c
            if (r0 == 0) goto L_0x0121
            com.ss.android.ugc.aweme.feed.adapter.e r0 = r6.f79882d
            java.util.List r0 = r0.f70670n
            int r1 = r7 + -1
            r0.remove(r1)
            goto L_0x0128
        L_0x0121:
            com.ss.android.ugc.aweme.feed.adapter.e r0 = r6.f79882d
            java.util.List r0 = r0.f70670n
            r0.remove(r7)
        L_0x0128:
            com.ss.android.ugc.aweme.feed.adapter.e r0 = r6.f79882d
            r0.notifyItemRemoved(r7)
            com.ss.android.ugc.aweme.feed.adapter.e r7 = r6.f79882d
            int r7 = r7.getItemCount()
            if (r7 != 0) goto L_0x0146
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r7 = r6.mStatusView
            r7.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r7 = r6.mStatusView
            r7.mo19213g()
            com.ss.android.ugc.aweme.feed.adapter.e r7 = r6.f79882d
            r7.an_()
            goto L_0x0146
        L_0x0145:
            return
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.panel.AbsCellFeedFragmentPanel.onVideoEvent(com.ss.android.ugc.aweme.feed.h.aw):void");
    }

    public AbsCellFeedFragmentPanel(C24579d dVar, C30462o oVar) {
        this.f79879a = dVar;
        this.f79880b = oVar;
    }

    /* renamed from: a */
    public void mo55784a(View view, Bundle bundle) {
        C24633ag agVar;
        super.mo55784a(view, bundle);
        this.mListView.setLayoutManager(mo62766b());
        this.mListView.mo4798a(mo62768c());
        this.mListView.setItemAnimator(new C1506w());
        this.f79882d = mo62769d();
        this.f79883e = new C27718c(this.f79882d);
        this.mListView.setAdapter(this.f79883e);
        if (!C23337c.m57398a()) {
            agVar = new C24633ag();
            this.mListView.mo4801a((C1340m) agVar);
        } else {
            agVar = null;
        }
        this.mListView = C47843ee.m103486a(this.mListView, this.f79880b);
        this.f79881c = new C26866a(this.mListView, agVar);
        this.mListView.mo4801a((C1340m) new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 0 && AbsCellFeedFragmentPanel.this.f79882d.getItemCount() > 1 && AbsCellFeedFragmentPanel.this.f79884f) {
                    AbsCellFeedFragmentPanel.this.f79882d.notifyItemChanged(1);
                    AbsCellFeedFragmentPanel.this.f79884f = false;
                }
            }
        });
    }
}

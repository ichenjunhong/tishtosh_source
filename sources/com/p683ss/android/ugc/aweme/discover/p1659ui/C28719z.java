package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.support.p019b.C0286l;
import android.support.p019b.C0296m;
import android.support.p019b.C0296m.C0302c;
import android.support.p019b.C0303n;
import android.support.p019b.C0304o;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27718c;
import com.p683ss.android.ugc.aweme.discover.widget.GuideSearchHeadView;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.z */
public final class C28719z extends C1340m {

    /* renamed from: a */
    public boolean f75357a;

    /* renamed from: b */
    private boolean f75358b;

    /* renamed from: c */
    private final GuideSearchHeadView f75359c;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.z$a */
    public static final class C28720a extends C0303n {

        /* renamed from: a */
        final /* synthetic */ C28719z f75360a;

        C28720a(C28719z zVar) {
            this.f75360a = zVar;
        }

        /* renamed from: a */
        public final void mo530a(C0296m mVar) {
            C52711k.m112240b(mVar, "p0");
            this.f75360a.f75357a = false;
        }

        /* renamed from: d */
        public final void mo533d(C0296m mVar) {
            C52711k.m112240b(mVar, "transition");
            this.f75360a.f75357a = true;
        }
    }

    /* renamed from: a */
    private final void m67993a() {
        this.f75359c.setVisibility(8);
    }

    public C28719z(GuideSearchHeadView guideSearchHeadView) {
        C52711k.m112240b(guideSearchHeadView, "guideSearchBar");
        this.f75359c = guideSearchHeadView;
    }

    /* renamed from: a */
    public final void mo58366a(List<GuideSearchWord> list, String str, String str2) {
        C52711k.m112240b(str, "originalKeyword");
        C52711k.m112240b(str2, "labelName");
        this.f75358b = !C9376b.m18558a((Collection<T>) list);
        if (!this.f75358b) {
            m67993a();
            return;
        }
        GuideSearchHeadView guideSearchHeadView = this.f75359c;
        if (list == null) {
            C52711k.m112234a();
        }
        guideSearchHeadView.mo58525a(list, str, str2);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (this.f75358b && i2 != 0) {
            C1322a adapter = recyclerView.getAdapter();
            if (!(adapter instanceof C27718c)) {
                adapter = null;
            }
            C27718c cVar = (C27718c) adapter;
            if (cVar != null) {
                List b = cVar.mo56147b();
                int size = b.size();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    } else if (!(b.get(i4) instanceof GuideSearchHeadView)) {
                        i4++;
                    } else if (b.get(i4) == null) {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView");
                    }
                }
                C1332i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).mo4749j();
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    staggeredGridLayoutManager.mo5240a(new int[staggeredGridLayoutManager.f4896a]);
                }
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!this.f75357a) {
                    C0286l lVar = new C0286l();
                    lVar.mo589a((C0302c) new C28720a(this));
                    lVar.mo584a(48);
                    lVar.mo587a(300);
                    ViewParent parent = this.f75359c.getParent();
                    if (parent != null) {
                        C0304o.m646a((ViewGroup) parent, lVar);
                        GuideSearchHeadView guideSearchHeadView = this.f75359c;
                        if (z) {
                            i3 = 8;
                        }
                        guideSearchHeadView.setVisibility(i3);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
            }
        }
    }
}

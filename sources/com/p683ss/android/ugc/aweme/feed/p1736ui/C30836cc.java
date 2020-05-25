package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.graphics.Rect;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.widget.C23745a;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoShowTypeExperiment;
import com.p683ss.android.ugc.aweme.poi.nearby.p2063a.C39146b;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cc */
public final class C30836cc extends C23745a {

    /* renamed from: a */
    public int f80783a;

    public C30836cc(int i) {
        super(2, i, false);
        this.f80783a = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        int f = RecyclerView.m4275f(view);
        C1322a adapter = recyclerView.getAdapter();
        if (!(view instanceof C39146b)) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                if (((GridLayoutManager.LayoutParams) layoutParams).f4528a % 2 == 0) {
                    rect.left = C23728o.m58241a((double) this.f80783a);
                    double d = (double) this.f80783a;
                    Double.isNaN(d);
                    rect.right = C23728o.m58241a(d / 2.0d);
                } else {
                    double d2 = (double) this.f80783a;
                    Double.isNaN(d2);
                    rect.left = C23728o.m58241a(d2 / 2.0d);
                    rect.right = C23728o.m58241a((double) this.f80783a);
                }
                if (C10181b.m20511a().mo18168a(VideoShowTypeExperiment.class, true, "video_search_show_style", 31744, 0) == 5) {
                    double d3 = (double) this.f80783a;
                    Double.isNaN(d3);
                    rect.bottom = C23728o.m58241a(d3 - 3.0d);
                    if ((adapter == null || adapter.getItemViewType(0) != 0) && f == 1) {
                        rect.top = C23728o.m58241a(3.0d);
                        return;
                    }
                } else {
                    rect.bottom = C23728o.m58241a((double) this.f80783a);
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager.LayoutParams");
        }
    }
}

package com.p683ss.android.ugc.aweme.discover.p1662v3.p1664b;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.poi.nearby.p2063a.C39146b;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.v3.b.b */
public final class C28743b extends C1331h {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        if (!(view instanceof C39146b)) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).mo5247d() % 2 != 0) {
                    rect.left = C23728o.m58241a(1.0d);
                }
                rect.bottom = C23728o.m58241a(1.0d);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams");
        }
    }
}

package com.p683ss.android.ugc.aweme.poi.nearby.p2063a;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.nearby.a.a */
public final class C39145a extends C39147c {

    /* renamed from: a */
    public int f99880a = 8;

    public C39145a(int i, int i2) {
        super(8);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (!(view instanceof C39146b)) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).mo5247d() % 2 == 0) {
                    rect.left = C23728o.m58241a((double) this.f99880a);
                    double d = (double) this.f99880a;
                    Double.isNaN(d);
                    rect.right = C23728o.m58241a(d / 2.0d);
                } else {
                    double d2 = (double) this.f99880a;
                    Double.isNaN(d2);
                    rect.left = C23728o.m58241a(d2 / 2.0d);
                    rect.right = C23728o.m58241a((double) this.f99880a);
                }
                rect.top = C23728o.m58241a((double) this.f99880a);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams");
        }
    }
}

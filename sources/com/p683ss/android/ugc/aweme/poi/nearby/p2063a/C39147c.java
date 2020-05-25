package com.p683ss.android.ugc.aweme.poi.nearby.p2063a;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.StaggeredGridLayoutManager.LayoutParams;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;

/* renamed from: com.ss.android.ugc.aweme.poi.nearby.a.c */
public class C39147c extends C1331h {

    /* renamed from: a */
    private int f99881a;

    /* renamed from: b */
    private int f99882b;

    public C39147c(int i) {
        this.f99881a = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        if (!(view instanceof C39146b)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.mo5247d() % 2 == 0) {
                rect.left = C23728o.m58241a((double) this.f99881a);
                rect.right = C23728o.m58241a(2.0d);
            } else {
                rect.left = C23728o.m58241a(2.0d);
                rect.right = C23728o.m58241a((double) this.f99881a);
            }
            if (layoutParams.mo5247d() == 0 || layoutParams.mo5247d() == 1) {
                rect.top = this.f99882b;
            } else {
                rect.top = 0;
            }
        }
    }
}

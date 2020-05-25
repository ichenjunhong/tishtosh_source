package com.p683ss.android.ugc.aweme.emoji.emojiPageV2;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.c */
public final class C29321c extends C1331h {

    /* renamed from: a */
    public final int f76731a;

    /* renamed from: b */
    public final int f76732b;

    public C29321c(int i, int i2) {
        this.f76731a = i;
        this.f76732b = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int d = ((StaggeredGridLayoutManager.LayoutParams) layoutParams).mo5247d() % 3;
            if (d == 0) {
                rect.left = 0;
            } else if (d == 1 || d == 2) {
                rect.left = this.f76732b;
            }
            rect.bottom = this.f76732b;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams");
    }
}

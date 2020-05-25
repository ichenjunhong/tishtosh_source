package com.p683ss.android.ugc.aweme.emoji.p1685e;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.e.e */
public final class C29316e extends C1331h {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        int measuredWidth = recyclerView.getMeasuredWidth() / 8;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            measuredWidth = (measuredWidth - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        layoutParams.width = measuredWidth;
    }
}

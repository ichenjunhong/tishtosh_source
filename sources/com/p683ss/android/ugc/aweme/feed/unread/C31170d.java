package com.p683ss.android.ugc.aweme.feed.unread;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.unread.d */
public final class C31170d extends C1331h {

    /* renamed from: a */
    private final int f81585a;

    public C31170d(int i) {
        this.f81585a = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        if (RecyclerView.m4275f(view) == 0) {
            rect.left = this.f81585a;
        }
        rect.right = this.f81585a;
    }
}

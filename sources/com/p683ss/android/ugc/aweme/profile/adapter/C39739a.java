package com.p683ss.android.ugc.aweme.profile.adapter;

import android.graphics.Rect;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.a */
public final class C39739a extends C1331h {

    /* renamed from: a */
    private final int f101422a;

    public C39739a(int i) {
        this.f101422a = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            layoutManager = null;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (gridLayoutManager != null) {
            C1302b bVar = gridLayoutManager.f4526g;
            if (bVar != null) {
                int f = RecyclerView.m4275f(view);
                int i = gridLayoutManager.f4521b;
                if (bVar.mo4690a(f) == 1) {
                    int a = bVar.mo4691a(f, i);
                    rect.left = (this.f101422a * a) / i;
                    rect.right = this.f101422a - (((a + 1) * this.f101422a) / i);
                    if (bVar.mo4694c(f, i) > 0) {
                        rect.top = this.f101422a;
                    }
                }
            }
        }
    }
}

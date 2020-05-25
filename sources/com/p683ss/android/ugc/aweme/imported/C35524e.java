package com.p683ss.android.ugc.aweme.imported;

import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.StaggeredGridLayoutManager;

/* renamed from: com.ss.android.ugc.aweme.imported.e */
public final class C35524e {
    /* renamed from: a */
    public static C0794k<Integer, Integer> m80267a(RecyclerView recyclerView) {
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            return new C0794k<>(Integer.valueOf(linearLayoutManager.mo4749j()), Integer.valueOf(linearLayoutManager.mo4751l()));
        } else if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            return new C0794k<>(Integer.valueOf(gridLayoutManager.mo4749j()), Integer.valueOf(gridLayoutManager.mo4751l()));
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.f4896a];
            staggeredGridLayoutManager.mo5242c(iArr);
            int i = iArr[0];
            for (int i2 : iArr) {
                if (i2 > i) {
                    i = i2;
                }
            }
            staggeredGridLayoutManager.mo5240a(iArr);
            int i3 = iArr[0];
            for (int i4 : iArr) {
                if (i4 < i3) {
                    i3 = i4;
                }
            }
            return new C0794k<>(Integer.valueOf(i3), Integer.valueOf(i));
        } else {
            throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager");
        }
    }
}

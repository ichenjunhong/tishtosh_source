package com.p683ss.android.ugc.aweme.utils;

import android.graphics.Rect;
import android.support.p030v4.p038f.C0794k;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.ss.android.ugc.aweme.utils.eh */
public final class C47849eh {
    /* renamed from: b */
    public static void m103498b(RecyclerView recyclerView) {
        m103496a(recyclerView, 6);
    }

    /* renamed from: a */
    private static int m103493a(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: b */
    private static int m103497b(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 < i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static Rect m103494a(C1352v vVar) {
        if (vVar == null || vVar.itemView == null) {
            return null;
        }
        View view = vVar.itemView;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    /* renamed from: a */
    public static C0794k<Integer, Integer> m103495a(RecyclerView recyclerView) {
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
            int a = m103493a(iArr);
            staggeredGridLayoutManager.mo5240a(iArr);
            return new C0794k<>(Integer.valueOf(m103497b(iArr)), Integer.valueOf(a));
        } else {
            throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager");
        }
    }

    /* renamed from: a */
    private static void m103496a(RecyclerView recyclerView, int i) {
        if (recyclerView != null) {
            recyclerView.setPadding(0, (int) C9432q.m18687b(recyclerView.getContext(), 6.0f), 0, 0);
            recyclerView.setClipToPadding(false);
        }
    }
}

package com.bytedance.android.live.core.p230g;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.StaggeredGridLayoutManager;

/* renamed from: com.bytedance.android.live.core.g.y */
public final class C3921y {
    /* renamed from: a */
    public static void m9898a(RecyclerView recyclerView, int i) {
        if (i >= 0) {
            C1332i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).mo4721a(i, 0);
                return;
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).mo4721a(i, 0);
            }
        }
    }
}

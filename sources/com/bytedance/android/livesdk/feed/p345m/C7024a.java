package com.bytedance.android.livesdk.feed.p345m;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.bytedance.android.live.core.p230g.C3922z;

/* renamed from: com.bytedance.android.livesdk.feed.m.a */
public final class C7024a extends C1331h {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int i;
        boolean z;
        if (view.getVisibility() == 0) {
            i = C3922z.m9899a(3.0f);
        } else {
            i = 0;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            z = ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f4918b;
        } else {
            z = false;
        }
        if (z) {
            i = C3922z.m9899a(3.0f);
        }
        int a = C3922z.m9899a(1.5f);
        rect.set(a, i, a, 0);
    }
}

package com.p683ss.android.ugc.aweme.friends.adapter;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.u */
public final class C32547u extends C1331h {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int i;
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        int f = RecyclerView.m4275f(view);
        C1322a adapter = recyclerView.getAdapter();
        int i2 = 0;
        if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        if (f == i - 1) {
            i2 = (int) C9432q.m18687b(view.getContext(), 72.0f);
        }
        rect.bottom = i2;
    }
}

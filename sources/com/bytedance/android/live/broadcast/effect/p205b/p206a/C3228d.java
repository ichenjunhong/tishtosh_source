package com.bytedance.android.live.broadcast.effect.p205b.p206a;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.bytedance.android.live.core.p230g.C3922z;

/* renamed from: com.bytedance.android.live.broadcast.effect.b.a.d */
public final class C3228d extends C1331h {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        int f = RecyclerView.m4275f(view);
        if (f == 0) {
            rect.set(C3922z.m9899a(10.0f), 0, 0, 0);
            return;
        }
        if (f == recyclerView.getAdapter().getItemCount() - 1) {
            rect.set(0, 0, C3922z.m9899a(10.0f), 0);
        }
    }
}

package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.bytedance.android.live.core.p230g.C3922z;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.l */
public final class C3343l extends C1331h {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (RecyclerView.m4275f(view) == 0) {
            rect.set(0, C3922z.m9899a(8.0f), 0, C3922z.m9899a(4.0f));
        } else {
            rect.set(0, C3922z.m9899a(4.0f), 0, C3922z.m9899a(4.0f));
        }
    }
}

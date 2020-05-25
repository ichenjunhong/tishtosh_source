package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bt */
public final class C37585bt extends C1331h {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int i;
        if (RecyclerView.m4275f(view) == 0) {
            i = 0;
        } else {
            i = (int) C9432q.m18687b(view.getContext(), 8.0f);
        }
        rect.set(i, 0, (int) C9432q.m18687b(view.getContext(), 8.0f), 0);
    }
}

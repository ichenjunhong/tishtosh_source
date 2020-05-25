package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.aw */
public final class C5948aw extends C1331h {

    /* renamed from: a */
    private static int f15661a = -1;

    /* renamed from: b */
    private static int f15662b = -1;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        Context context = recyclerView.getContext();
        if (f15661a <= 0) {
            f15661a = (int) C9432q.m18687b(context, 4.0f);
            f15662b = (int) C9432q.m18687b(context, 4.0f);
        }
        int g = RecyclerView.m4276g(view);
        if (g == 0) {
            rect.set(f15661a, 0, f15662b, 0);
        } else if (recyclerView.getAdapter().getItemCount() - 1 == g) {
            rect.set(f15662b, 0, f15661a, 0);
        } else {
            rect.set(f15662b, 0, f15662b, 0);
        }
    }
}

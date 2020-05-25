package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.graphics.PointF;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager */
public class SmoothLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public float f15577a = 25.0f;

    public SmoothLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: a */
    public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        if (i < 0) {
            i = 0;
        }
        C59181 r2 = new C1415af(recyclerView.getContext()) {
            /* renamed from: c */
            public final PointF mo5111c(int i) {
                return SmoothLinearLayoutManager.this.mo4738d(i);
            }

            /* renamed from: a */
            public final float mo5490a(DisplayMetrics displayMetrics) {
                return SmoothLinearLayoutManager.this.f15577a / ((float) displayMetrics.densityDpi);
            }
        };
        r2.f4778g = i;
        mo5022a((C1346r) r2);
    }

    public SmoothLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.graphics.PointF;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVLinearLayoutManager */
public class MVLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public float f108822a = 5.0f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVLinearLayoutManager$a */
    class C43105a extends C1415af {
        /* renamed from: c */
        public final PointF mo5111c(int i) {
            return MVLinearLayoutManager.this.mo4738d(i);
        }

        /* renamed from: a */
        public final float mo5490a(DisplayMetrics displayMetrics) {
            return MVLinearLayoutManager.this.f108822a / ((float) displayMetrics.densityDpi);
        }

        public C43105a(Context context) {
            super(context);
        }
    }

    public MVLinearLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
    }

    /* renamed from: a */
    public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        C43105a aVar = new C43105a(recyclerView.getContext());
        aVar.f4778g = i;
        mo5022a((C1346r) aVar);
    }

    public MVLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

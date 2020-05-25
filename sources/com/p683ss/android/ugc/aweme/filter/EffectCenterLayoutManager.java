package com.p683ss.android.ugc.aweme.filter;

import android.content.Context;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.ss.android.ugc.aweme.filter.EffectCenterLayoutManager */
public class EffectCenterLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private C1346r f82145a;

    /* renamed from: b */
    private Context f82146b;

    /* renamed from: com.ss.android.ugc.aweme.filter.EffectCenterLayoutManager$a */
    static class C31368a extends C1415af {
        C31368a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final float mo5490a(DisplayMetrics displayMetrics) {
            return 200.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: a */
        public final int mo5492a(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    /* renamed from: e */
    public final void mo4741e(int i) {
        mo4721a(i, (int) (((float) (this.f4745I / 2)) - C9432q.m18687b(this.f82146b, 45.0f)));
    }

    public EffectCenterLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
        this.f82146b = context;
    }

    /* renamed from: a */
    public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        if (this.f82145a == null) {
            this.f82145a = new C31368a(recyclerView.getContext());
        }
        this.f82145a.f4778g = i;
        mo5022a(this.f82145a);
    }

    public EffectCenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f82146b = context;
    }
}

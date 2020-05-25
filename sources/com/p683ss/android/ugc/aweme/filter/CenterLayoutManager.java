package com.p683ss.android.ugc.aweme.filter;

import android.content.Context;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

/* renamed from: com.ss.android.ugc.aweme.filter.CenterLayoutManager */
public class CenterLayoutManager extends LinearLayoutManager {

    /* renamed from: com.ss.android.ugc.aweme.filter.CenterLayoutManager$a */
    static class C31365a extends C1415af {
        C31365a(Context context) {
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

    public CenterLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
    }

    /* renamed from: a */
    public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        C31365a aVar = new C31365a(recyclerView.getContext());
        aVar.f4778g = i;
        mo5022a((C1346r) aVar);
    }

    public CenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

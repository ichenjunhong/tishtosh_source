package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.graphics.PointF;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.DisplayMetrics;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ScollLinearLayoutManager */
public class ScollLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public float f74806a = 4.0f;

    /* renamed from: b */
    public float f74807b = 4.0f;

    /* renamed from: c */
    Context f74808c;

    public ScollLinearLayoutManager(Context context) {
        super(context);
        this.f74808c = context;
    }

    /* renamed from: a */
    public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        C284491 r2 = new C1415af(recyclerView.getContext()) {
            /* renamed from: a */
            public final float mo5490a(DisplayMetrics displayMetrics) {
                return ScollLinearLayoutManager.this.f74806a / displayMetrics.density;
            }

            /* renamed from: c */
            public final PointF mo5111c(int i) {
                return ScollLinearLayoutManager.this.mo4738d(i);
            }
        };
        r2.f4778g = i;
        mo5022a((C1346r) r2);
    }
}

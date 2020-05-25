package com.p683ss.android.ugc.aweme.shortvideo.cut;

import android.graphics.Canvas;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.p052a.C1385a.C1391a;
import android.view.View;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.l */
public class C42654l extends C1391a {

    /* renamed from: a */
    public final C42651j f107897a;

    /* renamed from: b */
    private boolean f107898b;

    /* renamed from: c */
    private boolean f107899c;

    /* renamed from: a */
    public final void mo5453a(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "p0");
    }

    public C42654l(C42651j jVar) {
        C52711k.m112240b(jVar, "adapter");
        this.f107897a = jVar;
    }

    /* renamed from: a */
    public int mo5451a(RecyclerView recyclerView, C1352v vVar) {
        C52711k.m112240b(recyclerView, "p0");
        C52711k.m112240b(vVar, "p1");
        return C1391a.m4823b(15, 0);
    }

    /* renamed from: b */
    public final void mo5456b(C1352v vVar, int i) {
        if (!(i == 0 || vVar == null)) {
            C42652k.m93584a(C32463a.m75161a(), 100);
            this.f107897a.mo86929a(vVar, i);
        }
        super.mo5456b(vVar, i);
    }

    /* renamed from: c */
    public final void mo5457c(RecyclerView recyclerView, C1352v vVar) {
        C52711k.m112240b(recyclerView, "recyclerView");
        C52711k.m112240b(vVar, "viewHolder");
        this.f107897a.mo86931a(vVar, this.f107898b);
        super.mo5457c(recyclerView, vVar);
        this.f107898b = false;
    }

    /* renamed from: a */
    public boolean mo5454a(RecyclerView recyclerView, C1352v vVar, C1352v vVar2) {
        C52711k.m112240b(recyclerView, "p0");
        C52711k.m112240b(vVar, "p1");
        C52711k.m112240b(vVar2, "p2");
        C42652k.m93584a(C32463a.m75161a(), 50);
        this.f107897a.mo86930a(vVar, vVar2);
        this.f107898b = true;
        return true;
    }

    /* renamed from: a */
    public final void mo5452a(Canvas canvas, RecyclerView recyclerView, C1352v vVar, float f, float f2, int i, boolean z) {
        float f3;
        float f4;
        RecyclerView recyclerView2 = recyclerView;
        C1352v vVar2 = vVar;
        C52711k.m112240b(canvas, "c");
        C52711k.m112240b(recyclerView2, "recyclerView");
        C52711k.m112240b(vVar2, "viewHolder");
        View view = vVar2.itemView;
        C52711k.m112236a((Object) view, "viewHolder.itemView");
        double height = (double) view.getHeight();
        Double.isNaN(height);
        double d = (height * 0.25d) / 2.0d;
        View view2 = vVar2.itemView;
        C52711k.m112236a((Object) view2, "viewHolder.itemView");
        double top = (double) view2.getTop();
        Double.isNaN(top);
        double d2 = top - d;
        float f5 = f2;
        double d3 = (double) f5;
        Double.isNaN(d3);
        double d4 = d2 + d3;
        View view3 = vVar2.itemView;
        C52711k.m112236a((Object) view3, "viewHolder.itemView");
        double height2 = (double) (((float) view3.getHeight()) * 1.25f);
        Double.isNaN(height2);
        double d5 = height2 + d4;
        if (d4 < ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            View view4 = vVar2.itemView;
            C52711k.m112236a((Object) view4, "viewHolder.itemView");
            double top2 = (double) view4.getTop();
            Double.isNaN(top2);
            f4 = -((float) (top2 - d));
        } else if (d5 > ((double) recyclerView.getHeight())) {
            double bottom = (double) recyclerView.getBottom();
            double bottom2 = (double) view.getBottom();
            Double.isNaN(bottom2);
            double d6 = bottom2 + d;
            Double.isNaN(bottom);
            f4 = (float) (bottom - d6);
        } else {
            f3 = f5;
            if (i == 2 || z) {
                float f6 = f;
                super.mo5452a(canvas, recyclerView, vVar, f, f3, i, z);
                this.f107899c = true;
            } else if (this.f107899c) {
                this.f107899c = false;
                this.f107897a.mo86928a(vVar2).translationX(0.0f).translationY(0.0f).setDuration(m4820a(recyclerView2, 8, f, f3)).start();
                return;
            }
        }
        f3 = f4;
        if (i == 2) {
        }
        float f62 = f;
        super.mo5452a(canvas, recyclerView, vVar, f, f3, i, z);
        this.f107899c = true;
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a;

import android.graphics.Canvas;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.p052a.C1385a.C1391a;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42652k;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44286c.C44287a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.f */
public final class C44292f extends C1391a {

    /* renamed from: a */
    public final C44286c f112116a;

    /* renamed from: b */
    private boolean f112117b;

    /* renamed from: c */
    private boolean f112118c;

    /* renamed from: a */
    public final void mo5453a(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "p0");
    }

    public C44292f(C44286c cVar) {
        C52711k.m112240b(cVar, "adapter");
        this.f112116a = cVar;
    }

    /* renamed from: a */
    public final int mo5451a(RecyclerView recyclerView, C1352v vVar) {
        C52711k.m112240b(recyclerView, "p0");
        C52711k.m112240b(vVar, "p1");
        return C1391a.m4823b(15, 0);
    }

    /* renamed from: b */
    public final void mo5456b(C1352v vVar, int i) {
        if (!(i == 0 || vVar == null)) {
            C42652k.m93584a(C32463a.m75161a(), 100);
            C44286c cVar = this.f112116a;
            C52711k.m112240b(vVar, "holder");
            C44287a aVar = (C44287a) vVar;
            if (aVar.f112110f != null) {
                aVar.f112110f.setScaleX(1.0f);
                aVar.f112110f.setScaleY(1.0f);
            }
            cVar.f112103d = vVar.getAdapterPosition();
        }
        super.mo5456b(vVar, i);
    }

    /* renamed from: c */
    public final void mo5457c(RecyclerView recyclerView, C1352v vVar) {
        C52711k.m112240b(recyclerView, "recyclerView");
        C52711k.m112240b(vVar, "viewHolder");
        C44286c cVar = this.f112116a;
        boolean z = this.f112117b;
        C52711k.m112240b(vVar, "holder");
        if (cVar.f112103d != -1) {
            C44287a aVar = (C44287a) vVar;
            if (aVar.f112110f != null) {
                aVar.f112110f.setScaleY(1.0f);
                aVar.f112110f.setScaleX(1.0f);
            }
            int adapterPosition = vVar.getAdapterPosition();
            if (!(adapterPosition == cVar.f112103d || cVar.f112104e == null)) {
                C44291e eVar = cVar.f112104e;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                eVar.mo89955a(cVar.f112103d, adapterPosition);
            }
            cVar.f112103d = -1;
        }
        super.mo5457c(recyclerView, vVar);
        this.f112117b = false;
    }

    /* renamed from: a */
    public final boolean mo5454a(RecyclerView recyclerView, C1352v vVar, C1352v vVar2) {
        C52711k.m112240b(recyclerView, "p0");
        C52711k.m112240b(vVar, "p1");
        C52711k.m112240b(vVar2, "p2");
        C42652k.m93584a(C32463a.m75161a(), 50);
        this.f112116a.mo89841a(vVar, vVar2);
        this.f112117b = true;
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
                this.f112118c = true;
            } else if (this.f112118c) {
                this.f112118c = false;
                C52711k.m112240b(vVar2, "holder");
                ViewPropertyAnimator scaleY = vVar2.itemView.animate().scaleX(1.0f).scaleY(1.0f);
                C52711k.m112236a((Object) scaleY, "holder.itemView.animate(…scaleX(1.0f).scaleY(1.0f)");
                scaleY.translationX(0.0f).translationY(0.0f).setDuration(m4820a(recyclerView2, 8, f, f3)).start();
                return;
            }
        }
        f3 = f4;
        if (i == 2) {
        }
        float f62 = f;
        super.mo5452a(canvas, recyclerView, vVar, f, f3, i, z);
        this.f112118c = true;
    }
}

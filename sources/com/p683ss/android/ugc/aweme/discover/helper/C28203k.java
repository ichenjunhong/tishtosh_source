package com.p683ss.android.ugc.aweme.discover.helper;

import android.animation.TimeInterpolator;
import android.support.p019b.C0260c;
import android.support.p019b.C0272d;
import android.support.p019b.C0304o;
import android.support.p019b.C0308q;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.k */
public final class C28203k {

    /* renamed from: a */
    private final ViewGroup f74043a;

    /* renamed from: b */
    private final View f74044b;

    /* renamed from: c */
    private final View f74045c;

    /* renamed from: a */
    public final void mo56616a() {
        m67109a(true);
    }

    /* renamed from: b */
    public final void mo56617b() {
        m67109a(false);
    }

    /* renamed from: a */
    private final void m67109a(boolean z) {
        C0308q qVar = new C0308q();
        qVar.mo622a(new C0272d().mo603b(this.f74044b));
        qVar.mo622a(new C0260c().mo603b(this.f74045c));
        qVar.mo588a((TimeInterpolator) new LinearInterpolator());
        qVar.mo587a(100);
        C0304o.m646a(this.f74043a, qVar);
        if (z) {
            this.f74044b.setVisibility(8);
            LayoutParams layoutParams = this.f74045c.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = C23728o.m58241a(16.0d);
                this.f74045c.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        this.f74044b.setVisibility(0);
        LayoutParams layoutParams2 = this.f74045c.getLayoutParams();
        if (layoutParams2 != null) {
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
            marginLayoutParams2.leftMargin = C23728o.m58241a((double) ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            this.f74045c.setLayoutParams(marginLayoutParams2);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C28203k(ViewGroup viewGroup, View view, View view2) {
        C52711k.m112240b(viewGroup, "sceneRoot");
        C52711k.m112240b(view, "scanView");
        C52711k.m112240b(view2, "inputContainer");
        this.f74043a = viewGroup;
        this.f74044b = view;
        this.f74045c = view2;
    }
}

package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.i */
final /* synthetic */ class C37926i implements OnLayoutChangeListener {

    /* renamed from: a */
    private final View f96581a;

    /* renamed from: b */
    private final View f96582b;

    C37926i(View view, View view2) {
        this.f96581a = view;
        this.f96582b = view2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f96581a;
        View view3 = this.f96582b;
        LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            ((MarginLayoutParams) layoutParams).bottomMargin = C23728o.m58241a(72.0d) - (view3.getHeight() - i4);
            view2.setLayoutParams(layoutParams);
        }
    }
}

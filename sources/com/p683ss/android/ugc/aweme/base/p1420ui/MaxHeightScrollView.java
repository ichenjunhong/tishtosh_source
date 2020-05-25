package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ScrollView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.MaxHeightScrollView */
public final class MaxHeightScrollView extends ScrollView {

    /* renamed from: a */
    private int f63006a;

    public MaxHeightScrollView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f63006a <= 0) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(this.f63006a, DynamicTabYellowPointVersion.DEFAULT));
        }
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.acy, R.attr.adf});
        this.f63006a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ MaxHeightScrollView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 16842880;
        }
        this(context, attributeSet, i);
    }
}

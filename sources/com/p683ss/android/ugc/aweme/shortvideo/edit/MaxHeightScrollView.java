package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ScrollView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.MaxHeightScrollView */
public final class MaxHeightScrollView extends ScrollView {

    /* renamed from: a */
    private int f109533a;

    public final void setMaxHeightDp(int i) {
        this.f109533a = i;
        invalidate();
    }

    public MaxHeightScrollView(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(C23728o.m58241a((double) this.f109533a), DynamicTabYellowPointVersion.DEFAULT));
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.acy, R.attr.adf}, 0, 0);
        try {
            this.f109533a = obtainStyledAttributes.getInteger(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }
}

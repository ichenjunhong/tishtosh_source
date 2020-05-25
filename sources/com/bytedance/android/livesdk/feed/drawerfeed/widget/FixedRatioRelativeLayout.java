package com.bytedance.android.livesdk.feed.drawerfeed.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;

public class FixedRatioRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private float f18900a = 1.0f;

    public FixedRatioRelativeLayout(Context context) {
        super(context);
    }

    public FixedRatioRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        if (this.f18900a > 0.0f) {
            i2 = MeasureSpec.makeMeasureSpec((int) (((float) size) / this.f18900a), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public FixedRatioRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

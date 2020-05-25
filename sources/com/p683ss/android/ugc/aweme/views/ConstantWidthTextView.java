package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.views.ConstantWidthTextView */
public class ConstantWidthTextView extends DmtTextView {
    public ConstantWidthTextView(Context context) {
        super(context);
    }

    public ConstantWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(0, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }

    public ConstantWidthTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

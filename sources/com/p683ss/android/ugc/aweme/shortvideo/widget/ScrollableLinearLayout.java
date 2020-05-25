package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ScrollableLinearLayout */
public class ScrollableLinearLayout extends LinearLayout {
    public ScrollableLinearLayout(Context context) {
        super(context);
    }

    public ScrollableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.measure(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), 0), MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 0));
            i3 += childAt.getMeasuredWidth();
            i4 = Math.max(i4, childAt.getMeasuredHeight());
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (!(mode == Integer.MIN_VALUE || mode == 1073741824) || i3 >= size) {
            size = i3;
        }
        setMeasuredDimension(size, resolveSize(i4, i2));
    }

    public ScrollableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

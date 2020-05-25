package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.ss.android.ugc.trill.R;

public class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    protected double f130154a;

    /* renamed from: b */
    private int f130155b;

    public void setAspectRatio(double d) {
        this.f130154a = d;
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int measuredHeight;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f130155b == 0) {
            if (MeasureSpec.getMode(i) == 1073741824) {
                i4 = MeasureSpec.getSize(i) - paddingLeft;
            } else {
                super.onMeasure(i, i2);
                i4 = getMeasuredWidth() - paddingLeft;
            }
            double d = (double) i4;
            double d2 = this.f130154a;
            Double.isNaN(d);
            i3 = (int) (d / d2);
        } else {
            if (MeasureSpec.getMode(i2) == 1073741824) {
                measuredHeight = MeasureSpec.getSize(i2) - paddingBottom;
            } else {
                super.onMeasure(i, i2);
                measuredHeight = getMeasuredHeight() - paddingBottom;
            }
            i3 = measuredHeight;
            double d3 = (double) i3;
            double d4 = this.f130154a;
            Double.isNaN(d3);
            i4 = (int) (d3 * d4);
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(i4 + paddingLeft, 1073741824), MeasureSpec.makeMeasureSpec(i3 + paddingBottom, 1073741824));
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(i, new int[]{R.attr.a9c, R.attr.a9d});
        try {
            this.f130154a = (double) obtainStyledAttributes.getFloat(0, 1.0f);
            this.f130155b = obtainStyledAttributes.getInt(1, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

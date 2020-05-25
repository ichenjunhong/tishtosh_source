package com.p683ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout */
public class FixedRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    int f63303a;

    /* renamed from: b */
    float f63304b;

    public int getMode() {
        return this.f63303a;
    }

    public float getWhRatio() {
        return this.f63304b;
    }

    public FixedRatioFrameLayout(Context context) {
        this(context, null);
    }

    public void setMode(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("mode must be either FIXED_HEIGHT or FIXED_WIDTH");
        } else if (this.f63303a != i) {
            this.f63303a = i;
            requestLayout();
        }
    }

    public void setWhRatio(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("whRatio must be positive.");
        } else if (this.f63304b != f) {
            this.f63304b = f;
            requestLayout();
        }
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (MeasureSpec.getSize(i2) - getPaddingBottom()) - getPaddingTop();
        if (this.f63303a == 0) {
            i = MeasureSpec.makeMeasureSpec((int) ((((float) size2) * this.f63304b) + 0.5f), 1073741824);
        } else {
            i2 = MeasureSpec.makeMeasureSpec((int) ((((float) size) / this.f63304b) + 0.5f), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m58282a(context, attributeSet, i, 0);
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m58282a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m58282a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.mh, R.attr.a_t}, i, i2);
        this.f63303a = obtainStyledAttributes.getInteger(0, 1);
        this.f63304b = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
    }
}

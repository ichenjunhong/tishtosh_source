package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.KeepRatioLayout */
public class KeepRatioLayout extends FrameLayout {

    /* renamed from: a */
    int f70166a = 1;

    /* renamed from: b */
    private int f70167b;

    /* renamed from: c */
    private int f70168c;

    public KeepRatioLayout(Context context) {
        super(context);
    }

    public KeepRatioLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f70167b > 0 || this.f70168c > 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            switch (this.f70166a) {
                case 1:
                    if (measuredWidth > 0) {
                        measuredHeight = (this.f70168c * measuredWidth) / this.f70167b;
                        break;
                    } else {
                        return;
                    }
                case 2:
                    if (measuredHeight > 0) {
                        measuredWidth = (this.f70167b * measuredHeight) / this.f70168c;
                        break;
                    } else {
                        return;
                    }
            }
            super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    /* renamed from: a */
    public final void mo54439a(int i, int i2, int i3) {
        mo54440b(i, i2, 1);
    }

    public KeepRatioLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo54440b(int i, int i2, int i3) {
        if (this.f70167b != i || this.f70168c != i2 || this.f70166a != i3) {
            this.f70167b = i;
            this.f70168c = i2;
            this.f70166a = i3;
            requestLayout();
        }
    }
}

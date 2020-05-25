package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.DmtGradientDrawableTextView */
public class DmtGradientDrawableTextView extends DmtTextView {

    /* renamed from: b */
    private int f121034b;

    /* renamed from: c */
    private int f121035c;

    /* renamed from: d */
    private int f121036d;

    /* renamed from: e */
    private int f121037e;

    /* renamed from: f */
    private GradientDrawable f121038f;

    public DmtGradientDrawableTextView(Context context) {
        this(context, null);
    }

    public final void setFillColor(int i) {
        GradientDrawable gradientDrawable = this.f121038f;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
    }

    public DmtGradientDrawableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtGradientDrawableTextView(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArray;
        int i2;
        int i3;
        int i4;
        super(context, attributeSet, i);
        if (context != null) {
            typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aau, R.attr.aav, R.attr.aaw, R.attr.aax, R.attr.aay, R.attr.aaz, R.attr.ab0});
        } else {
            typedArray = null;
        }
        int i5 = 0;
        if (typedArray != null) {
            i2 = typedArray.getColor(4, 0);
        } else {
            i2 = 0;
        }
        this.f121034b = i2;
        if (typedArray != null) {
            i3 = typedArray.getColor(0, 0);
        } else {
            i3 = 0;
        }
        this.f121035c = i3;
        if (typedArray != null) {
            i4 = typedArray.getDimensionPixelSize(1, 0);
        } else {
            i4 = 0;
        }
        this.f121036d = i4;
        if (typedArray != null) {
            i5 = typedArray.getDimensionPixelSize(2, 0);
        }
        this.f121037e = i5;
        if (typedArray != null) {
            typedArray.recycle();
        }
        this.f121038f = new GradientDrawable();
        if (this.f121036d > 0 && this.f121035c != 0) {
            GradientDrawable gradientDrawable = this.f121038f;
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(this.f121036d, this.f121035c);
            }
        }
        if (this.f121034b != 0) {
            GradientDrawable gradientDrawable2 = this.f121038f;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(this.f121034b);
            }
        }
        GradientDrawable gradientDrawable3 = this.f121038f;
        if (gradientDrawable3 != null) {
            gradientDrawable3.setCornerRadius((float) this.f121037e);
        }
        setBackground(this.f121038f);
    }
}

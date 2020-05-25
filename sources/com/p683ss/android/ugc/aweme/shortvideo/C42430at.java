package com.p683ss.android.ugc.aweme.shortvideo;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.at */
public final class C42430at {
    /* renamed from: a */
    public static Drawable m93199a(int[] iArr) {
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TR_BL, iArr);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static Drawable m93195a(int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(i3, i);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static Drawable m93196a(int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(i3, i);
        gradientDrawable.setCornerRadius((float) i4);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static Drawable m93198a(int i, int i2, int i3, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(0, i);
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static Drawable m93197a(int i, int i2, int i3, int i4, int i5) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(0, i);
        gradientDrawable.setSize(i4, i5);
        return gradientDrawable;
    }
}

package com.bytedance.android.livesdkapi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View.MeasureSpec;

public class TextureRenderView extends TextureView implements C8866c {

    /* renamed from: a */
    private int f24176a;

    /* renamed from: b */
    private int f24177b;

    /* renamed from: c */
    private int f24178c = 2;

    /* renamed from: d */
    private final float f24179d = 1.7777778f;

    public int getTextureLayout() {
        return this.f24178c;
    }

    /* renamed from: a */
    public final void mo15860a() {
        this.f24176a = 0;
        this.f24177b = 0;
        this.f24178c = 2;
    }

    public void setScaleType(int i) {
        this.f24178c = i;
    }

    public TextureRenderView(Context context) {
        super(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo15861a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f24176a = i;
            this.f24177b = i2;
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        float f;
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        } else if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        }
        if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        }
        if (this.f24178c == 2 || this.f24176a == 0 || this.f24177b == 0) {
            float f2 = (float) suggestedMinimumHeight;
            float f3 = (float) suggestedMinimumWidth;
            float f4 = f2 / f3;
            if (this.f24176a == 0 || this.f24177b == 0) {
                f = 1.7777778f;
                i3 = 9;
                i4 = 16;
            } else {
                f = ((float) this.f24177b) / ((float) this.f24176a);
                i4 = this.f24177b;
                i3 = this.f24176a;
            }
            if (f > f4) {
                suggestedMinimumHeight = (int) (((float) i4) * ((f3 * 1.0f) / ((float) i3)));
            } else {
                suggestedMinimumWidth = (int) (((float) i3) * ((f2 * 1.0f) / ((float) i4)));
            }
        } else if (this.f24178c != 1) {
            if (this.f24178c == 0) {
                int i5 = (int) (((float) this.f24177b) * ((((float) suggestedMinimumWidth) * 1.0f) / ((float) this.f24176a)));
                if (i5 > suggestedMinimumHeight) {
                    suggestedMinimumWidth = (int) (((float) this.f24176a) * ((((float) suggestedMinimumHeight) * 1.0f) / ((float) this.f24177b)));
                } else {
                    suggestedMinimumHeight = i5;
                }
            } else if (this.f24178c == 3) {
                suggestedMinimumHeight = (int) (((float) this.f24177b) * ((((float) suggestedMinimumWidth) * 1.0f) / ((float) this.f24176a)));
            } else {
                suggestedMinimumWidth = 0;
                suggestedMinimumHeight = 0;
            }
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

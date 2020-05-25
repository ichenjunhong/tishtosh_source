package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader.TileMode;
import android.support.p043v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.util.AttributeSet;

public class GradientTextView extends AppCompatTextView {

    /* renamed from: b */
    private int[] f23016b;

    /* renamed from: c */
    private boolean f23017c;

    /* renamed from: d */
    private boolean f23018d;

    public void setColorList(int[] iArr) {
        this.f23016b = iArr;
    }

    public void setGradient(boolean z) {
        this.f23017c = z;
    }

    public GradientTextView(Context context) {
        this(context, null);
    }

    public GradientTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23017c = true;
        this.f23016b = new int[]{-39936, -26573};
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            if (this.f23017c) {
                TextPaint paint = getPaint();
                if (this.f23018d) {
                    f = (float) getWidth();
                } else {
                    f = 0.0f;
                }
                if (this.f23018d) {
                    f2 = 0.0f;
                } else {
                    f2 = (float) getHeight();
                }
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f, f2, this.f23016b[0], this.f23016b[1], TileMode.CLAMP);
                paint.setShader(linearGradient);
                return;
            }
            getPaint().setShader(null);
        }
    }
}

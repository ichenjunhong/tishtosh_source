package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;

public class FitTextView extends LiveTextView {

    /* renamed from: d */
    private Paint f11286d;

    /* renamed from: e */
    private float f11287e;

    /* renamed from: f */
    private float f11288f;

    public FitTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static float m10229a(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().scaledDensity;
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, bufferType);
        m10230a(charSequence.toString(), getWidth());
    }

    public FitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11288f = 6.0f;
        this.f11286d = new TextPaint();
        this.f11286d.set(getPaint());
        this.f11287e = getTextSize();
    }

    /* renamed from: a */
    private void m10230a(String str, int i) {
        if (i > 0) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float f = this.f11287e;
            this.f11286d.setTextSize(f);
            while (true) {
                if (this.f11286d.measureText(str) <= ((float) paddingLeft)) {
                    break;
                }
                f -= 1.0f;
                if (f <= this.f11288f) {
                    f = this.f11288f;
                    break;
                }
                this.f11286d.setTextSize(f);
            }
            setTextSize(m10229a(getContext(), f));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3) {
            m10230a(getText().toString(), i);
        }
    }
}

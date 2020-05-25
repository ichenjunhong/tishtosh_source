package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Paint;
import android.support.p043v7.widget.AppCompatButton;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;

public class FitButton extends AppCompatButton {

    /* renamed from: b */
    private Paint f23002b;

    /* renamed from: c */
    private float f23003c;

    /* renamed from: d */
    private float f23004d;

    public FitButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static float m16669a(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().scaledDensity;
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, bufferType);
        m16670a(charSequence.toString(), getWidth());
    }

    public FitButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23004d = 6.0f;
        this.f23002b = new TextPaint();
        this.f23002b.set(getPaint());
        this.f23003c = getTextSize();
    }

    /* renamed from: a */
    private void m16670a(String str, int i) {
        if (i > 0) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float f = this.f23003c;
            this.f23002b.setTextSize(f);
            while (true) {
                if (this.f23002b.measureText(str) <= ((float) paddingLeft)) {
                    break;
                }
                f -= 1.0f;
                if (f <= this.f23004d) {
                    f = this.f23004d;
                    break;
                }
                this.f23002b.setTextSize(f);
            }
            setTextSize(m16669a(getContext(), f));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3) {
            m16670a(getText().toString(), i);
        }
    }
}

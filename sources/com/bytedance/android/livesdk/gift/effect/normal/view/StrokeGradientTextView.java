package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

public class StrokeGradientTextView extends TextView {

    /* renamed from: a */
    private TextView f20371a;

    public StrokeGradientTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f20371a.draw(canvas);
        super.onDraw(canvas);
    }

    public void setLayoutParams(LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f20371a.setLayoutParams(layoutParams);
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        this.f20371a.setTextSize(f);
    }

    public StrokeGradientTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.f20371a.setTextSize(i, f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        CharSequence text = this.f20371a.getText();
        if (text == null || !text.equals(getText())) {
            this.f20371a.setText(getText());
            postInvalidate();
        }
        this.f20371a.measure(i, i2);
    }

    public StrokeGradientTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20371a = new TextView(context, attributeSet, i);
        TextPaint paint = this.f20371a.getPaint();
        paint.setStrokeWidth(getResources().getDimension(R.dimen.p4));
        paint.setStyle(Style.STROKE);
        this.f20371a.setTextColor(getResources().getColor(R.color.ae0));
        this.f20371a.setGravity(getGravity());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f20371a.layout(i, i2, i3, i4);
        TextPaint paint = getPaint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), getResources().getColor(R.color.ae3), getResources().getColor(R.color.ae2), TileMode.CLAMP);
        paint.setShader(linearGradient);
    }
}

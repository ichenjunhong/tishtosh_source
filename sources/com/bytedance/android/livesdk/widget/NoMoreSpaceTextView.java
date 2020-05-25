package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import com.bytedance.android.live.core.widget.LiveTextView;

public class NoMoreSpaceTextView extends LiveTextView {

    /* renamed from: d */
    private int f23153d;

    /* renamed from: e */
    private int f23154e;

    /* renamed from: f */
    private boolean f23155f;

    public void scrollBy(int i, int i2) {
    }

    public void scrollTo(int i, int i2) {
    }

    private int getSpaceExtra() {
        if (getLineCount() == this.f23154e) {
            return this.f23153d;
        }
        this.f23154e = getLineCount();
        this.f23153d = 0;
        int i = this.f23154e - 1;
        Layout layout = getLayout();
        if (i >= 0 && getMeasuredHeight() == layout.getHeight()) {
            FontMetricsInt fontMetricsInt = layout.getPaint().getFontMetricsInt();
            Rect rect = new Rect();
            this.f23153d = (rect.bottom - (fontMetricsInt.ascent - layout.getLineAscent(i))) - (getLineBounds(i, rect) + fontMetricsInt.bottom);
        }
        return this.f23153d;
    }

    public void setAlwaysInvalidate(boolean z) {
        this.f23155f = z;
    }

    public NoMoreSpaceTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception unused) {
        }
        if (this.f23155f) {
            invalidate();
        }
    }

    public NoMoreSpaceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() - getSpaceExtra());
    }

    public NoMoreSpaceTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

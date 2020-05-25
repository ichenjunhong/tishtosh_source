package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.trill.R;

public class RedEnvelopeProgressBar extends View {

    /* renamed from: a */
    private int f23182a;

    /* renamed from: b */
    private int f23183b;

    /* renamed from: c */
    private int f23184c;

    /* renamed from: d */
    private Paint f23185d;

    /* renamed from: e */
    private RectF f23186e;

    public RedEnvelopeProgressBar(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.f23186e, -90.0f, (float) ((int) (((((float) this.f23183b) * 1.0f) / ((float) this.f23184c)) * 360.0f)), false, this.f23185d);
    }

    public void setProgress(int i) {
        if (i < 0) {
            this.f23183b = 0;
        } else if (i > this.f23184c) {
            this.f23183b = this.f23184c;
        } else if (i == this.f23183b) {
            return;
        }
        this.f23183b = i;
        invalidate();
    }

    public RedEnvelopeProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RedEnvelopeProgressBar(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        super(context, attributeSet, i);
        int i4 = 100;
        this.f23184c = 100;
        int i5 = 16183767;
        if (attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{R.attr.ku, R.attr.kv, R.attr.os, R.attr.tq, R.attr.v0});
            if (obtainAttributes.hasValue(4)) {
                i2 = obtainAttributes.getDimensionPixelSize(4, 106);
            } else {
                i2 = 106;
            }
            if (obtainAttributes.hasValue(2)) {
                i3 = obtainAttributes.getDimensionPixelSize(2, 100);
            } else {
                i3 = 100;
            }
            if (obtainAttributes.hasValue(3)) {
                this.f23184c = obtainAttributes.getInt(3, 100);
            }
            if (obtainAttributes.hasValue(0)) {
                this.f23183b = obtainAttributes.getInt(0, 0);
            }
            if (obtainAttributes.hasValue(1)) {
                i5 = obtainAttributes.getColor(1, 16183767);
            }
            obtainAttributes.recycle();
        } else {
            i2 = 106;
            i3 = 100;
        }
        if (i2 <= i3 || i2 <= 0 || i3 <= 0) {
            i2 = 106;
        } else {
            i4 = i3;
        }
        this.f23182a = i2 - i4;
        this.f23185d = new Paint();
        this.f23185d.setColor(i5);
        this.f23185d.setAntiAlias(true);
        this.f23185d.setStrokeWidth((float) this.f23182a);
        this.f23185d.setStyle(Style.STROKE);
        this.f23185d.setStrokeCap(Cap.ROUND);
        this.f23186e = new RectF();
        setProgress(this.f23183b);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 > i6) {
            i5 = i6;
        } else if (i5 < i6) {
            i6 = i5;
        }
        this.f23186e.set((float) (this.f23182a / 2), (float) (this.f23182a / 2), (float) (i5 - (this.f23182a / 2)), (float) (i6 - (this.f23182a / 2)));
    }
}

package com.p683ss.android.p1103ad.splash.core.p1118g;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

/* renamed from: com.ss.android.ad.splash.core.g.a */
public final class C18648a extends TextView {

    /* renamed from: a */
    public long f51541a = 0;

    /* renamed from: b */
    public double f51542b = 1.0d;

    /* renamed from: c */
    private final int f51543c = Color.parseColor("#979797");

    /* renamed from: d */
    private Paint f51544d;

    /* renamed from: e */
    private int f51545e;

    /* renamed from: f */
    private int f51546f = -1;

    /* renamed from: g */
    private RectF f51547g;

    /* renamed from: h */
    private final float f51548h = 0.5f;

    /* renamed from: i */
    private ValueAnimator f51549i;

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f51549i != null) {
            this.f51549i.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f51549i != null) {
            this.f51549i.removeAllUpdateListeners();
            this.f51549i = null;
        }
    }

    public final void setBorderColor(int i) {
        this.f51546f = i;
        this.f51544d.setColor(this.f51546f);
    }

    public final void setBorderSize(int i) {
        this.f51545e = Math.max(i, 0);
        this.f51544d.setStrokeWidth((float) this.f51545e);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f51547g != null) {
            canvas.drawArc(this.f51547g, -90.0f, (float) (this.f51542b * 360.0d), false, this.f51544d);
        }
    }

    public final void setDuration(long j) {
        this.f51541a = Math.max(0, j);
        if (this.f51541a != 0) {
            this.f51549i = ValueAnimator.ofFloat(new float[]{(float) this.f51541a, 0.0f}).setDuration(this.f51541a);
            this.f51549i.setInterpolator(new LinearInterpolator());
            this.f51549i.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    C18648a aVar = C18648a.this;
                    double d = (double) floatValue;
                    double d2 = (double) C18648a.this.f51541a;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    aVar.f51542b = d / d2;
                    C18648a.this.invalidate();
                }
            });
        }
    }

    public C18648a(Context context) {
        super(context);
        if (this.f51545e == 0) {
            this.f51545e = (int) ((getResources().getDisplayMetrics().density * 0.5f) + 0.5f);
        }
        this.f51544d = new Paint();
        this.f51544d.setColor(this.f51546f);
        this.f51544d.setStyle(Style.STROKE);
        this.f51544d.setStrokeWidth((float) this.f51545e);
        setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f51543c);
        gradientDrawable.setShape(1);
        if (VERSION.SDK_INT >= 16) {
            setBackground(gradientDrawable);
        } else {
            setBackgroundDrawable(gradientDrawable);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            this.f51547g = new RectF((float) (this.f51545e / 2), (float) (this.f51545e / 2), (float) (getMeasuredWidth() - (this.f51545e / 2)), (float) (getMeasuredHeight() - (this.f51545e / 2)));
        }
    }
}

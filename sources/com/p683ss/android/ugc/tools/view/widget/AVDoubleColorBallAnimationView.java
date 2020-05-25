package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.widget.AVDoubleColorBallAnimationView */
public class AVDoubleColorBallAnimationView extends View {

    /* renamed from: a */
    public boolean f125918a;

    /* renamed from: b */
    private final float f125919b;

    /* renamed from: c */
    private final float f125920c;

    /* renamed from: d */
    private final float f125921d;

    /* renamed from: e */
    private final float f125922e;

    /* renamed from: f */
    private final float f125923f;

    /* renamed from: g */
    private final long f125924g;

    /* renamed from: h */
    private int f125925h;

    /* renamed from: i */
    private int f125926i;

    /* renamed from: j */
    private Paint f125927j;

    /* renamed from: k */
    private final PorterDuffXfermode f125928k;

    /* renamed from: l */
    private long f125929l;

    /* renamed from: m */
    private int f125930m;

    /* renamed from: n */
    private float f125931n;

    /* renamed from: o */
    private float f125932o;

    /* renamed from: p */
    private float f125933p;

    /* renamed from: q */
    private float f125934q;

    /* renamed from: a */
    private void m108448a() {
        setLayerType(0, null);
        this.f125918a = false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m108448a();
    }

    public AVDoubleColorBallAnimationView(Context context) {
        this(context, null);
        m108449a(context);
    }

    /* renamed from: a */
    private void m108449a(Context context) {
        this.f125925h = C0726c.m2098c(context, R.color.b1j);
        this.f125926i = C0726c.m2098c(context, R.color.b1k);
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            this.f125930m = i;
            this.f125931n = ((float) this.f125930m) / 2.0f;
            this.f125932o = ((float) (this.f125930m >> 1)) * 0.32f;
            this.f125933p = (((float) this.f125930m) * 0.16f) + this.f125932o;
            this.f125934q = ((float) this.f125930m) - (this.f125933p * 2.0f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            setLayerType(1, null);
            this.f125929l = -1;
            if (this.f125930m <= 0) {
                setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.ws));
            }
            int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
            if (this.f125930m > min && min > 0) {
                setProgressBarInfo(min);
            }
            if (this.f125927j == null) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                paint.setStyle(Style.FILL);
                this.f125927j = paint;
            }
            this.f125918a = true;
            postInvalidate();
            return;
        }
        m108448a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        super.onDraw(canvas);
        if (this.f125918a) {
            long nanoTime = System.nanoTime() / 1000000;
            if (this.f125929l < 0) {
                this.f125929l = nanoTime;
            }
            float f3 = ((float) (nanoTime - this.f125929l)) / 400.0f;
            int i3 = (int) f3;
            boolean z = true;
            if ((i3 & 1) != 1) {
                z = false;
            }
            float f4 = f3 - ((float) i3);
            if (((double) f4) < 0.5d) {
                f = f4 * 2.0f * f4;
            } else {
                f = ((f4 * 2.0f) * (2.0f - f4)) - 1.0f;
            }
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) this.f125930m, (float) this.f125930m, this.f125927j, 31);
            float f5 = (this.f125934q * f) + this.f125933p;
            if (((double) f) < 0.5d) {
                f2 = f * 2.0f;
            } else {
                f2 = 2.0f - (f * 2.0f);
            }
            float f6 = (0.25f * f2 * this.f125932o) + this.f125932o;
            Paint paint = this.f125927j;
            if (z) {
                i = this.f125926i;
            } else {
                i = this.f125925h;
            }
            paint.setColor(i);
            canvas.drawCircle(f5, this.f125931n, f6, this.f125927j);
            float f7 = ((float) this.f125930m) - f5;
            float f8 = this.f125932o - ((f2 * 0.375f) * this.f125932o);
            Paint paint2 = this.f125927j;
            if (z) {
                i2 = this.f125925h;
            } else {
                i2 = this.f125926i;
            }
            paint2.setColor(i2);
            this.f125927j.setXfermode(this.f125928k);
            canvas.drawCircle(f7, this.f125931n, f8, this.f125927j);
            this.f125927j.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            postInvalidateDelayed(17);
        }
    }

    public AVDoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m108449a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        if (this.f125930m > min && min > 0) {
            setProgressBarInfo(min);
        }
    }

    public AVDoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f125919b = 0.25f;
        this.f125920c = 0.375f;
        this.f125921d = 0.16f;
        this.f125922e = 0.32f;
        this.f125923f = 400.0f;
        this.f125924g = 17;
        this.f125928k = new PorterDuffXfermode(Mode.DARKEN);
        this.f125918a = false;
        this.f125929l = -1;
        this.f125930m = -1;
        m108449a(context);
    }
}

package com.bytedance.android.livesdk.chatroom.p325ui;

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

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.DoubleColorBallAnimationView */
public class DoubleColorBallAnimationView extends View {

    /* renamed from: a */
    public boolean f15443a;

    /* renamed from: b */
    private final float f15444b;

    /* renamed from: c */
    private final float f15445c;

    /* renamed from: d */
    private final float f15446d;

    /* renamed from: e */
    private final float f15447e;

    /* renamed from: f */
    private final float f15448f;

    /* renamed from: g */
    private final long f15449g;

    /* renamed from: h */
    private int f15450h;

    /* renamed from: i */
    private int f15451i;

    /* renamed from: j */
    private Paint f15452j;

    /* renamed from: k */
    private final PorterDuffXfermode f15453k;

    /* renamed from: l */
    private long f15454l;

    /* renamed from: m */
    private int f15455m;

    /* renamed from: n */
    private float f15456n;

    /* renamed from: o */
    private float f15457o;

    /* renamed from: p */
    private float f15458p;

    /* renamed from: q */
    private float f15459q;

    /* renamed from: a */
    private void m12859a() {
        setLayerType(0, null);
        this.f15443a = false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m12859a();
    }

    public DoubleColorBallAnimationView(Context context) {
        this(context, null);
        m12860a(context);
    }

    /* renamed from: a */
    private void m12860a(Context context) {
        this.f15450h = C0726c.m2098c(context, R.color.apg);
        this.f15451i = C0726c.m2098c(context, R.color.aph);
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            this.f15455m = i;
            this.f15456n = ((float) this.f15455m) / 2.0f;
            this.f15457o = ((float) (this.f15455m >> 1)) * 0.32f;
            this.f15458p = (((float) this.f15455m) * 0.16f) + this.f15457o;
            this.f15459q = ((float) this.f15455m) - (this.f15458p * 2.0f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            setLayerType(1, null);
            this.f15454l = -1;
            if (this.f15455m <= 0) {
                setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.fh));
            }
            int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
            if (this.f15455m > min && min > 0) {
                setProgressBarInfo(min);
            }
            if (this.f15452j == null) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                paint.setStyle(Style.FILL);
                this.f15452j = paint;
            }
            this.f15443a = true;
            postInvalidate();
            return;
        }
        m12859a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        super.onDraw(canvas);
        if (this.f15443a) {
            long nanoTime = System.nanoTime() / 1000000;
            if (this.f15454l < 0) {
                this.f15454l = nanoTime;
            }
            float f3 = ((float) (nanoTime - this.f15454l)) / 400.0f;
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
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) this.f15455m, (float) this.f15455m, this.f15452j, 31);
            float f5 = (this.f15459q * f) + this.f15458p;
            if (((double) f) < 0.5d) {
                f2 = f * 2.0f;
            } else {
                f2 = 2.0f - (f * 2.0f);
            }
            float f6 = (0.25f * f2 * this.f15457o) + this.f15457o;
            Paint paint = this.f15452j;
            if (z) {
                i = this.f15451i;
            } else {
                i = this.f15450h;
            }
            paint.setColor(i);
            canvas.drawCircle(f5, this.f15456n, f6, this.f15452j);
            float f7 = ((float) this.f15455m) - f5;
            float f8 = this.f15457o - ((f2 * 0.375f) * this.f15457o);
            Paint paint2 = this.f15452j;
            if (z) {
                i2 = this.f15450h;
            } else {
                i2 = this.f15451i;
            }
            paint2.setColor(i2);
            this.f15452j.setXfermode(this.f15453k);
            canvas.drawCircle(f7, this.f15456n, f8, this.f15452j);
            this.f15452j.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            postInvalidateDelayed(17);
        }
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m12860a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        if (this.f15455m > min && min > 0) {
            setProgressBarInfo(min);
        }
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15444b = 0.25f;
        this.f15445c = 0.375f;
        this.f15446d = 0.16f;
        this.f15447e = 0.32f;
        this.f15448f = 400.0f;
        this.f15449g = 17;
        this.f15453k = new PorterDuffXfermode(Mode.DARKEN);
        this.f15443a = false;
        this.f15454l = -1;
        this.f15455m = -1;
        m12860a(context);
    }
}

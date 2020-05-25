package com.bytedance.ies.dmt.p664ui.widget;

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

/* renamed from: com.bytedance.ies.dmt.ui.widget.DoubleColorBallAnimationView */
public class DoubleColorBallAnimationView extends View {

    /* renamed from: a */
    public boolean f28661a;

    /* renamed from: b */
    private final float f28662b;

    /* renamed from: c */
    private final float f28663c;

    /* renamed from: d */
    private final float f28664d;

    /* renamed from: e */
    private final float f28665e;

    /* renamed from: f */
    private final float f28666f;

    /* renamed from: g */
    private final long f28667g;

    /* renamed from: h */
    private int f28668h;

    /* renamed from: i */
    private int f28669i;

    /* renamed from: j */
    private Paint f28670j;

    /* renamed from: k */
    private final PorterDuffXfermode f28671k;

    /* renamed from: l */
    private float f28672l;

    /* renamed from: m */
    private boolean f28673m;

    /* renamed from: n */
    private boolean f28674n;

    /* renamed from: o */
    private int f28675o;

    /* renamed from: p */
    private long f28676p;

    /* renamed from: q */
    private int f28677q;

    /* renamed from: r */
    private float f28678r;

    /* renamed from: s */
    private float f28679s;

    /* renamed from: t */
    private float f28680t;

    /* renamed from: u */
    private float f28681u;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo19245b();
    }

    /* renamed from: a */
    public final void mo19244a() {
        m21694d();
        this.f28661a = true;
        this.f28673m = true;
        postInvalidate();
    }

    /* renamed from: b */
    public final void mo19245b() {
        this.f28661a = false;
        this.f28674n = false;
        this.f28672l = 0.0f;
    }

    /* renamed from: c */
    private static Paint m21693c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Style.FILL);
        return paint;
    }

    /* renamed from: d */
    private void m21694d() {
        this.f28676p = -1;
        if (this.f28677q <= 0) {
            setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.fh));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.f28677q > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.f28670j == null) {
            this.f28670j = m21693c();
        }
        this.f28674n = true;
    }

    public void setCycleBias(int i) {
        this.f28675o = i;
    }

    public DoubleColorBallAnimationView(Context context) {
        this(context, null);
        m21692a(context);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            mo19244a();
        } else {
            mo19245b();
        }
    }

    /* renamed from: a */
    private void m21692a(Context context) {
        this.f28668h = C0726c.m2098c(context, R.color.apg);
        this.f28669i = C0726c.m2098c(context, R.color.aph);
    }

    public void setProgress(float f) {
        if (!this.f28674n) {
            m21694d();
        }
        this.f28672l = f;
        this.f28661a = false;
        this.f28673m = false;
        postInvalidate();
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            this.f28677q = i;
            this.f28678r = ((float) this.f28677q) / 2.0f;
            this.f28679s = ((float) (this.f28677q >> 1)) * 0.32f;
            this.f28680t = (((float) this.f28677q) * 0.16f) + this.f28679s;
            this.f28681u = ((float) this.f28677q) - (this.f28680t * 2.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        super.onDraw(canvas);
        if ((this.f28661a || !this.f28673m) && this.f28674n) {
            boolean z = false;
            if (this.f28673m) {
                long nanoTime = System.nanoTime() / 1000000;
                if (this.f28676p < 0) {
                    this.f28676p = nanoTime;
                }
                this.f28672l = ((float) (nanoTime - this.f28676p)) / 400.0f;
                int i3 = (int) this.f28672l;
                if (((this.f28675o + i3) & 1) == 1) {
                    z = true;
                }
                this.f28672l -= (float) i3;
            }
            float f3 = this.f28672l;
            if (((double) f3) < 0.5d) {
                f = f3 * 2.0f * f3;
            } else {
                f = ((f3 * 2.0f) * (2.0f - f3)) - 1.0f;
            }
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) this.f28677q, (float) this.f28677q, this.f28670j, 31);
            float f4 = (this.f28681u * f) + this.f28680t;
            if (((double) f) < 0.5d) {
                f2 = f * 2.0f;
            } else {
                f2 = 2.0f - (f * 2.0f);
            }
            float f5 = (0.25f * f2 * this.f28679s) + this.f28679s;
            Paint paint = this.f28670j;
            if (z) {
                i = this.f28669i;
            } else {
                i = this.f28668h;
            }
            paint.setColor(i);
            canvas.drawCircle(f4, this.f28678r, f5, this.f28670j);
            float f6 = ((float) this.f28677q) - f4;
            float f7 = this.f28679s - ((f2 * 0.375f) * this.f28679s);
            Paint paint2 = this.f28670j;
            if (z) {
                i2 = this.f28668h;
            } else {
                i2 = this.f28669i;
            }
            paint2.setColor(i2);
            this.f28670j.setXfermode(this.f28671k);
            canvas.drawCircle(f6, this.f28678r, f7, this.f28670j);
            this.f28670j.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            postInvalidateDelayed(17);
        }
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m21692a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        if (this.f28677q > min && min > 0) {
            setProgressBarInfo(min);
        }
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28662b = 0.25f;
        this.f28663c = 0.375f;
        this.f28664d = 0.16f;
        this.f28665e = 0.32f;
        this.f28666f = 400.0f;
        this.f28667g = 17;
        this.f28671k = new PorterDuffXfermode(Mode.XOR);
        this.f28673m = false;
        this.f28674n = false;
        this.f28675o = 0;
        this.f28661a = false;
        this.f28676p = -1;
        this.f28677q = -1;
        m21692a(context);
    }
}

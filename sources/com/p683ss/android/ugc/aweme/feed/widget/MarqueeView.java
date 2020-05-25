package com.p683ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.support.p030v4.view.C1056u;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.MarqueeView */
public class MarqueeView extends View {

    /* renamed from: a */
    protected TextPaint f81748a;

    /* renamed from: b */
    protected FontMetrics f81749b;

    /* renamed from: c */
    protected String f81750c;

    /* renamed from: d */
    protected int f81751d;

    /* renamed from: e */
    protected long f81752e;

    /* renamed from: f */
    protected float f81753f;

    /* renamed from: g */
    protected float f81754g;

    /* renamed from: h */
    protected int f81755h;

    /* renamed from: i */
    protected long f81756i;

    /* renamed from: j */
    protected boolean f81757j;

    /* renamed from: k */
    protected int f81758k;

    /* renamed from: b */
    public final void mo64087b() {
        if (this.f81755h != 1) {
            this.f81755h = 1;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f81755h == 0) {
            mo64088c();
        }
    }

    /* renamed from: c */
    public final void mo64088c() {
        if (this.f81755h != 2) {
            this.f81755h = 2;
            this.f81753f = 0.0f;
            this.f81756i = 0;
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo64085a() {
        if (this.f81755h != 0) {
            if (this.f81755h == 1) {
                this.f81755h = 0;
                invalidate();
                return;
            }
            if (this.f81755h == 2) {
                this.f81753f = 0.0f;
                this.f81756i = 0;
                this.f81755h = 0;
                invalidate();
            }
        }
    }

    public void setSpeed(int i) {
        this.f81751d = i;
    }

    public MarqueeView(Context context) {
        this(context, null);
    }

    public void setText(int i) {
        setText(getResources().getString(i));
    }

    public void setTextColor(int i) {
        if (this.f81748a != null) {
            this.f81748a.setColor(i);
        }
    }

    public void setTextShadow(int i) {
        if (this.f81748a != null) {
            this.f81748a.setShadowLayer(1.0f, 1.0f, 1.0f, i);
        }
    }

    public void setTextSize(int i) {
        if (this.f81748a != null) {
            this.f81748a.setTextSize((float) i);
        }
    }

    /* renamed from: a */
    public final void mo64086a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        this.f81750c = sb.toString();
        this.f81754g = this.f81748a.measureText(this.f81750c);
        while (this.f81754g < ((float) this.f81758k)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f81750c);
            sb2.append(this.f81750c);
            this.f81750c = sb2.toString();
            this.f81754g = this.f81748a.measureText(this.f81750c);
        }
        this.f81753f = 0.0f;
        this.f81756i = 0;
    }

    public void setText(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        this.f81750c = sb.toString();
        this.f81754g = this.f81748a.measureText(this.f81750c);
        while (this.f81754g < ((float) this.f81758k)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f81750c);
            sb2.append(this.f81750c);
            this.f81750c = sb2.toString();
            this.f81754g = this.f81748a.measureText(this.f81750c);
        }
        this.f81753f = 0.0f;
        this.f81756i = 0;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.f81750c)) {
            float f = 0.0f;
            if (this.f81754g != 0.0f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f81756i > 0) {
                    float f2 = ((float) ((uptimeMillis - this.f81756i) * ((long) this.f81751d))) / 1000.0f;
                    float f3 = this.f81753f;
                    if (this.f81757j) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                    this.f81753f = f3 + (f2 * ((float) i3));
                    this.f81753f %= this.f81754g;
                }
                if (this.f81755h == 0) {
                    this.f81756i = uptimeMillis;
                }
                this.f81748a.getFontMetrics(this.f81749b);
                while (true) {
                    float measuredWidth = (float) getMeasuredWidth();
                    float f4 = this.f81753f;
                    if (this.f81757j) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    if (f >= measuredWidth + (f4 * ((float) i))) {
                        break;
                    }
                    String str = this.f81750c;
                    float f5 = this.f81753f;
                    if (this.f81757j) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    canvas.drawText(str, f5 + (((float) i2) * f), -this.f81749b.top, this.f81748a);
                    f += this.f81754g;
                }
                if (this.f81755h == 0) {
                    postInvalidateDelayed(this.f81752e);
                }
            }
        }
    }

    public MarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        this.f81748a.getFontMetrics(this.f81749b);
        int i4 = (int) (this.f81749b.bottom - this.f81749b.top);
        if (!TextUtils.isEmpty(this.f81750c)) {
            i3 = (int) this.f81748a.measureText(this.f81750c);
        } else {
            i3 = 0;
        }
        if (MeasureSpec.getSize(i) <= i3) {
            i3 = MeasureSpec.getSize(i);
        }
        setMeasuredDimension(i3, i4);
        boolean z = true;
        if (C1056u.m3055f(this) != 1) {
            z = false;
        }
        this.f81757j = z;
    }

    public MarqueeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f81749b = new FontMetrics();
        this.f81751d = 25;
        this.f81752e = 16;
        this.f81758k = 0;
        this.f81748a = new TextPaint();
        this.f81748a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a2n, R.attr.a9i, R.attr.a9j, R.attr.a9k});
        this.f81751d = obtainStyledAttributes.getDimensionPixelSize(0, this.f81751d);
        int color = obtainStyledAttributes.getColor(1, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 28);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        obtainStyledAttributes.recycle();
        this.f81748a.setTextSize((float) dimensionPixelSize);
        this.f81748a.setShadowLayer(1.0f, 1.0f, 1.0f, color2);
        this.f81748a.setColor(color);
        Typeface a = C10749b.m21787a().mo19435a(C10751d.f28902a);
        if (a != null) {
            this.f81748a.setTypeface(a);
        }
        this.f81755h = 2;
        this.f81758k = context.getResources().getDimensionPixelSize(R.dimen.ys);
    }
}

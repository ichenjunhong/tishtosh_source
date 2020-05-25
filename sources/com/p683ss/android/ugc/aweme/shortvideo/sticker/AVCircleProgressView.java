package com.p683ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.AVCircleProgressView */
public final class AVCircleProgressView extends View {

    /* renamed from: a */
    private Paint f112631a;

    /* renamed from: b */
    private Paint f112632b;

    /* renamed from: c */
    private int f112633c;

    /* renamed from: d */
    private int f112634d;

    /* renamed from: e */
    private int f112635e;

    /* renamed from: f */
    private int f112636f;

    /* renamed from: g */
    private int f112637g;

    /* renamed from: h */
    private int f112638h;

    /* renamed from: i */
    private float f112639i;

    public AVCircleProgressView(Context context) {
        this(context, null, 2, null);
    }

    public final int getHeight$tools_avdmtview_tiktokI18nRelease() {
        return this.f112634d;
    }

    public final int getWidth$tools_avdmtview_tiktokI18nRelease() {
        return this.f112633c;
    }

    public final void setHeight$tools_avdmtview_tiktokI18nRelease(int i) {
        this.f112634d = i;
    }

    public final void setMaxProgress(int i) {
        this.f112636f = i;
    }

    public final void setStartAngle(int i) {
        this.f112637g = i;
    }

    public final void setWidth$tools_avdmtview_tiktokI18nRelease(int i) {
        this.f112633c = i;
    }

    public final void setProgress(int i) {
        this.f112635e = i;
        invalidate();
    }

    public final void setBgCircleColor(int i) {
        Paint paint = this.f112631a;
        if (paint == null) {
            C52711k.m112237a("bgPaint");
        }
        paint.setColor(i);
    }

    public final void setCircleWidth(int i) {
        Paint paint = this.f112632b;
        if (paint == null) {
            C52711k.m112237a("progressPaint");
        }
        paint.setStrokeWidth((float) i);
    }

    public final void setProgressColor(int i) {
        Paint paint = this.f112632b;
        if (paint == null) {
            C52711k.m112237a("progressPaint");
        }
        paint.setColor(i);
    }

    public final void setBgCircleWidth(int i) {
        this.f112638h = i / 2;
        Paint paint = this.f112631a;
        if (paint == null) {
            C52711k.m112237a("bgPaint");
        }
        paint.setStrokeWidth((float) i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = new RectF((float) this.f112638h, (float) this.f112638h, (float) (this.f112633c - this.f112638h), (float) (this.f112634d - this.f112638h));
        if (this.f112639i > 0.0f) {
            rectF = new RectF(((float) (this.f112633c / 2)) - this.f112639i, ((float) (this.f112634d / 2)) - this.f112639i, ((float) (this.f112633c / 2)) + this.f112639i, ((float) (this.f112633c / 2)) + this.f112639i);
        }
        RectF rectF2 = rectF;
        float f = (float) (this.f112637g - 90);
        float f2 = ((((float) this.f112635e) * 1.0f) / ((float) this.f112636f)) * 360.0f;
        Paint paint = this.f112632b;
        if (paint == null) {
            C52711k.m112237a("progressPaint");
        }
        canvas.drawArc(rectF2, f, f2, false, paint);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f112633c = MeasureSpec.getSize(i);
        this.f112634d = MeasureSpec.getSize(i2);
    }

    public AVCircleProgressView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        this.f112636f = 100;
        this.f112631a = new Paint();
        Paint paint = this.f112631a;
        if (paint == null) {
            C52711k.m112237a("bgPaint");
        }
        paint.setAntiAlias(true);
        Paint paint2 = this.f112631a;
        if (paint2 == null) {
            C52711k.m112237a("bgPaint");
        }
        paint2.setStyle(Style.STROKE);
        Paint paint3 = this.f112631a;
        if (paint3 == null) {
            C52711k.m112237a("bgPaint");
        }
        this.f112632b = new Paint(paint3);
        Paint paint4 = this.f112632b;
        if (paint4 == null) {
            C52711k.m112237a("progressPaint");
        }
        paint4.setStrokeCap(Cap.ROUND);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.acv});
            this.f112639i = obtainStyledAttributes.getDimension(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ AVCircleProgressView(Context context, AttributeSet attributeSet, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }
}

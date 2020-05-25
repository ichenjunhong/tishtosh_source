package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.p043v7.widget.AppCompatImageView;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.n */
public final class C45621n extends AppCompatImageView {

    /* renamed from: a */
    private int f115400a;

    /* renamed from: b */
    private int f115401b;

    /* renamed from: c */
    private Paint f115402c;

    /* renamed from: d */
    private float f115403d;

    /* renamed from: e */
    private RectF f115404e;

    public C45621n(Context context) {
        this(context, 0, 0);
    }

    public final void setColor(int i) {
        this.f115402c.setColor(i);
    }

    public final void setStrokeWidth(int i) {
        this.f115402c.setStrokeWidth((float) i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(this.f115404e, this.f115403d, this.f115403d, this.f115402c);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f115400a, this.f115401b);
    }

    /* renamed from: a */
    public final void mo92002a(int i, int i2) {
        this.f115400a = i;
        this.f115401b = i2;
        this.f115404e = new RectF(this.f115403d / 2.0f, this.f115403d / 2.0f, ((float) i) - (this.f115403d / 2.0f), ((float) i2) - (this.f115403d / 2.0f));
        invalidate();
    }

    private C45621n(Context context, int i, int i2) {
        super(context);
        this.f115400a = 0;
        this.f115401b = 0;
        this.f115402c = new Paint();
        this.f115402c.setStyle(Style.STROKE);
        this.f115402c.setColor(-1);
        float b = C9432q.m18687b(getContext(), 1.0f);
        this.f115403d = b;
        this.f115402c.setStrokeWidth(b);
    }
}

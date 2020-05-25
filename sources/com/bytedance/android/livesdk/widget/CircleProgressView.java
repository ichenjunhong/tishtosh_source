package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.trill.R;

public class CircleProgressView extends View {

    /* renamed from: a */
    private Paint f22989a;

    /* renamed from: b */
    private RectF f22990b = new RectF();

    /* renamed from: c */
    private float f22991c;

    /* renamed from: d */
    private int f22992d;

    /* renamed from: e */
    private boolean f22993e = true;

    /* renamed from: f */
    private float f22994f = 0.0f;

    public float getProgress() {
        return this.f22994f;
    }

    /* renamed from: a */
    private void m16666a() {
        this.f22991c = getResources().getDimension(R.dimen.rs);
        this.f22992d = getResources().getColor(R.color.a9p);
        this.f22989a = new Paint();
        this.f22989a.setAntiAlias(true);
        this.f22989a.setStyle(Style.STROKE);
        this.f22989a.setStrokeCap(Cap.ROUND);
        this.f22989a.setStrokeWidth(this.f22991c);
        this.f22989a.setColor(this.f22992d);
    }

    public void setClockWise(boolean z) {
        this.f22993e = z;
    }

    public void setBorderColor(int i) {
        this.f22992d = i;
        this.f22989a.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.f22991c = f;
        this.f22989a.setStrokeWidth(f);
    }

    public void setProgress(float f) {
        this.f22994f = f;
        invalidate();
    }

    public CircleProgressView(Context context) {
        super(context);
        m16666a();
    }

    public void draw(Canvas canvas) {
        float f;
        super.draw(canvas);
        RectF rectF = this.f22990b;
        if (this.f22993e) {
            f = -this.f22994f;
        } else {
            f = this.f22994f;
        }
        float f2 = f;
        canvas.drawArc(rectF, -90.0f, f2, false, this.f22989a);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16666a();
    }

    public CircleProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16666a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = (float) i;
        this.f22990b.set(this.f22991c / 2.0f, this.f22991c / 2.0f, f - (this.f22991c / 2.0f), f - (this.f22991c / 2.0f));
    }
}

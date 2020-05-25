package com.p683ss.android.ugc.aweme.notification.p2031ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.ui.LiveCircleView */
public class LiveCircleView extends View {

    /* renamed from: a */
    private Paint f97797a;

    /* renamed from: b */
    private float f97798b;

    /* renamed from: c */
    private Context f97799c;

    /* renamed from: d */
    private int f97800d;

    /* renamed from: e */
    private int f97801e;

    /* renamed from: f */
    private float f97802f;

    /* renamed from: g */
    private float f97803g;

    /* renamed from: h */
    private int f97804h;

    /* renamed from: i */
    private Paint f97805i;

    public void setStrokeWidth(int i) {
        this.f97798b = (float) i;
    }

    public LiveCircleView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle((float) this.f97800d, (float) this.f97801e, this.f97802f, this.f97797a);
        canvas.drawCircle((float) this.f97800d, (float) this.f97801e, this.f97803g, this.f97805i);
    }

    public void setFraction(float f) {
        this.f97803g = this.f97802f + (((float) this.f97804h) * f);
        this.f97805i.setStrokeWidth(this.f97798b * (1.0f - f));
        postInvalidate();
    }

    public LiveCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f97800d = getMeasuredWidth() / 2;
        this.f97801e = getMeasuredHeight() / 2;
        this.f97802f = (float) ((getMeasuredHeight() / 2) - getPaddingBottom());
        this.f97803g = this.f97802f;
        this.f97804h = getPaddingBottom();
    }

    public LiveCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.t0});
        this.f97798b = (float) ((int) obtainStyledAttributes.getDimension(0, C9432q.m18687b(context, 1.5f)));
        obtainStyledAttributes.recycle();
        this.f97799c = context;
        this.f97797a = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, Color.parseColor("#FF1764"), Color.parseColor("#ED3495"), TileMode.MIRROR);
        this.f97797a.setShader(linearGradient);
        this.f97797a.setAntiAlias(true);
        this.f97797a.setDither(true);
        this.f97797a.setStyle(Style.STROKE);
        this.f97797a.setStrokeWidth(C9432q.m18687b(context, 1.0f));
        this.f97805i = new Paint(this.f97797a);
    }
}

package com.p683ss.android.ugc.aweme.feed.p1736ui;

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

/* renamed from: com.ss.android.ugc.aweme.feed.ui.LiveCircleView */
public class LiveCircleView extends View {

    /* renamed from: a */
    public Paint f80429a;

    /* renamed from: b */
    public Paint f80430b;

    /* renamed from: c */
    private float f80431c;

    /* renamed from: d */
    private Context f80432d;

    /* renamed from: e */
    private int f80433e;

    /* renamed from: f */
    private int f80434f;

    /* renamed from: g */
    private float f80435g;

    /* renamed from: h */
    private float f80436h;

    /* renamed from: i */
    private int f80437i;

    public void setStrokeWidth(int i) {
        this.f80431c = (float) i;
    }

    public LiveCircleView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle((float) this.f80433e, (float) this.f80434f, this.f80435g, this.f80429a);
        canvas.drawCircle((float) this.f80433e, (float) this.f80434f, this.f80436h, this.f80430b);
    }

    public void setFraction(float f) {
        this.f80436h = this.f80435g + (((float) this.f80437i) * f);
        this.f80430b.setStrokeWidth(this.f80431c * (1.0f - f));
        postInvalidate();
    }

    public LiveCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f80433e = getMeasuredWidth() / 2;
        this.f80434f = getMeasuredHeight() / 2;
        this.f80435g = (float) ((getMeasuredHeight() / 2) - getPaddingBottom());
        this.f80436h = this.f80435g;
        this.f80437i = getPaddingBottom();
    }

    public LiveCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.t0});
        this.f80431c = (float) ((int) obtainStyledAttributes.getDimension(0, C9432q.m18687b(context, 1.5f)));
        obtainStyledAttributes.recycle();
        this.f80432d = context;
        this.f80429a = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, Color.parseColor("#FF1764"), Color.parseColor("#ED3495"), TileMode.MIRROR);
        this.f80429a.setShader(linearGradient);
        this.f80429a.setAntiAlias(true);
        this.f80429a.setDither(true);
        this.f80429a.setStyle(Style.STROKE);
        this.f80429a.setStrokeWidth(C9432q.m18687b(context, 1.0f));
        this.f80430b = new Paint(this.f80429a);
    }
}

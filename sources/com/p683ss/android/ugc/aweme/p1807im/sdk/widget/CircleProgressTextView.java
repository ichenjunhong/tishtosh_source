package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.ss.android.ugc.trill.R;
import java.text.NumberFormat;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.CircleProgressTextView */
public class CircleProgressTextView extends View {

    /* renamed from: a */
    private boolean f90738a;

    /* renamed from: b */
    private float f90739b;

    /* renamed from: c */
    private float f90740c;

    /* renamed from: d */
    private float f90741d;

    /* renamed from: e */
    private String f90742e;

    /* renamed from: f */
    private int f90743f;

    /* renamed from: g */
    private int f90744g;

    /* renamed from: h */
    private int f90745h;

    /* renamed from: i */
    private Paint f90746i;

    /* renamed from: j */
    private Paint f90747j;

    /* renamed from: k */
    private Paint f90748k;

    /* renamed from: l */
    private RectF f90749l;

    /* renamed from: m */
    private NumberFormat f90750m;

    public void setText(String str) {
        this.f90742e = str;
    }

    public CircleProgressTextView(Context context) {
        this(context, null);
    }

    public void setHintProgressWidth(float f) {
        this.f90747j.setStrokeWidth(f);
    }

    public void setProgressWidth(float f) {
        this.f90740c = f;
        this.f90746i.setStrokeWidth(this.f90740c);
    }

    public void setTextSize(float f) {
        this.f90741d = f;
        this.f90748k.setTextSize(this.f90741d);
    }

    public void setHintProgressColor(int i) {
        this.f90744g = i;
        if (this.f90747j == null) {
            this.f90747j = new Paint(1);
        }
        this.f90747j.setStrokeWidth(this.f90740c);
        this.f90747j.setColor(this.f90744g);
    }

    public void setProgressColor(int i) {
        this.f90743f = i;
        if (this.f90746i == null) {
            this.f90746i = new Paint(1);
        }
        this.f90746i.setColor(this.f90743f);
    }

    public void setTextColor(int i) {
        this.f90745h = i;
        if (this.f90748k == null) {
            this.f90748k = new Paint(1);
        }
        this.f90748k.setColor(this.f90745h);
    }

    public void setProgress(double d) {
        if (d > 1.0d) {
            d = 1.0d;
        }
        double max = Math.max(d, ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        if (this.f90750m == null) {
            this.f90750m = NumberFormat.getPercentInstance();
            this.f90750m.setMinimumFractionDigits(0);
        }
        this.f90739b = (float) max;
        setText(this.f90750m.format(max));
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f90738a) {
            int width = getWidth();
            int height = getHeight();
            if (this.f90749l == null) {
                this.f90749l = new RectF();
            }
            float f = this.f90740c / 2.0f;
            this.f90749l.left = f;
            this.f90749l.right = ((float) width) - f;
            this.f90749l.top = f;
            this.f90749l.bottom = ((float) height) - f;
            this.f90738a = true;
        }
        this.f90746i.setColor(this.f90743f);
        this.f90747j.setColor(this.f90744g);
        float f2 = this.f90739b * 360.0f;
        canvas.drawArc(this.f90749l, -90.0f, f2, false, this.f90746i);
        canvas.drawArc(this.f90749l, f2 - 0.049804688f, 360.0f - f2, false, this.f90747j);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f90742e, (float) ((int) ((((float) canvas.getWidth()) - this.f90748k.measureText(this.f90742e)) / 2.0f)), (float) ((int) ((((float) canvas.getHeight()) / 2.0f) - ((this.f90748k.descent() + this.f90748k.ascent()) / 2.0f))), this.f90748k);
    }

    public CircleProgressTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleProgressTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f90740c = 10.0f;
        this.f90741d = 20.0f;
        this.f90742e = "";
        this.f90743f = -1;
        this.f90745h = -16776961;
        this.f90746i = new Paint(1);
        this.f90746i.setStyle(Style.STROKE);
        this.f90747j = new Paint(1);
        this.f90747j.setStyle(Style.STROKE);
        this.f90748k = new Paint(1);
        this.f90749l = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.nf, R.attr.wc, R.attr.wd, R.attr.a67, R.attr.a6e});
        this.f90740c = (float) obtainStyledAttributes.getDimensionPixelSize(2, 10);
        this.f90743f = obtainStyledAttributes.getColor(1, -1);
        this.f90741d = (float) obtainStyledAttributes.getDimensionPixelSize(4, 15);
        this.f90745h = obtainStyledAttributes.getColor(3, -16776961);
        this.f90744g = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        setProgressWidth(this.f90740c);
        setProgressColor(this.f90743f);
        setHintProgressWidth(this.f90740c);
        setHintProgressColor(this.f90744g);
        setTextSize(this.f90741d);
        setTextColor(this.f90745h);
    }
}

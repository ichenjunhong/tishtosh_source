package com.zhihu.matisse.internal.p2254ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.p035a.C0720f;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.ss.android.ugc.trill.R;

/* renamed from: com.zhihu.matisse.internal.ui.widget.CheckView */
public class CheckView extends View {

    /* renamed from: a */
    private boolean f130814a;

    /* renamed from: b */
    private boolean f130815b;

    /* renamed from: c */
    private int f130816c;

    /* renamed from: d */
    private Paint f130817d;

    /* renamed from: e */
    private Paint f130818e;

    /* renamed from: f */
    private TextPaint f130819f;

    /* renamed from: g */
    private Paint f130820g;

    /* renamed from: h */
    private Drawable f130821h;

    /* renamed from: i */
    private float f130822i;

    /* renamed from: j */
    private Rect f130823j;

    /* renamed from: k */
    private boolean f130824k = true;

    private Rect getCheckRect() {
        if (this.f130823j == null) {
            int i = (int) (((this.f130822i * 48.0f) / 2.0f) - ((this.f130822i * 16.0f) / 2.0f));
            float f = (float) i;
            this.f130823j = new Rect(i, i, (int) ((this.f130822i * 48.0f) - f), (int) ((this.f130822i * 48.0f) - f));
        }
        return this.f130823j;
    }

    /* renamed from: a */
    private void m112022a() {
        if (this.f130818e == null) {
            this.f130818e = new Paint();
            this.f130818e.setAntiAlias(true);
            this.f130818e.setStyle(Style.FILL);
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.pc});
            int color = obtainStyledAttributes.getColor(0, C0720f.m2076b(getResources(), R.color.ati, getContext().getTheme()));
            obtainStyledAttributes.recycle();
            this.f130818e.setColor(color);
        }
    }

    public void setCountable(boolean z) {
        this.f130814a = z;
    }

    public CheckView(Context context) {
        super(context);
        m112023a(context);
    }

    public void setEnabled(boolean z) {
        if (this.f130824k != z) {
            this.f130824k = z;
            invalidate();
        }
    }

    public void setChecked(boolean z) {
        if (!this.f130814a) {
            this.f130815b = z;
            invalidate();
            return;
        }
        throw new IllegalStateException("CheckView is countable, call setCheckedNum() instead.");
    }

    public void setCheckedNum(int i) {
        if (!this.f130814a) {
            throw new IllegalStateException("CheckView is not countable, call setChecked() instead.");
        } else if (i == Integer.MIN_VALUE || i > 0) {
            this.f130816c = i;
            invalidate();
        } else {
            throw new IllegalArgumentException("checked num can't be negative.");
        }
    }

    /* renamed from: a */
    private void m112023a(Context context) {
        this.f130822i = context.getResources().getDisplayMetrics().density;
        this.f130817d = new Paint();
        this.f130817d.setAntiAlias(true);
        this.f130817d.setStyle(Style.STROKE);
        this.f130817d.setXfermode(new PorterDuffXfermode(Mode.SRC_OVER));
        this.f130817d.setStrokeWidth(this.f130822i * 3.0f);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.pd});
        int color = obtainStyledAttributes.getColor(0, C0720f.m2076b(getResources(), R.color.atj, getContext().getTheme()));
        obtainStyledAttributes.recycle();
        this.f130817d.setColor(color);
        this.f130821h = C0720f.m2075a(context.getResources(), 2131953183, context.getTheme());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.f130820g == null) {
            this.f130820g = new Paint();
            this.f130820g.setAntiAlias(true);
            Paint paint = this.f130820g;
            RadialGradient radialGradient = new RadialGradient((this.f130822i * 48.0f) / 2.0f, (this.f130822i * 48.0f) / 2.0f, this.f130822i * 19.0f, new int[]{Color.parseColor("#00000000"), Color.parseColor("#0D000000"), Color.parseColor("#0D000000"), Color.parseColor("#00000000")}, new float[]{0.21052632f, 0.5263158f, 0.68421054f, 1.0f}, TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        canvas.drawCircle((this.f130822i * 48.0f) / 2.0f, (this.f130822i * 48.0f) / 2.0f, this.f130822i * 19.0f, this.f130820g);
        canvas.drawCircle((this.f130822i * 48.0f) / 2.0f, (this.f130822i * 48.0f) / 2.0f, this.f130822i * 11.5f, this.f130817d);
        if (this.f130814a) {
            if (this.f130816c != Integer.MIN_VALUE) {
                m112022a();
                canvas.drawCircle((this.f130822i * 48.0f) / 2.0f, (this.f130822i * 48.0f) / 2.0f, this.f130822i * 11.0f, this.f130818e);
                if (this.f130819f == null) {
                    this.f130819f = new TextPaint();
                    this.f130819f.setAntiAlias(true);
                    this.f130819f.setColor(-1);
                    this.f130819f.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                    this.f130819f.setTextSize(this.f130822i * 12.0f);
                }
                String valueOf = String.valueOf(this.f130816c);
                canvas.drawText(valueOf, (float) (((int) (((float) canvas.getWidth()) - this.f130819f.measureText(valueOf))) / 2), (float) (((int) ((((float) canvas.getHeight()) - this.f130819f.descent()) - this.f130819f.ascent())) / 2), this.f130819f);
            }
        } else if (this.f130815b) {
            m112022a();
            canvas.drawCircle((this.f130822i * 48.0f) / 2.0f, (this.f130822i * 48.0f) / 2.0f, this.f130822i * 11.0f, this.f130818e);
            this.f130821h.setBounds(getCheckRect());
            this.f130821h.draw(canvas);
        }
        if (this.f130824k) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        setAlpha(f);
    }

    public CheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m112023a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec((int) (this.f130822i * 48.0f), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public CheckView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m112023a(context);
    }
}

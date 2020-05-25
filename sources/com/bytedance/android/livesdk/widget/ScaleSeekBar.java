package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.p043v7.widget.AppCompatSeekBar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.ss.android.ugc.trill.R;

public class ScaleSeekBar extends AppCompatSeekBar {

    /* renamed from: a */
    private final Paint f23187a;

    /* renamed from: b */
    private final float f23188b;

    /* renamed from: c */
    private String f23189c;

    /* renamed from: d */
    private String f23190d;

    /* renamed from: e */
    private int f23191e;

    /* renamed from: f */
    private float f23192f;

    /* renamed from: g */
    private float f23193g;

    public ScaleSeekBar(Context context) {
        this(context, null);
    }

    public synchronized void onDraw(Canvas canvas) {
        int bottom = getBottom();
        int top = getTop();
        setBottom((int) (((float) bottom) - ((this.f23188b + ((float) getPaddingTop())) + this.f23193g)));
        setTop((int) (((float) top) + this.f23188b + ((float) getPaddingTop()) + this.f23193g));
        canvas.save();
        canvas.translate(0.0f, this.f23188b + ((float) getPaddingTop()) + this.f23193g);
        super.onDraw(canvas);
        canvas.restore();
        setBottom(bottom);
        setTop(top);
        int progress = getProgress();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23190d);
        sb.append(String.valueOf(progress));
        sb.append(this.f23189c);
        String sb2 = sb.toString();
        if (!C4206c.m10426a(getContext()) || VERSION.SDK_INT < 17) {
            canvas.drawText(sb2, ((float) (((((getWidth() - getPaddingLeft()) - getPaddingRight()) * progress) / 100) + getPaddingLeft())) - (this.f23187a.measureText(sb2) / 2.0f), this.f23188b + ((float) getPaddingTop()), this.f23187a);
        } else {
            canvas.drawText(sb2, ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) - (((float) (((((getWidth() - getPaddingLeft()) - getPaddingRight()) * progress) / 100) - getPaddingStart())) + (this.f23187a.measureText(sb2) / 2.0f)), this.f23188b + ((float) getPaddingTop()), this.f23187a);
        }
    }

    public ScaleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            measuredHeight = ((int) (((this.f23187a.descent() - this.f23187a.ascent()) + this.f23193g) * 2.0f)) + getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public ScaleSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23191e = -1;
        this.f23192f = 30.0f;
        this.f23193g = 10.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a93, R.attr.a94, R.attr.a95, R.attr.a96, R.attr.a97});
        if (obtainStyledAttributes != null) {
            this.f23191e = obtainStyledAttributes.getColor(0, -1);
            this.f23192f = obtainStyledAttributes.getDimension(3, 30.0f);
            this.f23193g = obtainStyledAttributes.getDimension(2, 10.0f);
            this.f23190d = obtainStyledAttributes.getString(4);
            if (TextUtils.isEmpty(this.f23190d)) {
                this.f23190d = "";
            }
            this.f23189c = obtainStyledAttributes.getString(1);
            if (TextUtils.isEmpty(this.f23189c)) {
                this.f23189c = "";
            }
            obtainStyledAttributes.recycle();
        }
        this.f23187a = new Paint();
        this.f23187a.setColor(this.f23191e);
        this.f23187a.setTextSize(this.f23192f);
        this.f23187a.setAntiAlias(true);
        this.f23188b = this.f23187a.descent() - this.f23187a.ascent();
    }
}

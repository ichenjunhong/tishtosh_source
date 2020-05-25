package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.ProgressBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar */
public class NewVideoPlayerProgressbar extends ProgressBar {

    /* renamed from: a */
    private Paint f113651a;

    /* renamed from: b */
    private float f113652b;

    /* renamed from: c */
    private int f113653c;

    /* renamed from: d */
    private int f113654d;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public final void mo91071a() {
        setProgress(0);
    }

    public ObjectAnimator getHideAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    public ObjectAnimator getShowAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
    }

    public void setReachedBarColor(int i) {
        this.f113654d = i;
    }

    public void setReachedProgressBarHeight(float f) {
        this.f113652b = f;
    }

    public NewVideoPlayerProgressbar(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        float progress = (float) ((int) (((float) this.f113653c) * ((((float) getProgress()) * 1.0f) / ((float) getMax()))));
        if (progress > 0.0f) {
            this.f113651a.setColor(this.f113654d);
            this.f113651a.setStrokeWidth(this.f113652b);
            canvas.drawLine(0.0f, (float) (getHeight() / 2), progress, (float) (getHeight() / 2), this.f113651a);
        }
        canvas.restore();
    }

    public NewVideoPlayerProgressbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + Math.max(this.f113652b, Math.abs(this.f113651a.descent() - this.f113651a.ascent())));
            if (mode == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
        this.f113653c = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
    }

    public NewVideoPlayerProgressbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f113651a = new Paint();
        this.f113652b = (float) ((int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.yc, R.attr.yd});
        this.f113654d = obtainStyledAttributes.getColor(0, -261935);
        this.f113652b = obtainStyledAttributes.getDimension(1, this.f113652b);
        obtainStyledAttributes.recycle();
    }
}

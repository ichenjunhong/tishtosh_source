package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.views.TextSeekBar */
public class TextSeekBar extends LinearLayout {

    /* renamed from: a */
    private TextView f121184a;

    /* renamed from: b */
    private SeekBar f121185b;

    /* renamed from: c */
    private boolean f121186c = true;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f121184a = (TextView) getChildAt(0);
        this.f121185b = (SeekBar) getChildAt(1);
    }

    /* renamed from: a */
    private void m104403a() {
        int paddingLeft = this.f121185b.getPaddingLeft();
        int measuredWidth = (this.f121185b.getMeasuredWidth() - paddingLeft) - this.f121185b.getPaddingRight();
        int progress = this.f121185b.getProgress();
        this.f121184a.setText(String.valueOf(progress));
        double d = (double) progress;
        Double.isNaN(d);
        double d2 = d / 100.0d;
        int measuredWidth2 = this.f121184a.getMeasuredWidth();
        double d3 = (double) paddingLeft;
        double d4 = (double) measuredWidth;
        Double.isNaN(d4);
        double d5 = d2 * d4;
        Double.isNaN(d3);
        double d6 = d3 + d5;
        double d7 = (double) measuredWidth2;
        Double.isNaN(d7);
        double d8 = d6 - (d7 / 2.0d);
        LayoutParams layoutParams = new LayoutParams(this.f121184a.getLayoutParams());
        layoutParams.leftMargin = (int) d8;
        this.f121184a.setLayoutParams(layoutParams);
    }

    public TextSeekBar(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent) {
            m104403a();
        }
        return dispatchTouchEvent;
    }

    public TextSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f121185b.getMeasuredWidth() != 0 && this.f121186c) {
            m104403a();
            this.f121186c = false;
        }
    }
}

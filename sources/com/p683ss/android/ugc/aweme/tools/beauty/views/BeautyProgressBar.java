package com.p683ss.android.ugc.aweme.tools.beauty.views;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautyProgressBar */
public final class BeautyProgressBar extends FilterBeautySeekBar {

    /* renamed from: c */
    public boolean f118475c;

    /* renamed from: d */
    private int f118476d;

    /* renamed from: e */
    private int f118477e;

    public final int getMaxValue() {
        return this.f118477e;
    }

    public final int getMinValue() {
        return this.f118476d;
    }

    public final int getProgress() {
        String str;
        int progress = super.getProgress();
        if (this.f118475c) {
            float f = (float) progress;
            if (f >= ((float) getMax()) / 2.0f) {
                str = String.valueOf((int) (((((float) this.f118477e) / (((float) getMax()) / 2.0f)) * f) - ((float) this.f118477e)));
            } else {
                str = String.valueOf((int) ((((-((float) this.f118476d)) / (((float) getMax()) / 2.0f)) * f) + ((float) this.f118476d)));
            }
        } else {
            str = String.valueOf((int) (((((float) (this.f118477e - this.f118476d)) / ((float) getMax())) * ((float) progress)) + ((float) this.f118476d)));
        }
        this.f82874a = str;
        return progress;
    }

    public final void setDoubleDirection(boolean z) {
        this.f118475c = z;
    }

    public final void setMaxValue(int i) {
        this.f118477e = i;
    }

    public final void setMinValue(int i) {
        this.f118476d = i;
    }

    public BeautyProgressBar(Context context) {
        super(context);
        m101909a(context);
    }

    public final void setTextColor(int i) {
        Paint paint = this.f82875b;
        C52711k.m112236a((Object) paint, "mPaint");
        paint.setColor(i);
        invalidate();
    }

    public final synchronized void setProgress(int i) {
        int progress = super.getProgress();
        super.setProgress(i);
        if (progress == super.getProgress()) {
            invalidate();
        }
    }

    /* renamed from: a */
    private final void m101909a(Context context) {
        if (context != null) {
            Paint paint = this.f82875b;
            C52711k.m112236a((Object) paint, "mPaint");
            paint.setColor(context.getResources().getColor(R.color.awk));
            Paint paint2 = this.f82875b;
            C52711k.m112236a((Object) paint2, "mPaint");
            paint2.setFakeBoldText(true);
        }
    }

    public BeautyProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m101909a(context);
    }

    public BeautyProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m101909a(context);
    }
}

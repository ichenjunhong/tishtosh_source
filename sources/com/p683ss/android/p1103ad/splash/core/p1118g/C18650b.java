package com.p683ss.android.p1103ad.splash.core.p1118g;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: com.ss.android.ad.splash.core.g.b */
public final class C18650b extends MetricAffectingSpan {

    /* renamed from: a */
    private int f51551a;

    public C18650b(int i) {
        this.f51551a = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += this.f51551a;
    }

    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += this.f51551a;
    }
}

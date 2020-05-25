package com.p683ss.android.ugc.aweme.account.views;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* renamed from: com.ss.android.ugc.aweme.account.views.c */
public abstract class C22313c extends ClickableSpan {

    /* renamed from: a */
    private int f60107a;

    /* renamed from: b */
    private int f60108b;

    /* renamed from: d */
    public boolean f60109d;

    public void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        if (this.f60109d) {
            i = this.f60108b;
        } else {
            i = this.f60107a;
        }
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
    }

    public C22313c(int i, int i2) {
        this.f60107a = i;
        this.f60108b = i2;
    }
}

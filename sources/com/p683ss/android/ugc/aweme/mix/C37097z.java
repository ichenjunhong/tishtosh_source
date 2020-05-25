package com.p683ss.android.ugc.aweme.mix;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.z */
public final class C37097z extends ClickableSpan {
    public final void onClick(View view) {
        C52711k.m112240b(view, "widget");
    }

    public final void updateDrawState(TextPaint textPaint) {
        C52711k.m112240b(textPaint, "ds");
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}

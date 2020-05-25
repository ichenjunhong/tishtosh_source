package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ay */
public final class C35212ay {

    /* renamed from: a */
    public static final C35212ay f90498a = new C35212ay();

    private C35212ay() {
    }

    /* renamed from: a */
    public static final SpannableStringBuilder m79598a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        C52711k.m112240b(spannableStringBuilder, "spannableStringBuilder");
        C52711k.m112240b(textPaint, "paint");
        return m79599a(spannableStringBuilder, textPaint, i, i2, i3, i4, true);
    }

    /* renamed from: a */
    private static SpannableStringBuilder m79599a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4, boolean z) {
        C52711k.m112240b(spannableStringBuilder, "spannableStringBuilder");
        C52711k.m112240b(textPaint, "paint");
        CharSequence charSequence = spannableStringBuilder;
        DynamicLayout dynamicLayout = new DynamicLayout(charSequence, textPaint, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            return spannableStringBuilder;
        }
        String str = "...";
        float measureText = ((float) i) - (textPaint.measureText(str) + ((float) i4));
        int lineStart = dynamicLayout.getLineStart(i2 - 1);
        while (lineStart < spannableStringBuilder.length() - i3 && 10 != spannableStringBuilder.charAt(lineStart)) {
            int i5 = lineStart + 1;
            measureText -= textPaint.measureText(charSequence, lineStart, i5);
            if (measureText <= 0.0f) {
                break;
            }
            lineStart = i5;
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length() - i3, spannableStringBuilder.length());
        C52711k.m112236a((Object) subSequence, "spannableStringBuilder.s…ableStringBuilder.length)");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, lineStart));
        spannableStringBuilder2.append(str);
        spannableStringBuilder2.append(subSequence);
        return spannableStringBuilder2;
    }
}

package com.p683ss.android.ugc.aweme.p1323ae.p1326c;

import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;

/* renamed from: com.ss.android.ugc.aweme.ae.c.b */
public final class C22473b {
    /* renamed from: a */
    public static SpannableStringBuilder m55522a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        return m55523a(spannableStringBuilder, textPaint, i, i2, i3, i4, true);
    }

    /* renamed from: a */
    private static SpannableStringBuilder m55523a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4, boolean z) {
        DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, textPaint, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            return spannableStringBuilder;
        }
        String str = "... ";
        float measureText = ((float) i) - (textPaint.measureText(str) + ((float) i4));
        int lineStart = dynamicLayout.getLineStart(i2 - 1);
        while (lineStart < spannableStringBuilder.length() - i3 && 10 != spannableStringBuilder.charAt(lineStart)) {
            int i5 = lineStart + 1;
            measureText -= textPaint.measureText(spannableStringBuilder, lineStart, i5);
            if (measureText <= 0.0f) {
                break;
            }
            lineStart = i5;
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length() - i3, spannableStringBuilder.length());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, lineStart));
        spannableStringBuilder2.append(str);
        spannableStringBuilder2.append(subSequence);
        return spannableStringBuilder2;
    }
}

package com.p683ss.android.ugc.aweme.p1308ad.utils;

import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.c */
public final class C22435c {

    /* renamed from: a */
    public static final C22435c f60435a = new C22435c();

    private C22435c() {
    }

    /* renamed from: a */
    public static final SpannableStringBuilder m55467a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4, boolean z) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        TextPaint textPaint2 = textPaint;
        int i5 = i2;
        C52711k.m112240b(spannableStringBuilder, "spannableStringBuilder");
        C52711k.m112240b(textPaint, "paint");
        CharSequence charSequence = spannableStringBuilder2;
        DynamicLayout dynamicLayout = new DynamicLayout(charSequence, textPaint, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() > i5) {
            String str = "... ";
            float measureText = ((float) i) - ((textPaint.measureText(str) + ((float) i4)) + C9432q.m18687b(C11010c.m22280a(), 1.0f));
            int lineStart = dynamicLayout.getLineStart(i5 - 1);
            while (lineStart < spannableStringBuilder.length() - i3 && 10 != spannableStringBuilder.charAt(lineStart)) {
                int i6 = lineStart + 1;
                measureText -= textPaint.measureText(charSequence, lineStart, i6);
                if (measureText <= 0.0f) {
                    break;
                }
                lineStart = i6;
            }
            CharSequence subSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length() - i3, spannableStringBuilder.length());
            C52711k.m112236a((Object) subSequence, "spannableStringBuilder.s…ableStringBuilder.length)");
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, lineStart));
            spannableStringBuilder3.append(str);
            spannableStringBuilder3.append(subSequence);
            return spannableStringBuilder3;
        } else if (z || spannableStringBuilder.length() <= i3 + 2) {
            return spannableStringBuilder2;
        } else {
            int lineStart2 = dynamicLayout.getLineStart(dynamicLayout.getLineCount() - 1);
            int length = spannableStringBuilder.length() - i3;
            if (lineStart2 != length - 1 && lineStart2 != length) {
                return spannableStringBuilder2;
            }
            int i7 = length - 2;
            CharSequence subSequence2 = spannableStringBuilder.subSequence(i7, spannableStringBuilder.length());
            C52711k.m112236a((Object) subSequence2, "spannableStringBuilder.s…ableStringBuilder.length)");
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, i7));
            spannableStringBuilder4.append("\n");
            spannableStringBuilder4.append(subSequence2);
            return spannableStringBuilder4;
        }
    }
}

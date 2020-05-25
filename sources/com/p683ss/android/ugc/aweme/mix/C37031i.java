package com.p683ss.android.ugc.aweme.mix;

import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.TextPaint;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.challenge.C24526a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.i */
public final class C37031i extends C24526a {

    /* renamed from: b */
    public boolean f94572b;

    /* renamed from: c */
    private TextPaint f94573c;

    /* renamed from: d */
    private int f94574d;

    /* renamed from: e */
    private int f94575e = 4;

    /* renamed from: f */
    private boolean f94576f;

    /* renamed from: g */
    private String f94577g;

    /* renamed from: a */
    public final SpannableString mo50296a(SpannableString spannableString) {
        if (!this.f94576f) {
            return spannableString;
        }
        DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), this.f94573c, this.f94574d, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= this.f94575e) {
            return spannableString;
        }
        int i = 1;
        this.f94572b = true;
        TextPaint textPaint = this.f94573c;
        StringBuilder sb = new StringBuilder("...");
        sb.append(this.f94577g);
        float measureText = textPaint.measureText(sb.toString()) + 0.0f + C9432q.m18687b(C11010c.m22280a(), 17.0f);
        int lineStart = dynamicLayout.getLineStart(this.f94575e) - 1;
        int i2 = (int) (((float) this.f94574d) - measureText);
        float measureText2 = this.f94573c.measureText(spannableString.subSequence(dynamicLayout.getLineStart(this.f94575e - 1), lineStart).toString());
        float f = (float) i2;
        if (measureText2 > f) {
            float f2 = measureText2 - f;
            while (i < 15 && this.f94573c.measureText(spannableString.subSequence(lineStart - i, lineStart).toString()) <= f2) {
                i++;
            }
        } else {
            i = 0;
        }
        C52711k.m112240b(spannableString, "spannableString");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(spannableString.subSequence(0, lineStart - i));
        sb2.append("...");
        return new SpannableString(sb2.toString());
    }

    public C37031i(TextPaint textPaint, int i, boolean z, String str, int i2) {
        this.f94573c = textPaint;
        this.f94574d = i;
        this.f94577g = str;
        this.f94576f = true;
        this.f94575e = 2;
    }
}

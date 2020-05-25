package com.p683ss.android.ugc.aweme.shortvideo.festival;

import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.TextPaint;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.challenge.C24526a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.k */
public final class C43823k extends C24526a {

    /* renamed from: b */
    public boolean f110977b;

    /* renamed from: c */
    private TextPaint f110978c;

    /* renamed from: d */
    private int f110979d;

    /* renamed from: e */
    private int f110980e = 4;

    /* renamed from: f */
    private boolean f110981f;

    /* renamed from: g */
    private String f110982g;

    /* renamed from: a */
    public final SpannableString mo50296a(SpannableString spannableString) {
        if (!this.f110981f) {
            return spannableString;
        }
        DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), this.f110978c, this.f110979d, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= this.f110980e) {
            return spannableString;
        }
        int i = 1;
        this.f110977b = true;
        TextPaint textPaint = this.f110978c;
        StringBuilder sb = new StringBuilder("...");
        sb.append(this.f110982g);
        float measureText = textPaint.measureText(sb.toString()) + C9432q.m18687b(C11010c.m22280a(), 13.0f);
        int lineStart = dynamicLayout.getLineStart(this.f110980e) - 1;
        int i2 = (int) (((float) this.f110979d) - measureText);
        float measureText2 = this.f110978c.measureText(spannableString.subSequence(dynamicLayout.getLineStart(this.f110980e - 1), lineStart).toString());
        float f = (float) i2;
        if (measureText2 > f) {
            float f2 = measureText2 - f;
            while (i < 15 && this.f110978c.measureText(spannableString.subSequence(lineStart - i, lineStart).toString()) <= f2) {
                i++;
            }
        } else {
            i = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(spannableString.subSequence(0, lineStart - i));
        sb2.append("...");
        return new SpannableString(sb2.toString());
    }

    public C43823k(TextPaint textPaint, int i, boolean z, String str) {
        this.f110978c = textPaint;
        this.f110979d = i;
        this.f110982g = str;
        this.f110981f = z;
    }
}

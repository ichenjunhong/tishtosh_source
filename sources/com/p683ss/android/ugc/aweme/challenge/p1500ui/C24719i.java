package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.TextPaint;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.challenge.C24526a;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.i */
public final class C24719i extends C24526a {

    /* renamed from: b */
    public boolean f65461b;

    /* renamed from: c */
    private TextPaint f65462c;

    /* renamed from: d */
    private int f65463d;

    /* renamed from: e */
    private int f65464e = 4;

    /* renamed from: f */
    private boolean f65465f;

    /* renamed from: g */
    private String f65466g;

    /* renamed from: a */
    public final SpannableString mo50296a(SpannableString spannableString) {
        if (!this.f65465f) {
            return spannableString;
        }
        DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), this.f65462c, this.f65463d, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= this.f65464e) {
            return spannableString;
        }
        int i = 1;
        this.f65461b = true;
        TextPaint textPaint = this.f65462c;
        StringBuilder sb = new StringBuilder("...");
        sb.append(this.f65466g);
        float measureText = textPaint.measureText(sb.toString()) + 45.0f + C9432q.m18687b(C11010c.m22280a(), 5.0f);
        int lineStart = dynamicLayout.getLineStart(this.f65464e) - 1;
        int i2 = (int) (((float) this.f65463d) - measureText);
        float measureText2 = this.f65462c.measureText(spannableString.subSequence(dynamicLayout.getLineStart(this.f65464e - 1), lineStart).toString());
        float f = (float) i2;
        if (measureText2 > f) {
            float f2 = measureText2 - f;
            while (i < 15 && this.f65462c.measureText(spannableString.subSequence(lineStart - i, lineStart).toString()) <= f2) {
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

    public C24719i(TextPaint textPaint, int i, boolean z, String str, int i2) {
        this.f65462c = textPaint;
        this.f65463d = i;
        this.f65466g = str;
        this.f65465f = z;
        this.f65464e = i2;
    }
}

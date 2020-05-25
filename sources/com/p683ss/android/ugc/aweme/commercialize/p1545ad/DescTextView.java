package com.p683ss.android.ugc.aweme.commercialize.p1545ad;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.bytedance.ies.dmt.p664ui.common.C10674a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.DescTextView */
public final class DescTextView extends DmtTextView {

    /* renamed from: b */
    public String f67744b;

    /* renamed from: c */
    public boolean f67745c;

    /* renamed from: d */
    private int f67746d;

    /* renamed from: e */
    private String f67747e;

    /* renamed from: f */
    private int f67748f;

    public DescTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DescTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getImageSpanXAxisAdjust() {
        return this.f67748f;
    }

    public final String getMoreString() {
        return this.f67747e;
    }

    private final int getDotWidth() {
        return (int) getPaint().measureText(this.f67744b);
    }

    private final int getSpanWidth() {
        Drawable drawable = new C10674a(getContext(), this.f67746d).getDrawable();
        C52711k.m112236a((Object) drawable, "drawable");
        return drawable.getIntrinsicWidth();
    }

    public final void setDescLightDrawable(int i) {
        this.f67746d = i;
    }

    public final void setImageSpanXAxisAdjust(int i) {
        this.f67748f = i;
    }

    public final void setMoreString(String str) {
        C52711k.m112240b(str, "value");
        this.f67747e = str;
        invalidate();
    }

    public final void setViewLineHeight(int i) {
        if (i >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            if (i != fontMetricsInt) {
                setLineSpacing((float) (i - fontMetricsInt), 1.0f);
            }
        }
    }

    /* renamed from: a */
    private final SpannableString m62128a(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(C52830p.m112459d(str).toString());
            sb.append(' ');
            String sb2 = sb.toString();
            if (this.f67745c) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(' ');
                sb2 = sb3.toString();
            }
            SpannableString spannableString = new SpannableString(sb2);
            C10674a aVar = new C10674a(getContext(), this.f67746d);
            aVar.f28431a = this.f67748f;
            spannableString.setSpan(aVar, sb2.length() - 1, sb2.length(), 33);
            return spannableString;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: a */
    private final String m62129a(String str, int i) {
        StaticLayout staticLayout = new StaticLayout(str, getPaint(), i, Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        int lineStart = staticLayout.getLineStart(getMaxLines() - 1);
        int lineEnd = staticLayout.getLineEnd(getMaxLines() - 1);
        if (str != null) {
            String substring = str.substring(lineStart, lineEnd);
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }

    public final void onMeasure(int i, int i2) {
        SpannableString spannableString;
        int size = MeasureSpec.getSize(i);
        StaticLayout staticLayout = new StaticLayout(getText().toString(), getPaint(), size, Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        if (staticLayout.getLineCount() < getMaxLines()) {
            spannableString = m62128a(getText().toString());
        } else {
            if (((float) size) > ((float) getSpanWidth()) + getPaint().measureText(m62129a(getText().toString(), size))) {
                spannableString = m62128a(getText().toString());
            } else {
                StringBuilder sb = new StringBuilder();
                String obj = getText().toString();
                StaticLayout staticLayout2 = new StaticLayout(obj, getPaint(), size, Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
                int lineStart = staticLayout2.getLineStart(getMaxLines() - 1);
                if (obj != null) {
                    String substring = obj.substring(0, lineStart);
                    C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring);
                    String obj2 = getText().toString();
                    StaticLayout staticLayout3 = new StaticLayout(m62129a(obj2, size), getPaint(), (size - getDotWidth()) - getSpanWidth(), Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
                    int lineStart2 = staticLayout3.getLineStart(0);
                    int lineEnd = staticLayout3.getLineEnd(0);
                    StringBuilder sb2 = new StringBuilder();
                    String a = m62129a(obj2, size);
                    if (a != null) {
                        String substring2 = a.substring(lineStart2, lineEnd);
                        C52711k.m112236a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb2.append(substring2);
                        sb2.append(this.f67744b);
                        sb.append(sb2.toString());
                        spannableString = m62128a(sb.toString());
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        setText(spannableString);
        super.onMeasure(i, i2);
    }

    public DescTextView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f67744b = "...";
        this.f67746d = R.drawable.cw2;
        this.f67747e = "";
    }

    public /* synthetic */ DescTextView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

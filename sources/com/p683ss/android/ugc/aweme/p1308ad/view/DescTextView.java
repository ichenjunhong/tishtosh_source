package com.p683ss.android.ugc.aweme.p1308ad.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10674a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.ad.view.DescTextView */
public final class DescTextView extends DmtTextView {

    /* renamed from: b */
    public static final C22446a f60448b = new C22446a(null);

    /* renamed from: c */
    private String f60449c;

    /* renamed from: d */
    private int f60450d;

    /* renamed from: e */
    private String f60451e;

    /* renamed from: com.ss.android.ugc.aweme.ad.view.DescTextView$a */
    public static final class C22446a {
        private C22446a() {
        }

        public /* synthetic */ C22446a(C52707g gVar) {
            this();
        }
    }

    public DescTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DescTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final String getMoreString() {
        return this.f60451e;
    }

    private final int getDotWidth() {
        return (int) getPaint().measureText(this.f60449c);
    }

    private final int getSpanWidth() {
        Drawable drawable = new C10674a(getContext(), this.f60450d).getDrawable();
        C52711k.m112236a((Object) drawable, "drawable");
        return drawable.getIntrinsicWidth();
    }

    public final void setMoreString(String str) {
        C52711k.m112240b(str, "value");
        this.f60451e = str;
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
    private final SpannableString m55476a(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(C52830p.m112459d(str).toString());
            sb.append(' ');
            String sb2 = sb.toString();
            SpannableString spannableString = new SpannableString(sb2);
            C10674a aVar = new C10674a(getContext(), this.f60450d);
            aVar.f28431a = (int) C9432q.m18687b(getContext(), 4.0f);
            spannableString.setSpan(aVar, sb2.length() - 1, sb2.length(), 33);
            return spannableString;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: a */
    private final String m55477a(String str, int i) {
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
            spannableString = m55476a(getText().toString());
        } else {
            if (((float) size) > ((float) getSpanWidth()) + getPaint().measureText(m55477a(getText().toString(), size))) {
                spannableString = m55476a(getText().toString());
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
                    StaticLayout staticLayout3 = new StaticLayout(m55477a(obj2, size), getPaint(), (size - getDotWidth()) - getSpanWidth(), Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
                    int lineStart2 = staticLayout3.getLineStart(0);
                    int lineEnd = staticLayout3.getLineEnd(0);
                    StringBuilder sb2 = new StringBuilder();
                    String a = m55477a(obj2, size);
                    if (a != null) {
                        String substring2 = a.substring(lineStart2, lineEnd);
                        C52711k.m112236a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb2.append(substring2);
                        sb2.append(this.f60449c);
                        sb.append(sb2.toString());
                        spannableString = m55476a(sb.toString());
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
        this.f60449c = "...";
        this.f60450d = R.drawable.x6;
        this.f60451e = "";
        setViewLineHeight((int) C9432q.m18687b(context, 20.0f));
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

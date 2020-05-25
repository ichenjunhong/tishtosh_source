package com.p683ss.android.ugc.aweme.views;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.views.TextClickable */
public final class TextClickable {

    /* renamed from: a */
    public static final Pattern f121170a = Pattern.compile("(#|＃)([0-9\\uff10-\\uff19_a-zA-Z\\u00c0-\\u00d6\\u00d8-\\u00f6\\u00f8-\\u00ff\\u0100-\\u024f\\u0253\\u0254\\u0256\\u0257\\u0259\\u025b\\u0263\\u0268\\u026f\\u0272\\u0289\\u028b\\u02bb\\u0300-\\u036f\\u1e00-\\u1eff\\u0400-\\u04ff\\u0500-\\u0527\\u2de0-\\u2dff\\ua640-\\ua69f\\u0591-\\u05bf\\u05c1-\\u05c2\\u05c4-\\u05c5\\u05c7\\u05d0-\\u05ea\\u05f0-\\u05f4\\ufb1d-\\ufb28\\ufb2a-\\ufb36\\ufb38-\\ufb3c\\ufb3e\\ufb40-\\ufb41\\ufb43-\\ufb44\\ufb46-\\ufb4f\\u0610-\\u061a\\u0620-\\u065f\\u066e-\\u06d3\\u06d5-\\u06dc\\u06de-\\u06e8\\u06ea-\\u06ef\\u06fa-\\u06fc\\u06ff\\u0750-\\u077f\\u08a0\\u08a2-\\u08ac\\u08e4-\\u08fe\\ufb50-\\ufbb1\\ufbd3-\\ufd3d\\ufd50-\\ufd8f\\ufd92-\\ufdc7\\ufdf0-\\ufdfb\\ufe70-\\ufe74\\ufe76-\\ufefc\\u200c\\u0e01-\\u0e3a\\u0e40-\\u0e4e\\u1100-\\u11ff\\u3130-\\u3185\\uA960-\\uA97F\\uAC00-\\uD7AF\\uD7B0-\\uD7FF\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}\\u3003\\u3005\\u303b\\uff21-\\uff3a\\uff41-\\uff5a\\uff66-\\uff9f\\uffa1-\\uffdc]*[a-zA-Z\\u00c0-\\u00d6\\u00d8-\\u00f6\\u00f8-\\u00ff\\u0100-\\u024f\\u0253\\u0254\\u0256\\u0257\\u0259\\u025b\\u0263\\u0268\\u026f\\u0272\\u0289\\u028b\\u02bb\\u0300-\\u036f\\u1e00-\\u1eff\\u0400-\\u04ff\\u0500-\\u0527\\u2de0-\\u2dff\\ua640-\\ua69f\\u0591-\\u05bf\\u05c1-\\u05c2\\u05c4-\\u05c5\\u05c7\\u05d0-\\u05ea\\u05f0-\\u05f4\\ufb1d-\\ufb28\\ufb2a-\\ufb36\\ufb38-\\ufb3c\\ufb3e\\ufb40-\\ufb41\\ufb43-\\ufb44\\ufb46-\\ufb4f\\u0610-\\u061a\\u0620-\\u065f\\u066e-\\u06d3\\u06d5-\\u06dc\\u06de-\\u06e8\\u06ea-\\u06ef\\u06fa-\\u06fc\\u06ff\\u0750-\\u077f\\u08a0\\u08a2-\\u08ac\\u08e4-\\u08fe\\ufb50-\\ufbb1\\ufbd3-\\ufd3d\\ufd50-\\ufd8f\\ufd92-\\ufdc7\\ufdf0-\\ufdfb\\ufe70-\\ufe74\\ufe76-\\ufefc\\u200c\\u0e01-\\u0e3a\\u0e40-\\u0e4e\\u1100-\\u11ff\\u3130-\\u3185\\uA960-\\uA97F\\uAC00-\\uD7AF\\uD7B0-\\uD7FF\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}\\u3003\\u3005\\u303b\\uff21-\\uff3a\\uff41-\\uff5a\\uff66-\\uff9f\\uffa1-\\uffdc][0-9\\uff10-\\uff19_a-zA-Z\\u00c0-\\u00d6\\u00d8-\\u00f6\\u00f8-\\u00ff\\u0100-\\u024f\\u0253\\u0254\\u0256\\u0257\\u0259\\u025b\\u0263\\u0268\\u026f\\u0272\\u0289\\u028b\\u02bb\\u0300-\\u036f\\u1e00-\\u1eff\\u0400-\\u04ff\\u0500-\\u0527\\u2de0-\\u2dff\\ua640-\\ua69f\\u0591-\\u05bf\\u05c1-\\u05c2\\u05c4-\\u05c5\\u05c7\\u05d0-\\u05ea\\u05f0-\\u05f4\\ufb1d-\\ufb28\\ufb2a-\\ufb36\\ufb38-\\ufb3c\\ufb3e\\ufb40-\\ufb41\\ufb43-\\ufb44\\ufb46-\\ufb4f\\u0610-\\u061a\\u0620-\\u065f\\u066e-\\u06d3\\u06d5-\\u06dc\\u06de-\\u06e8\\u06ea-\\u06ef\\u06fa-\\u06fc\\u06ff\\u0750-\\u077f\\u08a0\\u08a2-\\u08ac\\u08e4-\\u08fe\\ufb50-\\ufbb1\\ufbd3-\\ufd3d\\ufd50-\\ufd8f\\ufd92-\\ufdc7\\ufdf0-\\ufdfb\\ufe70-\\ufe74\\ufe76-\\ufefc\\u200c\\u0e01-\\u0e3a\\u0e40-\\u0e4e\\u1100-\\u11ff\\u3130-\\u3185\\uA960-\\uA97F\\uAC00-\\uD7AF\\uD7B0-\\uD7FF\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}\\u3003\\u3005\\u303b\\uff21-\\uff3a\\uff41-\\uff5a\\uff66-\\uff9f\\uffa1-\\uffdc]*)");

    /* renamed from: f */
    private static final Pattern f121171f = Pattern.compile("@([\\u4e00-\\u9fa5\\w\\.]{1,19}[\\u4e00-\\u9fa5\\w])");

    /* renamed from: b */
    public int f121172b = 2;

    /* renamed from: c */
    public C48168a f121173c;

    /* renamed from: d */
    public Pattern f121174d = f121170a;

    /* renamed from: e */
    public Typeface f121175e;

    /* renamed from: g */
    private int f121176g = 1;

    /* renamed from: h */
    private Pattern f121177h = f121171f;

    /* renamed from: com.ss.android.ugc.aweme.views.TextClickable$CustomTypefaceSpan */
    static class CustomTypefaceSpan extends TypefaceSpan {

        /* renamed from: a */
        private final Typeface f121180a;

        public void updateDrawState(TextPaint textPaint) {
            m104400a(textPaint, this.f121180a);
        }

        public void updateMeasureState(TextPaint textPaint) {
            m104400a(textPaint, this.f121180a);
        }

        CustomTypefaceSpan(String str, Typeface typeface) {
            super(str);
            this.f121180a = typeface;
        }

        /* renamed from: a */
        private static void m104400a(Paint paint, Typeface typeface) {
            int i;
            Typeface typeface2 = paint.getTypeface();
            if (typeface2 == null) {
                i = 0;
            } else {
                i = typeface2.getStyle();
            }
            int style = i & (typeface.getStyle() ^ -1);
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.setTypeface(typeface);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.TextClickable$a */
    public interface C48168a {
        /* renamed from: a */
        void mo83019a(TextPaint textPaint);

        /* renamed from: a */
        void mo83020a(View view, String str, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.views.TextClickable$b */
    class C48169b extends ClickableSpan {

        /* renamed from: b */
        private String f121182b;

        /* renamed from: c */
        private int f121183c;

        public final void updateDrawState(TextPaint textPaint) {
            if (TextClickable.this.f121173c != null) {
                TextClickable.this.f121173c.mo83019a(textPaint);
            }
        }

        public final void onClick(View view) {
            if (TextClickable.this.f121173c != null) {
                TextClickable.this.f121173c.mo83020a(view, this.f121182b, this.f121183c);
            }
        }

        private C48169b(String str, int i) {
            this.f121182b = str;
            this.f121183c = i;
        }
    }

    /* renamed from: a */
    public boolean mo95586a(Spannable spannable) {
        String obj = spannable.toString();
        Matcher matcher = this.f121174d.matcher(obj);
        Matcher matcher2 = this.f121177h.matcher(obj);
        boolean z = false;
        while (matcher2.find()) {
            spannable.setSpan(new C48169b(matcher2.group(this.f121176g), 1), matcher2.start(), matcher2.end(), 33);
            m104398a(spannable, matcher2.start(), matcher2.end());
            z = true;
        }
        while (matcher.find()) {
            spannable.setSpan(new C48169b(matcher.group(this.f121172b), 0), matcher.start(), matcher.end(), 33);
            m104398a(spannable, matcher.start(), matcher.end());
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private void m104398a(Spannable spannable, int i, int i2) {
        if (this.f121175e != null) {
            spannable.setSpan(new CustomTypefaceSpan("", this.f121175e), i, i2, 0);
        }
    }
}

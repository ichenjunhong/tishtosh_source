package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.os.Build.VERSION;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38135o;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.i */
public final class C38389i {

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.i$a */
    static final class C38390a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f97687a;

        /* renamed from: b */
        final /* synthetic */ SpannableStringBuilder f97688b;

        /* renamed from: c */
        final /* synthetic */ BaseNotice f97689c;

        /* renamed from: d */
        final /* synthetic */ int f97690d;

        C38390a(TextView textView, SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, int i) {
            this.f97687a = textView;
            this.f97688b = spannableStringBuilder;
            this.f97689c = baseNotice;
            this.f97690d = i;
        }

        public final void run() {
            C38389i.m85696a(this.f97687a, this.f97688b, this.f97689c, this.f97690d, this.f97687a.getWidth());
        }
    }

    /* renamed from: a */
    public static final void m85696a(TextView textView, SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, int i, int i2) {
        C52711k.m112240b(textView, "view");
        C52711k.m112240b(spannableStringBuilder, "spannableStringBuilder");
        C52711k.m112240b(baseNotice, "notice");
        if (i2 == 0) {
            textView.post(new C38390a(textView, spannableStringBuilder, baseNotice, i));
            return;
        }
        if (VERSION.SDK_INT >= 23) {
            textView.setBreakStrategy(0);
        }
        String valueOf = String.valueOf(C38135o.m85234a(baseNotice, textView.getContext()));
        C38135o.m85235a(spannableStringBuilder, baseNotice, textView.getContext());
        TextPaint paint = textView.getPaint();
        C52711k.m112236a((Object) paint, "view.paint");
        textView.setText(m85695a(spannableStringBuilder, paint, i2, i, valueOf.length(), (int) textView.getPaint().measureText(valueOf), true));
    }

    /* renamed from: a */
    private static SpannableStringBuilder m85695a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4, boolean z) {
        C52711k.m112240b(spannableStringBuilder, "spannableStringBuilder");
        C52711k.m112240b(textPaint, "paint");
        CharSequence charSequence = spannableStringBuilder;
        DynamicLayout dynamicLayout = new DynamicLayout(charSequence, textPaint, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i2) {
            return spannableStringBuilder;
        }
        String str = "... ";
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

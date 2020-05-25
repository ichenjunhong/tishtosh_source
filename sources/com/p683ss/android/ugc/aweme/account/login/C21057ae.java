package com.p683ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.views.C22311a;
import com.p683ss.android.ugc.aweme.account.views.C22313c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ae */
public final class C21057ae {
    /* renamed from: a */
    public static void m53524a(Context context, TextView textView, final OnClickListener onClickListener, final OnClickListener onClickListener2, boolean z) {
        int i;
        StringBuilder sb = new StringBuilder(" ");
        sb.append(context.getString(R.string.fy_));
        sb.append(" ");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(" ");
        sb3.append(context.getString(R.string.fy3));
        String sb4 = sb3.toString();
        if (z) {
            i = R.string.fxy;
        } else {
            i = R.string.fxx;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i, new Object[]{sb2, sb4}));
        int color = context.getResources().getColor(R.color.dj);
        int color2 = context.getResources().getColor(R.color.dj);
        C210581 r5 = new C22313c(color, color2) {
            public final void onClick(View view) {
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setFakeBoldText(true);
                textPaint.setUnderlineText(true);
            }
        };
        C210592 r12 = new C22313c(color, color2) {
            public final void onClick(View view) {
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setFakeBoldText(true);
                textPaint.setUnderlineText(true);
            }
        };
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf = spannableStringBuilder2.indexOf(sb2);
        int indexOf2 = spannableStringBuilder2.indexOf(sb4);
        if (indexOf < 0 || indexOf2 < 0) {
            C22089b.m54869a("text_highlight_not_match", "", C23088c.m56631a().mo47824a("enter_from", "login").mo47825b());
        }
        spannableStringBuilder.setSpan(r5, indexOf + 1, (indexOf + sb2.length()) - 1, 34);
        spannableStringBuilder.setSpan(r12, indexOf2 + 1, indexOf2 + sb4.length(), 34);
        textView.setHighlightColor(context.getResources().getColor(17170445));
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(C22311a.m55214a());
    }
}

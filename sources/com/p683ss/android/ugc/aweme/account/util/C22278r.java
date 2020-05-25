package com.p683ss.android.ugc.aweme.account.util;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.main.service.C36703x;

/* renamed from: com.ss.android.ugc.aweme.account.util.r */
public final class C22278r {

    /* renamed from: com.ss.android.ugc.aweme.account.util.r$a */
    public static class C22279a extends ClickableSpan {

        /* renamed from: a */
        private int f60047a;

        public C22279a(int i) {
            this.f60047a = i;
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f60047a);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                if (textView.getHighlightColor() != 0) {
                    textView.setHighlightColor(0);
                }
            }
            view.setTag(Boolean.valueOf(true));
            ((C36703x) C23826bi.m58450a(C36703x.class)).mo47870a(view.getContext(), C22277q.f60046a.mo46374a("privacy-policy"), true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.util.r$b */
    public static class C22280b extends ClickableSpan {

        /* renamed from: a */
        private int f60048a;

        public C22280b(int i) {
            this.f60048a = i;
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f60048a);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                if (textView.getHighlightColor() != 0) {
                    textView.setHighlightColor(0);
                }
            }
            view.setTag(Boolean.valueOf(true));
            ((C36703x) C23826bi.m58450a(C36703x.class)).mo47870a(view.getContext(), C22277q.f60046a.mo46374a("terms-of-use"), true);
        }
    }
}

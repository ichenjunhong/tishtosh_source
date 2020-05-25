package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1323ae.p1326c.C22473b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.t */
final /* synthetic */ class C24760t implements Runnable {

    /* renamed from: a */
    private final TextView f65546a;

    /* renamed from: b */
    private final SpannableStringBuilder f65547b;

    C24760t(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        this.f65546a = textView;
        this.f65547b = spannableStringBuilder;
    }

    public final void run() {
        TextView textView = this.f65546a;
        SpannableStringBuilder spannableStringBuilder = this.f65547b;
        spannableStringBuilder.append("  ");
        spannableStringBuilder.setSpan(new C24635ah(textView.getContext(), R.drawable.cr5), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                SmartRouter.buildRoute(view.getContext(), "aweme://search/trending").open();
                C26890h.m65011a("hot_search_icon", C23089d.m56640a().mo47829a("account_type", "click").mo47829a("enter_from", "challenge").f61491a);
            }
        }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
        textView.setText(C22473b.m55522a(spannableStringBuilder, textView.getPaint(), textView.getMeasuredWidth(), textView.getMaxLines(), 1, textView.getContext() != null ? textView.getContext().getResources().getDrawable(R.drawable.cr5).getIntrinsicWidth() : 164));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

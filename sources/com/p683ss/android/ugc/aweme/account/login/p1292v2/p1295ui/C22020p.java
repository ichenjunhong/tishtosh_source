package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.account.views.C22311a;
import com.p683ss.android.ugc.aweme.account.views.C22313c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.p */
public final class C22020p {

    /* renamed from: a */
    public static final C22020p f59497a = new C22020p();

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.p$a */
    public static final class C22021a extends C22313c {

        /* renamed from: a */
        final /* synthetic */ OnClickListener f59498a;

        /* renamed from: b */
        final /* synthetic */ int f59499b;

        public final void onClick(View view) {
            C52711k.m112240b(view, "view");
            this.f59498a.onClick(view);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            textPaint.setFakeBoldText(true);
            super.updateDrawState(textPaint);
        }

        C22021a(OnClickListener onClickListener, int i, int i2, int i3) {
            this.f59498a = onClickListener;
            this.f59499b = i;
            super(i2, i3);
        }
    }

    private C22020p() {
    }

    /* renamed from: a */
    public static void m54764a(TextView textView, OnClickListener onClickListener, int i, int i2) {
        C52711k.m112240b(textView, "textView");
        C52711k.m112240b(onClickListener, "termClickListener");
        Context context = textView.getContext();
        String string = context.getString(i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(i, new Object[]{string}));
        C52711k.m112236a((Object) context, "context");
        int color = context.getResources().getColor(R.color.ja);
        C22021a aVar = new C22021a(onClickListener, color, color, color);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        C52711k.m112236a((Object) spannableStringBuilder2, "builder.toString()");
        CharSequence charSequence = spannableStringBuilder2;
        C52711k.m112236a((Object) string, "termsOfUse");
        int a = C52830p.m112419a(charSequence, string, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(aVar, a, string.length() + a, 34);
        textView.setHighlightColor(context.getResources().getColor(17170445));
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(C22311a.m55214a());
    }
}

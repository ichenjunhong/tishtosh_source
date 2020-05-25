package com.p683ss.android.ugc.aweme.friends.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.C2240a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.friends.service.C32619f;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.w */
public final class C32550w extends C1352v {

    /* renamed from: a */
    public Context f84762a;

    /* renamed from: b */
    private TextView f84763b;

    public C32550w(View view) {
        super(view);
        this.f84762a = view.getContext();
        this.f84763b = (TextView) view.findViewById(R.id.c_4);
        if (((Boolean) SharePrefCache.inst().getIsEuropeCountry().mo47782d()).booleanValue()) {
            String string = this.f84762a.getString(R.string.h3w);
            String a = C2240a.m6772a(this.f84762a.getString(R.string.f5c), new Object[]{this.f84762a.getString(R.string.h3w)});
            int indexOf = a.indexOf(string);
            int length = string.length() + indexOf;
            SpannableString spannableString = new SpannableString(a);
            spannableString.setSpan(new ClickableSpan() {
                public final void onClick(View view) {
                    C32619f.f84867a.goToPrivacyActivity(C32550w.this.f84762a);
                }

                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(C32550w.this.f84762a.getResources().getColor(R.color.wp));
                }
            }, indexOf, length, 33);
            this.f84763b.setText(spannableString);
            this.f84763b.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        this.f84763b.setVisibility(8);
    }
}

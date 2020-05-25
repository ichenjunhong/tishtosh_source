package com.p683ss.android.ugc.aweme.profile.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.views.C22313c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24631ae;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47668ai;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.util.m */
final /* synthetic */ class C40554m implements OnClickListener {

    /* renamed from: a */
    private final ImageView f103472a;

    /* renamed from: b */
    private final ViewGroup f103473b;

    /* renamed from: c */
    private final TextView f103474c;

    /* renamed from: d */
    private final int f103475d;

    /* renamed from: e */
    private final int f103476e;

    /* renamed from: f */
    private final boolean f103477f;

    /* renamed from: g */
    private final SpannableString f103478g;

    C40554m(ImageView imageView, ViewGroup viewGroup, TextView textView, int i, int i2, boolean z, SpannableString spannableString) {
        this.f103472a = imageView;
        this.f103473b = viewGroup;
        this.f103474c = textView;
        this.f103475d = i;
        this.f103476e = i2;
        this.f103477f = z;
        this.f103478g = spannableString;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        ImageView imageView = this.f103472a;
        ViewGroup viewGroup = this.f103473b;
        TextView textView = this.f103474c;
        int i = this.f103475d;
        int i2 = this.f103476e;
        boolean z = this.f103477f;
        SpannableString spannableString = this.f103478g;
        boolean isSelected = imageView.isSelected();
        C47668ai.m103180a(viewGroup, imageView, textView, i, i2, isSelected, z, new AnimatorListenerAdapter(isSelected, textView, spannableString) {

            /* renamed from: a */
            final /* synthetic */ boolean f103459a;

            /* renamed from: b */
            final /* synthetic */ TextView f103460b;

            /* renamed from: c */
            final /* synthetic */ SpannableString f103461c;

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!this.f103459a) {
                    this.f103460b.setText(this.f103461c);
                }
            }

            {
                this.f103459a = r1;
                this.f103460b = r2;
                this.f103461c = r3;
            }
        });
        if (isSelected) {
            textView.setMovementMethod(C24631ae.m60124a());
            String string = C11010c.m22280a().getString(R.string.dc6);
            String str = (String) SharePrefCache.inst().getUpdateUserTipContent().mo47782d();
            if (TextUtils.isEmpty(str)) {
                str = C11010c.m22280a().getString(R.string.anw);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(string);
            String sb2 = sb.toString();
            int indexOf = sb2.indexOf(string);
            Spannable newSpannable = Factory.getInstance().newSpannable(sb2);
            newSpannable.setSpan(new C22313c(C23723j.m58216a(R.color.a3c), C23723j.m58216a(R.color.jb)) {
                public final void onClick(View view) {
                    C41302w.m91042a().mo83861a((String) SharePrefCache.inst().getJudgementClauseScheme().mo47782d());
                }
            }, indexOf, string.length() + indexOf, 17);
            textView.setText(newSpannable);
            viewGroup.setVisibility(8);
        }
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.festival;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.utils.C47668ai;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.d */
final /* synthetic */ class C43815d implements OnClickListener {

    /* renamed from: a */
    private final ImageView f110960a;

    /* renamed from: b */
    private final ViewGroup f110961b;

    /* renamed from: c */
    private final TextView f110962c;

    /* renamed from: d */
    private final int f110963d;

    /* renamed from: e */
    private final int f110964e;

    /* renamed from: f */
    private final SpannableString f110965f;

    /* renamed from: g */
    private final SpannableString f110966g;

    /* renamed from: h */
    private final TextView f110967h;

    C43815d(ImageView imageView, ViewGroup viewGroup, TextView textView, int i, int i2, SpannableString spannableString, SpannableString spannableString2, TextView textView2) {
        this.f110960a = imageView;
        this.f110961b = viewGroup;
        this.f110962c = textView;
        this.f110963d = i;
        this.f110964e = i2;
        this.f110965f = spannableString;
        this.f110966g = spannableString2;
        this.f110967h = textView2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        ImageView imageView = this.f110960a;
        ViewGroup viewGroup = this.f110961b;
        TextView textView = this.f110962c;
        int i = this.f110963d;
        int i2 = this.f110964e;
        SpannableString spannableString = this.f110965f;
        SpannableString spannableString2 = this.f110966g;
        TextView textView2 = this.f110967h;
        boolean isSelected = imageView.isSelected();
        C47668ai.m103180a(viewGroup, imageView, textView, i, i2, isSelected, false, new AnimatorListenerAdapter(isSelected, textView, spannableString) {

            /* renamed from: a */
            final /* synthetic */ boolean f110950a;

            /* renamed from: b */
            final /* synthetic */ TextView f110951b;

            /* renamed from: c */
            final /* synthetic */ SpannableString f110952c;

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!this.f110950a) {
                    this.f110951b.setText(this.f110952c);
                }
            }

            {
                this.f110950a = r1;
                this.f110951b = r2;
                this.f110952c = r3;
            }
        });
        if (isSelected) {
            textView.setText(spannableString2);
        }
        textView2.setText(textView2.getContext().getResources().getString(isSelected ? R.string.b3v : R.string.azy));
        imageView.setSelected(!isSelected);
    }
}

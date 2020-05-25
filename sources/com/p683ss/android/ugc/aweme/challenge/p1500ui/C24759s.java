package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.challenge.p1496b.C24556a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.s */
final /* synthetic */ class C24759s implements Runnable {

    /* renamed from: a */
    private final TextView f65537a;

    /* renamed from: b */
    private final SpannableString f65538b;

    /* renamed from: c */
    private final ImageView f65539c;

    /* renamed from: d */
    private final TextView f65540d;

    /* renamed from: e */
    private final View f65541e;

    /* renamed from: f */
    private final ViewGroup f65542f;

    /* renamed from: g */
    private final SpannableString f65543g;

    /* renamed from: h */
    private final Challenge f65544h;

    /* renamed from: i */
    private final boolean f65545i;

    C24759s(TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, View view, ViewGroup viewGroup, SpannableString spannableString2, Challenge challenge, boolean z) {
        this.f65537a = textView;
        this.f65538b = spannableString;
        this.f65539c = imageView;
        this.f65540d = textView2;
        this.f65541e = view;
        this.f65542f = viewGroup;
        this.f65543g = spannableString2;
        this.f65544h = challenge;
        this.f65545i = z;
    }

    public final void run() {
        TextView textView = this.f65537a;
        SpannableString spannableString = this.f65538b;
        ImageView imageView = this.f65539c;
        TextView textView2 = this.f65540d;
        View view = this.f65541e;
        ViewGroup viewGroup = this.f65542f;
        SpannableString spannableString2 = this.f65543g;
        Challenge challenge = this.f65544h;
        boolean z = this.f65545i;
        if (textView.getHeight() == C24556a.m59970a(textView, spannableString).f65015b.intValue()) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new C24761u(imageView));
        C24762v vVar = new C24762v(imageView, viewGroup, textView, spannableString2, challenge, z, spannableString, textView2);
        imageView.setOnClickListener(vVar);
    }
}

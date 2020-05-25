package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.challenge.p1496b.C24556a;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.f */
final /* synthetic */ class C24661f implements Runnable {

    /* renamed from: a */
    private final TextView f65253a;

    /* renamed from: b */
    private final SpannableString f65254b;

    /* renamed from: c */
    private final ImageView f65255c;

    /* renamed from: d */
    private final TextView f65256d;

    /* renamed from: e */
    private final ViewGroup f65257e;

    /* renamed from: f */
    private final boolean f65258f;

    /* renamed from: g */
    private final SpannableString f65259g;

    C24661f(TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, boolean z, SpannableString spannableString2) {
        this.f65253a = textView;
        this.f65254b = spannableString;
        this.f65255c = imageView;
        this.f65256d = textView2;
        this.f65257e = viewGroup;
        this.f65258f = z;
        this.f65259g = spannableString2;
    }

    public final void run() {
        TextView textView = this.f65253a;
        SpannableString spannableString = this.f65254b;
        ImageView imageView = this.f65255c;
        TextView textView2 = this.f65256d;
        ViewGroup viewGroup = this.f65257e;
        boolean z = this.f65258f;
        SpannableString spannableString2 = this.f65259g;
        int height = textView.getHeight();
        int intValue = C24556a.m59970a(textView, spannableString).f65015b.intValue();
        if (height == intValue) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new C24662g(imageView));
        C24663h hVar = new C24663h(imageView, viewGroup, textView, intValue, height, z, spannableString2, spannableString, textView2);
        imageView.setOnClickListener(hVar);
    }
}

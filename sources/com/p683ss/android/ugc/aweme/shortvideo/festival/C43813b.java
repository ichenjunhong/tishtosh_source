package com.p683ss.android.ugc.aweme.shortvideo.festival;

import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.challenge.p1496b.C24556a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.b */
final /* synthetic */ class C43813b implements Runnable {

    /* renamed from: a */
    private final TextView f110953a;

    /* renamed from: b */
    private final SpannableString f110954b;

    /* renamed from: c */
    private final ImageView f110955c;

    /* renamed from: d */
    private final TextView f110956d;

    /* renamed from: e */
    private final ViewGroup f110957e;

    /* renamed from: f */
    private final SpannableString f110958f;

    C43813b(TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, SpannableString spannableString2) {
        this.f110953a = textView;
        this.f110954b = spannableString;
        this.f110955c = imageView;
        this.f110956d = textView2;
        this.f110957e = viewGroup;
        this.f110958f = spannableString2;
    }

    public final void run() {
        TextView textView = this.f110953a;
        SpannableString spannableString = this.f110954b;
        ImageView imageView = this.f110955c;
        TextView textView2 = this.f110956d;
        ViewGroup viewGroup = this.f110957e;
        SpannableString spannableString2 = this.f110958f;
        int height = textView.getHeight();
        int intValue = C24556a.m59970a(textView, spannableString).f65015b.intValue();
        if (height == intValue) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new C43814c(imageView));
        C43815d dVar = new C43815d(imageView, viewGroup, textView, intValue, height, spannableString2, spannableString, textView2);
        imageView.setOnClickListener(dVar);
    }
}

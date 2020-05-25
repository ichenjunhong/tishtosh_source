package com.p683ss.android.ugc.aweme.profile.util;

import android.text.DynamicLayout;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.ss.android.ugc.aweme.profile.util.k */
final /* synthetic */ class C40552k implements Runnable {

    /* renamed from: a */
    private final TextView f103462a;

    /* renamed from: b */
    private final int f103463b;

    /* renamed from: c */
    private final DynamicLayout f103464c;

    /* renamed from: d */
    private final SpannableString f103465d;

    /* renamed from: e */
    private final ImageView f103466e;

    /* renamed from: f */
    private final TextView f103467f;

    /* renamed from: g */
    private final ViewGroup f103468g;

    /* renamed from: h */
    private final boolean f103469h;

    /* renamed from: i */
    private final SpannableString f103470i;

    C40552k(TextView textView, int i, DynamicLayout dynamicLayout, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, boolean z, SpannableString spannableString2) {
        this.f103462a = textView;
        this.f103463b = i;
        this.f103464c = dynamicLayout;
        this.f103465d = spannableString;
        this.f103466e = imageView;
        this.f103467f = textView2;
        this.f103468g = viewGroup;
        this.f103469h = z;
        this.f103470i = spannableString2;
    }

    public final void run() {
        TextView textView = this.f103462a;
        int i = this.f103463b;
        DynamicLayout dynamicLayout = this.f103464c;
        SpannableString spannableString = this.f103465d;
        ImageView imageView = this.f103466e;
        TextView textView2 = this.f103467f;
        ViewGroup viewGroup = this.f103468g;
        boolean z = this.f103469h;
        SpannableString spannableString2 = this.f103470i;
        int height = textView.getHeight();
        int lineCount = (int) (((float) i) + (((float) dynamicLayout.getLineCount()) * C9432q.m18687b(textView.getContext(), 2.0f)));
        if (height == lineCount) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new C40553l(imageView));
        C40554m mVar = new C40554m(imageView, viewGroup, textView, lineCount, height, z, spannableString2);
        imageView.setOnClickListener(mVar);
    }
}

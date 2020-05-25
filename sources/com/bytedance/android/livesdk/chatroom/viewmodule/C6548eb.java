package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.eb */
final /* synthetic */ class C6548eb implements Runnable {

    /* renamed from: a */
    private final ImageView f17876a;

    /* renamed from: b */
    private final ImageView f17877b;

    /* renamed from: c */
    private final View f17878c;

    /* renamed from: d */
    private final TextView f17879d;

    C6548eb(ImageView imageView, ImageView imageView2, View view, TextView textView) {
        this.f17876a = imageView;
        this.f17877b = imageView2;
        this.f17878c = view;
        this.f17879d = textView;
    }

    public final void run() {
        ImageView imageView = this.f17876a;
        ImageView imageView2 = this.f17877b;
        View view = this.f17878c;
        TextView textView = this.f17879d;
        imageView.setVisibility(8);
        imageView2.setVisibility(8);
        view.setVisibility(8);
        textView.setVisibility(8);
    }
}

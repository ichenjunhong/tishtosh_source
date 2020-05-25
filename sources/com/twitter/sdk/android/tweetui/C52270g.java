package com.twitter.sdk.android.tweetui;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import com.twitter.sdk.android.tweetui.internal.C52296f.C52297a;
import com.twitter.sdk.android.tweetui.internal.VideoControlView;
import com.twitter.sdk.android.tweetui.internal.VideoView;

/* renamed from: com.twitter.sdk.android.tweetui.g */
final class C52270g {

    /* renamed from: a */
    final VideoView f130144a;

    /* renamed from: b */
    final VideoControlView f130145b;

    /* renamed from: c */
    final ProgressBar f130146c;

    /* renamed from: d */
    final TextView f130147d;

    /* renamed from: e */
    final View f130148e;

    /* renamed from: f */
    int f130149f;

    /* renamed from: g */
    boolean f130150g = true;

    /* renamed from: h */
    final C52297a f130151h;

    C52270g(View view, C52297a aVar) {
        this.f130148e = view;
        this.f130144a = (VideoView) view.findViewById(R.id.dqi);
        this.f130145b = (VideoControlView) view.findViewById(R.id.dp1);
        this.f130146c = (ProgressBar) view.findViewById(R.id.dpx);
        this.f130147d = (TextView) view.findViewById(R.id.q5);
        this.f130151h = aVar;
    }
}

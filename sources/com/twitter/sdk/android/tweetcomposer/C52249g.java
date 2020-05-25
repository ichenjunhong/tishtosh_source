package com.twitter.sdk.android.tweetcomposer;

import com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView.C52252a;

/* renamed from: com.twitter.sdk.android.tweetcomposer.g */
final /* synthetic */ class C52249g implements C52252a {

    /* renamed from: a */
    private final ComposerView f130100a;

    C52249g(ComposerView composerView) {
        this.f130100a = composerView;
    }

    /* renamed from: a */
    public final void mo108998a(int i) {
        ComposerView composerView = this.f130100a;
        if (i > 0) {
            composerView.f130076g.setVisibility(0);
        } else {
            composerView.f130076g.setVisibility(4);
        }
    }
}

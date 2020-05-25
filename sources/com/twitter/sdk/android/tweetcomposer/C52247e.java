package com.twitter.sdk.android.tweetcomposer;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.twitter.sdk.android.tweetcomposer.e */
final /* synthetic */ class C52247e implements OnClickListener {

    /* renamed from: a */
    private final ComposerView f130098a;

    C52247e(ComposerView composerView) {
        this.f130098a = composerView;
    }

    public final void onClick(View view) {
        ComposerView composerView = this.f130098a;
        composerView.f130079j.mo108992b(composerView.getTweetText());
    }
}

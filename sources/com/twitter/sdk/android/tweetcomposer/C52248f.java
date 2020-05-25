package com.twitter.sdk.android.tweetcomposer;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: com.twitter.sdk.android.tweetcomposer.f */
final /* synthetic */ class C52248f implements OnEditorActionListener {

    /* renamed from: a */
    private final ComposerView f130099a;

    C52248f(ComposerView composerView) {
        this.f130099a = composerView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        ComposerView composerView = this.f130099a;
        composerView.f130079j.mo108992b(composerView.getTweetText());
        return true;
    }
}

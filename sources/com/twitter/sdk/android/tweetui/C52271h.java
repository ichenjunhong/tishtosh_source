package com.twitter.sdk.android.tweetui;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

/* renamed from: com.twitter.sdk.android.tweetui.h */
final /* synthetic */ class C52271h implements OnPreparedListener {

    /* renamed from: a */
    private final C52270g f130152a;

    C52271h(C52270g gVar) {
        this.f130152a = gVar;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f130152a.f130146c.setVisibility(8);
    }
}

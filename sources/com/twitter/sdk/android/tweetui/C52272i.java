package com.twitter.sdk.android.tweetui;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnInfoListener;

/* renamed from: com.twitter.sdk.android.tweetui.i */
final /* synthetic */ class C52272i implements OnInfoListener {

    /* renamed from: a */
    private final C52270g f130153a;

    C52272i(C52270g gVar) {
        this.f130153a = gVar;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        C52270g gVar = this.f130153a;
        if (i == 702) {
            gVar.f130146c.setVisibility(8);
            return true;
        } else if (i != 701) {
            return false;
        } else {
            gVar.f130146c.setVisibility(0);
            return true;
        }
    }
}

package com.p683ss.android.ugc.aweme.choosemusic.adapter;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.c */
final /* synthetic */ class C24820c implements OnPreparedListener {

    /* renamed from: a */
    private final MusicItemViewHolder f65713a;

    C24820c(MusicItemViewHolder musicItemViewHolder) {
        this.f65713a = musicItemViewHolder;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        MusicItemViewHolder musicItemViewHolder = this.f65713a;
        mediaPlayer.start();
        musicItemViewHolder.mo51012a(false, true);
    }
}

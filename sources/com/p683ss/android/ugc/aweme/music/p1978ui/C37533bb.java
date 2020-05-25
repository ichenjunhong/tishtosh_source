package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.music.api.MusicApi;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bb */
final /* synthetic */ class C37533bb implements Callable {

    /* renamed from: a */
    private final MusicModel f95756a;

    C37533bb(MusicModel musicModel) {
        this.f95756a = musicModel;
    }

    public final Object call() {
        MusicModel musicModel = this.f95756a;
        if (TextUtils.isEmpty(musicModel.getMusicId())) {
            return musicModel;
        }
        musicModel.setMusic(MusicApi.m83621a(musicModel.getMusicId(), 0).music);
        musicModel.setStrongBeatUrl(musicModel.getMusic().getStrongBeatUrl());
        return musicModel;
    }
}

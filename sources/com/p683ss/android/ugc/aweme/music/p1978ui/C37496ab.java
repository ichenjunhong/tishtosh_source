package com.p683ss.android.ugc.aweme.music.p1978ui;

import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ab */
final /* synthetic */ class C37496ab implements Runnable {

    /* renamed from: a */
    private final C376493 f95683a;

    /* renamed from: b */
    private final MusicModel f95684b;

    /* renamed from: c */
    private final MusicWaveBean f95685c;

    /* renamed from: d */
    private final String f95686d;

    C37496ab(C376493 r1, MusicModel musicModel, MusicWaveBean musicWaveBean, String str) {
        this.f95683a = r1;
        this.f95684b = musicModel;
        this.f95685c = musicWaveBean;
        this.f95686d = str;
    }

    public final void run() {
        C376493 r0 = this.f95683a;
        MusicModel musicModel = this.f95684b;
        MusicWaveBean musicWaveBean = this.f95685c;
        String str = this.f95686d;
        C37646v.this.f95996b.bz_();
        musicModel.setMusicWaveBean(musicWaveBean);
        C37646v.this.f95996b.mo76950a(str, musicModel);
    }
}

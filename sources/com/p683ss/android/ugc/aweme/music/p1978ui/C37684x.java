package com.p683ss.android.ugc.aweme.music.p1978ui;

import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* renamed from: com.ss.android.ugc.aweme.music.ui.x */
final /* synthetic */ class C37684x implements Runnable {

    /* renamed from: a */
    private final C376482 f96093a;

    /* renamed from: b */
    private final MusicModel f96094b;

    /* renamed from: c */
    private final MusicWaveBean f96095c;

    /* renamed from: d */
    private final String f96096d;

    C37684x(C376482 r1, MusicModel musicModel, MusicWaveBean musicWaveBean, String str) {
        this.f96093a = r1;
        this.f96094b = musicModel;
        this.f96095c = musicWaveBean;
        this.f96096d = str;
    }

    public final void run() {
        C376482 r0 = this.f96093a;
        MusicModel musicModel = this.f96094b;
        MusicWaveBean musicWaveBean = this.f96095c;
        String str = this.f96096d;
        C37646v.this.f95996b.bz_();
        musicModel.setMusicWaveBean(musicWaveBean);
        C37646v.this.f95996b.mo76950a(str, musicModel);
    }
}

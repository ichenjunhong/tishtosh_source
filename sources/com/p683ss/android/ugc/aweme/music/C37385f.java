package com.p683ss.android.ugc.aweme.music;

import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.music.api.MusicApi;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.services.music.IMusicService;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicList;

/* renamed from: com.ss.android.ugc.aweme.music.f */
public final class C37385f implements IMusicService {
    public final Music getDefaultMusic() {
        return null;
    }

    public final MusicList getStickPointMusicList(int i, int i2, int i3, String str) throws Exception {
        if (C24954a.m60699b()) {
            return (MusicList) MusicApi.f95243a.fetchCommerceStickPointMusicList(i, i2, i3, str).get();
        }
        return (MusicList) MusicApi.f95243a.fetchStickPointMusicList(i, i2, i3, str).get();
    }
}

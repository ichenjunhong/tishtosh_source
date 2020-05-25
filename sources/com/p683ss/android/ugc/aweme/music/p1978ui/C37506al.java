package com.p683ss.android.ugc.aweme.music.p1978ui;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.adapter.C37301j.C37302a;
import com.p683ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.ui.al */
final /* synthetic */ class C37506al implements C37302a {

    /* renamed from: a */
    private final MusicDetailFragment f95696a;

    /* renamed from: b */
    private final List f95697b;

    C37506al(MusicDetailFragment musicDetailFragment, List list) {
        this.f95696a = musicDetailFragment;
        this.f95697b = list;
    }

    /* renamed from: a */
    public final void mo76604a(int i) {
        MusicDetailFragment musicDetailFragment = this.f95696a;
        List list = this.f95697b;
        if (i >= 0 && i < list.size()) {
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) list.get(i);
            if (musicOwnerInfo.getEnterType() == 1) {
                C26890h.m65011a("click_musician_profile", C23089d.m56640a().mo47829a("author_id", musicOwnerInfo.getUid()).mo47829a("enter_from", "single_song").mo47829a("type", musicDetailFragment.f95558p).mo47829a("music_id", musicDetailFragment.f95553k).f61491a);
            } else {
                C26890h.m65011a("click_musician_profile", C23089d.m56640a().mo47829a("author_id", musicOwnerInfo.getUid()).mo47829a("music_id", musicDetailFragment.f95553k).mo47829a("type", musicDetailFragment.f95557o).mo47829a("enter_from", "single_song").f61491a);
            }
            musicDetailFragment.mo76975a(musicOwnerInfo);
        }
    }
}

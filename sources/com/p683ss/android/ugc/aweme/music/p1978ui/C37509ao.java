package com.p683ss.android.ugc.aweme.music.p1978ui;

import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.adapter.C37313p.C37314a;
import com.p683ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ao */
final /* synthetic */ class C37509ao implements C37314a {

    /* renamed from: a */
    private final MusicDetailFragment f95701a;

    /* renamed from: b */
    private final List f95702b;

    C37509ao(MusicDetailFragment musicDetailFragment, List list) {
        this.f95701a = musicDetailFragment;
        this.f95702b = list;
    }

    /* renamed from: a */
    public final void mo76608a(int i) {
        MusicDetailFragment musicDetailFragment = this.f95701a;
        List list = this.f95702b;
        if (i >= 0 && i < list.size()) {
            ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) list.get(i);
            musicDetailFragment.mo76974a(externalMusicInfo);
            HashMap hashMap = new HashMap();
            hashMap.put("music_id", externalMusicInfo.getPartnerSongId());
            hashMap.put("music_from", externalMusicInfo.getPartnerName());
            hashMap.put("process_id", musicDetailFragment.f95559q);
            C26890h.m65011a("click_copyright_music", (Map<String, String>) hashMap);
        }
    }
}

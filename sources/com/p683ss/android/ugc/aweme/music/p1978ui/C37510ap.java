package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ap */
final /* synthetic */ class C37510ap implements OnClickListener {

    /* renamed from: a */
    private final MusicDetailFragment f95703a;

    /* renamed from: b */
    private final List f95704b;

    C37510ap(MusicDetailFragment musicDetailFragment, List list) {
        this.f95703a = musicDetailFragment;
        this.f95704b = list;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) this.f95704b.get(0);
        this.f95703a.mo76974a(externalMusicInfo);
        HashMap hashMap = new HashMap();
        hashMap.put("music_id", externalMusicInfo.getPartnerSongId());
        hashMap.put("music_from", externalMusicInfo.getPartnerName());
        C26890h.m65011a("click_copyright_music", (Map<String, String>) hashMap);
    }
}

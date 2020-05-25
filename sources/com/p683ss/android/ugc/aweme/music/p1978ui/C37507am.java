package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;

/* renamed from: com.ss.android.ugc.aweme.music.ui.am */
final /* synthetic */ class C37507am implements OnClickListener {

    /* renamed from: a */
    private final MusicDetailFragment f95698a;

    /* renamed from: b */
    private final Music f95699b;

    C37507am(MusicDetailFragment musicDetailFragment, Music music) {
        this.f95698a = musicDetailFragment;
        this.f95699b = music;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        MusicDetailFragment musicDetailFragment = this.f95698a;
        Music music = this.f95699b;
        if (!C32800a.m75679a(view)) {
            SmartRouter.buildRoute((Context) musicDetailFragment.getActivity(), "aweme://music/similar").withParam("music_id", music.getMid()).withParam("music_title", music.getMusicName()).withParam("anthor_id", music.getOwnerId()).withParam("enter_type", "music_detail").open();
            C26890h.m65011a("click_similar_song_entrance", C23089d.m56640a().mo47829a("enter_from", "single_song").mo47829a("music_id", music.getMid()).mo47829a("author_id", music.getOwnerId()).f61491a);
        }
    }
}

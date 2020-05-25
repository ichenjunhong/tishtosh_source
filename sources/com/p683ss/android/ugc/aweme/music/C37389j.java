package com.p683ss.android.ugc.aweme.music;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.music.j */
public final /* synthetic */ class C37389j implements OnClickListener {

    /* renamed from: a */
    private final OriginMusicViewHolder f95381a;

    public C37389j(OriginMusicViewHolder originMusicViewHolder) {
        this.f95381a = originMusicViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        OriginMusicViewHolder originMusicViewHolder = this.f95381a;
        if (originMusicViewHolder.f95017a != null && MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(originMusicViewHolder.f95017a, originMusicViewHolder.itemView.getContext(), true)) {
            originMusicViewHolder.f95018b = !originMusicViewHolder.f95018b;
            if (originMusicViewHolder.f95018b) {
                C26890h.m65011a("favourite_song", new C23089d().mo47829a("enter_from", "personal_homepage_list").mo47829a("previous_page", originMusicViewHolder.f95020d).mo47829a("music_id", originMusicViewHolder.f95017a.getMusicId()).mo47829a("enter_method", "personal_list").f61491a);
            } else {
                C26890h.m65011a("cancel_favourite_song", new C23089d().mo47829a("enter_from", "personal_homepage_list").mo47829a("previous_page", originMusicViewHolder.f95020d).mo47829a("music_id", originMusicViewHolder.f95017a.getMusicId()).mo47829a("enter_method", "personal_list").f61491a);
            }
            boolean z = originMusicViewHolder.f95018b;
            C47718bf.m103288a(new C37351d(z ? 1 : 0, originMusicViewHolder.f95017a));
            originMusicViewHolder.mIvMusicCollect.mo76959b();
        }
    }
}

package com.p683ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24989j;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw.C37523a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.g */
final /* synthetic */ class C25050g implements C24989j {

    /* renamed from: a */
    private final StickerMusicWidget f66366a;

    C25050g(StickerMusicWidget stickerMusicWidget) {
        this.f66366a = stickerMusicWidget;
    }

    /* renamed from: a */
    public final void mo50703a(MusicItemViewHolder musicItemViewHolder, View view, MusicModel musicModel, int i) {
        StickerMusicWidget stickerMusicWidget = this.f66366a;
        int id = view.getId();
        if (id == R.id.b2l) {
            Activity g = C11016e.m22312g();
            if (g != null) {
                g.getString(R.string.b17);
            }
            if (!AccountService.createIAccountServicebyMonsterPlugin().userService().isLogin()) {
                C27965f.m66720a(C11016e.m22312g(), C24964d.m60737a(i), "click_favorite_music", (Bundle) null);
                return;
            }
            musicItemViewHolder.mo51014c();
            C24963c.m60725a(musicItemViewHolder.f66228a, musicModel.getMusicId(), stickerMusicWidget.f66354l, musicItemViewHolder.f66231d, musicModel.getLogPb());
            return;
        }
        if (id == R.id.b2n) {
            if (musicModel != null && musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                String offlineDesc = musicModel.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = view.getContext().getString(R.string.ce6);
                }
                C10691a.m21551c(view.getContext(), offlineDesc).mo19066a();
            } else if (musicModel != null && C37378c.m83700a(musicModel, view.getContext(), true)) {
                String uuid = UUID.randomUUID().toString();
                C41302w a = C41302w.m91042a();
                StringBuilder sb = new StringBuilder("aweme://music/detail/");
                sb.append(musicModel.getMusicId());
                a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("process_id", uuid).mo83871a());
                C24963c.m60719a(new C24803a("change_music_page", "attached_song", "click_button", C24963c.m60726b()), musicModel.getMusicId(), false, uuid);
            }
        } else if (id == R.id.bg1) {
            if (stickerMusicWidget.f66351i == musicItemViewHolder.f66231d && ((Integer) stickerMusicWidget.f62238e.mo48230b("music_position", Integer.valueOf(-1))).intValue() == -2) {
                stickerMusicWidget.f62238e.mo48228a("music_position", (Object) Integer.valueOf(-1));
                stickerMusicWidget.f62238e.mo48228a("music_index", (Object) Integer.valueOf(-1));
                stickerMusicWidget.mo51053d();
                return;
            }
            if (stickerMusicWidget.f66350h != null) {
                stickerMusicWidget.mo51053d();
                C24963c.m60715a(musicItemViewHolder.f66231d);
                C24803a aVar = new C24803a("change_music_page", "prop", "", C24963c.m60726b());
                aVar.f65646f = (String) stickerMusicWidget.f62238e.mo48230b("sticker_id", null);
                stickerMusicWidget.f66350h.mo50731a((C37523a) new C25051h(stickerMusicWidget));
                stickerMusicWidget.f66350h.mo50733a(musicModel, aVar);
            }
            stickerMusicWidget.f62238e.mo48228a("music_position", (Object) Integer.valueOf(-2));
            stickerMusicWidget.f62238e.mo48228a("music_index", (Object) Integer.valueOf(musicItemViewHolder.f66231d));
            stickerMusicWidget.f62238e.mo48228a("music_loading", (Object) Boolean.valueOf(true));
        } else if (id == R.id.bgp) {
            if (stickerMusicWidget.f66356n != null) {
                stickerMusicWidget.f66356n.mo50737c(9);
            }
            if (stickerMusicWidget.f66350h != null) {
                stickerMusicWidget.f66350h.mo50734b(musicModel);
                C24963c.m60717a(stickerMusicWidget.f66354l, musicModel.getMusicId(), musicItemViewHolder.f66231d, musicModel.getLogPb());
            }
        }
    }
}

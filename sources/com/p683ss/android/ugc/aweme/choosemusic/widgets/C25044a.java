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

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.a */
final /* synthetic */ class C25044a implements C24989j {

    /* renamed from: a */
    private final ChallengeMusicWidget f66359a;

    C25044a(ChallengeMusicWidget challengeMusicWidget) {
        this.f66359a = challengeMusicWidget;
    }

    /* renamed from: a */
    public final void mo50703a(MusicItemViewHolder musicItemViewHolder, View view, MusicModel musicModel, int i) {
        ChallengeMusicWidget challengeMusicWidget = this.f66359a;
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
            C24963c.m60725a(musicItemViewHolder.f66228a, musicModel.getMusicId(), challengeMusicWidget.f66315m, musicItemViewHolder.f66231d, musicModel.getLogPb());
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
                C24803a aVar = new C24803a("change_music_page", "attached_song", "click_button", C24963c.m60726b());
                aVar.f65647g = (String) challengeMusicWidget.f62238e.mo48230b("challenge_id", null);
                C24963c.m60719a(aVar, musicModel.getMusicId(), false, uuid);
            }
        } else if (id == R.id.bg1) {
            if (challengeMusicWidget.f66312j == musicItemViewHolder.f66231d && ((Integer) challengeMusicWidget.f62238e.mo48230b("music_position", Integer.valueOf(-1))).intValue() == -2) {
                challengeMusicWidget.f62238e.mo48228a("music_position", (Object) Integer.valueOf(-1));
                challengeMusicWidget.f62238e.mo48228a("music_index", (Object) Integer.valueOf(-1));
                musicItemViewHolder.mo51012a(false, false);
                challengeMusicWidget.mo51045d();
                return;
            }
            if (challengeMusicWidget.f66311i != null) {
                challengeMusicWidget.mo51045d();
                C24963c.m60715a(musicItemViewHolder.f66231d);
                C24803a aVar2 = new C24803a("change_music_page", "attached_song", "", C24963c.m60726b());
                aVar2.f65647g = (String) challengeMusicWidget.f62238e.mo48230b("challenge_id", null);
                challengeMusicWidget.f66311i.mo50733a(musicModel, aVar2);
                challengeMusicWidget.f66311i.mo50731a((C37523a) new C25045b(challengeMusicWidget));
            }
            challengeMusicWidget.f62238e.mo48228a("music_position", (Object) Integer.valueOf(-2));
            challengeMusicWidget.f62238e.mo48228a("music_index", (Object) Integer.valueOf(musicItemViewHolder.f66231d));
            challengeMusicWidget.f62238e.mo48228a("music_loading", (Object) Boolean.valueOf(true));
        } else if (id == R.id.bgp) {
            if (challengeMusicWidget.f66317o != null) {
                challengeMusicWidget.f66317o.mo50737c(10);
            }
            if (challengeMusicWidget.f66311i != null) {
                challengeMusicWidget.f66311i.mo50734b(musicModel);
                C24963c.m60717a(challengeMusicWidget.f66315m, musicModel.getMusicId(), musicItemViewHolder.f66231d, musicModel.getLogPb());
            }
        }
    }
}

package com.p683ss.android.ugc.aweme.choosemusic.widgets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24989j;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw.C37523a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.d */
final /* synthetic */ class C25047d implements C24989j {

    /* renamed from: a */
    private final MusicBoardWidget f66362a;

    /* renamed from: b */
    private final MusicCollectionItem f66363b;

    C25047d(MusicBoardWidget musicBoardWidget, MusicCollectionItem musicCollectionItem) {
        this.f66362a = musicBoardWidget;
        this.f66363b = musicCollectionItem;
    }

    /* renamed from: a */
    public final void mo50703a(MusicItemViewHolder musicItemViewHolder, View view, MusicModel musicModel, int i) {
        MusicBoardWidget musicBoardWidget = this.f66362a;
        MusicCollectionItem musicCollectionItem = this.f66363b;
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
            C24963c.m60725a(musicItemViewHolder.f66228a, musicModel.getMusicId(), musicBoardWidget.f66327n, musicItemViewHolder.f66231d, musicModel.getLogPb());
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
                C24963c.m60719a(musicBoardWidget.f66327n, musicModel.getMusicId(), false, uuid);
            }
        } else if (id == R.id.dhi) {
            Intent intent = new Intent(musicBoardWidget.f62235b, MusicDetailListActivity.class);
            if (musicBoardWidget.f66324k == 0) {
                intent.putExtra("music_type", 1);
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.f66326m);
            } else {
                intent.putExtra("music_class_id", musicCollectionItem.mcId);
                intent.putExtra("music_class_name", musicCollectionItem.mcName);
                intent.putExtra("music_type", 2);
                intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
                intent.putExtra("music_class_enter_method", "click_more");
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicBoardWidget.f66326m);
            }
            musicBoardWidget.mo48240a(intent, musicBoardWidget.f66325l);
            C24963c.m60724a(musicCollectionItem.mcName, "click_more", "", "change_music_page", musicCollectionItem.mcId);
        } else if (id == R.id.bg1) {
            if (musicItemViewHolder != null && musicModel != null) {
                if (musicBoardWidget.f66323j == musicItemViewHolder.f66231d && ((Integer) musicBoardWidget.f62238e.mo48230b("music_position", Integer.valueOf(-1))).intValue() == musicBoardWidget.f66324k) {
                    musicBoardWidget.f62238e.mo48228a("music_position", (Object) Integer.valueOf(-1));
                    musicBoardWidget.f62238e.mo48228a("music_index", (Object) Integer.valueOf(-1));
                    musicItemViewHolder.mo51012a(false, false);
                    musicBoardWidget.mo51049f();
                    return;
                }
                if (musicBoardWidget.f66321h != null) {
                    musicBoardWidget.mo51049f();
                    musicBoardWidget.f66321h.mo50731a((C37523a) new C25048e(musicBoardWidget));
                    musicBoardWidget.f66321h.mo50733a(musicModel, musicBoardWidget.f66327n);
                    C24963c.m60715a(musicItemViewHolder.f66231d);
                }
                musicBoardWidget.f62238e.mo48228a("music_position", (Object) Integer.valueOf(musicBoardWidget.f66324k));
                musicBoardWidget.f62238e.mo48228a("music_index", (Object) Integer.valueOf(musicItemViewHolder.f66231d));
                musicBoardWidget.f62238e.mo48228a("music_loading", (Object) Boolean.valueOf(true));
            }
        } else if (!(id != R.id.bgp || musicBoardWidget.f66321h == null || musicModel == null)) {
            musicBoardWidget.f66321h.mo50734b(musicModel);
            C24963c.m60717a(musicBoardWidget.f66327n, musicModel.getMusicId(), musicBoardWidget.f66324k, musicModel.getLogPb());
        }
    }
}

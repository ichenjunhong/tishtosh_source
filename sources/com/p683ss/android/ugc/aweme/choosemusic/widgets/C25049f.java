package com.p683ss.android.ugc.aweme.choosemusic.widgets;

import android.content.Intent;
import com.p683ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24834c;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.widgets.f */
final /* synthetic */ class C25049f implements C24834c {

    /* renamed from: a */
    private final MusicClassWidget f66365a;

    C25049f(MusicClassWidget musicClassWidget) {
        this.f66365a = musicClassWidget;
    }

    /* renamed from: a */
    public final void mo50735a(MusicCollectionItem musicCollectionItem, int i) {
        MusicClassWidget musicClassWidget = this.f66365a;
        Intent intent = new Intent(musicClassWidget.f62235b, MusicDetailListActivity.class);
        intent.putExtra("music_type", 2);
        intent.putExtra("music_class_id", musicCollectionItem.mcId);
        intent.putExtra("music_class_name", musicCollectionItem.mcName);
        intent.putExtra("music_category_is_hot", musicCollectionItem.isHot);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", musicClassWidget.f66337j);
        intent.putExtra("music_class_enter_method", "click_category_list");
        musicClassWidget.mo48240a(intent, musicClassWidget.f66336i);
        C24963c.m60724a(musicCollectionItem.mcName, "click_category_list", "", "change_music_page", musicCollectionItem.mcId);
    }
}

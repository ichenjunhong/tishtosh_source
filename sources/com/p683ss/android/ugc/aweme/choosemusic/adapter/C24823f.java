package com.p683ss.android.ugc.aweme.choosemusic.adapter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.f */
final /* synthetic */ class C24823f implements OnClickListener {

    /* renamed from: a */
    private final C42482c f65717a;

    /* renamed from: b */
    private final MusicModel f65718b;

    C24823f(C42482c cVar, MusicModel musicModel) {
        this.f65717a = cVar;
        this.f65718b = musicModel;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C42482c cVar = this.f65717a;
        MusicModel musicModel = this.f65718b;
        C26890h.m65011a("overwrite_song_toast_cancel", C24963c.m60735g().mo47829a("music_id", musicModel.getMusicId()).mo47829a("origin_music_id", cVar == null ? "" : cVar.mid).f61491a);
    }
}

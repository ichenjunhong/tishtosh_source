package com.p683ss.android.ugc.aweme.choosemusic.adapter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.g */
final /* synthetic */ class C24824g implements OnClickListener {

    /* renamed from: a */
    private final C248182 f65719a;

    /* renamed from: b */
    private final MusicModel f65720b;

    /* renamed from: c */
    private final MusicItemViewHolder f65721c;

    /* renamed from: d */
    private final C42482c f65722d;

    C24824g(C248182 r1, MusicModel musicModel, MusicItemViewHolder musicItemViewHolder, C42482c cVar) {
        this.f65719a = r1;
        this.f65720b = musicModel;
        this.f65721c = musicItemViewHolder;
        this.f65722d = cVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        C248182 r5 = this.f65719a;
        MusicModel musicModel = this.f65720b;
        MusicItemViewHolder musicItemViewHolder = this.f65721c;
        C42482c cVar = this.f65722d;
        C24816b.this.f65695a.mo50734b(musicModel);
        C24963c.m60717a(C24816b.this.f65700f, musicModel.getMusicId(), musicItemViewHolder.getLayoutPosition(), musicModel.getLogPb());
        if (cVar == null) {
            str = "";
        } else {
            str = cVar.mid;
        }
        C26890h.m65011a("overwrite_song_toast_confirm", C24963c.m60735g().mo47829a("music_id", musicModel.getMusicId()).mo47829a("origin_music_id", str).f61491a);
    }
}

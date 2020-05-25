package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemNoLyricViewHolder_ViewBinding */
public class MusicItemNoLyricViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicItemNoLyricViewHolder f66226a;

    public void unbind() {
        MusicItemNoLyricViewHolder musicItemNoLyricViewHolder = this.f66226a;
        if (musicItemNoLyricViewHolder != null) {
            this.f66226a = null;
            musicItemNoLyricViewHolder.mIvMusicCover = null;
            musicItemNoLyricViewHolder.mOriginalTag = null;
            musicItemNoLyricViewHolder.mIvMusicMark = null;
            musicItemNoLyricViewHolder.mTvMusicName = null;
            musicItemNoLyricViewHolder.mTvMusicSinger = null;
            musicItemNoLyricViewHolder.mTvMusicDuration = null;
            musicItemNoLyricViewHolder.mIvMusicMask2 = null;
            musicItemNoLyricViewHolder.mTvNotSupportLyric = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicItemNoLyricViewHolder_ViewBinding(MusicItemNoLyricViewHolder musicItemNoLyricViewHolder, View view) {
        this.f66226a = musicItemNoLyricViewHolder;
        musicItemNoLyricViewHolder.mIvMusicCover = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.azj, "field 'mIvMusicCover'", SmartImageView.class);
        musicItemNoLyricViewHolder.mOriginalTag = (ImageView) Utils.findRequiredViewAsType(view, R.id.b2v, "field 'mOriginalTag'", ImageView.class);
        musicItemNoLyricViewHolder.mIvMusicMark = (ImageView) Utils.findRequiredViewAsType(view, R.id.b2o, "field 'mIvMusicMark'", ImageView.class);
        musicItemNoLyricViewHolder.mTvMusicName = (TextView) Utils.findRequiredViewAsType(view, R.id.dcn, "field 'mTvMusicName'", TextView.class);
        musicItemNoLyricViewHolder.mTvMusicSinger = (TextView) Utils.findRequiredViewAsType(view, R.id.dg2, "field 'mTvMusicSinger'", TextView.class);
        musicItemNoLyricViewHolder.mTvMusicDuration = (TextView) Utils.findRequiredViewAsType(view, R.id.dcf, "field 'mTvMusicDuration'", TextView.class);
        musicItemNoLyricViewHolder.mIvMusicMask2 = (ImageView) Utils.findRequiredViewAsType(view, R.id.ef8, "field 'mIvMusicMask2'", ImageView.class);
        musicItemNoLyricViewHolder.mTvNotSupportLyric = (TextView) Utils.findRequiredViewAsType(view, R.id.f3m, "field 'mTvNotSupportLyric'", TextView.class);
    }
}

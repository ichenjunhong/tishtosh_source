package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder_ViewBinding */
public class MusicItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicItemViewHolder f66245a;

    /* renamed from: b */
    private View f66246b;

    /* renamed from: c */
    private View f66247c;

    /* renamed from: d */
    private View f66248d;

    /* renamed from: e */
    private View f66249e;

    public void unbind() {
        MusicItemViewHolder musicItemViewHolder = this.f66245a;
        if (musicItemViewHolder != null) {
            this.f66245a = null;
            musicItemViewHolder.mIvMusicCover = null;
            musicItemViewHolder.mOriginalTag = null;
            musicItemViewHolder.mIvMusicMark = null;
            musicItemViewHolder.mIvPlayView = null;
            musicItemViewHolder.mTvMusicName = null;
            musicItemViewHolder.mTvMusicSinger = null;
            musicItemViewHolder.mIvMusicCollect = null;
            musicItemViewHolder.mIvMusicDetail = null;
            musicItemViewHolder.mLlUseToShoot = null;
            musicItemViewHolder.mIvUseToShoot = null;
            musicItemViewHolder.mTvUseToShoot = null;
            musicItemViewHolder.mRlUseContainer = null;
            musicItemViewHolder.mLlItemContainer = null;
            musicItemViewHolder.mRLCoverContainer = null;
            musicItemViewHolder.mLlTitltContainer = null;
            musicItemViewHolder.mSpaceView = null;
            musicItemViewHolder.mTvMusicDuration = null;
            musicItemViewHolder.mMusicTagsContainer = null;
            this.f66246b.setOnClickListener(null);
            this.f66246b = null;
            this.f66247c.setOnClickListener(null);
            this.f66247c = null;
            this.f66248d.setOnClickListener(null);
            this.f66248d = null;
            this.f66249e.setOnClickListener(null);
            this.f66249e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicItemViewHolder_ViewBinding(final MusicItemViewHolder musicItemViewHolder, View view) {
        this.f66245a = musicItemViewHolder;
        musicItemViewHolder.mIvMusicCover = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.azj, "field 'mIvMusicCover'", SmartImageView.class);
        musicItemViewHolder.mOriginalTag = (ImageView) Utils.findRequiredViewAsType(view, R.id.b2v, "field 'mOriginalTag'", ImageView.class);
        musicItemViewHolder.mIvMusicMark = (ImageView) Utils.findRequiredViewAsType(view, R.id.b2o, "field 'mIvMusicMark'", ImageView.class);
        musicItemViewHolder.mIvPlayView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b4e, "field 'mIvPlayView'", ImageView.class);
        musicItemViewHolder.mTvMusicName = (TextView) Utils.findRequiredViewAsType(view, R.id.dcn, "field 'mTvMusicName'", TextView.class);
        musicItemViewHolder.mTvMusicSinger = (TextView) Utils.findRequiredViewAsType(view, R.id.dg2, "field 'mTvMusicSinger'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b2l, "field 'mIvMusicCollect' and method 'onClick'");
        musicItemViewHolder.mIvMusicCollect = (CheckableImageView) Utils.castView(findRequiredView, R.id.b2l, "field 'mIvMusicCollect'", CheckableImageView.class);
        this.f66246b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicItemViewHolder.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.b2n, "field 'mIvMusicDetail' and method 'onClick'");
        musicItemViewHolder.mIvMusicDetail = (ImageView) Utils.castView(findRequiredView2, R.id.b2n, "field 'mIvMusicDetail'", ImageView.class);
        this.f66247c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicItemViewHolder.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.bgp, "field 'mLlUseToShoot' and method 'onClick'");
        musicItemViewHolder.mLlUseToShoot = (ViewGroup) Utils.castView(findRequiredView3, R.id.bgp, "field 'mLlUseToShoot'", ViewGroup.class);
        this.f66248d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicItemViewHolder.onClick(view);
            }
        });
        musicItemViewHolder.mIvUseToShoot = (ImageView) Utils.findRequiredViewAsType(view, R.id.b59, "field 'mIvUseToShoot'", ImageView.class);
        musicItemViewHolder.mTvUseToShoot = (TextView) Utils.findRequiredViewAsType(view, R.id.di8, "field 'mTvUseToShoot'", TextView.class);
        musicItemViewHolder.mRlUseContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ce7, "field 'mRlUseContainer'", ViewGroup.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.bg1, "field 'mLlItemContainer' and method 'onClick'");
        musicItemViewHolder.mLlItemContainer = (ViewGroup) Utils.castView(findRequiredView4, R.id.bg1, "field 'mLlItemContainer'", ViewGroup.class);
        this.f66249e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicItemViewHolder.onClick(view);
            }
        });
        musicItemViewHolder.mRLCoverContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cdb, "field 'mRLCoverContainer'", ViewGroup.class);
        musicItemViewHolder.mLlTitltContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.bgm, "field 'mLlTitltContainer'", ViewGroup.class);
        musicItemViewHolder.mSpaceView = Utils.findRequiredView(view, R.id.dte, "field 'mSpaceView'");
        musicItemViewHolder.mTvMusicDuration = (TextView) Utils.findRequiredViewAsType(view, R.id.dcf, "field 'mTvMusicDuration'", TextView.class);
        musicItemViewHolder.mMusicTagsContainer = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.emg, "field 'mMusicTagsContainer'", RecyclerView.class);
    }
}

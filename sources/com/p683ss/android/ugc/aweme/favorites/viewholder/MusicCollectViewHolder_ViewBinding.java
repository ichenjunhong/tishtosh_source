package com.p683ss.android.ugc.aweme.favorites.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MusicCollectViewHolder_ViewBinding */
public class MusicCollectViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicCollectViewHolder f77718a;

    /* renamed from: b */
    private View f77719b;

    /* renamed from: c */
    private View f77720c;

    /* renamed from: d */
    private View f77721d;

    public void unbind() {
        MusicCollectViewHolder musicCollectViewHolder = this.f77718a;
        if (musicCollectViewHolder != null) {
            this.f77718a = null;
            musicCollectViewHolder.mNameView = null;
            musicCollectViewHolder.mOriginalTag = null;
            musicCollectViewHolder.mSingerView = null;
            musicCollectViewHolder.mCoverView = null;
            musicCollectViewHolder.mRightView = null;
            musicCollectViewHolder.mPlayView = null;
            musicCollectViewHolder.mTopView = null;
            musicCollectViewHolder.mProgressBarView = null;
            musicCollectViewHolder.musicItemll = null;
            musicCollectViewHolder.mMusicDuration = null;
            musicCollectViewHolder.mOkView = null;
            this.f77719b.setOnClickListener(null);
            this.f77719b = null;
            this.f77720c.setOnClickListener(null);
            this.f77720c = null;
            this.f77721d.setOnClickListener(null);
            this.f77721d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicCollectViewHolder_ViewBinding(final MusicCollectViewHolder musicCollectViewHolder, View view) {
        this.f77718a = musicCollectViewHolder;
        musicCollectViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, R.id.dcn, "field 'mNameView'", TextView.class);
        musicCollectViewHolder.mOriginalTag = (ImageView) Utils.findRequiredViewAsType(view, R.id.b2v, "field 'mOriginalTag'", ImageView.class);
        musicCollectViewHolder.mSingerView = (TextView) Utils.findRequiredViewAsType(view, R.id.dg2, "field 'mSingerView'", TextView.class);
        musicCollectViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.ci1, "field 'mCoverView'", RemoteImageView.class);
        musicCollectViewHolder.mRightView = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.cds, "field 'mRightView'", RelativeLayout.class);
        musicCollectViewHolder.mPlayView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b4e, "field 'mPlayView'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.bgn, "field 'mTopView' and method 'onClick'");
        musicCollectViewHolder.mTopView = (LinearLayout) Utils.castView(findRequiredView, R.id.bgn, "field 'mTopView'", LinearLayout.class);
        this.f77719b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicCollectViewHolder.onClick(view);
            }
        });
        musicCollectViewHolder.mProgressBarView = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.bwy, "field 'mProgressBarView'", ProgressBar.class);
        musicCollectViewHolder.musicItemll = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bo9, "field 'musicItemll'", LinearLayout.class);
        musicCollectViewHolder.mMusicDuration = (TextView) Utils.findRequiredViewAsType(view, R.id.v5, "field 'mMusicDuration'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.cdm, "field 'mOkView' and method 'onClick'");
        musicCollectViewHolder.mOkView = (RelativeLayout) Utils.castView(findRequiredView2, R.id.cdm, "field 'mOkView'", RelativeLayout.class);
        this.f77720c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicCollectViewHolder.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.bo5, "method 'onClick'");
        this.f77721d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicCollectViewHolder.onClick(view);
            }
        });
    }
}

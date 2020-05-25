package com.p683ss.android.ugc.aweme.music.adapter;

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
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder_ViewBinding */
public class MusicUnitViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicUnitViewHolder f95131a;

    /* renamed from: b */
    private View f95132b;

    /* renamed from: c */
    private View f95133c;

    /* renamed from: d */
    private View f95134d;

    /* renamed from: e */
    private View f95135e;

    public void unbind() {
        MusicUnitViewHolder musicUnitViewHolder = this.f95131a;
        if (musicUnitViewHolder != null) {
            this.f95131a = null;
            musicUnitViewHolder.mNameView = null;
            musicUnitViewHolder.mSingerView = null;
            musicUnitViewHolder.mDurationView = null;
            musicUnitViewHolder.mCoverView = null;
            musicUnitViewHolder.mOkView = null;
            musicUnitViewHolder.mRightView = null;
            musicUnitViewHolder.mPlayView = null;
            musicUnitViewHolder.mTopView = null;
            musicUnitViewHolder.mProgressBarView = null;
            musicUnitViewHolder.musicDetailContainer = null;
            musicUnitViewHolder.musicItemll = null;
            musicUnitViewHolder.ivDetail = null;
            musicUnitViewHolder.divider = null;
            musicUnitViewHolder.ivCollectFrame = null;
            musicUnitViewHolder.ivMusicCollect = null;
            musicUnitViewHolder.ivOriginMusicMark = null;
            this.f95132b.setOnClickListener(null);
            this.f95132b = null;
            this.f95133c.setOnClickListener(null);
            this.f95133c = null;
            this.f95134d.setOnClickListener(null);
            this.f95134d = null;
            this.f95135e.setOnClickListener(null);
            this.f95135e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicUnitViewHolder_ViewBinding(final MusicUnitViewHolder musicUnitViewHolder, View view) {
        this.f95131a = musicUnitViewHolder;
        musicUnitViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, R.id.dcn, "field 'mNameView'", TextView.class);
        musicUnitViewHolder.mSingerView = (TextView) Utils.findRequiredViewAsType(view, R.id.dg2, "field 'mSingerView'", TextView.class);
        musicUnitViewHolder.mDurationView = (TextView) Utils.findRequiredViewAsType(view, R.id.d9m, "field 'mDurationView'", TextView.class);
        musicUnitViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.ci1, "field 'mCoverView'", RemoteImageView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.cdm, "field 'mOkView' and method 'onClick'");
        musicUnitViewHolder.mOkView = (LinearLayout) Utils.castView(findRequiredView, R.id.cdm, "field 'mOkView'", LinearLayout.class);
        this.f95132b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicUnitViewHolder.onClick(view);
            }
        });
        musicUnitViewHolder.mRightView = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.cds, "field 'mRightView'", RelativeLayout.class);
        musicUnitViewHolder.mPlayView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b4e, "field 'mPlayView'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bgn, "field 'mTopView' and method 'onClick'");
        musicUnitViewHolder.mTopView = (LinearLayout) Utils.castView(findRequiredView2, R.id.bgn, "field 'mTopView'", LinearLayout.class);
        this.f95133c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicUnitViewHolder.onClick(view);
            }
        });
        musicUnitViewHolder.mProgressBarView = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.bwy, "field 'mProgressBarView'", ProgressBar.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.bo6, "field 'musicDetailContainer' and method 'onClick'");
        musicUnitViewHolder.musicDetailContainer = (LinearLayout) Utils.castView(findRequiredView3, R.id.bo6, "field 'musicDetailContainer'", LinearLayout.class);
        this.f95134d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicUnitViewHolder.onClick(view);
            }
        });
        musicUnitViewHolder.musicItemll = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bo9, "field 'musicItemll'", LinearLayout.class);
        musicUnitViewHolder.ivDetail = (ImageView) Utils.findRequiredViewAsType(view, R.id.bo5, "field 'ivDetail'", ImageView.class);
        musicUnitViewHolder.divider = Utils.findRequiredView(view, R.id.box, "field 'divider'");
        View findRequiredView4 = Utils.findRequiredView(view, R.id.v0, "field 'ivCollectFrame' and method 'onClick'");
        musicUnitViewHolder.ivCollectFrame = (LinearLayout) Utils.castView(findRequiredView4, R.id.v0, "field 'ivCollectFrame'", LinearLayout.class);
        this.f95135e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicUnitViewHolder.onClick(view);
            }
        });
        musicUnitViewHolder.ivMusicCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, R.id.bo0, "field 'ivMusicCollect'", CheckableImageView.class);
        musicUnitViewHolder.ivOriginMusicMark = (ImageView) Utils.findRequiredViewAsType(view, R.id.bvc, "field 'ivOriginMusicMark'", ImageView.class);
    }
}

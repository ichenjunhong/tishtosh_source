package com.p683ss.android.ugc.aweme.music;

import android.support.constraint.ConstraintLayout;
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

/* renamed from: com.ss.android.ugc.aweme.music.OriginMusicViewHolder_ViewBinding */
public class OriginMusicViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private OriginMusicViewHolder f95023a;

    /* renamed from: b */
    private View f95024b;

    /* renamed from: c */
    private View f95025c;

    /* renamed from: d */
    private View f95026d;

    public void unbind() {
        OriginMusicViewHolder originMusicViewHolder = this.f95023a;
        if (originMusicViewHolder != null) {
            this.f95023a = null;
            originMusicViewHolder.mNameView = null;
            originMusicViewHolder.mDurationView = null;
            originMusicViewHolder.mCoverView = null;
            originMusicViewHolder.mOkView = null;
            originMusicViewHolder.mRightView = null;
            originMusicViewHolder.mPlayView = null;
            originMusicViewHolder.mTvConfirm = null;
            originMusicViewHolder.mTopView = null;
            originMusicViewHolder.mIvMusicCollect = null;
            originMusicViewHolder.mProgressBarView = null;
            originMusicViewHolder.musicItemll = null;
            originMusicViewHolder.ivDetail = null;
            originMusicViewHolder.txtUserCount = null;
            originMusicViewHolder.mTagView = null;
            this.f95024b.setOnClickListener(null);
            this.f95024b = null;
            this.f95025c.setOnClickListener(null);
            this.f95025c = null;
            this.f95026d.setOnClickListener(null);
            this.f95026d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public OriginMusicViewHolder_ViewBinding(final OriginMusicViewHolder originMusicViewHolder, View view) {
        this.f95023a = originMusicViewHolder;
        originMusicViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, R.id.dcn, "field 'mNameView'", TextView.class);
        originMusicViewHolder.mDurationView = (TextView) Utils.findRequiredViewAsType(view, R.id.d9m, "field 'mDurationView'", TextView.class);
        originMusicViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.ci1, "field 'mCoverView'", RemoteImageView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.cdm, "field 'mOkView' and method 'onClick'");
        originMusicViewHolder.mOkView = (RelativeLayout) Utils.castView(findRequiredView, R.id.cdm, "field 'mOkView'", RelativeLayout.class);
        this.f95024b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                originMusicViewHolder.onClick(view);
            }
        });
        originMusicViewHolder.mRightView = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.cds, "field 'mRightView'", ConstraintLayout.class);
        originMusicViewHolder.mPlayView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b4e, "field 'mPlayView'", ImageView.class);
        originMusicViewHolder.mTvConfirm = (TextView) Utils.findRequiredViewAsType(view, R.id.dkx, "field 'mTvConfirm'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bgn, "field 'mTopView' and method 'onClick'");
        originMusicViewHolder.mTopView = (LinearLayout) Utils.castView(findRequiredView2, R.id.bgn, "field 'mTopView'", LinearLayout.class);
        this.f95025c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                originMusicViewHolder.onClick(view);
            }
        });
        originMusicViewHolder.mIvMusicCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, R.id.b2l, "field 'mIvMusicCollect'", CheckableImageView.class);
        originMusicViewHolder.mProgressBarView = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.bwy, "field 'mProgressBarView'", ProgressBar.class);
        originMusicViewHolder.musicItemll = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bo9, "field 'musicItemll'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.bo5, "field 'ivDetail' and method 'onClick'");
        originMusicViewHolder.ivDetail = (ImageView) Utils.castView(findRequiredView3, R.id.bo5, "field 'ivDetail'", ImageView.class);
        this.f95026d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                originMusicViewHolder.onClick(view);
            }
        });
        originMusicViewHolder.txtUserCount = (TextView) Utils.findRequiredViewAsType(view, R.id.di_, "field 'txtUserCount'", TextView.class);
        originMusicViewHolder.mTagView = (TextView) Utils.findRequiredViewAsType(view, R.id.cx9, "field 'mTagView'", TextView.class);
    }
}

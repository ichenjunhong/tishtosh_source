package com.p683ss.android.ugc.aweme.feed.adapter;

import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.p683ss.android.ugc.aweme.feed.p1736ui.DebugInfoView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout;
import com.p683ss.android.ugc.aweme.setting.p2148ui.RestrictTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder_ViewBinding */
public class VideoViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private VideoViewHolder f78359a;

    /* renamed from: b */
    private View f78360b;

    /* renamed from: c */
    private View f78361c;

    /* renamed from: d */
    private View f78362d;

    public void unbind() {
        VideoViewHolder videoViewHolder = this.f78359a;
        if (videoViewHolder != null) {
            this.f78359a = null;
            videoViewHolder.mWidgetContainer = null;
            videoViewHolder.mCoverView = null;
            videoViewHolder.mVideoTagContainer = null;
            videoViewHolder.mBottomView = null;
            videoViewHolder.mGradualBottomView = null;
            videoViewHolder.mGradualTopView = null;
            videoViewHolder.mRestrictTextView = null;
            videoViewHolder.tagLayout = null;
            videoViewHolder.mIvRelieveTag = null;
            videoViewHolder.feedReportVotell = null;
            videoViewHolder.feedReportWarnll = null;
            videoViewHolder.adFeeDeductionLayout = null;
            videoViewHolder.llRightMenu = null;
            videoViewHolder.llAwemeIntro = null;
            videoViewHolder.mLongPressLayout = null;
            videoViewHolder.mRootView = null;
            videoViewHolder.mFullFeedStub = null;
            videoViewHolder.mTxtProhibited = null;
            videoViewHolder.mVoteStatusTextView = null;
            videoViewHolder.mAllowDisplayBtn = null;
            videoViewHolder.mDisallowDisplayBtn = null;
            videoViewHolder.mAvatarLayout = null;
            videoViewHolder.mShareTipImageView = null;
            videoViewHolder.shareTipsRl = null;
            videoViewHolder.shareTipsTv = null;
            videoViewHolder.flInteractLayout = null;
            videoViewHolder.mCornerTL = null;
            videoViewHolder.mCornerTR = null;
            videoViewHolder.mCornerBL = null;
            videoViewHolder.mCornerBR = null;
            videoViewHolder.mDebugInfoView = null;
            videoViewHolder.mlandscapeTipTv = null;
            videoViewHolder.commerceGoodHalfCardContainer = null;
            this.f78360b.setOnClickListener(null);
            this.f78360b = null;
            this.f78361c.setOnClickListener(null);
            this.f78361c = null;
            this.f78362d.setOnClickListener(null);
            this.f78362d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VideoViewHolder_ViewBinding(final VideoViewHolder videoViewHolder, View view) {
        this.f78359a = videoViewHolder;
        videoViewHolder.mWidgetContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.dv6, "field 'mWidgetContainer'", RelativeLayout.class);
        videoViewHolder.mCoverView = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.a22, "field 'mCoverView'", SmartImageView.class);
        videoViewHolder.mVideoTagContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.dq9, "field 'mVideoTagContainer'", ViewGroup.class);
        videoViewHolder.mBottomView = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.ll, "field 'mBottomView'", FrameLayout.class);
        videoViewHolder.mGradualBottomView = Utils.findRequiredView(view, R.id.amc, "field 'mGradualBottomView'");
        videoViewHolder.mGradualTopView = Utils.findRequiredView(view, R.id.ea0, "field 'mGradualTopView'");
        videoViewHolder.mRestrictTextView = (RestrictTextView) Utils.findRequiredViewAsType(view, R.id.des, "field 'mRestrictTextView'", RestrictTextView.class);
        videoViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.dq_, "field 'tagLayout'", TagLayout.class);
        videoViewHolder.mIvRelieveTag = (AnimationImageView) Utils.findRequiredViewAsType(view, R.id.dq1, "field 'mIvRelieveTag'", AnimationImageView.class);
        videoViewHolder.feedReportVotell = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.aek, "field 'feedReportVotell'", LinearLayout.class);
        videoViewHolder.feedReportWarnll = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.ael, "field 'feedReportWarnll'", ConstraintLayout.class);
        videoViewHolder.adFeeDeductionLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bo, "field 'adFeeDeductionLayout'", LinearLayout.class);
        videoViewHolder.llRightMenu = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ccn, "field 'llRightMenu'", LinearLayout.class);
        videoViewHolder.llAwemeIntro = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.id, "field 'llAwemeIntro'", ViewGroup.class);
        videoViewHolder.mLongPressLayout = (LongPressLayout) Utils.findRequiredViewAsType(view, R.id.bji, "field 'mLongPressLayout'", LongPressLayout.class);
        videoViewHolder.mRootView = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.drr, "field 'mRootView'", FrameLayout.class);
        videoViewHolder.mFullFeedStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.ak0, "field 'mFullFeedStub'", ViewStub.class);
        videoViewHolder.mTxtProhibited = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dkr, "field 'mTxtProhibited'", DmtTextView.class);
        videoViewHolder.mVoteStatusTextView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dih, "field 'mVoteStatusTextView'", DmtTextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.eo, "field 'mAllowDisplayBtn' and method 'onClick'");
        videoViewHolder.mAllowDisplayBtn = (DmtTextView) Utils.castView(findRequiredView, R.id.eo, "field 'mAllowDisplayBtn'", DmtTextView.class);
        this.f78360b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoViewHolder.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.a62, "field 'mDisallowDisplayBtn' and method 'onClick'");
        videoViewHolder.mDisallowDisplayBtn = (DmtTextView) Utils.castView(findRequiredView2, R.id.a62, "field 'mDisallowDisplayBtn'", DmtTextView.class);
        this.f78361c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoViewHolder.onClick(view);
            }
        });
        videoViewHolder.mAvatarLayout = Utils.findRequiredView(view, R.id.i1, "field 'mAvatarLayout'");
        videoViewHolder.mShareTipImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b0m, "field 'mShareTipImageView'", ImageView.class);
        videoViewHolder.shareTipsRl = Utils.findRequiredView(view, R.id.cmw, "field 'shareTipsRl'");
        videoViewHolder.shareTipsTv = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cmx, "field 'shareTipsTv'", DmtTextView.class);
        videoViewHolder.flInteractLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.auf, "field 'flInteractLayout'", FrameLayout.class);
        videoViewHolder.mCornerTL = (ImageView) Utils.findRequiredViewAsType(view, R.id.a0t, "field 'mCornerTL'", ImageView.class);
        videoViewHolder.mCornerTR = (ImageView) Utils.findRequiredViewAsType(view, R.id.a0u, "field 'mCornerTR'", ImageView.class);
        videoViewHolder.mCornerBL = (ImageView) Utils.findRequiredViewAsType(view, R.id.a0p, "field 'mCornerBL'", ImageView.class);
        videoViewHolder.mCornerBR = (ImageView) Utils.findRequiredViewAsType(view, R.id.a0q, "field 'mCornerBR'", ImageView.class);
        videoViewHolder.mDebugInfoView = (DebugInfoView) Utils.findRequiredViewAsType(view, R.id.a3j, "field 'mDebugInfoView'", DebugInfoView.class);
        videoViewHolder.mlandscapeTipTv = (TextView) Utils.findRequiredViewAsType(view, R.id.b6b, "field 'mlandscapeTipTv'", TextView.class);
        videoViewHolder.commerceGoodHalfCardContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.y0, "field 'commerceGoodHalfCardContainer'", FrameLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.title, "method 'onClick'");
        this.f78362d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                videoViewHolder.onClick(view);
            }
        });
    }
}

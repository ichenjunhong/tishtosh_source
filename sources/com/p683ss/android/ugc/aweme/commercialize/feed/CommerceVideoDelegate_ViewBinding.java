package com.p683ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout;
import com.p683ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.p683ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdRatingView;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdTagGroup;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.DescTextView;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p683ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView;
import com.p683ss.android.ugc.aweme.commercialize.views.CircleWaveLayout;
import com.p683ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate_ViewBinding */
public class CommerceVideoDelegate_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommerceVideoDelegate f68348a;

    /* renamed from: b */
    private View f68349b;

    /* renamed from: c */
    private View f68350c;

    /* renamed from: d */
    private View f68351d;

    /* renamed from: e */
    private View f68352e;

    /* renamed from: f */
    private View f68353f;

    /* renamed from: g */
    private View f68354g;

    /* renamed from: h */
    private View f68355h;

    /* renamed from: i */
    private View f68356i;

    /* renamed from: j */
    private View f68357j;

    /* renamed from: k */
    private View f68358k;

    /* renamed from: l */
    private View f68359l;

    /* renamed from: m */
    private View f68360m;

    /* renamed from: n */
    private View f68361n;

    /* renamed from: o */
    private View f68362o;

    /* renamed from: p */
    private View f68363p;

    public void unbind() {
        CommerceVideoDelegate commerceVideoDelegate = this.f68348a;
        if (commerceVideoDelegate != null) {
            this.f68348a = null;
            commerceVideoDelegate.adCircleWaveLayout = null;
            commerceVideoDelegate.mNativeAdBottomLabelView = null;
            commerceVideoDelegate.adHalfWebPageContainer = null;
            commerceVideoDelegate.blackMaskLayer = null;
            commerceVideoDelegate.diggLayout = null;
            commerceVideoDelegate.eggLayout = null;
            commerceVideoDelegate.eggViewStub = null;
            commerceVideoDelegate.adRedPacketIv = null;
            commerceVideoDelegate.adPendantIv = null;
            commerceVideoDelegate.flAdGuideRoot = null;
            commerceVideoDelegate.feedAdLayout = null;
            commerceVideoDelegate.feedAdDownloadBtn = null;
            commerceVideoDelegate.feedAdReplay = null;
            commerceVideoDelegate.introContainer = null;
            commerceVideoDelegate.mBottomView = null;
            commerceVideoDelegate.adGuideName = null;
            commerceVideoDelegate.adRatingView = null;
            commerceVideoDelegate.adLikeDivide = null;
            commerceVideoDelegate.adAppUseNumber = null;
            commerceVideoDelegate.adLikeLayout = null;
            commerceVideoDelegate.adTagGroup = null;
            commerceVideoDelegate.adGuideDesc = null;
            commerceVideoDelegate.adGuideIcon = null;
            commerceVideoDelegate.adGuideImage = null;
            commerceVideoDelegate.adGuideWebImage = null;
            commerceVideoDelegate.adGuideLabel = null;
            commerceVideoDelegate.adGuideTitle = null;
            commerceVideoDelegate.adPriceLayout = null;
            commerceVideoDelegate.adGuidePrice = null;
            commerceVideoDelegate.adGuideService = null;
            commerceVideoDelegate.mStarAtlasLinkViewStub = null;
            commerceVideoDelegate.mNationalTaskLinkViewStub = null;
            commerceVideoDelegate.mLinkTag = null;
            commerceVideoDelegate.mDouPlusLinkTag = null;
            commerceVideoDelegate.mIvRelieveTag = null;
            commerceVideoDelegate.mMicroTag = null;
            commerceVideoDelegate.vastAdTag = null;
            commerceVideoDelegate.vastAdTagAdChoice = null;
            commerceVideoDelegate.vastAdTagText = null;
            commerceVideoDelegate.feedStarAtlasCheckLL = null;
            commerceVideoDelegate.starAtlasCheckHintTv = null;
            commerceVideoDelegate.adFeeDeductionLayout = null;
            commerceVideoDelegate.feeDeductionHint = null;
            commerceVideoDelegate.mCleanModeAdTag = null;
            commerceVideoDelegate.mCleanModeAdTagContainer = null;
            this.f68349b.setOnClickListener(null);
            this.f68349b = null;
            this.f68350c.setOnClickListener(null);
            this.f68350c = null;
            this.f68351d.setOnClickListener(null);
            this.f68351d = null;
            this.f68352e.setOnClickListener(null);
            this.f68352e = null;
            this.f68353f.setOnClickListener(null);
            this.f68353f = null;
            this.f68354g.setOnClickListener(null);
            this.f68354g = null;
            this.f68355h.setOnClickListener(null);
            this.f68355h = null;
            this.f68356i.setOnClickListener(null);
            this.f68356i = null;
            this.f68357j.setOnClickListener(null);
            this.f68357j = null;
            this.f68358k.setOnClickListener(null);
            this.f68358k = null;
            this.f68359l.setOnClickListener(null);
            this.f68359l = null;
            this.f68360m.setOnClickListener(null);
            this.f68360m = null;
            this.f68361n.setOnClickListener(null);
            this.f68361n = null;
            this.f68362o.setOnClickListener(null);
            this.f68362o = null;
            this.f68363p.setOnClickListener(null);
            this.f68363p = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommerceVideoDelegate_ViewBinding(final CommerceVideoDelegate commerceVideoDelegate, View view) {
        this.f68348a = commerceVideoDelegate;
        commerceVideoDelegate.adCircleWaveLayout = (CircleWaveLayout) Utils.findRequiredViewAsType(view, R.id.be, "field 'adCircleWaveLayout'", CircleWaveLayout.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.emo, "field 'mNativeAdBottomLabelView' and method 'onClick'");
        commerceVideoDelegate.mNativeAdBottomLabelView = (ButtonAdBottomLabelView) Utils.castView(findRequiredView, R.id.emo, "field 'mNativeAdBottomLabelView'", ButtonAdBottomLabelView.class);
        this.f68349b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        commerceVideoDelegate.adHalfWebPageContainer = (AdHalfWebPageContainer) Utils.findRequiredViewAsType(view, R.id.bt, "field 'adHalfWebPageContainer'", AdHalfWebPageContainer.class);
        commerceVideoDelegate.blackMaskLayer = (AdHalfWebPageMaskLayer) Utils.findRequiredViewAsType(view, R.id.l7, "field 'blackMaskLayer'", AdHalfWebPageMaskLayer.class);
        commerceVideoDelegate.diggLayout = (CommerceLikeLayout) Utils.findRequiredViewAsType(view, R.id.bj, "field 'diggLayout'", CommerceLikeLayout.class);
        commerceVideoDelegate.eggLayout = (CommerceEggLayout) Utils.findRequiredViewAsType(view, R.id.e3c, "field 'eggLayout'", CommerceEggLayout.class);
        commerceVideoDelegate.eggViewStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.e38, "field 'eggViewStub'", ViewStub.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.cj, "field 'adRedPacketIv' and method 'onClick'");
        commerceVideoDelegate.adRedPacketIv = (RemoteImageView) Utils.castView(findRequiredView2, R.id.cj, "field 'adRedPacketIv'", RemoteImageView.class);
        this.f68350c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        commerceVideoDelegate.adPendantIv = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.dx4, "field 'adPendantIv'", RemoteImageView.class);
        commerceVideoDelegate.flAdGuideRoot = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.bs, "field 'flAdGuideRoot'", FrameLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.aed, "field 'feedAdLayout' and method 'onClick'");
        commerceVideoDelegate.feedAdLayout = (LinearLayout) Utils.castView(findRequiredView3, R.id.aed, "field 'feedAdLayout'", LinearLayout.class);
        this.f68351d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.aec, "field 'feedAdDownloadBtn' and method 'onClick'");
        commerceVideoDelegate.feedAdDownloadBtn = (TextView) Utils.castView(findRequiredView4, R.id.aec, "field 'feedAdDownloadBtn'", TextView.class);
        this.f68352e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.aee, "field 'feedAdReplay' and method 'onClick'");
        commerceVideoDelegate.feedAdReplay = findRequiredView5;
        this.f68353f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        commerceVideoDelegate.introContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.id, "field 'introContainer'", LinearLayout.class);
        View findRequiredView6 = Utils.findRequiredView(view, R.id.ll, "field 'mBottomView' and method 'onClick'");
        commerceVideoDelegate.mBottomView = (FrameLayout) Utils.castView(findRequiredView6, R.id.ll, "field 'mBottomView'", FrameLayout.class);
        this.f68354g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, R.id.c9, "field 'adGuideName' and method 'onClick'");
        commerceVideoDelegate.adGuideName = (DmtTextView) Utils.castView(findRequiredView7, R.id.c9, "field 'adGuideName'", DmtTextView.class);
        this.f68355h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        commerceVideoDelegate.adRatingView = (AdRatingView) Utils.findRequiredViewAsType(view, R.id.ci, "field 'adRatingView'", AdRatingView.class);
        commerceVideoDelegate.adLikeDivide = Utils.findRequiredView(view, R.id.c5, "field 'adLikeDivide'");
        commerceVideoDelegate.adAppUseNumber = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.b6, "field 'adAppUseNumber'", DmtTextView.class);
        View findRequiredView8 = Utils.findRequiredView(view, R.id.c6, "field 'adLikeLayout' and method 'onClick'");
        commerceVideoDelegate.adLikeLayout = (LinearLayout) Utils.castView(findRequiredView8, R.id.c6, "field 'adLikeLayout'", LinearLayout.class);
        this.f68356i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, R.id.d0, "field 'adTagGroup' and method 'onClick'");
        commerceVideoDelegate.adTagGroup = (AdTagGroup) Utils.castView(findRequiredView9, R.id.d0, "field 'adTagGroup'", AdTagGroup.class);
        this.f68357j = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, R.id.bi, "field 'adGuideDesc' and method 'onClick'");
        commerceVideoDelegate.adGuideDesc = (DescTextView) Utils.castView(findRequiredView10, R.id.bi, "field 'adGuideDesc'", DescTextView.class);
        this.f68358k = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, R.id.by, "field 'adGuideIcon' and method 'onClick'");
        commerceVideoDelegate.adGuideIcon = (RemoteImageView) Utils.castView(findRequiredView11, R.id.by, "field 'adGuideIcon'", RemoteImageView.class);
        this.f68359l = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, R.id.c0, "field 'adGuideImage' and method 'onClick'");
        commerceVideoDelegate.adGuideImage = (RemoteImageView) Utils.castView(findRequiredView12, R.id.c0, "field 'adGuideImage'", RemoteImageView.class);
        this.f68360m = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, R.id.d7, "field 'adGuideWebImage' and method 'onClick'");
        commerceVideoDelegate.adGuideWebImage = (RemoteImageView) Utils.castView(findRequiredView13, R.id.d7, "field 'adGuideWebImage'", RemoteImageView.class);
        this.f68361n = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        commerceVideoDelegate.adGuideLabel = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.c3, "field 'adGuideLabel'", DmtTextView.class);
        commerceVideoDelegate.adGuideTitle = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.d1, "field 'adGuideTitle'", DmtTextView.class);
        View findRequiredView14 = Utils.findRequiredView(view, R.id.ch, "field 'adPriceLayout' and method 'onClick'");
        commerceVideoDelegate.adPriceLayout = (LinearLayout) Utils.castView(findRequiredView14, R.id.ch, "field 'adPriceLayout'", LinearLayout.class);
        this.f68362o = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
        commerceVideoDelegate.adGuidePrice = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cg, "field 'adGuidePrice'", DmtTextView.class);
        commerceVideoDelegate.adGuideService = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.ck, "field 'adGuideService'", DmtTextView.class);
        commerceVideoDelegate.mStarAtlasLinkViewStub = (ViewStub) Utils.findOptionalViewAsType(view, R.id.ewl, "field 'mStarAtlasLinkViewStub'", ViewStub.class);
        commerceVideoDelegate.mNationalTaskLinkViewStub = (ViewStub) Utils.findOptionalViewAsType(view, R.id.emm, "field 'mNationalTaskLinkViewStub'", ViewStub.class);
        commerceVideoDelegate.mLinkTag = (CommerceTagLayout) Utils.findOptionalViewAsType(view, R.id.bbm, "field 'mLinkTag'", CommerceTagLayout.class);
        commerceVideoDelegate.mDouPlusLinkTag = (DouPlusTagLayout) Utils.findOptionalViewAsType(view, R.id.a77, "field 'mDouPlusLinkTag'", DouPlusTagLayout.class);
        commerceVideoDelegate.mIvRelieveTag = (AnimationImageView) Utils.findRequiredViewAsType(view, R.id.dq1, "field 'mIvRelieveTag'", AnimationImageView.class);
        commerceVideoDelegate.mMicroTag = (CommerceMicroTagLayout) Utils.findOptionalViewAsType(view, R.id.blu, "field 'mMicroTag'", CommerceMicroTagLayout.class);
        commerceVideoDelegate.vastAdTag = (ViewGroup) Utils.findOptionalViewAsType(view, R.id.doa, "field 'vastAdTag'", ViewGroup.class);
        commerceVideoDelegate.vastAdTagAdChoice = (RemoteImageView) Utils.findOptionalViewAsType(view, R.id.dob, "field 'vastAdTagAdChoice'", RemoteImageView.class);
        commerceVideoDelegate.vastAdTagText = (DmtTextView) Utils.findOptionalViewAsType(view, R.id.doc, "field 'vastAdTagText'", DmtTextView.class);
        commerceVideoDelegate.feedStarAtlasCheckLL = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.aen, "field 'feedStarAtlasCheckLL'", LinearLayout.class);
        commerceVideoDelegate.starAtlasCheckHintTv = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.crt, "field 'starAtlasCheckHintTv'", DmtTextView.class);
        commerceVideoDelegate.adFeeDeductionLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bo, "field 'adFeeDeductionLayout'", LinearLayout.class);
        commerceVideoDelegate.feeDeductionHint = (TextView) Utils.findRequiredViewAsType(view, R.id.aeb, "field 'feeDeductionHint'", TextView.class);
        commerceVideoDelegate.mCleanModeAdTag = (DmtTextView) Utils.findOptionalViewAsType(view, R.id.f1w, "field 'mCleanModeAdTag'", DmtTextView.class);
        commerceVideoDelegate.mCleanModeAdTagContainer = view.findViewById(R.id.e90);
        View findRequiredView15 = Utils.findRequiredView(view, R.id.d2, "method 'onClick'");
        this.f68363p = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commerceVideoDelegate.onClick(view);
            }
        });
    }
}

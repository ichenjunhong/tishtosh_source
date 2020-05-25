package com.p683ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.sticker.prop.view.C46404a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.StickerPropDetailFragment_ViewBinding */
public class StickerPropDetailFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StickerPropDetailFragment f117032a;

    /* renamed from: b */
    private View f117033b;

    /* renamed from: c */
    private View f117034c;

    /* renamed from: d */
    private View f117035d;

    /* renamed from: e */
    private View f117036e;

    /* renamed from: f */
    private View f117037f;

    public void unbind() {
        StickerPropDetailFragment stickerPropDetailFragment = this.f117032a;
        if (stickerPropDetailFragment != null) {
            this.f117032a = null;
            stickerPropDetailFragment.mStartRecodeLayout = null;
            stickerPropDetailFragment.mLayoutBottomBg = null;
            stickerPropDetailFragment.mLayoutStickerUrl = null;
            stickerPropDetailFragment.mTextStickerUrl = null;
            stickerPropDetailFragment.collapsingTextView = null;
            stickerPropDetailFragment.mTextStickerInfo = null;
            stickerPropDetailFragment.mVpExpandContainer = null;
            stickerPropDetailFragment.txtDisclaimer = null;
            stickerPropDetailFragment.ivDisclaimer = null;
            stickerPropDetailFragment.imgToRecord = null;
            stickerPropDetailFragment.lockImageView = null;
            stickerPropDetailFragment.coverImgView = null;
            stickerPropDetailFragment.titleTextView = null;
            stickerPropDetailFragment.nickNameTextView = null;
            stickerPropDetailFragment.usedCountTextView = null;
            stickerPropDetailFragment.mHeadLayout = null;
            stickerPropDetailFragment.mInfoView = null;
            stickerPropDetailFragment.mStatusView = null;
            stickerPropDetailFragment.mBgCover = null;
            stickerPropDetailFragment.mStickerOwnerProfileView = null;
            stickerPropDetailFragment.mVsOriginalMusic = null;
            stickerPropDetailFragment.mBottomLineView = null;
            stickerPropDetailFragment.mTopLineView = null;
            stickerPropDetailFragment.mArrowImg = null;
            stickerPropDetailFragment.mStickerPropActImgView = null;
            stickerPropDetailFragment.mStickerPropActImgView_i18n = null;
            stickerPropDetailFragment.gridView = null;
            stickerPropDetailFragment.mCollectView = null;
            stickerPropDetailFragment.ivCollect = null;
            stickerPropDetailFragment.tvCollect = null;
            stickerPropDetailFragment.mAdOwnerLL = null;
            stickerPropDetailFragment.mAdNickNameTv = null;
            stickerPropDetailFragment.mLinkIconIv = null;
            stickerPropDetailFragment.mShareBtn = null;
            stickerPropDetailFragment.activityBannerContainer = null;
            stickerPropDetailFragment.activityBannerBg = null;
            stickerPropDetailFragment.detailPageInfo = null;
            stickerPropDetailFragment.disclaimerContainer = null;
            stickerPropDetailFragment.mTitleFavoriteBtn = null;
            stickerPropDetailFragment.mGridViewWrapper = null;
            stickerPropDetailFragment.mTextInfoWrapper = null;
            this.f117033b.setOnClickListener(null);
            this.f117033b = null;
            this.f117034c.setOnClickListener(null);
            this.f117034c = null;
            this.f117035d.setOnClickListener(null);
            this.f117035d = null;
            this.f117036e.setOnClickListener(null);
            this.f117036e = null;
            this.f117037f.setOnClickListener(null);
            this.f117037f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StickerPropDetailFragment_ViewBinding(final StickerPropDetailFragment stickerPropDetailFragment, View view) {
        this.f117032a = stickerPropDetailFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.csb, "field 'mStartRecodeLayout' and method 'click'");
        stickerPropDetailFragment.mStartRecodeLayout = findRequiredView;
        this.f117033b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                stickerPropDetailFragment.click(view);
            }
        });
        stickerPropDetailFragment.mLayoutBottomBg = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.eia, "field 'mLayoutBottomBg'", ViewGroup.class);
        stickerPropDetailFragment.mLayoutStickerUrl = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.b8c, "field 'mLayoutStickerUrl'", LinearLayout.class);
        stickerPropDetailFragment.mTextStickerUrl = (TextView) Utils.findRequiredViewAsType(view, R.id.cyt, "field 'mTextStickerUrl'", TextView.class);
        stickerPropDetailFragment.collapsingTextView = (C46404a) Utils.findOptionalViewAsType(view, R.id.e2i, "field 'collapsingTextView'", C46404a.class);
        stickerPropDetailFragment.mTextStickerInfo = (TextView) Utils.findOptionalViewAsType(view, R.id.cys, "field 'mTextStickerInfo'", TextView.class);
        stickerPropDetailFragment.mVpExpandContainer = (LinearLayout) Utils.findOptionalViewAsType(view, R.id.acr, "field 'mVpExpandContainer'", LinearLayout.class);
        stickerPropDetailFragment.txtDisclaimer = (TextView) Utils.findOptionalViewAsType(view, R.id.act, "field 'txtDisclaimer'", TextView.class);
        stickerPropDetailFragment.ivDisclaimer = (ImageView) Utils.findOptionalViewAsType(view, R.id.acs, "field 'ivDisclaimer'", ImageView.class);
        stickerPropDetailFragment.imgToRecord = (RemoteImageView) Utils.findOptionalViewAsType(view, R.id.csd, "field 'imgToRecord'", RemoteImageView.class);
        stickerPropDetailFragment.lockImageView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.cta, "field 'lockImageView'", RemoteImageView.class);
        stickerPropDetailFragment.coverImgView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.ct_, "field 'coverImgView'", RemoteImageView.class);
        stickerPropDetailFragment.titleTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.ctb, "field 'titleTextView'", TextView.class);
        stickerPropDetailFragment.nickNameTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.dcr, "field 'nickNameTextView'", TextView.class);
        stickerPropDetailFragment.usedCountTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.dm1, "field 'usedCountTextView'", TextView.class);
        stickerPropDetailFragment.mHeadLayout = Utils.findRequiredView(view, R.id.ans, "field 'mHeadLayout'");
        stickerPropDetailFragment.mInfoView = Utils.findRequiredView(view, R.id.atz, "field 'mInfoView'");
        stickerPropDetailFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        stickerPropDetailFragment.mBgCover = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.k5, "field 'mBgCover'", RemoteImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.b9z, "field 'mStickerOwnerProfileView' and method 'click'");
        stickerPropDetailFragment.mStickerOwnerProfileView = (ViewGroup) Utils.castView(findRequiredView2, R.id.b9z, "field 'mStickerOwnerProfileView'", ViewGroup.class);
        this.f117034c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                stickerPropDetailFragment.click(view);
            }
        });
        stickerPropDetailFragment.mVsOriginalMusic = (ViewStub) Utils.findRequiredViewAsType(view, R.id.f7z, "field 'mVsOriginalMusic'", ViewStub.class);
        stickerPropDetailFragment.mBottomLineView = Utils.findRequiredView(view, R.id.m0, "field 'mBottomLineView'");
        stickerPropDetailFragment.mTopLineView = Utils.findRequiredView(view, R.id.d34, "field 'mTopLineView'");
        stickerPropDetailFragment.mArrowImg = (ImageView) Utils.findRequiredViewAsType(view, R.id.ga, "field 'mArrowImg'", ImageView.class);
        stickerPropDetailFragment.mStickerPropActImgView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b4k, "field 'mStickerPropActImgView'", RemoteImageView.class);
        stickerPropDetailFragment.mStickerPropActImgView_i18n = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b4l, "field 'mStickerPropActImgView_i18n'", RemoteImageView.class);
        stickerPropDetailFragment.gridView = (GridView) Utils.findRequiredViewAsType(view, R.id.ct0, "field 'gridView'", GridView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.ct8, "field 'mCollectView' and method 'click'");
        stickerPropDetailFragment.mCollectView = findRequiredView3;
        this.f117035d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                stickerPropDetailFragment.click(view);
            }
        });
        stickerPropDetailFragment.ivCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, R.id.ct9, "field 'ivCollect'", CheckableImageView.class);
        stickerPropDetailFragment.tvCollect = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dgp, "field 'tvCollect'", DmtTextView.class);
        stickerPropDetailFragment.mAdOwnerLL = Utils.findRequiredView(view, R.id.cf, "field 'mAdOwnerLL'");
        stickerPropDetailFragment.mAdNickNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.c_, "field 'mAdNickNameTv'", TextView.class);
        stickerPropDetailFragment.mLinkIconIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.bbf, "field 'mLinkIconIv'", ImageView.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.cmr, "field 'mShareBtn' and method 'click'");
        stickerPropDetailFragment.mShareBtn = (ImageView) Utils.castView(findRequiredView4, R.id.cmr, "field 'mShareBtn'", ImageView.class);
        this.f117036e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                stickerPropDetailFragment.click(view);
            }
        });
        stickerPropDetailFragment.activityBannerContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.dwc, "field 'activityBannerContainer'", FrameLayout.class);
        stickerPropDetailFragment.activityBannerBg = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.dwd, "field 'activityBannerBg'", SmartImageView.class);
        stickerPropDetailFragment.detailPageInfo = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e4y, "field 'detailPageInfo'", DmtTextView.class);
        stickerPropDetailFragment.disclaimerContainer = (ViewStub) Utils.findRequiredViewAsType(view, R.id.f7x, "field 'disclaimerContainer'", ViewStub.class);
        stickerPropDetailFragment.mTitleFavoriteBtn = (CheckableImageView) Utils.findOptionalViewAsType(view, R.id.e89, "field 'mTitleFavoriteBtn'", CheckableImageView.class);
        stickerPropDetailFragment.mGridViewWrapper = (ViewGroup) Utils.findOptionalViewAsType(view, R.id.ea7, "field 'mGridViewWrapper'", ViewGroup.class);
        stickerPropDetailFragment.mTextInfoWrapper = (ViewGroup) Utils.findOptionalViewAsType(view, R.id.b_a, "field 'mTextInfoWrapper'", ViewGroup.class);
        View findRequiredView5 = Utils.findRequiredView(view, R.id.ik, "method 'click'");
        this.f117037f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                stickerPropDetailFragment.click(view);
            }
        });
    }
}

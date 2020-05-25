package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.poi.map.MapLayout;
import com.p683ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.AbsSlidablePoiAwemeFeedFragment_ViewBinding */
public class AbsSlidablePoiAwemeFeedFragment_ViewBinding extends AbsPoiAwemeFeedFragment_ViewBinding {

    /* renamed from: a */
    private AbsSlidablePoiAwemeFeedFragment f100319a;

    /* renamed from: b */
    private View f100320b;

    /* renamed from: c */
    private View f100321c;

    /* renamed from: d */
    private View f100322d;

    /* renamed from: e */
    private View f100323e;

    /* renamed from: f */
    private View f100324f;

    public void unbind() {
        AbsSlidablePoiAwemeFeedFragment absSlidablePoiAwemeFeedFragment = this.f100319a;
        if (absSlidablePoiAwemeFeedFragment != null) {
            this.f100319a = null;
            absSlidablePoiAwemeFeedFragment.mPoiMap = null;
            absSlidablePoiAwemeFeedFragment.mBannerVPer = null;
            absSlidablePoiAwemeFeedFragment.mStatusBar = null;
            absSlidablePoiAwemeFeedFragment.mIndicatorView = null;
            absSlidablePoiAwemeFeedFragment.mHeader = null;
            absSlidablePoiAwemeFeedFragment.mUploadImage = null;
            absSlidablePoiAwemeFeedFragment.mTopbar = null;
            absSlidablePoiAwemeFeedFragment.mTopbarStatus = null;
            absSlidablePoiAwemeFeedFragment.mTopbarBg = null;
            absSlidablePoiAwemeFeedFragment.mRouteStatus = null;
            absSlidablePoiAwemeFeedFragment.mTopCollectImg = null;
            absSlidablePoiAwemeFeedFragment.mCollectContainer = null;
            absSlidablePoiAwemeFeedFragment.mPoiMore = null;
            absSlidablePoiAwemeFeedFragment.mPoiHeaderLayout = null;
            absSlidablePoiAwemeFeedFragment.mTitleBarBg = null;
            absSlidablePoiAwemeFeedFragment.mBackBtn = null;
            absSlidablePoiAwemeFeedFragment.mShareBtn = null;
            absSlidablePoiAwemeFeedFragment.mMoreActionBtn = null;
            absSlidablePoiAwemeFeedFragment.mTitleBarTools = null;
            this.f100320b.setOnClickListener(null);
            this.f100320b = null;
            this.f100321c.setOnClickListener(null);
            this.f100321c = null;
            this.f100322d.setOnClickListener(null);
            this.f100322d = null;
            this.f100323e.setOnClickListener(null);
            this.f100323e = null;
            this.f100324f.setOnClickListener(null);
            this.f100324f = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AbsSlidablePoiAwemeFeedFragment_ViewBinding(final AbsSlidablePoiAwemeFeedFragment absSlidablePoiAwemeFeedFragment, View view) {
        super(absSlidablePoiAwemeFeedFragment, view);
        this.f100319a = absSlidablePoiAwemeFeedFragment;
        absSlidablePoiAwemeFeedFragment.mPoiMap = (MapLayout) Utils.findRequiredViewAsType(view, R.id.c29, "field 'mPoiMap'", MapLayout.class);
        absSlidablePoiAwemeFeedFragment.mBannerVPer = (BannerViewPager) Utils.findRequiredViewAsType(view, R.id.ds2, "field 'mBannerVPer'", BannerViewPager.class);
        absSlidablePoiAwemeFeedFragment.mStatusBar = Utils.findRequiredView(view, R.id.csm, "field 'mStatusBar'");
        absSlidablePoiAwemeFeedFragment.mIndicatorView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dkj, "field 'mIndicatorView'", DmtTextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.bzn, "field 'mHeader' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mHeader = findRequiredView;
        this.f100320b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absSlidablePoiAwemeFeedFragment.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.c37, "field 'mUploadImage' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mUploadImage = (ImageView) Utils.castView(findRequiredView2, R.id.c37, "field 'mUploadImage'", ImageView.class);
        this.f100321c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absSlidablePoiAwemeFeedFragment.onClick(view);
            }
        });
        absSlidablePoiAwemeFeedFragment.mTopbar = Utils.findRequiredView(view, R.id.d1b, "field 'mTopbar'");
        absSlidablePoiAwemeFeedFragment.mTopbarStatus = Utils.findRequiredView(view, R.id.c2e, "field 'mTopbarStatus'");
        absSlidablePoiAwemeFeedFragment.mTopbarBg = Utils.findRequiredView(view, R.id.c2c, "field 'mTopbarBg'");
        absSlidablePoiAwemeFeedFragment.mRouteStatus = Utils.findRequiredView(view, R.id.c2a, "field 'mRouteStatus'");
        View findRequiredView3 = Utils.findRequiredView(view, R.id.azc, "field 'mTopCollectImg' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mTopCollectImg = (CheckableImageView) Utils.castView(findRequiredView3, R.id.azc, "field 'mTopCollectImg'", CheckableImageView.class);
        this.f100322d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absSlidablePoiAwemeFeedFragment.onClick(view);
            }
        });
        absSlidablePoiAwemeFeedFragment.mCollectContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.uy, "field 'mCollectContainer'", ViewGroup.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.c0b, "field 'mPoiMore' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mPoiMore = findRequiredView4;
        this.f100323e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absSlidablePoiAwemeFeedFragment.onClick(view);
            }
        });
        absSlidablePoiAwemeFeedFragment.mPoiHeaderLayout = (PoiHeaderLayout) Utils.findOptionalViewAsType(view, R.id.c0w, "field 'mPoiHeaderLayout'", PoiHeaderLayout.class);
        absSlidablePoiAwemeFeedFragment.mTitleBarBg = Utils.findRequiredView(view, R.id.c2p, "field 'mTitleBarBg'");
        absSlidablePoiAwemeFeedFragment.mBackBtn = (AutoRTLImageView) Utils.findRequiredViewAsType(view, R.id.ik, "field 'mBackBtn'", AutoRTLImageView.class);
        View findRequiredView5 = Utils.findRequiredView(view, R.id.cmr, "field 'mShareBtn' and method 'onClick'");
        absSlidablePoiAwemeFeedFragment.mShareBtn = (ImageView) Utils.castView(findRequiredView5, R.id.cmr, "field 'mShareBtn'", ImageView.class);
        this.f100324f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absSlidablePoiAwemeFeedFragment.onClick(view);
            }
        });
        absSlidablePoiAwemeFeedFragment.mMoreActionBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.elh, "field 'mMoreActionBtn'", ImageView.class);
        absSlidablePoiAwemeFeedFragment.mTitleBarTools = Utils.findRequiredView(view, R.id.c2f, "field 'mTitleBarTools'");
    }
}

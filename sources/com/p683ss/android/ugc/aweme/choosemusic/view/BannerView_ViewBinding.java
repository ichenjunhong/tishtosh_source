package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.support.p030v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.BannerView_ViewBinding */
public class BannerView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BannerView f66087a;

    public void unbind() {
        BannerView bannerView = this.f66087a;
        if (bannerView != null) {
            this.f66087a = null;
            bannerView.mViewPager = null;
            bannerView.mIndicator = null;
            bannerView.mStatusBar = null;
            bannerView.mBannerLayout = null;
            bannerView.mLlBannerContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BannerView_ViewBinding(BannerView bannerView, View view) {
        this.f66087a = bannerView;
        bannerView.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.ds2, "field 'mViewPager'", ViewPager.class);
        bannerView.mIndicator = (IndicatorView) Utils.findRequiredViewAsType(view, R.id.a71, "field 'mIndicator'", IndicatorView.class);
        bannerView.mStatusBar = Utils.findRequiredView(view, R.id.csm, "field 'mStatusBar'");
        bannerView.mBannerLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.j7, "field 'mBannerLayout'", RelativeLayout.class);
        bannerView.mLlBannerContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.bf_, "field 'mLlBannerContainer'", ViewGroup.class);
    }
}

package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p030v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder_ViewBinding */
public class DiscoverBannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DiscoverBannerViewHolder f72847a;

    public void unbind() {
        DiscoverBannerViewHolder discoverBannerViewHolder = this.f72847a;
        if (discoverBannerViewHolder != null) {
            this.f72847a = null;
            discoverBannerViewHolder.mTitle = null;
            discoverBannerViewHolder.mViewPager = null;
            discoverBannerViewHolder.mIndicator = null;
            discoverBannerViewHolder.mStatusBar = null;
            discoverBannerViewHolder.mBannerLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DiscoverBannerViewHolder_ViewBinding(DiscoverBannerViewHolder discoverBannerViewHolder, View view) {
        this.f72847a = discoverBannerViewHolder;
        discoverBannerViewHolder.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.d9i, "field 'mTitle'", TextView.class);
        discoverBannerViewHolder.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, R.id.ds2, "field 'mViewPager'", ViewPager.class);
        discoverBannerViewHolder.mIndicator = (IndicatorView) Utils.findRequiredViewAsType(view, R.id.a71, "field 'mIndicator'", IndicatorView.class);
        discoverBannerViewHolder.mStatusBar = Utils.findRequiredView(view, R.id.csm, "field 'mStatusBar'");
        discoverBannerViewHolder.mBannerLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.j7, "field 'mBannerLayout'", RelativeLayout.class);
    }
}

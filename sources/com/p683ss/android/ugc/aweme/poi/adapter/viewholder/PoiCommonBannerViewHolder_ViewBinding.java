package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.p683ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCommonBannerViewHolder_ViewBinding */
public class PoiCommonBannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiCommonBannerViewHolder f99351a;

    public void unbind() {
        PoiCommonBannerViewHolder poiCommonBannerViewHolder = this.f99351a;
        if (poiCommonBannerViewHolder != null) {
            this.f99351a = null;
            poiCommonBannerViewHolder.mViewPager = null;
            poiCommonBannerViewHolder.mIndicator = null;
            poiCommonBannerViewHolder.mDividerBottom = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiCommonBannerViewHolder_ViewBinding(PoiCommonBannerViewHolder poiCommonBannerViewHolder, View view) {
        this.f99351a = poiCommonBannerViewHolder;
        poiCommonBannerViewHolder.mViewPager = (BannerViewPager) Utils.findRequiredViewAsType(view, R.id.bz0, "field 'mViewPager'", BannerViewPager.class);
        poiCommonBannerViewHolder.mIndicator = (IndicatorView) Utils.findRequiredViewAsType(view, R.id.byy, "field 'mIndicator'", IndicatorView.class);
        poiCommonBannerViewHolder.mDividerBottom = Utils.findRequiredView(view, R.id.byx, "field 'mDividerBottom'");
    }
}

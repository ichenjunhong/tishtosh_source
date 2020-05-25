package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.HotSearchAndDiscoveryFragment2_ViewBinding */
public class HotSearchAndDiscoveryFragment2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HotSearchAndDiscoveryFragment2 f74779a;

    public void unbind() {
        HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2 = this.f74779a;
        if (hotSearchAndDiscoveryFragment2 != null) {
            this.f74779a = null;
            hotSearchAndDiscoveryFragment2.loftNestedRefreshLayout = null;
            hotSearchAndDiscoveryFragment2.mTopStatus = null;
            hotSearchAndDiscoveryFragment2.mSearchContainer = null;
            hotSearchAndDiscoveryFragment2.mSearchScanView = null;
            hotSearchAndDiscoveryFragment2.mSearchScanViewRight = null;
            hotSearchAndDiscoveryFragment2.mRightBackBtn = null;
            hotSearchAndDiscoveryFragment2.mHotSearchFlipperView = null;
            hotSearchAndDiscoveryFragment2.mRightSearchView = null;
            hotSearchAndDiscoveryFragment2.mFragmentContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HotSearchAndDiscoveryFragment2_ViewBinding(HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2, View view) {
        this.f74779a = hotSearchAndDiscoveryFragment2;
        hotSearchAndDiscoveryFragment2.loftNestedRefreshLayout = (LoftNestedRefreshLayout) Utils.findRequiredViewAsType(view, R.id.biu, "field 'loftNestedRefreshLayout'", LoftNestedRefreshLayout.class);
        hotSearchAndDiscoveryFragment2.mTopStatus = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.d3j, "field 'mTopStatus'", ViewGroup.class);
        hotSearchAndDiscoveryFragment2.mSearchContainer = Utils.findRequiredView(view, R.id.cd9, "field 'mSearchContainer'");
        hotSearchAndDiscoveryFragment2.mSearchScanView = (SearchScanView) Utils.findRequiredViewAsType(view, R.id.cjr, "field 'mSearchScanView'", SearchScanView.class);
        hotSearchAndDiscoveryFragment2.mSearchScanViewRight = (SearchScanView) Utils.findRequiredViewAsType(view, R.id.cjs, "field 'mSearchScanViewRight'", SearchScanView.class);
        hotSearchAndDiscoveryFragment2.mRightBackBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.io, "field 'mRightBackBtn'", ImageView.class);
        hotSearchAndDiscoveryFragment2.mHotSearchFlipperView = (HotSearchWordsFlipperView) Utils.findRequiredViewAsType(view, R.id.apw, "field 'mHotSearchFlipperView'", HotSearchWordsFlipperView.class);
        hotSearchAndDiscoveryFragment2.mRightSearchView = Utils.findRequiredView(view, R.id.ccg, "field 'mRightSearchView'");
        hotSearchAndDiscoveryFragment2.mFragmentContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ajf, "field 'mFragmentContainer'", ViewGroup.class);
    }
}

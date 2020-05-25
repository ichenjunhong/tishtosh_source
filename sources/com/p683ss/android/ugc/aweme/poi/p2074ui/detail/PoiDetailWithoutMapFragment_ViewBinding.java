package com.p683ss.android.ugc.aweme.poi.p2074ui.detail;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.poi.p2074ui.AbsSlidablePoiAwemeFeedFragment_ViewBinding;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.AppBarLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.PoiDetailWithoutMapFragment_ViewBinding */
public class PoiDetailWithoutMapFragment_ViewBinding extends AbsSlidablePoiAwemeFeedFragment_ViewBinding {

    /* renamed from: a */
    private PoiDetailWithoutMapFragment f100518a;

    public void unbind() {
        PoiDetailWithoutMapFragment poiDetailWithoutMapFragment = this.f100518a;
        if (poiDetailWithoutMapFragment != null) {
            this.f100518a = null;
            poiDetailWithoutMapFragment.mAppBarLayout = null;
            poiDetailWithoutMapFragment.mRecyclerView = null;
            poiDetailWithoutMapFragment.mRootLayout = null;
            poiDetailWithoutMapFragment.mTopbarDivider = null;
            poiDetailWithoutMapFragment.mTopbar = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiDetailWithoutMapFragment_ViewBinding(PoiDetailWithoutMapFragment poiDetailWithoutMapFragment, View view) {
        super(poiDetailWithoutMapFragment, view);
        this.f100518a = poiDetailWithoutMapFragment;
        poiDetailWithoutMapFragment.mAppBarLayout = (AppBarLayout) Utils.findRequiredViewAsType(view, R.id.fq, "field 'mAppBarLayout'", AppBarLayout.class);
        poiDetailWithoutMapFragment.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bc2, "field 'mRecyclerView'", RecyclerView.class);
        poiDetailWithoutMapFragment.mRootLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.b9e, "field 'mRootLayout'", RelativeLayout.class);
        poiDetailWithoutMapFragment.mTopbarDivider = Utils.findRequiredView(view, R.id.d1_, "field 'mTopbarDivider'");
        poiDetailWithoutMapFragment.mTopbar = Utils.findRequiredView(view, R.id.epk, "field 'mTopbar'");
    }
}

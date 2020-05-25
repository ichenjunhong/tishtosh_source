package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder_ViewBinding */
public class HotVideoViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HotVideoViewHolder f72881a;

    public void unbind() {
        HotVideoViewHolder hotVideoViewHolder = this.f72881a;
        if (hotVideoViewHolder != null) {
            this.f72881a = null;
            hotVideoViewHolder.mLeftTitleView = null;
            hotVideoViewHolder.mRightTitleView = null;
            hotVideoViewHolder.mYellowDotView = null;
            hotVideoViewHolder.mRightArrowView = null;
            hotVideoViewHolder.mRecyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HotVideoViewHolder_ViewBinding(HotVideoViewHolder hotVideoViewHolder, View view) {
        this.f72881a = hotVideoViewHolder;
        hotVideoViewHolder.mLeftTitleView = Utils.findRequiredView(view, R.id.dhb, "field 'mLeftTitleView'");
        hotVideoViewHolder.mRightTitleView = Utils.findRequiredView(view, R.id.dae, "field 'mRightTitleView'");
        hotVideoViewHolder.mYellowDotView = Utils.findRequiredView(view, R.id.dra, "field 'mYellowDotView'");
        hotVideoViewHolder.mRightArrowView = Utils.findRequiredView(view, R.id.b1j, "field 'mRightArrowView'");
        hotVideoViewHolder.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cg4, "field 'mRecyclerView'", RecyclerView.class);
    }
}

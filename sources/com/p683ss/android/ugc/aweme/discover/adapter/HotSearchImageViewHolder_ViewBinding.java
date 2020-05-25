package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder_ViewBinding */
public class HotSearchImageViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HotSearchImageViewHolder f72866a;

    public void unbind() {
        HotSearchImageViewHolder hotSearchImageViewHolder = this.f72866a;
        if (hotSearchImageViewHolder != null) {
            this.f72866a = null;
            hotSearchImageViewHolder.mHotSearchBoardView = null;
            hotSearchImageViewHolder.mHotSearchCardView = null;
            hotSearchImageViewHolder.mTitle = null;
            hotSearchImageViewHolder.mViewMoreTextView = null;
            hotSearchImageViewHolder.ivMore = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HotSearchImageViewHolder_ViewBinding(HotSearchImageViewHolder hotSearchImageViewHolder, View view) {
        this.f72866a = hotSearchImageViewHolder;
        hotSearchImageViewHolder.mHotSearchBoardView = Utils.findRequiredView(view, R.id.bgs, "field 'mHotSearchBoardView'");
        hotSearchImageViewHolder.mHotSearchCardView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cg3, "field 'mHotSearchCardView'", RecyclerView.class);
        hotSearchImageViewHolder.mTitle = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dhb, "field 'mTitle'", DmtTextView.class);
        hotSearchImageViewHolder.mViewMoreTextView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dab, "field 'mViewMoreTextView'", DmtTextView.class);
        hotSearchImageViewHolder.ivMore = (ImageView) Utils.findRequiredViewAsType(view, R.id.b2h, "field 'ivMore'", ImageView.class);
    }
}

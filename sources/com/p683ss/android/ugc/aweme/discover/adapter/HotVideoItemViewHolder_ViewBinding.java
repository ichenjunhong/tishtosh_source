package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotVideoItemViewHolder_ViewBinding */
public class HotVideoItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HotVideoItemViewHolder f72870a;

    public void unbind() {
        HotVideoItemViewHolder hotVideoItemViewHolder = this.f72870a;
        if (hotVideoItemViewHolder != null) {
            this.f72870a = null;
            hotVideoItemViewHolder.mCover = null;
            hotVideoItemViewHolder.mText = null;
            hotVideoItemViewHolder.mRank = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HotVideoItemViewHolder_ViewBinding(HotVideoItemViewHolder hotVideoItemViewHolder, View view) {
        this.f72870a = hotVideoItemViewHolder;
        hotVideoItemViewHolder.mCover = (AnimatedImageView) Utils.findRequiredViewAsType(view, R.id.b1m, "field 'mCover'", AnimatedImageView.class);
        hotVideoItemViewHolder.mText = (TextView) Utils.findRequiredViewAsType(view, R.id.dds, "field 'mText'", TextView.class);
        hotVideoItemViewHolder.mRank = (TextView) Utils.findRequiredViewAsType(view, R.id.dea, "field 'mRank'", TextView.class);
    }
}

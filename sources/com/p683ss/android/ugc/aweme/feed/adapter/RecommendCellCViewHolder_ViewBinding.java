package com.p683ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.BorderLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.RecommendCellCViewHolder_ViewBinding */
public class RecommendCellCViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecommendCellCViewHolder f78261a;

    public void unbind() {
        RecommendCellCViewHolder recommendCellCViewHolder = this.f78261a;
        if (recommendCellCViewHolder != null) {
            this.f78261a = null;
            recommendCellCViewHolder.txtDesc = null;
            recommendCellCViewHolder.txtLikeCount = null;
            recommendCellCViewHolder.txtCommentCount = null;
            recommendCellCViewHolder.tagLayout = null;
            recommendCellCViewHolder.borderLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecommendCellCViewHolder_ViewBinding(RecommendCellCViewHolder recommendCellCViewHolder, View view) {
        this.f78261a = recommendCellCViewHolder;
        recommendCellCViewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.a4e, "field 'txtDesc'", TextView.class);
        recommendCellCViewHolder.txtLikeCount = (TextView) Utils.findRequiredViewAsType(view, R.id.baj, "field 'txtLikeCount'", TextView.class);
        recommendCellCViewHolder.txtCommentCount = (TextView) Utils.findRequiredViewAsType(view, R.id.x3, "field 'txtCommentCount'", TextView.class);
        recommendCellCViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.cxc, "field 'tagLayout'", TagLayout.class);
        recommendCellCViewHolder.borderLayout = (BorderLayout) Utils.findRequiredViewAsType(view, R.id.lj, "field 'borderLayout'", BorderLayout.class);
    }
}

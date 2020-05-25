package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerCardViewHolder_ViewBinding */
public class FollowerCardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FollowerCardViewHolder f83638a;

    public void unbind() {
        FollowerCardViewHolder followerCardViewHolder = this.f83638a;
        if (followerCardViewHolder != null) {
            this.f83638a = null;
            followerCardViewHolder.fansRecyclerView = null;
            followerCardViewHolder.tvFansSum = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FollowerCardViewHolder_ViewBinding(FollowerCardViewHolder followerCardViewHolder, View view) {
        this.f83638a = followerCardViewHolder;
        followerCardViewHolder.fansRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.ae3, "field 'fansRecyclerView'", RecyclerView.class);
        followerCardViewHolder.tvFansSum = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.d_7, "field 'tvFansSum'", DmtTextView.class);
    }
}

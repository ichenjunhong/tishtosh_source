package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder_ViewBinding */
public class RankingListCoverViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RankingListCoverViewHolder f72927a;

    public void unbind() {
        RankingListCoverViewHolder rankingListCoverViewHolder = this.f72927a;
        if (rankingListCoverViewHolder != null) {
            this.f72927a = null;
            rankingListCoverViewHolder.mStarContainer = null;
            rankingListCoverViewHolder.mMusicContainer = null;
            rankingListCoverViewHolder.mStarHeaderView = null;
            rankingListCoverViewHolder.mMusicHeaderView = null;
            rankingListCoverViewHolder.mStarName = null;
            rankingListCoverViewHolder.mMusicName = null;
            rankingListCoverViewHolder.mStarBackground = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RankingListCoverViewHolder_ViewBinding(RankingListCoverViewHolder rankingListCoverViewHolder, View view) {
        this.f72927a = rankingListCoverViewHolder;
        rankingListCoverViewHolder.mStarContainer = Utils.findRequiredView(view, R.id.cde, "field 'mStarContainer'");
        rankingListCoverViewHolder.mMusicContainer = Utils.findRequiredView(view, R.id.cdd, "field 'mMusicContainer'");
        rankingListCoverViewHolder.mStarHeaderView = (CircleImageView) Utils.findRequiredViewAsType(view, R.id.b1_, "field 'mStarHeaderView'", CircleImageView.class);
        rankingListCoverViewHolder.mMusicHeaderView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b19, "field 'mMusicHeaderView'", RemoteImageView.class);
        rankingListCoverViewHolder.mStarName = (TextView) Utils.findRequiredViewAsType(view, R.id.dg8, "field 'mStarName'", TextView.class);
        rankingListCoverViewHolder.mMusicName = (TextView) Utils.findRequiredViewAsType(view, R.id.dcg, "field 'mMusicName'", TextView.class);
        rankingListCoverViewHolder.mStarBackground = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.kl, "field 'mStarBackground'", RemoteImageView.class);
    }
}

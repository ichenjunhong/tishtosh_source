package com.p683ss.android.ugc.aweme.flowfeed.p1761ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.FollowFeedCommentLayout_ViewBinding */
public class FollowFeedCommentLayout_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FollowFeedCommentLayout f83178a;

    public void unbind() {
        FollowFeedCommentLayout followFeedCommentLayout = this.f83178a;
        if (followFeedCommentLayout != null) {
            this.f83178a = null;
            followFeedCommentLayout.mRecComments = null;
            followFeedCommentLayout.mLayoutAddComment = null;
            followFeedCommentLayout.mImgAvatar = null;
            followFeedCommentLayout.mShowAllComments = null;
            followFeedCommentLayout.mSpace = null;
            followFeedCommentLayout.mLayoutLikes = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FollowFeedCommentLayout_ViewBinding(FollowFeedCommentLayout followFeedCommentLayout, View view) {
        this.f83178a = followFeedCommentLayout;
        followFeedCommentLayout.mRecComments = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.ca8, "field 'mRecComments'", RecyclerView.class);
        followFeedCommentLayout.mLayoutAddComment = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.b6v, "field 'mLayoutAddComment'", LinearLayout.class);
        followFeedCommentLayout.mImgAvatar = (CircleImageView) Utils.findRequiredViewAsType(view, R.id.art, "field 'mImgAvatar'", CircleImageView.class);
        followFeedCommentLayout.mShowAllComments = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dfz, "field 'mShowAllComments'", DmtTextView.class);
        followFeedCommentLayout.mSpace = view.findViewById(R.id.cqc);
        followFeedCommentLayout.mLayoutLikes = (CommentLikeListView) Utils.findRequiredViewAsType(view, R.id.b8a, "field 'mLayoutLikes'", CommentLikeListView.class);
        followFeedCommentLayout.mAvatarSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.zs);
    }
}

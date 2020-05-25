package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommentFollowFeedMomentViewHolder_ViewBinding */
public class CommentFollowFeedMomentViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommentFollowFeedMomentViewHolder f96615a;

    public void unbind() {
        CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = this.f96615a;
        if (commentFollowFeedMomentViewHolder != null) {
            this.f96615a = null;
            commentFollowFeedMomentViewHolder.mTvComment = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentFollowFeedMomentViewHolder_ViewBinding(CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder, View view) {
        this.f96615a = commentFollowFeedMomentViewHolder;
        commentFollowFeedMomentViewHolder.mTvComment = (MentionTextView) Utils.findRequiredViewAsType(view, R.id.d89, "field 'mTvComment'", MentionTextView.class);
    }
}

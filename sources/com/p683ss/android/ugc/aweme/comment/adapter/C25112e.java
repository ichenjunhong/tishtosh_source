package com.p683ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.p030v4.content.C0726c;
import com.p683ss.android.ugc.aweme.comment.C25143b;
import com.p683ss.android.ugc.aweme.comment.api.C25139b;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.e */
public final class C25112e implements C25139b {
    /* renamed from: a */
    public static boolean m61020a() {
        return C25143b.m61059a();
    }

    /* renamed from: b */
    public final boolean mo51199b() {
        return C25143b.m61059a();
    }

    /* renamed from: b */
    public final int mo51198b(Context context) {
        return C0726c.m2098c(context, R.color.av0);
    }

    /* renamed from: a */
    public final int mo51197a(Context context) {
        return C0726c.m2098c(context, R.color.a1l);
    }

    /* renamed from: a */
    public static void m61019a(Context context, CommentViewHolderNewStyle commentViewHolderNewStyle, Comment comment) {
        if (commentViewHolderNewStyle.mo51170j() && context != null && comment != null) {
            Resources resources = context.getResources();
            commentViewHolderNewStyle.mTitleView.setTextColor(resources.getColor(R.color.a1o));
            commentViewHolderNewStyle.mCommentSplitView.setTextColor(resources.getColor(R.color.a1o));
            commentViewHolderNewStyle.mReplyTitleView.setTextColor(resources.getColor(R.color.a1o));
            commentViewHolderNewStyle.mReplyCommentSplitView.setTextColor(resources.getColor(R.color.a1o));
            commentViewHolderNewStyle.mCommentTimeView.setTextColor(resources.getColor(R.color.a1r));
            commentViewHolderNewStyle.mContentView.setTextColor(resources.getColor(R.color.a1l));
            commentViewHolderNewStyle.mReplyContentView.setTextColor(resources.getColor(R.color.a1o));
            commentViewHolderNewStyle.mReplyDivider.setBackground(resources.getDrawable(R.drawable.chy));
            if (comment.getLabelType() != 1) {
                commentViewHolderNewStyle.mCommentStyleView.setTextColor(resources.getColor(R.color.a1o));
            }
            if (commentViewHolderNewStyle.mIronFanLabel != null) {
                commentViewHolderNewStyle.mIronFanLabel.setFillColor(resources.getColor(R.color.a1l));
                commentViewHolderNewStyle.mIronFanLabel.setTextColor(resources.getColor(R.color.a2j));
            }
            if (!(comment.getReplyComments() == null || comment.getReplyComments().isEmpty() || ((Comment) comment.getReplyComments().get(0)).getLabelType() == 1)) {
                commentViewHolderNewStyle.mReplyCommentStyleView.setTextColor(resources.getColor(R.color.a1o));
            }
            commentViewHolderNewStyle.mTvRelationLabel.setBackground(resources.getDrawable(R.drawable.ci_));
            commentViewHolderNewStyle.mTvReplyCommentRelationLabel.setBackground(resources.getDrawable(R.drawable.ci_));
            commentViewHolderNewStyle.mTvRelationLabel.setTextColor(resources.getColor(R.color.a1o));
            commentViewHolderNewStyle.mTvReplyCommentRelationLabel.setTextColor(resources.getColor(R.color.a1o));
        }
    }
}

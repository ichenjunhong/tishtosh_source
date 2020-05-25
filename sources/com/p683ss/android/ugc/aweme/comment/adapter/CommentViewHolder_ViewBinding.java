package com.p683ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.p683ss.android.ugc.aweme.comment.p1528ui.CommentTranslationStatusView;
import com.p683ss.android.ugc.aweme.unread.UnReadCircleView;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder_ViewBinding */
public class CommentViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommentViewHolder f66491a;

    public void unbind() {
        CommentViewHolder commentViewHolder = this.f66491a;
        if (commentViewHolder != null) {
            this.f66491a = null;
            commentViewHolder.mRootView = null;
            commentViewHolder.mAvatarView = null;
            commentViewHolder.mTitleView = null;
            commentViewHolder.mContentView = null;
            commentViewHolder.mReplyContainer = null;
            commentViewHolder.mReplyTitleView = null;
            commentViewHolder.mReplyContentView = null;
            commentViewHolder.mMenuItem = null;
            commentViewHolder.mReplyDivider = null;
            commentViewHolder.mUnReadCircleView = null;
            commentViewHolder.mTranslationView = null;
            commentViewHolder.mBuryView = null;
            commentViewHolder.mInvalidUsernamePrompt = null;
            commentViewHolder.mBgView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentViewHolder_ViewBinding(CommentViewHolder commentViewHolder, View view) {
        this.f66491a = commentViewHolder;
        commentViewHolder.mRootView = Utils.findRequiredView(view, R.id.b9e, "field 'mRootView'");
        commentViewHolder.mAvatarView = (SmartAvatarImageView) Utils.findRequiredViewAsType(view, R.id.hi, "field 'mAvatarView'", SmartAvatarImageView.class);
        commentViewHolder.mTitleView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", DmtTextView.class);
        commentViewHolder.mContentView = (MentionTextView) Utils.findRequiredViewAsType(view, R.id.ze, "field 'mContentView'", MentionTextView.class);
        commentViewHolder.mReplyContainer = Utils.findRequiredView(view, R.id.cbg, "field 'mReplyContainer'");
        commentViewHolder.mReplyTitleView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cbj, "field 'mReplyTitleView'", DmtTextView.class);
        commentViewHolder.mReplyContentView = (MentionTextView) Utils.findRequiredViewAsType(view, R.id.cbh, "field 'mReplyContentView'", MentionTextView.class);
        commentViewHolder.mMenuItem = (ImageView) Utils.findOptionalViewAsType(view, R.id.acx, "field 'mMenuItem'", ImageView.class);
        commentViewHolder.mReplyDivider = Utils.findRequiredView(view, R.id.cbi, "field 'mReplyDivider'");
        commentViewHolder.mUnReadCircleView = (UnReadCircleView) Utils.findOptionalViewAsType(view, R.id.f7l, "field 'mUnReadCircleView'", UnReadCircleView.class);
        commentViewHolder.mTranslationView = (CommentTranslationStatusView) Utils.findOptionalViewAsType(view, R.id.d4a, "field 'mTranslationView'", CommentTranslationStatusView.class);
        commentViewHolder.mBuryView = (ImageView) Utils.findOptionalViewAsType(view, R.id.ee4, "field 'mBuryView'", ImageView.class);
        commentViewHolder.mInvalidUsernamePrompt = view.findViewById(R.id.eda);
        commentViewHolder.mBgView = view.findViewById(R.id.z0);
        commentViewHolder.size = view.getContext().getResources().getDimensionPixelSize(R.dimen.ei);
    }
}

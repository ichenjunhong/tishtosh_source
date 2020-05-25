package com.p683ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.comment.widget.DynamicLabelTextView;
import com.p683ss.android.ugc.aweme.views.RelationLabelTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentViewHolderNewStyle_ViewBinding */
public class CommentViewHolderNewStyle_ViewBinding extends CommentViewHolder_ViewBinding {

    /* renamed from: a */
    private CommentViewHolderNewStyle f66476a;

    /* renamed from: b */
    private View f66477b;

    /* renamed from: c */
    private View f66478c;

    /* renamed from: d */
    private View f66479d;

    /* renamed from: e */
    private View f66480e;

    public void unbind() {
        CommentViewHolderNewStyle commentViewHolderNewStyle = this.f66476a;
        if (commentViewHolderNewStyle != null) {
            this.f66476a = null;
            commentViewHolderNewStyle.mGifEmojiView = null;
            commentViewHolderNewStyle.mCommentTimeView = null;
            commentViewHolderNewStyle.mDiggCountView = null;
            commentViewHolderNewStyle.mDiggView = null;
            commentViewHolderNewStyle.mCommentStyleView = null;
            commentViewHolderNewStyle.mDiggLayout = null;
            commentViewHolderNewStyle.mReplyCommentStyleView = null;
            commentViewHolderNewStyle.mTvRelationLabel = null;
            commentViewHolderNewStyle.mTvReplyCommentRelationLabel = null;
            commentViewHolderNewStyle.mCommentSplitView = null;
            commentViewHolderNewStyle.mReplyCommentSplitView = null;
            commentViewHolderNewStyle.mPostStatus = null;
            commentViewHolderNewStyle.mTvLikedByCreator = null;
            commentViewHolderNewStyle.mBuryLayout = null;
            commentViewHolderNewStyle.mIronFanLabel = null;
            commentViewHolderNewStyle.mTvPromptContent = null;
            if (this.f66477b != null) {
                this.f66477b.setOnClickListener(null);
                this.f66477b.setOnLongClickListener(null);
                this.f66477b = null;
            }
            this.f66478c.setOnClickListener(null);
            this.f66478c = null;
            if (this.f66479d != null) {
                this.f66479d.setOnClickListener(null);
                this.f66479d = null;
            }
            if (this.f66480e != null) {
                this.f66480e.setOnClickListener(null);
                this.f66480e = null;
            }
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentViewHolderNewStyle_ViewBinding(final CommentViewHolderNewStyle commentViewHolderNewStyle, View view) {
        super(commentViewHolderNewStyle, view);
        this.f66476a = commentViewHolderNewStyle;
        View findViewById = view.findViewById(R.id.akl);
        commentViewHolderNewStyle.mGifEmojiView = (RemoteImageView) Utils.castView(findViewById, R.id.akl, "field 'mGifEmojiView'", RemoteImageView.class);
        if (findViewById != null) {
            this.f66477b = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    commentViewHolderNewStyle.onClick(view);
                }
            });
            findViewById.setOnLongClickListener(new OnLongClickListener() {
                public final boolean onLongClick(View view) {
                    return commentViewHolderNewStyle.onLongClick(view);
                }
            });
        }
        commentViewHolderNewStyle.mCommentTimeView = (TextView) Utils.findOptionalViewAsType(view, R.id.xm, "field 'mCommentTimeView'", TextView.class);
        commentViewHolderNewStyle.mDiggCountView = (TextView) Utils.findRequiredViewAsType(view, R.id.d9h, "field 'mDiggCountView'", TextView.class);
        commentViewHolderNewStyle.mDiggView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b02, "field 'mDiggView'", ImageView.class);
        commentViewHolderNewStyle.mCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, R.id.xl, "field 'mCommentStyleView'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b7f, "field 'mDiggLayout'");
        commentViewHolderNewStyle.mDiggLayout = findRequiredView;
        this.f66478c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commentViewHolderNewStyle.onClick(view);
            }
        });
        commentViewHolderNewStyle.mReplyCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, R.id.cbf, "field 'mReplyCommentStyleView'", TextView.class);
        commentViewHolderNewStyle.mTvRelationLabel = (RelationLabelTextView) Utils.findRequiredViewAsType(view, R.id.del, "field 'mTvRelationLabel'", RelationLabelTextView.class);
        commentViewHolderNewStyle.mTvReplyCommentRelationLabel = (RelationLabelTextView) Utils.findRequiredViewAsType(view, R.id.deo, "field 'mTvReplyCommentRelationLabel'", RelationLabelTextView.class);
        commentViewHolderNewStyle.mCommentSplitView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.xk, "field 'mCommentSplitView'", DmtTextView.class);
        commentViewHolderNewStyle.mReplyCommentSplitView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cbe, "field 'mReplyCommentSplitView'", DmtTextView.class);
        commentViewHolderNewStyle.mPostStatus = (DmtTextView) Utils.findOptionalViewAsType(view, R.id.c3w, "field 'mPostStatus'", DmtTextView.class);
        commentViewHolderNewStyle.mTvLikedByCreator = (DmtTextView) Utils.findOptionalViewAsType(view, R.id.bap, "field 'mTvLikedByCreator'", DmtTextView.class);
        View findViewById2 = view.findViewById(R.id.ei3);
        commentViewHolderNewStyle.mBuryLayout = findViewById2;
        if (findViewById2 != null) {
            this.f66479d = findViewById2;
            findViewById2.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    commentViewHolderNewStyle.onClick(view);
                }
            });
        }
        commentViewHolderNewStyle.mIronFanLabel = (DynamicLabelTextView) Utils.findOptionalViewAsType(view, R.id.f2p, "field 'mIronFanLabel'", DynamicLabelTextView.class);
        commentViewHolderNewStyle.mTvPromptContent = (TextView) Utils.findOptionalViewAsType(view, R.id.f40, "field 'mTvPromptContent'", TextView.class);
        View findViewById3 = view.findViewById(R.id.eda);
        if (findViewById3 != null) {
            this.f66480e = findViewById3;
            findViewById3.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    commentViewHolderNewStyle.onClick(view);
                }
            });
        }
    }
}

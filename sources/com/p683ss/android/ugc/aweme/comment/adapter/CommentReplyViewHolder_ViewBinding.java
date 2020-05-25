package com.p683ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.comment.p1528ui.CommentTranslationStatusView;
import com.p683ss.android.ugc.aweme.comment.widget.DynamicLabelTextView;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.aweme.views.RelationLabelTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentReplyViewHolder_ViewBinding */
public class CommentReplyViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommentReplyViewHolder f66430a;

    /* renamed from: b */
    private View f66431b;

    /* renamed from: c */
    private View f66432c;

    /* renamed from: d */
    private View f66433d;

    /* renamed from: e */
    private View f66434e;

    public void unbind() {
        CommentReplyViewHolder commentReplyViewHolder = this.f66430a;
        if (commentReplyViewHolder != null) {
            this.f66430a = null;
            commentReplyViewHolder.mBgView = null;
            commentReplyViewHolder.mRootView = null;
            commentReplyViewHolder.mAvatarView = null;
            commentReplyViewHolder.mDiggLayout = null;
            commentReplyViewHolder.mDiggView = null;
            commentReplyViewHolder.mDiggCountView = null;
            commentReplyViewHolder.mTitleView = null;
            commentReplyViewHolder.mCommentSplitView = null;
            commentReplyViewHolder.mContentView = null;
            commentReplyViewHolder.mCommentStyleView = null;
            commentReplyViewHolder.mTvRelationLabel = null;
            commentReplyViewHolder.mTranslationView = null;
            commentReplyViewHolder.mPostStatus = null;
            commentReplyViewHolder.mTvLikedByCreator = null;
            commentReplyViewHolder.mGifEmojiView = null;
            commentReplyViewHolder.mVideoCoverView = null;
            commentReplyViewHolder.mCommentTimeView = null;
            commentReplyViewHolder.mBuryView = null;
            commentReplyViewHolder.mBuryLayout = null;
            commentReplyViewHolder.mInvalidUsernamePrompt = null;
            commentReplyViewHolder.mTvPromptContent = null;
            commentReplyViewHolder.mIronFanLabel = null;
            this.f66431b.setOnClickListener(null);
            this.f66431b = null;
            if (this.f66432c != null) {
                this.f66432c.setOnClickListener(null);
                this.f66432c.setOnLongClickListener(null);
                this.f66432c = null;
            }
            if (this.f66433d != null) {
                this.f66433d.setOnClickListener(null);
                this.f66433d = null;
            }
            if (this.f66434e != null) {
                this.f66434e.setOnClickListener(null);
                this.f66434e = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentReplyViewHolder_ViewBinding(final CommentReplyViewHolder commentReplyViewHolder, View view) {
        this.f66430a = commentReplyViewHolder;
        commentReplyViewHolder.mBgView = view.findViewById(R.id.z0);
        commentReplyViewHolder.mRootView = Utils.findRequiredView(view, R.id.b9e, "field 'mRootView'");
        commentReplyViewHolder.mAvatarView = (SmartCircleImageView) Utils.findRequiredViewAsType(view, R.id.hi, "field 'mAvatarView'", SmartCircleImageView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b7f, "field 'mDiggLayout'");
        commentReplyViewHolder.mDiggLayout = findRequiredView;
        this.f66431b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                commentReplyViewHolder.onClick(view);
            }
        });
        commentReplyViewHolder.mDiggView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b02, "field 'mDiggView'", ImageView.class);
        commentReplyViewHolder.mDiggCountView = (TextView) Utils.findRequiredViewAsType(view, R.id.d9h, "field 'mDiggCountView'", TextView.class);
        commentReplyViewHolder.mTitleView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", DmtTextView.class);
        commentReplyViewHolder.mCommentSplitView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.xk, "field 'mCommentSplitView'", DmtTextView.class);
        commentReplyViewHolder.mContentView = (MentionTextView) Utils.findRequiredViewAsType(view, R.id.ze, "field 'mContentView'", MentionTextView.class);
        commentReplyViewHolder.mCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, R.id.xl, "field 'mCommentStyleView'", TextView.class);
        commentReplyViewHolder.mTvRelationLabel = (RelationLabelTextView) Utils.findRequiredViewAsType(view, R.id.del, "field 'mTvRelationLabel'", RelationLabelTextView.class);
        commentReplyViewHolder.mTranslationView = (CommentTranslationStatusView) Utils.findOptionalViewAsType(view, R.id.d4a, "field 'mTranslationView'", CommentTranslationStatusView.class);
        commentReplyViewHolder.mPostStatus = (DmtTextView) Utils.findOptionalViewAsType(view, R.id.c3w, "field 'mPostStatus'", DmtTextView.class);
        commentReplyViewHolder.mTvLikedByCreator = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.bap, "field 'mTvLikedByCreator'", DmtTextView.class);
        View findViewById = view.findViewById(R.id.akl);
        commentReplyViewHolder.mGifEmojiView = (RemoteImageView) Utils.castView(findViewById, R.id.akl, "field 'mGifEmojiView'", RemoteImageView.class);
        if (findViewById != null) {
            this.f66432c = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    commentReplyViewHolder.onClick(view);
                }
            });
            findViewById.setOnLongClickListener(new OnLongClickListener() {
                public final boolean onLongClick(View view) {
                    return commentReplyViewHolder.onLongClick(view);
                }
            });
        }
        commentReplyViewHolder.mVideoCoverView = (RemoteImageView) Utils.findOptionalViewAsType(view, R.id.dp2, "field 'mVideoCoverView'", RemoteImageView.class);
        commentReplyViewHolder.mCommentTimeView = (TextView) Utils.findOptionalViewAsType(view, R.id.xm, "field 'mCommentTimeView'", TextView.class);
        commentReplyViewHolder.mBuryView = (ImageView) Utils.findOptionalViewAsType(view, R.id.ee4, "field 'mBuryView'", ImageView.class);
        View findViewById2 = view.findViewById(R.id.ei3);
        commentReplyViewHolder.mBuryLayout = findViewById2;
        if (findViewById2 != null) {
            this.f66433d = findViewById2;
            findViewById2.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    commentReplyViewHolder.onClick(view);
                }
            });
        }
        View findViewById3 = view.findViewById(R.id.eda);
        commentReplyViewHolder.mInvalidUsernamePrompt = findViewById3;
        if (findViewById3 != null) {
            this.f66434e = findViewById3;
            findViewById3.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    commentReplyViewHolder.onClick(view);
                }
            });
        }
        commentReplyViewHolder.mTvPromptContent = (TextView) Utils.findOptionalViewAsType(view, R.id.f40, "field 'mTvPromptContent'", TextView.class);
        commentReplyViewHolder.mIronFanLabel = (DynamicLabelTextView) Utils.findOptionalViewAsType(view, R.id.f2p, "field 'mIronFanLabel'", DynamicLabelTextView.class);
    }
}

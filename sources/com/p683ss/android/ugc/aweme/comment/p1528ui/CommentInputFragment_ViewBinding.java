package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.support.p043v7.widget.AppCompatCheckBox;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.detail.p1628ui.FadeImageView;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentInputFragment_ViewBinding */
public class CommentInputFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommentInputFragment f66916a;

    public void unbind() {
        CommentInputFragment commentInputFragment = this.f66916a;
        if (commentInputFragment != null) {
            this.f66916a = null;
            commentInputFragment.mEditText = null;
            commentInputFragment.mSendCommentView = null;
            commentInputFragment.mLayout = null;
            commentInputFragment.mVgCommentContainer = null;
            commentInputFragment.ivAt = null;
            commentInputFragment.ivEmoji = null;
            commentInputFragment.tabDivider = null;
            commentInputFragment.mCbForward = null;
            commentInputFragment.report = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentInputFragment_ViewBinding(CommentInputFragment commentInputFragment, View view) {
        this.f66916a = commentInputFragment;
        commentInputFragment.mEditText = (MentionEditText) Utils.findRequiredViewAsType(view, R.id.x4, "field 'mEditText'", MentionEditText.class);
        commentInputFragment.mSendCommentView = (ImageView) Utils.findRequiredViewAsType(view, R.id.xi, "field 'mSendCommentView'", ImageView.class);
        commentInputFragment.mLayout = Utils.findRequiredView(view, R.id.yw, "field 'mLayout'");
        commentInputFragment.mVgCommentContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.a9b, "field 'mVgCommentContainer'", ViewGroup.class);
        commentInputFragment.ivAt = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.gg, "field 'ivAt'", FadeImageView.class);
        commentInputFragment.ivEmoji = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.b0c, "field 'ivEmoji'", FadeImageView.class);
        commentInputFragment.tabDivider = Utils.findRequiredView(view, R.id.cwp, "field 'tabDivider'");
        commentInputFragment.mCbForward = (AppCompatCheckBox) Utils.findRequiredViewAsType(view, R.id.r7, "field 'mCbForward'", AppCompatCheckBox.class);
        commentInputFragment.report = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.cbm, "field 'report'", FadeImageView.class);
    }
}

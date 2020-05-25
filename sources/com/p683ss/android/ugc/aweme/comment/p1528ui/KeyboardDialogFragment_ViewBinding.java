package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.support.p043v7.widget.AppCompatCheckBox;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p683ss.android.ugc.aweme.detail.p1628ui.FadeImageView;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment_ViewBinding */
public class KeyboardDialogFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private KeyboardDialogFragment f66997a;

    public void unbind() {
        KeyboardDialogFragment keyboardDialogFragment = this.f66997a;
        if (keyboardDialogFragment != null) {
            this.f66997a = null;
            keyboardDialogFragment.mContentLayout = null;
            keyboardDialogFragment.mInputLayout = null;
            keyboardDialogFragment.mSearchGifLayout = null;
            keyboardDialogFragment.mEditBlank = null;
            keyboardDialogFragment.mEditText = null;
            keyboardDialogFragment.mPublishView = null;
            keyboardDialogFragment.mCommentAtSearchLayout = null;
            keyboardDialogFragment.mReplyWithVideoView = null;
            keyboardDialogFragment.mAtView = null;
            keyboardDialogFragment.mEmojiView = null;
            keyboardDialogFragment.mGifEmojiLayout = null;
            keyboardDialogFragment.mGifEmoji = null;
            keyboardDialogFragment.mGifEmojiClear = null;
            keyboardDialogFragment.mCbForward = null;
            keyboardDialogFragment.mPanelContainer = null;
            keyboardDialogFragment.mMiniPanelContainer = null;
            keyboardDialogFragment.mOutWrapper = null;
            keyboardDialogFragment.mGifEmojiDrawingCache = null;
            keyboardDialogFragment.mGuideLayout = null;
            keyboardDialogFragment.mVgCommentContainer = null;
            keyboardDialogFragment.mGuideText = null;
            keyboardDialogFragment.mRvSearch = null;
            keyboardDialogFragment.mCommentAtSearchLoadingView = null;
            keyboardDialogFragment.mErrorText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public KeyboardDialogFragment_ViewBinding(KeyboardDialogFragment keyboardDialogFragment, View view) {
        this.f66997a = keyboardDialogFragment;
        keyboardDialogFragment.mContentLayout = Utils.findRequiredView(view, R.id.b7b, "field 'mContentLayout'");
        keyboardDialogFragment.mInputLayout = Utils.findRequiredView(view, R.id.b81, "field 'mInputLayout'");
        keyboardDialogFragment.mSearchGifLayout = Utils.findRequiredView(view, R.id.b9j, "field 'mSearchGifLayout'");
        keyboardDialogFragment.mEditBlank = Utils.findRequiredView(view, R.id.e6n, "field 'mEditBlank'");
        keyboardDialogFragment.mEditText = (MentionEditText) Utils.findRequiredViewAsType(view, R.id.x4, "field 'mEditText'", MentionEditText.class);
        keyboardDialogFragment.mPublishView = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.xi, "field 'mPublishView'", FadeImageView.class);
        keyboardDialogFragment.mCommentAtSearchLayout = (CommentAtSearchLayout) Utils.findRequiredViewAsType(view, R.id.q4, "field 'mCommentAtSearchLayout'", CommentAtSearchLayout.class);
        keyboardDialogFragment.mReplyWithVideoView = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.erw, "field 'mReplyWithVideoView'", FadeImageView.class);
        keyboardDialogFragment.mAtView = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.gg, "field 'mAtView'", FadeImageView.class);
        keyboardDialogFragment.mEmojiView = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.b0c, "field 'mEmojiView'", FadeImageView.class);
        keyboardDialogFragment.mGifEmojiLayout = Utils.findRequiredView(view, R.id.b7x, "field 'mGifEmojiLayout'");
        keyboardDialogFragment.mGifEmoji = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.akl, "field 'mGifEmoji'", RemoteImageView.class);
        keyboardDialogFragment.mGifEmojiClear = Utils.findRequiredView(view, R.id.akm, "field 'mGifEmojiClear'");
        keyboardDialogFragment.mCbForward = (AppCompatCheckBox) Utils.findRequiredViewAsType(view, R.id.r7, "field 'mCbForward'", AppCompatCheckBox.class);
        keyboardDialogFragment.mPanelContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bw1, "field 'mPanelContainer'", LinearLayout.class);
        keyboardDialogFragment.mMiniPanelContainer = (ClipLinearLayout) Utils.findRequiredViewAsType(view, R.id.bw2, "field 'mMiniPanelContainer'", ClipLinearLayout.class);
        keyboardDialogFragment.mOutWrapper = (MeasureLinearLayout) Utils.findRequiredViewAsType(view, R.id.bvl, "field 'mOutWrapper'", MeasureLinearLayout.class);
        keyboardDialogFragment.mGifEmojiDrawingCache = (ImageView) Utils.findRequiredViewAsType(view, R.id.akn, "field 'mGifEmojiDrawingCache'", ImageView.class);
        keyboardDialogFragment.mGuideLayout = Utils.findRequiredView(view, R.id.b7y, "field 'mGuideLayout'");
        keyboardDialogFragment.mVgCommentContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.x2, "field 'mVgCommentContainer'", ViewGroup.class);
        keyboardDialogFragment.mGuideText = (TextView) Utils.findRequiredViewAsType(view, R.id.cyp, "field 'mGuideText'", TextView.class);
        keyboardDialogFragment.mRvSearch = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cga, "field 'mRvSearch'", RecyclerView.class);
        keyboardDialogFragment.mCommentAtSearchLoadingView = (CommentAtSearchLoadingView) Utils.findRequiredViewAsType(view, R.id.bhy, "field 'mCommentAtSearchLoadingView'", CommentAtSearchLoadingView.class);
        keyboardDialogFragment.mErrorText = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.d_0, "field 'mErrorText'", DmtTextView.class);
    }
}

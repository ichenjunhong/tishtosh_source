package com.p683ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentReplyButtonViewHolder_ViewBinding */
public class CommentReplyButtonViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommentReplyButtonViewHolder f66408a;

    public void unbind() {
        CommentReplyButtonViewHolder commentReplyButtonViewHolder = this.f66408a;
        if (commentReplyButtonViewHolder != null) {
            this.f66408a = null;
            commentReplyButtonViewHolder.mExpandLayout = null;
            commentReplyButtonViewHolder.mLayoutButton = null;
            commentReplyButtonViewHolder.mLayoutLoading = null;
            commentReplyButtonViewHolder.mTvTitle = null;
            commentReplyButtonViewHolder.mCollapseLayout = null;
            commentReplyButtonViewHolder.mImgExpand = null;
            commentReplyButtonViewHolder.mDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentReplyButtonViewHolder_ViewBinding(CommentReplyButtonViewHolder commentReplyButtonViewHolder, View view) {
        this.f66408a = commentReplyButtonViewHolder;
        commentReplyButtonViewHolder.mExpandLayout = Utils.findRequiredView(view, R.id.acu, "field 'mExpandLayout'");
        commentReplyButtonViewHolder.mLayoutButton = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.b9_, "field 'mLayoutButton'", LinearLayout.class);
        commentReplyButtonViewHolder.mLayoutLoading = (DmtLoadingLayout) Utils.findRequiredViewAsType(view, R.id.b9a, "field 'mLayoutLoading'", DmtLoadingLayout.class);
        commentReplyButtonViewHolder.mTvTitle = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dep, "field 'mTvTitle'", DmtTextView.class);
        commentReplyButtonViewHolder.mCollapseLayout = Utils.findRequiredView(view, R.id.e2g, "field 'mCollapseLayout'");
        commentReplyButtonViewHolder.mImgExpand = (ImageView) Utils.findRequiredViewAsType(view, R.id.asy, "field 'mImgExpand'", ImageView.class);
        commentReplyButtonViewHolder.mDivider = Utils.findRequiredView(view, R.id.a6h, "field 'mDivider'");
    }
}

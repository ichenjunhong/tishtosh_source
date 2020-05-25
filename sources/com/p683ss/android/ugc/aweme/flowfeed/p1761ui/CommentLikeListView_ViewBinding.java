package com.p683ss.android.ugc.aweme.flowfeed.p1761ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.CommentLikeListView_ViewBinding */
public class CommentLikeListView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommentLikeListView f83162a;

    public void unbind() {
        CommentLikeListView commentLikeListView = this.f83162a;
        if (commentLikeListView != null) {
            this.f83162a = null;
            commentLikeListView.mHeadViews = null;
            commentLikeListView.mTvContent = null;
            commentLikeListView.mLikeListLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommentLikeListView_ViewBinding(CommentLikeListView commentLikeListView, View view) {
        this.f83162a = commentLikeListView;
        commentLikeListView.mHeadViews = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.bal, "field 'mHeadViews'", ViewGroup.class);
        commentLikeListView.mTvContent = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.bam, "field 'mTvContent'", DmtTextView.class);
        commentLikeListView.mLikeListLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ai9, "field 'mLikeListLayout'", ViewGroup.class);
    }
}

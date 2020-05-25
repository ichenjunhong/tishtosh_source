package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p683ss.android.ugc.aweme.common.widget.DragView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.AbsFollowFeedDetailActivity_ViewBinding */
public class AbsFollowFeedDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AbsFollowFeedDetailActivity f96507a;

    public void unbind() {
        AbsFollowFeedDetailActivity absFollowFeedDetailActivity = this.f96507a;
        if (absFollowFeedDetailActivity != null) {
            this.f96507a = null;
            absFollowFeedDetailActivity.mDragView = null;
            absFollowFeedDetailActivity.mDiggLayout = null;
            absFollowFeedDetailActivity.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AbsFollowFeedDetailActivity_ViewBinding(AbsFollowFeedDetailActivity absFollowFeedDetailActivity, View view) {
        this.f96507a = absFollowFeedDetailActivity;
        absFollowFeedDetailActivity.mDragView = (DragView) Utils.findRequiredViewAsType(view, R.id.a4x, "field 'mDragView'", DragView.class);
        absFollowFeedDetailActivity.mDiggLayout = (DiggLayout) Utils.findRequiredViewAsType(view, R.id.a5q, "field 'mDiggLayout'", DiggLayout.class);
        absFollowFeedDetailActivity.mRootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cfc, "field 'mRootView'", ViewGroup.class);
    }
}

package com.p683ss.android.ugc.aweme.followrequest;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.followrequest.FollowRequestActivity_ViewBinding */
public class FollowRequestActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FollowRequestActivity f84235a;

    /* renamed from: b */
    private View f84236b;

    public void unbind() {
        FollowRequestActivity followRequestActivity = this.f84235a;
        if (followRequestActivity != null) {
            this.f84235a = null;
            followRequestActivity.mTitleBar = null;
            followRequestActivity.mRecyclerView = null;
            followRequestActivity.mStatusView = null;
            followRequestActivity.mListStatusView = null;
            this.f84236b.setOnClickListener(null);
            this.f84236b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FollowRequestActivity_ViewBinding(final FollowRequestActivity followRequestActivity, View view) {
        this.f84235a = followRequestActivity;
        followRequestActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", TextTitleBar.class);
        followRequestActivity.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cbo, "field 'mRecyclerView'", RecyclerView.class);
        followRequestActivity.mStatusView = Utils.findRequiredView(view, R.id.csm, "field 'mStatusView'");
        followRequestActivity.mListStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.aid, "field 'mListStatusView'", DmtStatusView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "method 'back'");
        this.f84236b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                followRequestActivity.back();
            }
        });
    }
}

package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity_ViewBinding */
public class InviteUserListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InviteUserListActivity f85029a;

    /* renamed from: b */
    private View f85030b;

    /* renamed from: c */
    private View f85031c;

    /* renamed from: d */
    private View f85032d;

    public void unbind() {
        InviteUserListActivity inviteUserListActivity = this.f85029a;
        if (inviteUserListActivity != null) {
            this.f85029a = null;
            inviteUserListActivity.mTitleBar = null;
            inviteUserListActivity.mInviteText = null;
            inviteUserListActivity.mStatusView = null;
            inviteUserListActivity.mRefreshLayout = null;
            inviteUserListActivity.mListView = null;
            inviteUserListActivity.mTitleView = null;
            this.f85030b.setOnClickListener(null);
            this.f85030b = null;
            this.f85031c.setOnClickListener(null);
            this.f85031c = null;
            this.f85032d.setOnClickListener(null);
            this.f85032d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InviteUserListActivity_ViewBinding(final InviteUserListActivity inviteUserListActivity, View view) {
        this.f85029a = inviteUserListActivity;
        inviteUserListActivity.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", ButtonTitleBar.class);
        inviteUserListActivity.mInviteText = (TextView) Utils.findRequiredViewAsType(view, R.id.auz, "field 'mInviteText'", TextView.class);
        inviteUserListActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        inviteUserListActivity.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.caw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        inviteUserListActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bc2, "field 'mListView'", RecyclerView.class);
        inviteUserListActivity.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.auu, "method 'onClick'");
        this.f85030b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                inviteUserListActivity.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ccd, "method 'onClick'");
        this.f85031c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                inviteUserListActivity.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.ik, "method 'back'");
        this.f85032d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                inviteUserListActivity.back();
            }
        });
    }
}

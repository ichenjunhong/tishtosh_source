package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity_ViewBinding */
public class InviteFriendsActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InviteFriendsActivity f85012a;

    public void unbind() {
        InviteFriendsActivity inviteFriendsActivity = this.f85012a;
        if (inviteFriendsActivity != null) {
            this.f85012a = null;
            inviteFriendsActivity.mListView = null;
            inviteFriendsActivity.mTitleBar = null;
            inviteFriendsActivity.mStatusView = null;
            inviteFriendsActivity.mRefreshLayout = null;
            inviteFriendsActivity.mBtnFloatInviteAll = null;
            inviteFriendsActivity.mBtnFloatInviteAllContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InviteFriendsActivity_ViewBinding(InviteFriendsActivity inviteFriendsActivity, View view) {
        this.f85012a = inviteFriendsActivity;
        inviteFriendsActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bc2, "field 'mListView'", RecyclerView.class);
        inviteFriendsActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", TextTitleBar.class);
        inviteFriendsActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        inviteFriendsActivity.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.caw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        inviteFriendsActivity.mBtnFloatInviteAll = (TextView) Utils.findRequiredViewAsType(view, R.id.aht, "field 'mBtnFloatInviteAll'", TextView.class);
        inviteFriendsActivity.mBtnFloatInviteAllContainer = Utils.findRequiredView(view, R.id.ahu, "field 'mBtnFloatInviteAllContainer'");
    }
}

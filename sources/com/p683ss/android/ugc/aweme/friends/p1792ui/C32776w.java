package com.p683ss.android.ugc.aweme.friends.p1792ui;

import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.w */
final /* synthetic */ class C32776w implements C23596b {

    /* renamed from: a */
    private final InviteFriendsActivity f85356a;

    C32776w(InviteFriendsActivity inviteFriendsActivity) {
        this.f85356a = inviteFriendsActivity;
    }

    /* renamed from: a */
    public final void mo47048a() {
        InviteFriendsActivity inviteFriendsActivity = this.f85356a;
        if (inviteFriendsActivity.f84985g != null) {
            inviteFriendsActivity.f84985g.mo44934a_(Integer.valueOf(1));
            return;
        }
        inviteFriendsActivity.mRefreshLayout.setRefreshing(false);
    }
}

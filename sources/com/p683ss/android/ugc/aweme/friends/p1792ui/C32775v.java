package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import com.p683ss.android.ugc.aweme.share.InviteFriendSharePackage;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.C42345e;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.v */
final /* synthetic */ class C32775v implements C42345e {

    /* renamed from: a */
    private final InviteFriendsActivity f85354a;

    /* renamed from: b */
    private final InviteFriendSharePackage f85355b;

    C32775v(InviteFriendsActivity inviteFriendsActivity, InviteFriendSharePackage inviteFriendSharePackage) {
        this.f85354a = inviteFriendsActivity;
        this.f85355b = inviteFriendSharePackage;
    }

    /* renamed from: a */
    public final void mo66353a(C42307b bVar) {
        InviteFriendsActivity inviteFriendsActivity = this.f85354a;
        InviteFriendSharePackage inviteFriendSharePackage = this.f85355b;
        if (!inviteFriendSharePackage.mo85939a(bVar, inviteFriendsActivity)) {
            bVar.mo49947a(inviteFriendSharePackage.mo73884a(bVar), (Context) inviteFriendsActivity);
        }
    }
}

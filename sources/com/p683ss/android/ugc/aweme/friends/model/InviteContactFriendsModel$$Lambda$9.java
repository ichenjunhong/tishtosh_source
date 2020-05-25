package com.p683ss.android.ugc.aweme.friends.model;

import com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$9 */
final /* synthetic */ class InviteContactFriendsModel$$Lambda$9 implements Runnable {
    private final boolean arg$1;
    private final InviteFriendsCallback arg$2;
    private final String arg$3;

    InviteContactFriendsModel$$Lambda$9(boolean z, InviteFriendsCallback inviteFriendsCallback, String str) {
        this.arg$1 = z;
        this.arg$2 = inviteFriendsCallback;
        this.arg$3 = str;
    }

    public final void run() {
        InviteContactFriendsModel.lambda$null$7$InviteContactFriendsModel(this.arg$1, this.arg$2, this.arg$3);
    }
}

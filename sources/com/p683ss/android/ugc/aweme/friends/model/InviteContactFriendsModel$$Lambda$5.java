package com.p683ss.android.ugc.aweme.friends.model;

import com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$5 */
final /* synthetic */ class InviteContactFriendsModel$$Lambda$5 implements Callable {
    private final InviteContactFriendsModel arg$1;
    private final List arg$2;
    private final String arg$3;
    private final InviteFriendsCallback arg$4;

    InviteContactFriendsModel$$Lambda$5(InviteContactFriendsModel inviteContactFriendsModel, List list, String str, InviteFriendsCallback inviteFriendsCallback) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = list;
        this.arg$3 = str;
        this.arg$4 = inviteFriendsCallback;
    }

    public final Object call() {
        return this.arg$1.lambda$inviteFriendsForDouyin$6$InviteContactFriendsModel(this.arg$2, this.arg$3, this.arg$4);
    }
}

package com.p683ss.android.ugc.aweme.friends.model;

import com.p683ss.android.ugc.aweme.friends.invite.C32586d;
import com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.IFetchShareConfigCallback;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$8 */
final /* synthetic */ class InviteContactFriendsModel$$Lambda$8 implements Runnable {
    private final IFetchShareConfigCallback arg$1;
    private final C32586d arg$2;

    InviteContactFriendsModel$$Lambda$8(IFetchShareConfigCallback iFetchShareConfigCallback, C32586d dVar) {
        this.arg$1 = iFetchShareConfigCallback;
        this.arg$2 = dVar;
    }

    public final void run() {
        InviteContactFriendsModel.lambda$null$9$InviteContactFriendsModel(this.arg$1, this.arg$2);
    }
}

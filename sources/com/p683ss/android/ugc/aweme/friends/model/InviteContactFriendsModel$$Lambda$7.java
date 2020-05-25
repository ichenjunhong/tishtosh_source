package com.p683ss.android.ugc.aweme.friends.model;

import com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.IFetchShareConfigCallback;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$7 */
final /* synthetic */ class InviteContactFriendsModel$$Lambda$7 implements Callable {
    private final InviteContactFriendsModel arg$1;
    private final IFetchShareConfigCallback arg$2;

    InviteContactFriendsModel$$Lambda$7(InviteContactFriendsModel inviteContactFriendsModel, IFetchShareConfigCallback iFetchShareConfigCallback) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = iFetchShareConfigCallback;
    }

    public final Object call() {
        return this.arg$1.lambda$fetchShareConfig$10$InviteContactFriendsModel(this.arg$2);
    }
}

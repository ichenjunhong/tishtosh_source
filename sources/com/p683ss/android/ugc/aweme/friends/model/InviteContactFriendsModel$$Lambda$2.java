package com.p683ss.android.ugc.aweme.friends.model;

import java.util.concurrent.atomic.AtomicReference;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$2 */
final /* synthetic */ class InviteContactFriendsModel$$Lambda$2 implements C0011g {
    private final InviteContactFriendsModel arg$1;
    private final AtomicReference arg$2;

    InviteContactFriendsModel$$Lambda$2(InviteContactFriendsModel inviteContactFriendsModel, AtomicReference atomicReference) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = atomicReference;
    }

    public final Object then(C0013i iVar) {
        return this.arg$1.lambda$uploadContacts$2$InviteContactFriendsModel(this.arg$2, iVar);
    }
}

package com.p683ss.android.ugc.aweme.friends.model;

import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$11 */
final /* synthetic */ class InviteContactFriendsModel$$Lambda$11 implements Callable {
    private final C0013i arg$1;

    private InviteContactFriendsModel$$Lambda$11(C0013i iVar) {
        this.arg$1 = iVar;
    }

    static Callable get$Lambda(C0013i iVar) {
        return new InviteContactFriendsModel$$Lambda$11(iVar);
    }

    public final Object call() {
        return this.arg$1.mo34e();
    }
}

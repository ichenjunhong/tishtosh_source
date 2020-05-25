package com.p683ss.android.ugc.aweme.friends.model;

import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel$$Lambda$5 */
final /* synthetic */ class ThirdPartyFriendModel$$Lambda$5 implements Callable {
    private final C0013i arg$1;

    private ThirdPartyFriendModel$$Lambda$5(C0013i iVar) {
        this.arg$1 = iVar;
    }

    static Callable get$Lambda(C0013i iVar) {
        return new ThirdPartyFriendModel$$Lambda$5(iVar);
    }

    public final Object call() {
        return this.arg$1.mo34e();
    }
}

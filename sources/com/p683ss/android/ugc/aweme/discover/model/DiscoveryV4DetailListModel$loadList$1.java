package com.p683ss.android.ugc.aweme.discover.model;

import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel$loadList$1 */
final class DiscoveryV4DetailListModel$loadList$1<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {
    public static final DiscoveryV4DetailListModel$loadList$1 INSTANCE = new DiscoveryV4DetailListModel$loadList$1();

    DiscoveryV4DetailListModel$loadList$1() {
    }

    public final DiscoveryV4CellDetailResponse then(C0013i<DiscoveryV4CellDetailResponse> iVar) {
        C52711k.m112236a((Object) iVar, "it");
        if (iVar.mo31c()) {
            return null;
        }
        if (!iVar.mo33d()) {
            return (DiscoveryV4CellDetailResponse) iVar.mo34e();
        }
        Exception f = iVar.mo35f();
        C52711k.m112236a((Object) f, "it.error");
        throw f;
    }
}

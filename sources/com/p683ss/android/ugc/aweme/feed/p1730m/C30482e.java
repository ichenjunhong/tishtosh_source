package com.p683ss.android.ugc.aweme.feed.p1730m;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.m.e */
final /* synthetic */ class C30482e implements Callable {

    /* renamed from: a */
    private final C30480d f79668a;

    C30482e(C30480d dVar) {
        this.f79668a = dVar;
    }

    public final Object call() {
        C30480d dVar = this.f79668a;
        if (dVar.getItems() != null && dVar.f79649e.f80316a + 1 < dVar.getItems().size()) {
            dVar.getItems().subList(0, dVar.f79649e.f80316a + 1).clear();
            dVar.f79649e.f80316a = 0;
            if (dVar.f79649e.f80317b) {
                dVar.f79649e.f80317b = false;
            }
        }
        Thread.sleep(400);
        return dVar.mData;
    }
}

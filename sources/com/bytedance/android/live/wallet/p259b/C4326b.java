package com.bytedance.android.live.wallet.p259b;

import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;

/* renamed from: com.bytedance.android.live.wallet.b.b */
final /* synthetic */ class C4326b implements Runnable {

    /* renamed from: a */
    private final C4312a f11854a;

    /* renamed from: b */
    private final CheckOrderOriginalResult f11855b;

    C4326b(C4312a aVar, CheckOrderOriginalResult checkOrderOriginalResult) {
        this.f11854a = aVar;
        this.f11855b = checkOrderOriginalResult;
    }

    public final void run() {
        this.f11854a.mo10101a(this.f11855b.getRetry() + 1);
    }
}

package com.bytedance.android.livesdk.gift.honor;

/* renamed from: com.bytedance.android.livesdk.gift.honor.i */
final /* synthetic */ class C7472i implements Runnable {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f20484a;

    /* renamed from: b */
    private final Integer f20485b;

    C7472i(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget, Integer num) {
        this.f20484a = liveGiftHonorLevelWidget;
        this.f20485b = num;
    }

    public final void run() {
        this.f20484a.mo13870a(this.f20485b.intValue());
    }
}

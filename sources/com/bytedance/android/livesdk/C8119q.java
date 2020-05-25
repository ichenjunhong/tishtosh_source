package com.bytedance.android.livesdk;

/* renamed from: com.bytedance.android.livesdk.q */
final /* synthetic */ class C8119q implements Runnable {

    /* renamed from: a */
    private final C6752f f22176a;

    C8119q(C6752f fVar) {
        this.f22176a = fVar;
    }

    public final void run() {
        C6752f fVar = this.f22176a;
        TTLiveSDKContext.getHostService().mo10309b();
    }
}

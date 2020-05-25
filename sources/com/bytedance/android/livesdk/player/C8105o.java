package com.bytedance.android.livesdk.player;

/* renamed from: com.bytedance.android.livesdk.player.o */
final /* synthetic */ class C8105o implements Runnable {

    /* renamed from: a */
    private final C8097k f22133a;

    /* renamed from: b */
    private final float f22134b;

    C8105o(C8097k kVar, float f) {
        this.f22133a = kVar;
        this.f22134b = f;
    }

    public final void run() {
        C8097k kVar = this.f22133a;
        float f = this.f22134b;
        if (kVar.f22111a && f >= 0.0f) {
            kVar.f22112b = f;
        }
    }
}

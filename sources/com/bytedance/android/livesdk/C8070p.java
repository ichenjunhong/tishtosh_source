package com.bytedance.android.livesdk;

/* renamed from: com.bytedance.android.livesdk.p */
final /* synthetic */ class C8070p implements Runnable {

    /* renamed from: a */
    private final C6752f f22049a;

    C8070p(C6752f fVar) {
        this.f22049a = fVar;
    }

    public final void run() {
        C6752f fVar = this.f22049a;
        if (fVar.f18469i != null) {
            fVar.f18469i.run();
        }
    }
}

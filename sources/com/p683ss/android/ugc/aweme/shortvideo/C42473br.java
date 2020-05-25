package com.p683ss.android.ugc.aweme.shortvideo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.br */
final /* synthetic */ class C42473br implements Runnable {

    /* renamed from: a */
    private final C42470bo f107414a;

    /* renamed from: b */
    private final C43856fy f107415b;

    C42473br(C42470bo boVar, C43856fy fyVar) {
        this.f107414a = boVar;
        this.f107415b = fyVar;
    }

    public final void run() {
        C42470bo boVar = this.f107414a;
        boVar.f107406a.onError(this.f107415b);
    }
}

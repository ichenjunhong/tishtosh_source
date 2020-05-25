package com.p683ss.android.ugc.aweme.shortvideo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bs */
final /* synthetic */ class C42474bs implements Runnable {

    /* renamed from: a */
    private final C42470bo f107416a;

    /* renamed from: b */
    private final String f107417b;

    C42474bs(C42470bo boVar, String str) {
        this.f107416a = boVar;
        this.f107417b = str;
    }

    public final void run() {
        C42470bo boVar = this.f107416a;
        boVar.f107406a.onSynthetiseSuccess(this.f107417b);
    }
}

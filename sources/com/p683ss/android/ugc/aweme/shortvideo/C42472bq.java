package com.p683ss.android.ugc.aweme.shortvideo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bq */
final /* synthetic */ class C42472bq implements Runnable {

    /* renamed from: a */
    private final C42470bo f107411a;

    /* renamed from: b */
    private final C42421al f107412b;

    /* renamed from: c */
    private final boolean f107413c;

    C42472bq(C42470bo boVar, C42421al alVar, boolean z) {
        this.f107411a = boVar;
        this.f107412b = alVar;
        this.f107413c = z;
    }

    public final void run() {
        C42470bo boVar = this.f107411a;
        boVar.f107406a.onSuccess(this.f107412b, this.f107413c);
    }
}

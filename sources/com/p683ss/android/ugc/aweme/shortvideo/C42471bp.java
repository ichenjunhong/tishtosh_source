package com.p683ss.android.ugc.aweme.shortvideo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bp */
final /* synthetic */ class C42471bp implements Runnable {

    /* renamed from: a */
    private final C42470bo f107408a;

    /* renamed from: b */
    private final int f107409b;

    /* renamed from: c */
    private final boolean f107410c;

    C42471bp(C42470bo boVar, int i, boolean z) {
        this.f107408a = boVar;
        this.f107409b = i;
        this.f107410c = z;
    }

    public final void run() {
        C42470bo boVar = this.f107408a;
        boVar.f107406a.onProgressUpdate(this.f107409b, this.f107410c);
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.p2225s;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.q */
final /* synthetic */ class C44501q implements Runnable {

    /* renamed from: a */
    private final C44485k f112577a;

    C44501q(C44485k kVar) {
        this.f112577a = kVar;
    }

    public final void run() {
        C44485k kVar = this.f112577a;
        int a = kVar.f112515d.mo87841a(1, kVar.f112519h.mo87844d());
        if (kVar.f112512a != null) {
            kVar.f112512a.onProgressUpdate(a, false);
        }
    }
}

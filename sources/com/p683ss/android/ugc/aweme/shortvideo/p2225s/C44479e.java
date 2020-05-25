package com.p683ss.android.ugc.aweme.shortvideo.p2225s;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.e */
final /* synthetic */ class C44479e implements Runnable {

    /* renamed from: a */
    private final C44468a f112502a;

    C44479e(C44468a aVar) {
        this.f112502a = aVar;
    }

    public final void run() {
        C44468a aVar = this.f112502a;
        int a = aVar.f112469b.mo87841a(1, aVar.f112472e.mo87844d());
        if (aVar.f112468a != null) {
            aVar.f112468a.onProgressUpdate(a, false);
        }
    }
}

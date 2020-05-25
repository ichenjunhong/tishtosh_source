package com.p683ss.android.ugc.aweme.feed.p1719e;

/* renamed from: com.ss.android.ugc.aweme.feed.e.i */
final /* synthetic */ class C30194i implements Runnable {

    /* renamed from: a */
    private final C30188c f78795a;

    /* renamed from: b */
    private final long f78796b;

    C30194i(C30188c cVar, long j) {
        this.f78795a = cVar;
        this.f78796b = j;
    }

    public final void run() {
        C30188c cVar = this.f78795a;
        cVar.f78783c.animate().alpha(1.0f).translationX(0.0f).setDuration(this.f78796b).start();
    }
}

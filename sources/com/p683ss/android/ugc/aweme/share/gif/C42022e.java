package com.p683ss.android.ugc.aweme.share.gif;

/* renamed from: com.ss.android.ugc.aweme.share.gif.e */
final /* synthetic */ class C42022e implements Runnable {

    /* renamed from: a */
    private final C42018b f106396a;

    /* renamed from: b */
    private final int f106397b;

    C42022e(C42018b bVar, int i) {
        this.f106396a = bVar;
        this.f106397b = i;
    }

    public final void run() {
        C42018b bVar = this.f106396a;
        int i = this.f106397b;
        if (bVar.f106381b != null) {
            bVar.f106381b.setProgress(i);
        }
    }
}

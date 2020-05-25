package com.p683ss.android.ugc.aweme.feed.p1736ui;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ey */
final /* synthetic */ class C30984ey implements Runnable {

    /* renamed from: a */
    private final C30966et f81140a;

    C30984ey(C30966et etVar) {
        this.f81140a = etVar;
    }

    public final void run() {
        C30966et etVar = this.f81140a;
        etVar.f81102r.animate().scaleX(1.0f).scaleY(1.0f).setDuration(350).withEndAction(new C30985ez(etVar)).start();
    }
}

package com.p683ss.android.ugc.aweme.feed.p1736ui;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ew */
final /* synthetic */ class C30982ew implements Runnable {

    /* renamed from: a */
    private final C30966et f81134a;

    /* renamed from: b */
    private final float f81135b;

    /* renamed from: c */
    private final float f81136c;

    C30982ew(C30966et etVar, float f, float f2) {
        this.f81134a = etVar;
        this.f81135b = f;
        this.f81136c = f2;
    }

    public final void run() {
        C30966et etVar = this.f81134a;
        float f = this.f81135b;
        etVar.f81102r.animate().scaleX(f).scaleY(f).setDuration(150).withEndAction(new C30983ex(etVar, f, this.f81136c)).start();
    }
}

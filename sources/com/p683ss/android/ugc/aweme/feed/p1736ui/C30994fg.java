package com.p683ss.android.ugc.aweme.feed.p1736ui;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.fg */
final /* synthetic */ class C30994fg implements Runnable {

    /* renamed from: a */
    private final C30966et f81163a;

    /* renamed from: b */
    private final float f81164b;

    /* renamed from: c */
    private final float f81165c;

    C30994fg(C30966et etVar, float f, float f2) {
        this.f81163a = etVar;
        this.f81164b = f;
        this.f81165c = f2;
    }

    public final void run() {
        C30966et etVar = this.f81163a;
        etVar.f81102r.animate().scaleX(1.08f).scaleY(1.08f).setDuration(150).withEndAction(new C30982ew(etVar, this.f81164b, this.f81165c)).start();
    }
}

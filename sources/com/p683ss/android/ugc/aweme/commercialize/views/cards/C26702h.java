package com.p683ss.android.ugc.aweme.commercialize.views.cards;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.h */
final /* synthetic */ class C26702h implements Runnable {

    /* renamed from: a */
    private final C26691e f70375a;

    C26702h(C26691e eVar) {
        this.f70375a = eVar;
    }

    public final void run() {
        C26691e eVar = this.f70375a;
        if (!eVar.f70354o) {
            eVar.f70352m = -1;
            eVar.f70351l = -1;
            boolean z = true;
            boolean z2 = eVar.f70345f != null && eVar.f70345f.f70318g;
            boolean z3 = eVar.f70347h != null && eVar.f70347h.f70318g;
            if (!z2 && !z3) {
                z = false;
            }
            if (!z && eVar.f70342c.mo54260a()) {
                eVar.f70349j.mo48228a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
            }
        }
    }
}

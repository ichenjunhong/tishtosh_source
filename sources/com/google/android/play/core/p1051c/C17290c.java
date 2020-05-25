package com.google.android.play.core.p1051c;

/* renamed from: com.google.android.play.core.c.c */
final class C17290c extends C17281bc {

    /* renamed from: b */
    private final /* synthetic */ C17289bk f48767b;

    C17290c(C17289bk bkVar) {
        this.f48767b = bkVar;
    }

    /* renamed from: a */
    public final void mo33509a() {
        C17283be beVar = this.f48767b.f48766a;
        beVar.f48751b.mo33685a("unlinkToDeath", new Object[0]);
        beVar.f48760k.asBinder().unlinkToDeath(beVar.f48758i, 0);
        this.f48767b.f48766a.f48760k = null;
        this.f48767b.f48766a.f48754e = false;
    }
}

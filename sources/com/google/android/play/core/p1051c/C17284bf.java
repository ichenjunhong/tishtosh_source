package com.google.android.play.core.p1051c;

/* renamed from: com.google.android.play.core.c.bf */
final class C17284bf extends C17281bc {

    /* renamed from: b */
    private final /* synthetic */ C17283be f48761b;

    C17284bf(C17283be beVar) {
        this.f48761b = beVar;
    }

    /* renamed from: a */
    public final void mo33509a() {
        if (this.f48761b.f48760k != null) {
            this.f48761b.f48751b.mo33685a("Unbind from service.", new Object[0]);
            this.f48761b.f48750a.unbindService(this.f48761b.f48759j);
            this.f48761b.f48754e = false;
            this.f48761b.f48760k = null;
            this.f48761b.f48759j = null;
        }
    }
}

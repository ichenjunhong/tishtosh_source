package com.google.android.gms.p1033b;

/* renamed from: com.google.android.gms.b.n */
final class C15189n implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15179g f39215a;

    /* renamed from: b */
    private final /* synthetic */ C15188m f39216b;

    C15189n(C15188m mVar, C15179g gVar) {
        this.f39216b = mVar;
        this.f39215a = gVar;
    }

    public final void run() {
        try {
            C15179g gVar = (C15179g) this.f39216b.f39212a.mo27985a(this.f39215a);
            if (gVar == null) {
                this.f39216b.mo27988a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            gVar.mo27996a(C15181i.f39204b, (C15177e<? super TResult>) this.f39216b);
            gVar.mo27995a(C15181i.f39204b, (C15176d) this.f39216b);
            gVar.mo27993a(C15181i.f39204b, (C15174b) this.f39216b);
        } catch (C15178f e) {
            if (e.getCause() instanceof Exception) {
                this.f39216b.f39214c.mo28018a((Exception) e.getCause());
            } else {
                this.f39216b.f39214c.mo28018a((Exception) e);
            }
        } catch (Exception e2) {
            this.f39216b.f39214c.mo28018a(e2);
        }
    }
}

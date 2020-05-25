package com.google.android.gms.p1033b;

/* renamed from: com.google.android.gms.b.l */
final class C15187l implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15179g f39210a;

    /* renamed from: b */
    private final /* synthetic */ C15186k f39211b;

    C15187l(C15186k kVar, C15179g gVar) {
        this.f39211b = kVar;
        this.f39210a = gVar;
    }

    public final void run() {
        if (this.f39210a.mo28001c()) {
            this.f39211b.f39209c.mo28022f();
            return;
        }
        try {
            this.f39211b.f39209c.mo28019a(this.f39211b.f39207a.mo27985a(this.f39210a));
        } catch (C15178f e) {
            if (e.getCause() instanceof Exception) {
                this.f39211b.f39209c.mo28018a((Exception) e.getCause());
            } else {
                this.f39211b.f39209c.mo28018a((Exception) e);
            }
        } catch (Exception e2) {
            this.f39211b.f39209c.mo28018a(e2);
        }
    }
}

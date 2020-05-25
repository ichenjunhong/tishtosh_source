package com.google.android.play.core.p1056f;

/* renamed from: com.google.android.play.core.f.i */
final class C17371i implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17365d f48884a;

    /* renamed from: b */
    private final /* synthetic */ C17372j f48885b;

    C17371i(C17372j jVar, C17365d dVar) {
        this.f48885b = jVar;
        this.f48884a = dVar;
    }

    public final void run() {
        synchronized (this.f48885b.f48886a) {
            if (this.f48885b.f48888c != null) {
                this.f48885b.f48888c.mo23058a(this.f48884a.mo33660c());
            }
        }
    }
}

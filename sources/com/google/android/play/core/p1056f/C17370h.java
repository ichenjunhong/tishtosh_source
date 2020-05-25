package com.google.android.play.core.p1056f;

/* renamed from: com.google.android.play.core.f.h */
final class C17370h implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17365d f48882a;

    /* renamed from: b */
    private final /* synthetic */ C17369g f48883b;

    C17370h(C17369g gVar, C17365d dVar) {
        this.f48883b = gVar;
        this.f48882a = dVar;
    }

    public final void run() {
        synchronized (this.f48883b.f48879a) {
            if (this.f48883b.f48881c != null) {
                this.f48883b.f48881c.mo23057a(this.f48882a.mo33661d());
            }
        }
    }
}

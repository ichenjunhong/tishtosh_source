package com.google.android.play.core.p1051c;

/* renamed from: com.google.android.play.core.c.an */
final class C17265an extends C17260aj {

    /* renamed from: a */
    private final C17264am f48735a = new C17264am();

    C17265an() {
    }

    /* renamed from: a */
    public final void mo33545a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f48735a.mo33548a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}

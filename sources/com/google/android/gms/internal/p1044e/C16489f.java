package com.google.android.gms.internal.p1044e;

/* renamed from: com.google.android.gms.internal.e.f */
final class C16489f extends C16486c {

    /* renamed from: a */
    private final C16487d f46389a = new C16487d();

    C16489f() {
    }

    /* renamed from: a */
    public final void mo31694a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f46389a.mo31695a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}

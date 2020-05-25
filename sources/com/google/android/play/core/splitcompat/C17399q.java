package com.google.android.play.core.splitcompat;

import java.util.Set;

/* renamed from: com.google.android.play.core.splitcompat.q */
final class C17399q implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Set f48935a;

    /* renamed from: b */
    private final /* synthetic */ C17383a f48936b;

    C17399q(C17383a aVar, Set set) {
        this.f48936b = aVar;
        this.f48935a = set;
    }

    public final void run() {
        try {
            for (String e : this.f48935a) {
                this.f48936b.f48909b.mo33705e(e);
            }
        } catch (Exception unused) {
        }
    }
}

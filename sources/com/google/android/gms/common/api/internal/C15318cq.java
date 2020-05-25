package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cq */
final class C15318cq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15317cp f39530a;

    C15318cq(C15317cp cpVar) {
        this.f39530a = cpVar;
    }

    public final void run() {
        this.f39530a.f39528m.lock();
        try {
            C15317cp.m31767b(this.f39530a);
        } finally {
            this.f39530a.f39528m.unlock();
        }
    }
}

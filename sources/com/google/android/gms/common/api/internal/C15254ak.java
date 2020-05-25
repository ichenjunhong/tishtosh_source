package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.ak */
abstract class C15254ak implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15244aa f39371a;

    private C15254ak(C15244aa aaVar) {
        this.f39371a = aaVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28164a();

    public void run() {
        this.f39371a.f39342h.lock();
        try {
            if (!Thread.interrupted()) {
                mo28164a();
                this.f39371a.f39342h.unlock();
            }
        } catch (RuntimeException e) {
            C15265av d = this.f39371a.f39335a;
            d.f39414e.sendMessage(d.f39414e.obtainMessage(2, e));
        } finally {
            this.f39371a.f39342h.unlock();
        }
    }

    /* synthetic */ C15254ak(C15244aa aaVar, C15245ab abVar) {
        this(aaVar);
    }
}

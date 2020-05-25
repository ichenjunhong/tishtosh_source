package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.aw */
abstract class C15266aw {

    /* renamed from: a */
    private final C15264au f39425a;

    protected C15266aw(C15264au auVar) {
        this.f39425a = auVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28165a();

    /* renamed from: a */
    public final void mo28195a(C15265av avVar) {
        avVar.f39410a.lock();
        try {
            if (avVar.f39420k == this.f39425a) {
                mo28165a();
                avVar.f39410a.unlock();
            }
        } finally {
            avVar.f39410a.unlock();
        }
    }
}

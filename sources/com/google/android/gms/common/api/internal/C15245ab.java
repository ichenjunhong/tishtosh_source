package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.ab */
final class C15245ab implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15244aa f39356a;

    C15245ab(C15244aa aaVar) {
        this.f39356a = aaVar;
    }

    public final void run() {
        this.f39356a.f39344j.cancelAvailabilityErrorNotifications(this.f39356a.f39343i);
    }
}

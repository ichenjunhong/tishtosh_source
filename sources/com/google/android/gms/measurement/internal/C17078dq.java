package com.google.android.gms.measurement.internal;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.dq */
final class C17078dq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17092ed f48208a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f48209b;

    C17078dq(C17074dm dmVar, C17092ed edVar, Runnable runnable) {
        this.f48208a = edVar;
        this.f48209b = runnable;
    }

    public final void run() {
        this.f48208a.mo33116o();
        C17092ed edVar = this.f48208a;
        Runnable runnable = this.f48209b;
        edVar.mo33112i();
        if (edVar.f48237c == null) {
            edVar.f48237c = new ArrayList();
        }
        edVar.f48237c.add(runnable);
        this.f48208a.mo33114k();
    }
}

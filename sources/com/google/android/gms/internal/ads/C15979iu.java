package com.google.android.gms.internal.ads;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.ads.iu */
final class C15979iu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15976ir f45079a;

    C15979iu(C15976ir irVar) {
        this.f45079a = irVar;
    }

    public final void run() {
        C15976ir irVar = this.f45079a;
        if (irVar.f45075a != null) {
            irVar.f45075a.mo28403f();
            Binder.flushPendingCommands();
        }
    }
}

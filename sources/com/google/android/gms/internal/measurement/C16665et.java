package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.et */
final class C16665et extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C16663er f46901a;

    C16665et(C16663er erVar, Handler handler) {
        this.f46901a = erVar;
        super(null);
    }

    public final void onChange(boolean z) {
        C16663er erVar = this.f46901a;
        synchronized (erVar.f46895b) {
            erVar.f46896c = null;
            C16675fc.m39833a();
        }
        synchronized (erVar) {
            Iterator it = erVar.f46897d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}

package com.google.android.gms.tagmanager;

import android.os.Process;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;

/* renamed from: com.google.android.gms.tagmanager.v */
final class C17226v implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17209e f48682a;

    C17226v(C17209e eVar) {
        this.f48682a = eVar;
    }

    public final void run() {
        C17209e eVar = this.f48682a;
        Process.setThreadPriority(10);
        while (!eVar.f48654b) {
            C14903a a = eVar.f48661i.mo33483a();
            if (a != null) {
                eVar.f48655c = a;
                eVar.f48656d = eVar.f48658f.mo28523a();
            }
            synchronized (eVar) {
                eVar.notifyAll();
            }
            try {
                synchronized (eVar.f48660h) {
                    eVar.f48660h.wait(eVar.f48653a);
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}

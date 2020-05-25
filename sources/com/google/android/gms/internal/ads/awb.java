package com.google.android.gms.internal.ads;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

final class awb extends avy {

    /* renamed from: a */
    private final avz f41453a = new avz();

    awb() {
    }

    /* renamed from: a */
    public final void mo29572a(Throwable th) {
        List a = this.f41453a.mo29574a(th, false);
        if (a != null) {
            synchronized (a) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    it.next();
                    System.err.print("Suppressed: ");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo29573a(Throwable th, PrintWriter printWriter) {
        C17840a.m43751a(th, printWriter);
        List<Throwable> a = this.f41453a.mo29574a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printWriter.print("Suppressed: ");
                    C17840a.m43751a(th2, printWriter);
                }
            }
        }
    }
}

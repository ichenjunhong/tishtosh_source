package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.common.C15373d;
import com.google.android.gms.common.C15382e;
import java.io.IOException;

final class bfa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bey f42238a;

    bfa(bey bey) {
        this.f42238a = bey;
    }

    public final void run() {
        bey bey = this.f42238a;
        try {
            if (bey.f42221f == null && bey.f42222g) {
                C14902a aVar = new C14902a(bey.f42216a);
                aVar.mo27307a();
                bey.f42221f = aVar;
            }
        } catch (C15373d | C15382e | IOException unused) {
            bey.f42221f = null;
        }
    }
}

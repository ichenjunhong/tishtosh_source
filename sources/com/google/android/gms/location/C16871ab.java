package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C15227b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C15427b;
import com.google.android.gms.internal.location.C16507e;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.android.gms.location.ab */
final class C16871ab extends C16507e {

    /* renamed from: a */
    private final /* synthetic */ C15180h f47650a;

    C16871ab(C16882b bVar, C15180h hVar) {
        this.f47650a = hVar;
    }

    /* renamed from: a */
    public final void mo31718a(zzad zzad) throws RemoteException {
        Status a = zzad.mo27935a();
        if (a == null) {
            this.f47650a.mo28006b(new C15227b(new Status(8, "Got null status from location service")));
        } else if (a.f39272g == 0) {
            this.f47650a.mo28005a(Boolean.valueOf(true));
        } else {
            this.f47650a.mo28006b(C15427b.m32018a(a));
        }
    }
}

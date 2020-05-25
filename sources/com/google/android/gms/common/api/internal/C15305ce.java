package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15328d.C15329a;
import com.google.android.gms.common.api.internal.C15336h.C15337a;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.android.gms.common.api.internal.ce */
public final class C15305ce extends C15301ca<Boolean> {

    /* renamed from: b */
    private final C15337a<?> f39488b;

    public C15305ce(C15337a<?> aVar, C15180h<Boolean> hVar) {
        super(4, hVar);
        this.f39488b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28178a(C15349r rVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo28231d(C15329a<?> aVar) throws RemoteException {
        C15283bl blVar = (C15283bl) aVar.f39586c.remove(this.f39488b);
        if (blVar != null) {
            blVar.f39447b.mo28293a(aVar.f39584a, this.f39481a);
            blVar.f39446a.f39622a.mo28284a();
            return;
        }
        C15180h hVar = this.f39481a;
        hVar.f39202a.mo28021b(Boolean.valueOf(false));
    }

    /* renamed from: b */
    public final Feature[] mo28215b(C15329a<?> aVar) {
        C15283bl blVar = (C15283bl) aVar.f39586c.get(this.f39488b);
        if (blVar == null) {
            return null;
        }
        return blVar.f39446a.f39623b;
    }

    /* renamed from: c */
    public final boolean mo28216c(C15329a<?> aVar) {
        C15283bl blVar = (C15283bl) aVar.f39586c.get(this.f39488b);
        return blVar != null && blVar.f39446a.f39624c;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28179a(RuntimeException runtimeException) {
        super.mo28179a(runtimeException);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28176a(Status status) {
        super.mo28176a(status);
    }
}

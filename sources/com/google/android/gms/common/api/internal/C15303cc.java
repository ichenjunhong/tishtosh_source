package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15328d.C15329a;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.android.gms.common.api.internal.cc */
public final class C15303cc extends C15301ca<Void> {

    /* renamed from: b */
    private final C15341j<C15213b, ?> f39483b;

    /* renamed from: c */
    private final C15347p<C15213b, ?> f39484c;

    public C15303cc(C15283bl blVar, C15180h<Void> hVar) {
        super(3, hVar);
        this.f39483b = blVar.f39446a;
        this.f39484c = blVar.f39447b;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28178a(C15349r rVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo28231d(C15329a<?> aVar) throws RemoteException {
        this.f39483b.mo28291a(aVar.f39584a, this.f39481a);
        if (this.f39483b.mo28290a() != null) {
            aVar.f39586c.put(this.f39483b.mo28290a(), new C15283bl(this.f39483b, this.f39484c));
        }
    }

    /* renamed from: b */
    public final Feature[] mo28215b(C15329a<?> aVar) {
        return this.f39483b.f39623b;
    }

    /* renamed from: c */
    public final boolean mo28216c(C15329a<?> aVar) {
        return this.f39483b.f39624c;
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

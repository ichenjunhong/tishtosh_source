package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.internal.C15336h;
import com.google.android.gms.common.api.internal.C15341j;
import com.google.android.gms.internal.location.C16518p;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.android.gms.location.z */
public final class C16908z extends C15341j<C16518p, C16885d> {

    /* renamed from: d */
    private final /* synthetic */ zzbd f47662d;

    /* renamed from: e */
    private final /* synthetic */ C15336h f47663e;

    public C16908z(C16882b bVar, C15336h hVar, zzbd zzbd, C15336h hVar2) {
        this.f47662d = zzbd;
        this.f47663e = hVar2;
        super(hVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo28291a(C15213b bVar, C15180h hVar) throws RemoteException {
        ((C16518p) bVar).mo31729a(this.f47662d, this.f47663e, new C16883a(hVar));
    }
}

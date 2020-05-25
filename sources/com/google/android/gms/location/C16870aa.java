package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.internal.C15336h.C15337a;
import com.google.android.gms.common.api.internal.C15347p;
import com.google.android.gms.internal.location.C16518p;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.android.gms.location.aa */
public final class C16870aa extends C15347p<C16518p, C16885d> {

    /* renamed from: b */
    private final /* synthetic */ C16882b f47649b;

    public C16870aa(C16882b bVar, C15337a aVar) {
        this.f47649b = bVar;
        super(aVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo28293a(C15213b bVar, C15180h hVar) throws RemoteException {
        try {
            ((C16518p) bVar).mo31728a(this.f39627a, new C16871ab(this.f47649b, hVar));
        } catch (RuntimeException e) {
            hVar.mo28006b(e);
        }
    }
}

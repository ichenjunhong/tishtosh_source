package com.google.android.gms.internal.p1041b;

import android.os.RemoteException;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.internal.C15345n;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.android.gms.internal.b.k */
abstract class C16473k extends C15345n<C16469g, Void> {

    /* renamed from: c */
    C15180h<Void> f46376c;

    private C16473k() {
    }

    /* synthetic */ C16473k(C16471i iVar) {
        this();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo28292a(C15213b bVar, C15180h hVar) throws RemoteException {
        C16469g gVar = (C16469g) bVar;
        this.f46376c = hVar;
        mo31681a((C16465c) gVar.mo28413p());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31681a(C16465c cVar) throws RemoteException;
}

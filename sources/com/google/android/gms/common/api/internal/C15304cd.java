package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15328d.C15329a;
import com.google.android.gms.p1033b.C15175c;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.android.gms.common.api.internal.cd */
public final class C15304cd<ResultT> extends C15284bm {

    /* renamed from: a */
    private final C15345n<C15213b, ResultT> f39485a;

    /* renamed from: b */
    private final C15180h<ResultT> f39486b;

    /* renamed from: c */
    private final C15343l f39487c;

    public C15304cd(int i, C15345n<C15213b, ResultT> nVar, C15180h<ResultT> hVar, C15343l lVar) {
        super(i);
        this.f39486b = hVar;
        this.f39485a = nVar;
        this.f39487c = lVar;
    }

    /* renamed from: a */
    public final void mo28177a(C15329a<?> aVar) throws DeadObjectException {
        try {
            this.f39485a.mo28292a(aVar.f39584a, this.f39486b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo28176a(C15260aq.m31620a(e2));
        } catch (RuntimeException e3) {
            mo28179a(e3);
        }
    }

    /* renamed from: a */
    public final void mo28176a(Status status) {
        this.f39486b.mo28006b(this.f39487c.mo28147a(status));
    }

    /* renamed from: a */
    public final void mo28179a(RuntimeException runtimeException) {
        this.f39486b.mo28006b(runtimeException);
    }

    /* renamed from: a */
    public final void mo28178a(C15349r rVar, boolean z) {
        C15180h<ResultT> hVar = this.f39486b;
        rVar.f39631b.put(hVar, Boolean.valueOf(z));
        hVar.f39202a.mo27991a((C15175c<TResult>) new C15351t<TResult>(rVar, hVar));
    }

    /* renamed from: b */
    public final Feature[] mo28215b(C15329a<?> aVar) {
        return this.f39485a.f39625a;
    }

    /* renamed from: c */
    public final boolean mo28216c(C15329a<?> aVar) {
        return this.f39485a.f39626b;
    }
}

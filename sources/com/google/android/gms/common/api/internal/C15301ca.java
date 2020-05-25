package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C15227b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15328d.C15329a;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.android.gms.common.api.internal.ca */
abstract class C15301ca<T> extends C15284bm {

    /* renamed from: a */
    protected final C15180h<T> f39481a;

    public C15301ca(int i, C15180h<T> hVar) {
        super(i);
        this.f39481a = hVar;
    }

    /* renamed from: a */
    public void mo28178a(C15349r rVar, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo28231d(C15329a<?> aVar) throws RemoteException;

    /* renamed from: a */
    public void mo28176a(Status status) {
        this.f39481a.mo28006b(new C15227b(status));
    }

    /* renamed from: a */
    public void mo28179a(RuntimeException runtimeException) {
        this.f39481a.mo28006b(runtimeException);
    }

    /* renamed from: a */
    public final void mo28177a(C15329a<?> aVar) throws DeadObjectException {
        try {
            mo28231d(aVar);
        } catch (DeadObjectException e) {
            mo28176a(C15260aq.m31620a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            mo28176a(C15260aq.m31620a(e2));
        } catch (RuntimeException e3) {
            mo28179a(e3);
        }
    }
}

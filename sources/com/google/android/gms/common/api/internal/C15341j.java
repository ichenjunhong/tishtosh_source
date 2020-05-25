package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C15211a.C15213b;
import com.google.android.gms.common.api.internal.C15336h.C15337a;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.android.gms.common.api.internal.j */
public abstract class C15341j<A extends C15213b, L> {

    /* renamed from: a */
    final C15336h<L> f39622a;

    /* renamed from: b */
    public final Feature[] f39623b;

    /* renamed from: c */
    public final boolean f39624c;

    protected C15341j(C15336h<L> hVar) {
        this.f39622a = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28291a(A a, C15180h<Void> hVar) throws RemoteException;

    /* renamed from: a */
    public final C15337a<L> mo28290a() {
        return this.f39622a.f39616b;
    }
}

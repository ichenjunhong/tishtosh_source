package com.google.android.gms.common.internal.p1038a;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15298c.C15300b;

/* renamed from: com.google.android.gms.common.internal.a.g */
final class C15402g extends C15397b {

    /* renamed from: a */
    private final C15300b<Status> f39760a;

    public C15402g(C15300b<Status> bVar) {
        this.f39760a = bVar;
    }

    /* renamed from: a */
    public final void mo28364a(int i) throws RemoteException {
        this.f39760a.mo28228a(new Status(i));
    }
}

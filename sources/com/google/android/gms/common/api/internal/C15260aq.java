package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15328d.C15329a;
import com.google.android.gms.common.util.C15524o;

/* renamed from: com.google.android.gms.common.api.internal.aq */
public abstract class C15260aq {

    /* renamed from: a */
    private final int f39403a;

    public C15260aq(int i) {
        this.f39403a = i;
    }

    /* renamed from: a */
    public abstract void mo28176a(Status status);

    /* renamed from: a */
    public abstract void mo28177a(C15329a<?> aVar) throws DeadObjectException;

    /* renamed from: a */
    public abstract void mo28178a(C15349r rVar, boolean z);

    /* renamed from: a */
    public abstract void mo28179a(RuntimeException runtimeException);

    /* renamed from: a */
    static /* synthetic */ Status m31620a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C15524o.m32293a() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}

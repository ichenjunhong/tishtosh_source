package com.google.android.gms.common.internal.p1038a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1042c.C16474a;
import com.google.android.gms.internal.p1042c.C16476c;

/* renamed from: com.google.android.gms.common.internal.a.n */
public final class C15409n extends C16474a implements C15408m {
    C15409n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    /* renamed from: a */
    public final void mo28367a(C15406k kVar) throws RemoteException {
        Parcel a = mo31682a();
        C16476c.m39342a(a, (IInterface) kVar);
        try {
            this.f46377a.transact(1, a, null, 1);
        } finally {
            a.recycle();
        }
    }
}

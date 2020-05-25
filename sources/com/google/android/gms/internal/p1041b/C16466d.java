package com.google.android.gms.internal.p1041b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.b.d */
public final class C16466d extends C16463a implements C16465c {
    C16466d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    /* renamed from: a */
    public final void mo31679a(C16467e eVar) throws RemoteException {
        IBinder asBinder;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f46374b);
        if (eVar == null) {
            asBinder = null;
        } else {
            asBinder = eVar.asBinder();
        }
        obtain.writeStrongBinder(asBinder);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.f46373a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}

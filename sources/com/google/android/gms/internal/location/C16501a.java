package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.a */
public class C16501a implements IInterface {

    /* renamed from: a */
    private final IBinder f46393a;

    /* renamed from: b */
    private final String f46394b;

    protected C16501a(IBinder iBinder, String str) {
        this.f46393a = iBinder;
        this.f46394b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo31710a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f46394b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31711a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f46393a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f46393a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo31713b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f46393a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth-api.a */
public class C16444a implements IInterface {

    /* renamed from: a */
    private final IBinder f46350a;

    /* renamed from: b */
    private final String f46351b;

    protected C16444a(IBinder iBinder, String str) {
        this.f46350a = iBinder;
        this.f46351b = str;
    }

    public IBinder asBinder() {
        return this.f46350a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo31648a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f46351b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31649a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f46350a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

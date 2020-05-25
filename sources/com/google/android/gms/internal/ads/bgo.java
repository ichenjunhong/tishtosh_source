package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class bgo implements IInterface {

    /* renamed from: a */
    final IBinder f42323a;

    /* renamed from: b */
    private final String f42324b;

    protected bgo(IBinder iBinder, String str) {
        this.f42323a = iBinder;
        this.f42324b = str;
    }

    public IBinder asBinder() {
        return this.f42323a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Parcel mo30134z() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f42324b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo30131a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f42323a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30133b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f42323a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

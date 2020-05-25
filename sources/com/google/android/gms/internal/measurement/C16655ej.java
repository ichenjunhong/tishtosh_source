package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.ej */
public class C16655ej implements IInterface {

    /* renamed from: a */
    private final IBinder f46868a;

    /* renamed from: b */
    private final String f46869b;

    protected C16655ej(IBinder iBinder, String str) {
        this.f46868a = iBinder;
        this.f46869b = str;
    }

    public IBinder asBinder() {
        return this.f46868a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo31965a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f46869b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo31966a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f46868a.transact(i, parcel, parcel, 0);
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
    public final void mo31968b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f46868a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

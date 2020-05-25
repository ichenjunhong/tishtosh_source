package com.google.android.gms.internal.p1043d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.d.a */
public class C16479a implements IInterface {

    /* renamed from: a */
    private final IBinder f46380a;

    /* renamed from: b */
    private final String f46381b;

    protected C16479a(IBinder iBinder, String str) {
        this.f46380a = iBinder;
        this.f46381b = str;
    }

    public IBinder asBinder() {
        return this.f46380a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo31690c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f46381b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo31687a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f46380a.transact(i, parcel, parcel, 0);
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
    public final void mo31689b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f46380a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

package com.google.android.gms.internal.p1045f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.f.a */
public class C16491a implements IInterface {

    /* renamed from: a */
    private final IBinder f46390a;

    /* renamed from: b */
    private final String f46391b;

    protected C16491a(IBinder iBinder, String str) {
        this.f46390a = iBinder;
        this.f46391b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo31698a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f46391b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo31699a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f46390a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f46390a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo31701b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f46390a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

package com.google.android.gms.internal.p1042c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.c.a */
public class C16474a implements IInterface {

    /* renamed from: a */
    protected final IBinder f46377a;

    /* renamed from: b */
    private final String f46378b;

    protected C16474a(IBinder iBinder, String str) {
        this.f46377a = iBinder;
        this.f46378b = str;
    }

    public IBinder asBinder() {
        return this.f46377a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo31682a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f46378b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31683a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f46377a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

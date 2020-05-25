package com.google.android.play.core.p1051c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.c.at */
public class C17271at implements IInterface {

    /* renamed from: a */
    private final IBinder f48743a;

    /* renamed from: b */
    private final String f48744b;

    protected C17271at(IBinder iBinder, String str) {
        this.f48743a = iBinder;
        this.f48744b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo33575a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f48744b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33576a(int i, Parcel parcel) throws RemoteException {
        try {
            this.f48743a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f48743a;
    }
}

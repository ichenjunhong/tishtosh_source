package com.google.android.gms.internal.p1040a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.a.a */
public class C15556a implements IInterface {

    /* renamed from: a */
    private final IBinder f40039a;

    /* renamed from: b */
    private final String f40040b;

    protected C15556a(IBinder iBinder, String str) {
        this.f40039a = iBinder;
        this.f40040b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L_ */
    public final Parcel mo28542L_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f40040b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo28543a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f40039a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f40039a;
    }
}

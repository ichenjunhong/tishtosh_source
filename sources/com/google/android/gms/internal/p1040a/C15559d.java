package com.google.android.gms.internal.p1040a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.a.d */
public final class C15559d extends C15556a implements C15558c {
    public C15559d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: a */
    public final String mo28545a() throws RemoteException {
        Parcel a = mo28543a(1, mo28542L_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final boolean mo28547b() throws RemoteException {
        Parcel a = mo28543a(6, mo28542L_());
        boolean a2 = C15557b.m32375a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final boolean mo28546a(boolean z) throws RemoteException {
        Parcel L_ = mo28542L_();
        L_.writeInt(1);
        Parcel a = mo28543a(2, L_);
        boolean a2 = C15557b.m32375a(a);
        a.recycle();
        return a2;
    }
}

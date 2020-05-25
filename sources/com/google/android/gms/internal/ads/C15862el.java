package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.el */
public abstract class C15862el extends bgp implements C15861ek {
    public C15862el() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: a */
    public static C15861ek m37462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof C15861ek) {
            return (C15861ek) queryLocalInterface;
        }
        return new C15863em(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String a = mo30912a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 3:
                List b = mo30913b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                break;
            default:
                return false;
        }
        return true;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.fx */
public abstract class C15901fx extends bgp implements C15900fw {
    public C15901fx() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15889fl flVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            flVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            if (queryLocalInterface instanceof C15889fl) {
                flVar = (C15889fl) queryLocalInterface;
            } else {
                flVar = new C15891fn(readStrongBinder);
            }
        }
        mo31078a(flVar, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.internal.ads.co */
public abstract class C15810co extends bgp implements C15809cn {
    public C15810co() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String a = mo30905a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 2:
                String b = mo30907b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                break;
            case 3:
                mo30906a(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 4:
                mo30908c();
                parcel2.writeNoException();
                break;
            case 5:
                mo30909d();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

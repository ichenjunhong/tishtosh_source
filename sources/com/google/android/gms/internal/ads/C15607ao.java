package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ao */
public abstract class C15607ao extends bgp implements C15606an {
    public C15607ao() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo29354a();
                break;
            case 2:
                mo29356b();
                break;
            case 3:
                mo29357c();
                break;
            case 4:
                mo29358d();
                break;
            case 5:
                mo29355a(bgq.m35598a(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

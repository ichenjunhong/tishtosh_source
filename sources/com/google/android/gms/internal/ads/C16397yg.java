package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.yg */
public abstract class C16397yg extends bgp implements C16396yf {
    public C16397yg() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C16385xv xvVar;
        switch (i) {
            case 1:
                mo31119a();
                break;
            case 2:
                mo31122b();
                break;
            case 3:
                mo31123c();
                break;
            case 4:
                mo31124d();
                break;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    xvVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    if (queryLocalInterface instanceof C16385xv) {
                        xvVar = (C16385xv) queryLocalInterface;
                    } else {
                        xvVar = new C16387xx(readStrongBinder);
                    }
                }
                mo31121a(xvVar);
                break;
            case 6:
                mo31125e();
                break;
            case 7:
                mo31120a(parcel.readInt());
                break;
            case 8:
                mo31126f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

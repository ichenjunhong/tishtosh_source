package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.internal.ads.ze */
public abstract class C16422ze extends bgp implements C16421zd {
    public C16422ze() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static C16421zd m39201a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof C16421zd) {
            return (C16421zd) queryLocalInterface;
        }
        return new C16423zf(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo31526a(C14883a.m30535a(parcel.readStrongBinder()));
                break;
            case 2:
                mo31527a(C14883a.m30535a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo31529b(C14883a.m30535a(parcel.readStrongBinder()));
                break;
            case 4:
                mo31531c(C14883a.m30535a(parcel.readStrongBinder()));
                break;
            case 5:
                mo31532d(C14883a.m30535a(parcel.readStrongBinder()));
                break;
            case 6:
                mo31533e(C14883a.m30535a(parcel.readStrongBinder()));
                break;
            case 7:
                mo31528a(C14883a.m30535a(parcel.readStrongBinder()), (zzbaz) bgq.m35594a(parcel, zzbaz.CREATOR));
                break;
            case 8:
                mo31534f(C14883a.m30535a(parcel.readStrongBinder()));
                break;
            case 9:
                mo31530b(C14883a.m30535a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo31535g(C14883a.m30535a(parcel.readStrongBinder()));
                break;
            case 11:
                mo31536h(C14883a.m30535a(parcel.readStrongBinder()));
                break;
            case 12:
                mo31525a((Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

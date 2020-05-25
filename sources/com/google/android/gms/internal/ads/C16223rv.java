package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.internal.ads.rv */
public abstract class C16223rv extends bgp implements C16222ru {
    public C16223rv() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo27672a((Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo27681f();
                parcel2.writeNoException();
                break;
            case 3:
                mo27682g();
                parcel2.writeNoException();
                break;
            case 4:
                mo27683h();
                parcel2.writeNoException();
                break;
            case 5:
                mo27684i();
                parcel2.writeNoException();
                break;
            case 6:
                Bundle bundle = (Bundle) bgq.m35594a(parcel, Bundle.CREATOR);
                mo27677b(bundle);
                parcel2.writeNoException();
                bgq.m35600b(parcel2, bundle);
                break;
            case 7:
                mo27685j();
                parcel2.writeNoException();
                break;
            case 8:
                mo27686k();
                parcel2.writeNoException();
                break;
            case 9:
                mo27687l();
                parcel2.writeNoException();
                break;
            case 10:
                mo27679d();
                parcel2.writeNoException();
                break;
            case 11:
                boolean e = mo27680e();
                parcel2.writeNoException();
                bgq.m35597a(parcel2, e);
                break;
            case 12:
                mo27671a(parcel.readInt(), parcel.readInt(), (Intent) bgq.m35594a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                mo27674a(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

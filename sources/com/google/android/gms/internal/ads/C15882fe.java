package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fe */
public abstract class C15882fe extends bgp implements C15881fd {
    public C15882fe() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C14882b n = mo30946n();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) n);
                break;
            case 3:
                String a = mo30934a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 4:
                List f = mo30938f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                break;
            case 5:
                String g = mo30939g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                break;
            case 6:
                C15865eo h = mo30940h();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) h);
                break;
            case 7:
                String i3 = mo30941i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                break;
            case 8:
                double j = mo30942j();
                parcel2.writeNoException();
                parcel2.writeDouble(j);
                break;
            case 9:
                String k = mo30943k();
                parcel2.writeNoException();
                parcel2.writeString(k);
                break;
            case 10:
                String l = mo30944l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                break;
            case 11:
                Bundle o = mo30947o();
                parcel2.writeNoException();
                bgq.m35600b(parcel2, o);
                break;
            case 12:
                mo30951s();
                parcel2.writeNoException();
                break;
            case 13:
                C15583ak m = mo30945m();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) m);
                break;
            case 14:
                mo30935a((Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                boolean b = mo30936b((Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bgq.m35597a(parcel2, b);
                break;
            case 16:
                mo30937c((Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 17:
                C15861ek r = mo30950r();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) r);
                break;
            case 18:
                C14882b p = mo30948p();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) p);
                break;
            case 19:
                String q = mo30949q();
                parcel2.writeNoException();
                parcel2.writeString(q);
                break;
            default:
                return false;
        }
        return true;
    }
}

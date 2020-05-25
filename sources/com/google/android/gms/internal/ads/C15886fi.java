package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fi */
public abstract class C15886fi extends bgp implements C15885fh {
    public C15886fi() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                C14882b n = mo30964n();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) n);
                break;
            case 3:
                String a = mo30953a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 4:
                List f = mo30938f();
                parcel2.writeNoException();
                parcel2.writeList(f);
                break;
            case 5:
                String i3 = mo30959i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                break;
            case 6:
                C15865eo j = mo30960j();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) j);
                break;
            case 7:
                String k = mo30961k();
                parcel2.writeNoException();
                parcel2.writeString(k);
                break;
            case 8:
                String l = mo30962l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                break;
            case 9:
                Bundle o = mo30965o();
                parcel2.writeNoException();
                bgq.m35600b(parcel2, o);
                break;
            case 10:
                mo30967q();
                parcel2.writeNoException();
                break;
            case 11:
                C15583ak m = mo30963m();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) m);
                break;
            case 12:
                mo30954a((Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                boolean b = mo30955b((Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bgq.m35597a(parcel2, b);
                break;
            case 14:
                mo30956c((Bundle) bgq.m35594a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                C15861ek p = mo30966p();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) p);
                break;
            case 16:
                C14882b g = mo30957g();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) g);
                break;
            case 17:
                String h = mo30958h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                break;
            default:
                return false;
        }
        return true;
    }
}

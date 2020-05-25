package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pe */
public abstract class C16152pe extends bgp implements C16151pd {
    public C16152pe() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String a = mo31289a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 3:
                List b = mo31292b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                break;
            case 4:
                String c = mo31294c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 5:
                C15865eo d = mo31296d();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) d);
                break;
            case 6:
                String e = mo31297e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 7:
                String f = mo31298f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                break;
            case 8:
                mo31299g();
                parcel2.writeNoException();
                break;
            case 9:
                mo31290a(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 10:
                mo31293b(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 11:
                boolean h = mo31300h();
                parcel2.writeNoException();
                bgq.m35597a(parcel2, h);
                break;
            case 12:
                boolean i3 = mo31301i();
                parcel2.writeNoException();
                bgq.m35597a(parcel2, i3);
                break;
            case 13:
                Bundle j = mo31302j();
                parcel2.writeNoException();
                bgq.m35600b(parcel2, j);
                break;
            case 14:
                mo31295c(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 15:
                C14882b k = mo31303k();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) k);
                break;
            case 16:
                C15583ak l = mo31304l();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) l);
                break;
            case 19:
                C15861ek m = mo31305m();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) m);
                break;
            case 20:
                C14882b n = mo31306n();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) n);
                break;
            case 21:
                C14882b o = mo31307o();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) o);
                break;
            case 22:
                mo31291a(C14883a.m30535a(parcel.readStrongBinder()), C14883a.m30535a(parcel.readStrongBinder()), C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

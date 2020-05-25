package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pb */
public abstract class C16149pb extends bgp implements C16148pa {
    public C16149pb() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String a = mo31268a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 3:
                List b = mo31271b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                break;
            case 4:
                String c = mo31273c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 5:
                C15865eo d = mo31275d();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) d);
                break;
            case 6:
                String e = mo31276e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 7:
                double f = mo31277f();
                parcel2.writeNoException();
                parcel2.writeDouble(f);
                break;
            case 8:
                String g = mo31278g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                break;
            case 9:
                String h = mo31279h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                break;
            case 10:
                mo31280i();
                parcel2.writeNoException();
                break;
            case 11:
                mo31269a(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 12:
                mo31272b(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 13:
                boolean j = mo31281j();
                parcel2.writeNoException();
                bgq.m35597a(parcel2, j);
                break;
            case 14:
                boolean k = mo31282k();
                parcel2.writeNoException();
                bgq.m35597a(parcel2, k);
                break;
            case 15:
                Bundle l = mo31283l();
                parcel2.writeNoException();
                bgq.m35600b(parcel2, l);
                break;
            case 16:
                mo31274c(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 17:
                C15583ak m = mo31284m();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) m);
                break;
            case 18:
                C14882b n = mo31285n();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) n);
                break;
            case 19:
                C15861ek o = mo31286o();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) o);
                break;
            case 20:
                C14882b p = mo31287p();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) p);
                break;
            case 21:
                C14882b q = mo31288q();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) q);
                break;
            case 22:
                mo31270a(C14883a.m30535a(parcel.readStrongBinder()), C14883a.m30535a(parcel.readStrongBinder()), C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

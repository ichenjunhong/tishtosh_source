package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ph */
public abstract class C16155ph extends bgp implements C16154pg {
    public C16155ph() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String a = mo31308a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 3:
                List b = mo31311b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                break;
            case 4:
                String c = mo31313c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 5:
                C15865eo d = mo31314d();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) d);
                break;
            case 6:
                String e = mo31315e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 7:
                String f = mo31316f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                break;
            case 8:
                double g = mo31317g();
                parcel2.writeNoException();
                parcel2.writeDouble(g);
                break;
            case 9:
                String h = mo31318h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                break;
            case 10:
                String i3 = mo31319i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                break;
            case 11:
                C15583ak j = mo31320j();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) j);
                break;
            case 12:
                C15861ek k = mo31321k();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) k);
                break;
            case 13:
                C14882b l = mo31322l();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) l);
                break;
            case 14:
                C14882b m = mo31323m();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) m);
                break;
            case 15:
                C14882b n = mo31324n();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) n);
                break;
            case 16:
                Bundle o = mo31325o();
                parcel2.writeNoException();
                bgq.m35600b(parcel2, o);
                break;
            case 17:
                boolean p = mo31326p();
                parcel2.writeNoException();
                bgq.m35597a(parcel2, p);
                break;
            case 18:
                boolean q = mo31327q();
                parcel2.writeNoException();
                bgq.m35597a(parcel2, q);
                break;
            case 19:
                mo31328r();
                parcel2.writeNoException();
                break;
            case 20:
                mo31309a(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 21:
                mo31310a(C14883a.m30535a(parcel.readStrongBinder()), C14883a.m30535a(parcel.readStrongBinder()), C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 22:
                mo31312b(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

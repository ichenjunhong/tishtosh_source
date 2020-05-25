package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fm */
public abstract class C15890fm extends bgp implements C15889fl {
    public C15890fm() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: a */
    public static C15889fl m37599a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof C15889fl) {
            return (C15889fl) queryLocalInterface;
        }
        return new C15891fn(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String a = mo30969a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 2:
                C15865eo b = mo30972b(parcel.readString());
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) b);
                break;
            case 3:
                List a2 = mo30970a();
                parcel2.writeNoException();
                parcel2.writeStringList(a2);
                break;
            case 4:
                String c = mo30921c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 5:
                mo30973c(parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo30976h();
                parcel2.writeNoException();
                break;
            case 7:
                C15583ak g = mo30975g();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) g);
                break;
            case 8:
                mo30978j();
                parcel2.writeNoException();
                break;
            case 9:
                C14882b i3 = mo30977i();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) i3);
                break;
            case 10:
                boolean a3 = mo30971a(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bgq.m35597a(parcel2, a3);
                break;
            case 11:
                C14882b f = mo30974f();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) f);
                break;
            default:
                return false;
        }
        return true;
    }
}

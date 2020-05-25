package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.internal.ads.eu */
public abstract class C15871eu extends bgp implements C15870et {
    public C15871eu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo31058a(parcel.readString(), C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 2:
                C14882b a = mo31054a(parcel.readString());
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) a);
                break;
            case 3:
                mo31056a(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 4:
                mo31055a();
                parcel2.writeNoException();
                break;
            case 5:
                mo31057a(C14883a.m30535a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 6:
                mo31060b(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

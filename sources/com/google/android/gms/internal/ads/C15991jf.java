package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.internal.ads.jf */
public abstract class C15991jf extends bgp implements C15990je {
    public C15991jf() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15992jg jgVar;
        switch (i) {
            case 3:
                C15583ak f = mo30924f();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) f);
                break;
            case 4:
                mo30925g();
                parcel2.writeNoException();
                break;
            case 5:
                C14882b a = C14883a.m30535a(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    jgVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    if (queryLocalInterface instanceof C15992jg) {
                        jgVar = (C15992jg) queryLocalInterface;
                    } else {
                        jgVar = new C15993jh(readStrongBinder);
                    }
                }
                mo30918a(a, jgVar);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

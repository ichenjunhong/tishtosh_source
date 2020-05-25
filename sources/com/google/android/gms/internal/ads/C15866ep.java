package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.internal.ads.ep */
public abstract class C15866ep extends bgp implements C15865eo {
    public C15866ep() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public static C15865eo m37470a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (queryLocalInterface instanceof C15865eo) {
            return (C15865eo) queryLocalInterface;
        }
        return new C15867eq(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C14882b a = mo30929a();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) a);
                break;
            case 2:
                Uri b = mo30930b();
                parcel2.writeNoException();
                bgq.m35600b(parcel2, b);
                break;
            case 3:
                double c = mo30931c();
                parcel2.writeNoException();
                parcel2.writeDouble(c);
                break;
            case 4:
                int d = mo30932d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                break;
            case 5:
                int e = mo30933e();
                parcel2.writeNoException();
                parcel2.writeInt(e);
                break;
            default:
                return false;
        }
        return true;
    }
}

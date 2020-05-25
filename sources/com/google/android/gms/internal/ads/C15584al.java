package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.al */
public abstract class C15584al extends bgp implements C15583ak {
    public C15584al() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public static C15583ak m33192a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof C15583ak) {
            return (C15583ak) queryLocalInterface;
        }
        return new C15586am(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15606an anVar;
        switch (i) {
            case 1:
                mo29062a();
                parcel2.writeNoException();
                break;
            case 2:
                mo29065b();
                parcel2.writeNoException();
                break;
            case 3:
                mo29064a(bgq.m35598a(parcel));
                parcel2.writeNoException();
                break;
            case 4:
                boolean c = mo29066c();
                parcel2.writeNoException();
                bgq.m35597a(parcel2, c);
                break;
            case 5:
                int d = mo29067d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                break;
            case 6:
                float e = mo29068e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                break;
            case 7:
                float f = mo29069f();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    anVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (queryLocalInterface instanceof C15606an) {
                        anVar = (C15606an) queryLocalInterface;
                    } else {
                        anVar = new C15612ap(readStrongBinder);
                    }
                }
                mo29063a(anVar);
                parcel2.writeNoException();
                break;
            case 9:
                float g = mo29070g();
                parcel2.writeNoException();
                parcel2.writeFloat(g);
                break;
            case 10:
                boolean h = mo29071h();
                parcel2.writeNoException();
                bgq.m35597a(parcel2, h);
                break;
            case 11:
                C15606an i3 = mo29072i();
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) i3);
                break;
            case 12:
                boolean j = mo29073j();
                parcel2.writeNoException();
                bgq.m35597a(parcel2, j);
                break;
            case 13:
                mo29074k();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* renamed from: com.google.android.gms.internal.ads.e */
public final class C15850e extends bgo implements C15795c {
    C15850e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* renamed from: a */
    public final cao mo27648a() throws RemoteException {
        cao cao;
        Parcel a = mo30131a(1, mo30134z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            cao = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof cao) {
                cao = (cao) queryLocalInterface;
            } else {
                cao = new caq(readStrongBinder);
            }
        }
        a.recycle();
        return cao;
    }

    /* renamed from: a */
    public final void mo27650a(cal cal) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) cal);
        mo30133b(2, z);
    }

    /* renamed from: a */
    public final void mo27651a(C15893fp fpVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) fpVar);
        mo30133b(3, z);
    }

    /* renamed from: a */
    public final void mo27652a(C15897ft ftVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) ftVar);
        mo30133b(4, z);
    }

    /* renamed from: a */
    public final void mo27659a(String str, C15903fz fzVar, C15900fw fwVar) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        bgq.m35595a(z, (IInterface) fzVar);
        bgq.m35595a(z, (IInterface) fwVar);
        mo30133b(5, z);
    }

    /* renamed from: a */
    public final void mo27657a(zzafl zzafl) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzafl);
        mo30133b(6, z);
    }

    /* renamed from: a */
    public final void mo27656a(C16309v vVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) vVar);
        mo30133b(7, z);
    }

    /* renamed from: a */
    public final void mo27653a(C15907gc gcVar, zzyz zzyz) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) gcVar);
        bgq.m35596a(z, (Parcelable) zzyz);
        mo30133b(8, z);
    }

    /* renamed from: a */
    public final void mo27649a(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) publisherAdViewOptions);
        mo30133b(9, z);
    }

    /* renamed from: a */
    public final void mo27654a(C15909ge geVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) geVar);
        mo30133b(10, z);
    }

    /* renamed from: a */
    public final void mo27658a(zzaks zzaks) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35596a(z, (Parcelable) zzaks);
        mo30133b(13, z);
    }

    /* renamed from: a */
    public final void mo27655a(C15994ji jiVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) jiVar);
        mo30133b(14, z);
    }
}

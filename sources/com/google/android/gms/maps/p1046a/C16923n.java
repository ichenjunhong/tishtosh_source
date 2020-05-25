package com.google.android.gms.maps.p1046a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.p1045f.C16491a;
import com.google.android.gms.internal.p1045f.C16495e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.maps.a.n */
public final class C16923n extends C16491a implements C16910a {
    C16923n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    /* renamed from: a */
    public final C14882b mo32631a(float f) throws RemoteException {
        Parcel a = mo31698a();
        a.writeFloat(f);
        Parcel a2 = mo31699a(4, a);
        C14882b a3 = C14883a.m30535a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* renamed from: a */
    public final C14882b mo32632a(LatLng latLng) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39364a(a, (Parcelable) latLng);
        Parcel a2 = mo31699a(8, a);
        C14882b a3 = C14883a.m30535a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* renamed from: a */
    public final C14882b mo32633a(LatLng latLng, float f) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39364a(a, (Parcelable) latLng);
        a.writeFloat(f);
        Parcel a2 = mo31699a(9, a);
        C14882b a3 = C14883a.m30535a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}

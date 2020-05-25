package com.google.android.gms.internal.p1045f;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.internal.f.g */
public final class C16497g extends C16491a implements C16496f {
    public C16497g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    /* renamed from: a */
    public final C14882b mo31705a(Bitmap bitmap) throws RemoteException {
        Parcel a = mo31698a();
        C16495e.m39364a(a, (Parcelable) bitmap);
        Parcel a2 = mo31699a(6, a);
        C14882b a3 = C14883a.m30535a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.em */
public final class C15863em extends bgo implements C15861ek {
    C15863em(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: a */
    public final String mo30912a() throws RemoteException {
        Parcel a = mo30131a(2, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List<C15865eo> mo30913b() throws RemoteException {
        Parcel a = mo30131a(3, mo30134z());
        ArrayList b = bgq.m35599b(a);
        a.recycle();
        return b;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class bgs extends bgp implements bgr {
    /* renamed from: a */
    public static bgr m35608a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        if (queryLocalInterface instanceof bgr) {
            return (bgr) queryLocalInterface;
        }
        return new bgt(iBinder);
    }
}

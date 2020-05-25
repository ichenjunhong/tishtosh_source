package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.maps.model.C16955d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.p1046a.C16910a;

/* renamed from: com.google.android.gms.maps.b */
public final class C16932b {

    /* renamed from: a */
    static C16910a f47709a;

    /* renamed from: a */
    private static C16910a m41072a() {
        return (C16910a) C15464q.m32124a(f47709a, (Object) "CameraUpdateFactory is not initialized");
    }

    /* renamed from: a */
    public static C16909a m41073a(float f) {
        try {
            return new C16909a(m41072a().mo32631a(13.0f));
        } catch (RemoteException e) {
            throw new C16955d(e);
        }
    }

    /* renamed from: a */
    public static C16909a m41074a(LatLng latLng) {
        try {
            return new C16909a(m41072a().mo32632a(latLng));
        } catch (RemoteException e) {
            throw new C16955d(e);
        }
    }

    /* renamed from: a */
    public static C16909a m41075a(LatLng latLng, float f) {
        try {
            return new C16909a(m41072a().mo32633a(latLng, f));
        } catch (RemoteException e) {
            throw new C16955d(e);
        }
    }
}

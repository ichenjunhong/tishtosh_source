package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.p1045f.C16496f;

/* renamed from: com.google.android.gms.maps.model.b */
public final class C16953b {

    /* renamed from: a */
    public static C16496f f47843a;

    /* renamed from: a */
    public static C16952a m41121a(Bitmap bitmap) {
        try {
            return new C16952a(((C16496f) C15464q.m32124a(f47843a, (Object) "IBitmapDescriptorFactory is not initialized")).mo31705a(bitmap));
        } catch (RemoteException e) {
            throw new C16955d(e);
        }
    }
}

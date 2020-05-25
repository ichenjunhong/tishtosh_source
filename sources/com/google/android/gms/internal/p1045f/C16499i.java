package com.google.android.gms.internal.p1045f;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.f.i */
public abstract class C16499i extends C16494d implements C16498h {
    /* renamed from: a */
    public static C16498h m39371a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof C16498h ? (C16498h) queryLocalInterface : new C16500j(iBinder);
    }
}

package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.location.C16873ad;
import com.google.android.gms.location.C16875af;

public final class zzo extends AbstractSafeParcelable {
    public static final Creator<zzo> CREATOR = new C16502aa();

    /* renamed from: a */
    private int f46442a;

    /* renamed from: b */
    private zzm f46443b;

    /* renamed from: c */
    private C16873ad f46444c;

    /* renamed from: d */
    private C16506d f46445d;

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46442a);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f46443b, i, false);
        IBinder iBinder = null;
        C15469b.m32182a(parcel, 3, this.f46444c == null ? null : this.f46444c.asBinder(), false);
        if (this.f46445d != null) {
            iBinder = this.f46445d.asBinder();
        }
        C15469b.m32182a(parcel, 4, iBinder, false);
        C15469b.m32197c(parcel, a);
    }

    zzo(int i, zzm zzm, IBinder iBinder, IBinder iBinder2) {
        C16873ad adVar;
        this.f46442a = i;
        this.f46443b = zzm;
        C16506d dVar = null;
        if (iBinder == null || iBinder == null) {
            adVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            adVar = queryLocalInterface instanceof C16873ad ? (C16873ad) queryLocalInterface : new C16875af(iBinder);
        }
        this.f46444c = adVar;
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            dVar = queryLocalInterface2 instanceof C16506d ? (C16506d) queryLocalInterface2 : new C16508f(iBinder2);
        }
        this.f46445d = dVar;
    }
}

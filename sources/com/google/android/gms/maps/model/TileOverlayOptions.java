package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.internal.p1045f.C16492b;
import com.google.android.gms.internal.p1045f.C16493c;

public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Creator<TileOverlayOptions> CREATOR = new C16976y();

    /* renamed from: a */
    C16492b f47831a;

    /* renamed from: b */
    public C16956e f47832b;

    /* renamed from: c */
    public boolean f47833c = true;

    /* renamed from: d */
    public float f47834d;

    /* renamed from: e */
    public boolean f47835e = true;

    /* renamed from: f */
    public float f47836f;

    public TileOverlayOptions() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32182a(parcel, 2, this.f47831a.asBinder(), false);
        C15469b.m32189a(parcel, 3, this.f47833c);
        C15469b.m32178a(parcel, 4, this.f47834d);
        C15469b.m32189a(parcel, 5, this.f47835e);
        C15469b.m32178a(parcel, 6, this.f47836f);
        C15469b.m32197c(parcel, a);
    }

    TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        C16492b bVar;
        C16975x xVar = null;
        if (iBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            bVar = queryLocalInterface instanceof C16492b ? (C16492b) queryLocalInterface : new C16493c(iBinder);
        }
        this.f47831a = bVar;
        if (this.f47831a != null) {
            xVar = new C16975x(this);
        }
        this.f47832b = xVar;
        this.f47833c = z;
        this.f47834d = f;
        this.f47835e = z2;
        this.f47836f = f2;
    }
}

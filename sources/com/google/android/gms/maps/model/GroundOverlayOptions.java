package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.p1027a.C14882b.C14883a;

public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Creator<GroundOverlayOptions> CREATOR = new C16960i();

    /* renamed from: a */
    public C16952a f47747a;

    /* renamed from: b */
    public LatLng f47748b;

    /* renamed from: c */
    public float f47749c;

    /* renamed from: d */
    public float f47750d;

    /* renamed from: e */
    public LatLngBounds f47751e;

    /* renamed from: f */
    public float f47752f;

    /* renamed from: g */
    public float f47753g;

    /* renamed from: h */
    public boolean f47754h = true;

    /* renamed from: i */
    public float f47755i;

    /* renamed from: j */
    public float f47756j = 0.5f;

    /* renamed from: k */
    public float f47757k = 0.5f;

    /* renamed from: l */
    public boolean f47758l;

    public GroundOverlayOptions() {
    }

    GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.f47747a = new C16952a(C14883a.m30535a(iBinder));
        this.f47748b = latLng;
        this.f47749c = f;
        this.f47750d = f2;
        this.f47751e = latLngBounds;
        this.f47752f = f3;
        this.f47753g = f4;
        this.f47754h = z;
        this.f47755i = f5;
        this.f47756j = f6;
        this.f47757k = f7;
        this.f47758l = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32182a(parcel, 2, this.f47747a.f47842a.asBinder(), false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f47748b, i, false);
        C15469b.m32178a(parcel, 4, this.f47749c);
        C15469b.m32178a(parcel, 5, this.f47750d);
        C15469b.m32183a(parcel, 6, (Parcelable) this.f47751e, i, false);
        C15469b.m32178a(parcel, 7, this.f47752f);
        C15469b.m32178a(parcel, 8, this.f47753g);
        C15469b.m32189a(parcel, 9, this.f47754h);
        C15469b.m32178a(parcel, 10, this.f47755i);
        C15469b.m32178a(parcel, 11, this.f47756j);
        C15469b.m32178a(parcel, 12, this.f47757k);
        C15469b.m32189a(parcel, 13, this.f47758l);
        C15469b.m32197c(parcel, a);
    }
}

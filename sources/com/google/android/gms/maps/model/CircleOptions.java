package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.List;

public final class CircleOptions extends AbstractSafeParcelable {
    public static final Creator<CircleOptions> CREATOR = new C16959h();

    /* renamed from: a */
    public LatLng f47734a;

    /* renamed from: b */
    public double f47735b;

    /* renamed from: c */
    public float f47736c = 10.0f;

    /* renamed from: d */
    public int f47737d = -16777216;

    /* renamed from: e */
    public int f47738e;

    /* renamed from: f */
    public float f47739f;

    /* renamed from: g */
    public boolean f47740g = true;

    /* renamed from: h */
    public boolean f47741h;

    /* renamed from: i */
    public List<PatternItem> f47742i;

    public CircleOptions() {
    }

    CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List<PatternItem> list) {
        this.f47734a = latLng;
        this.f47735b = d;
        this.f47736c = f;
        this.f47737d = i;
        this.f47738e = i2;
        this.f47739f = f2;
        this.f47740g = z;
        this.f47741h = z2;
        this.f47742i = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f47734a, i, false);
        C15469b.m32177a(parcel, 3, this.f47735b);
        C15469b.m32178a(parcel, 4, this.f47736c);
        C15469b.m32195b(parcel, 5, this.f47737d);
        C15469b.m32195b(parcel, 6, this.f47738e);
        C15469b.m32178a(parcel, 7, this.f47739f);
        C15469b.m32189a(parcel, 8, this.f47740g);
        C15469b.m32189a(parcel, 9, this.f47741h);
        C15469b.m32196b(parcel, 10, this.f47742i, false);
        C15469b.m32197c(parcel, a);
    }
}

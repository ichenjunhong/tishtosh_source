package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Creator<PointOfInterest> CREATOR = new C16966o();

    /* renamed from: a */
    public final LatLng f47786a;

    /* renamed from: b */
    public final String f47787b;

    /* renamed from: c */
    public final String f47788c;

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.f47786a = latLng;
        this.f47787b = str;
        this.f47788c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f47786a, i, false);
        C15469b.m32187a(parcel, 3, this.f47787b, false);
        C15469b.m32187a(parcel, 4, this.f47788c, false);
        C15469b.m32197c(parcel, a);
    }
}

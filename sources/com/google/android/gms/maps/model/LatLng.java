package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LatLng> CREATOR = new C16962k();

    /* renamed from: a */
    public final double f47759a;

    /* renamed from: b */
    public final double f47760b;

    public LatLng(double d, double d2) {
        if (-180.0d > d2 || d2 >= 180.0d) {
            d2 = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.f47760b = d2;
        this.f47759a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f47759a) == Double.doubleToLongBits(latLng.f47759a) && Double.doubleToLongBits(this.f47760b) == Double.doubleToLongBits(latLng.f47760b);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f47759a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f47760b);
        return (i * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        double d = this.f47759a;
        double d2 = this.f47760b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32177a(parcel, 2, this.f47759a);
        C15469b.m32177a(parcel, 3, this.f47760b);
        C15469b.m32197c(parcel, a);
    }
}

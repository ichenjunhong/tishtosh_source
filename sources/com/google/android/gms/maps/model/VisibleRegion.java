package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Creator<VisibleRegion> CREATOR = new C16977z();

    /* renamed from: a */
    public final LatLng f47837a;

    /* renamed from: b */
    public final LatLng f47838b;

    /* renamed from: c */
    public final LatLng f47839c;

    /* renamed from: d */
    public final LatLng f47840d;

    /* renamed from: e */
    public final LatLngBounds f47841e;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f47837a = latLng;
        this.f47838b = latLng2;
        this.f47839c = latLng3;
        this.f47840d = latLng4;
        this.f47841e = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f47837a.equals(visibleRegion.f47837a) && this.f47838b.equals(visibleRegion.f47838b) && this.f47839c.equals(visibleRegion.f47839c) && this.f47840d.equals(visibleRegion.f47840d) && this.f47841e.equals(visibleRegion.f47841e);
    }

    public final int hashCode() {
        return C15462p.m32118a(this.f47837a, this.f47838b, this.f47839c, this.f47840d, this.f47841e);
    }

    public final String toString() {
        return C15462p.m32119a((Object) this).mo28449a("nearLeft", this.f47837a).mo28449a("nearRight", this.f47838b).mo28449a("farLeft", this.f47839c).mo28449a("farRight", this.f47840d).mo28449a("latLngBounds", this.f47841e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f47837a, i, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f47838b, i, false);
        C15469b.m32183a(parcel, 4, (Parcelable) this.f47839c, i, false);
        C15469b.m32183a(parcel, 5, (Parcelable) this.f47840d, i, false);
        C15469b.m32183a(parcel, 6, (Parcelable) this.f47841e, i, false);
        C15469b.m32197c(parcel, a);
    }
}

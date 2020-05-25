package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Creator<StreetViewPanoramaLocation> CREATOR = new C16971t();

    /* renamed from: a */
    public final StreetViewPanoramaLink[] f47817a;

    /* renamed from: b */
    public final LatLng f47818b;

    /* renamed from: c */
    public final String f47819c;

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f47817a = streetViewPanoramaLinkArr;
        this.f47818b = latLng;
        this.f47819c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.f47819c.equals(streetViewPanoramaLocation.f47819c) && this.f47818b.equals(streetViewPanoramaLocation.f47818b);
    }

    public int hashCode() {
        return C15462p.m32118a(this.f47818b, this.f47819c);
    }

    public String toString() {
        return C15462p.m32119a((Object) this).mo28449a("panoId", this.f47819c).mo28449a("position", this.f47818b.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32191a(parcel, 2, (T[]) this.f47817a, i, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f47818b, i, false);
        C15469b.m32187a(parcel, 4, this.f47819c, false);
        C15469b.m32197c(parcel, a);
    }
}

package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import com.google.android.gms.maps.p1046a.C16914e;

public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<StreetViewPanoramaOptions> CREATOR = new C16945i();

    /* renamed from: a */
    public StreetViewPanoramaCamera f47695a;

    /* renamed from: b */
    public String f47696b;

    /* renamed from: c */
    public LatLng f47697c;

    /* renamed from: d */
    public Integer f47698d;

    /* renamed from: e */
    public Boolean f47699e = Boolean.valueOf(true);

    /* renamed from: f */
    public Boolean f47700f = Boolean.valueOf(true);

    /* renamed from: g */
    public Boolean f47701g = Boolean.valueOf(true);

    /* renamed from: h */
    public Boolean f47702h = Boolean.valueOf(true);

    /* renamed from: i */
    public Boolean f47703i;

    /* renamed from: j */
    public StreetViewSource f47704j = StreetViewSource.f47824a;

    public StreetViewPanoramaOptions() {
    }

    StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        this.f47695a = streetViewPanoramaCamera;
        this.f47697c = latLng;
        this.f47698d = num;
        this.f47696b = str;
        this.f47699e = C16914e.m41024a(b);
        this.f47700f = C16914e.m41024a(b2);
        this.f47701g = C16914e.m41024a(b3);
        this.f47702h = C16914e.m41024a(b4);
        this.f47703i = C16914e.m41024a(b5);
        this.f47704j = streetViewSource;
    }

    public final String toString() {
        return C15462p.m32119a((Object) this).mo28449a("PanoramaId", this.f47696b).mo28449a("Position", this.f47697c).mo28449a("Radius", this.f47698d).mo28449a("Source", this.f47704j).mo28449a("StreetViewPanoramaCamera", this.f47695a).mo28449a("UserNavigationEnabled", this.f47699e).mo28449a("ZoomGesturesEnabled", this.f47700f).mo28449a("PanningGesturesEnabled", this.f47701g).mo28449a("StreetNamesEnabled", this.f47702h).mo28449a("UseViewLifecycleInFragment", this.f47703i).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f47695a, i, false);
        C15469b.m32187a(parcel, 3, this.f47696b, false);
        C15469b.m32183a(parcel, 4, (Parcelable) this.f47697c, i, false);
        C15469b.m32185a(parcel, 5, this.f47698d, false);
        C15469b.m32176a(parcel, 6, C16914e.m41023a(this.f47699e));
        C15469b.m32176a(parcel, 7, C16914e.m41023a(this.f47700f));
        C15469b.m32176a(parcel, 8, C16914e.m41023a(this.f47701g));
        C15469b.m32176a(parcel, 9, C16914e.m41023a(this.f47702h));
        C15469b.m32176a(parcel, 10, C16914e.m41023a(this.f47703i));
        C15469b.m32183a(parcel, 11, (Parcelable) this.f47704j, i, false);
        C15469b.m32197c(parcel, a);
    }
}

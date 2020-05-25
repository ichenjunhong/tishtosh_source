package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.p1046a.C16914e;

public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleMapOptions> CREATOR = new C16943g();

    /* renamed from: a */
    public Boolean f47679a;

    /* renamed from: b */
    public Boolean f47680b;

    /* renamed from: c */
    public int f47681c = -1;

    /* renamed from: d */
    public CameraPosition f47682d;

    /* renamed from: e */
    public Boolean f47683e;

    /* renamed from: f */
    public Boolean f47684f;

    /* renamed from: g */
    public Boolean f47685g;

    /* renamed from: h */
    public Boolean f47686h;

    /* renamed from: i */
    public Boolean f47687i;

    /* renamed from: j */
    public Boolean f47688j;

    /* renamed from: k */
    public Boolean f47689k;

    /* renamed from: l */
    public Boolean f47690l;

    /* renamed from: m */
    public Boolean f47691m;

    /* renamed from: n */
    public Float f47692n;

    /* renamed from: o */
    public Float f47693o;

    /* renamed from: p */
    public LatLngBounds f47694p;

    public GoogleMapOptions() {
    }

    GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds) {
        this.f47679a = C16914e.m41024a(b);
        this.f47680b = C16914e.m41024a(b2);
        this.f47681c = i;
        this.f47682d = cameraPosition;
        this.f47683e = C16914e.m41024a(b3);
        this.f47684f = C16914e.m41024a(b4);
        this.f47685g = C16914e.m41024a(b5);
        this.f47686h = C16914e.m41024a(b6);
        this.f47687i = C16914e.m41024a(b7);
        this.f47688j = C16914e.m41024a(b8);
        this.f47689k = C16914e.m41024a(b9);
        this.f47690l = C16914e.m41024a(b10);
        this.f47691m = C16914e.m41024a(b11);
        this.f47692n = f;
        this.f47693o = f2;
        this.f47694p = latLngBounds;
    }

    public final String toString() {
        return C15462p.m32119a((Object) this).mo28449a("MapType", Integer.valueOf(this.f47681c)).mo28449a("LiteMode", this.f47689k).mo28449a("Camera", this.f47682d).mo28449a("CompassEnabled", this.f47684f).mo28449a("ZoomControlsEnabled", this.f47683e).mo28449a("ScrollGesturesEnabled", this.f47685g).mo28449a("ZoomGesturesEnabled", this.f47686h).mo28449a("TiltGesturesEnabled", this.f47687i).mo28449a("RotateGesturesEnabled", this.f47688j).mo28449a("MapToolbarEnabled", this.f47690l).mo28449a("AmbientEnabled", this.f47691m).mo28449a("MinZoomPreference", this.f47692n).mo28449a("MaxZoomPreference", this.f47693o).mo28449a("LatLngBoundsForCameraTarget", this.f47694p).mo28449a("ZOrderOnTop", this.f47679a).mo28449a("UseViewLifecycleInFragment", this.f47680b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32176a(parcel, 2, C16914e.m41023a(this.f47679a));
        C15469b.m32176a(parcel, 3, C16914e.m41023a(this.f47680b));
        C15469b.m32195b(parcel, 4, this.f47681c);
        C15469b.m32183a(parcel, 5, (Parcelable) this.f47682d, i, false);
        C15469b.m32176a(parcel, 6, C16914e.m41023a(this.f47683e));
        C15469b.m32176a(parcel, 7, C16914e.m41023a(this.f47684f));
        C15469b.m32176a(parcel, 8, C16914e.m41023a(this.f47685g));
        C15469b.m32176a(parcel, 9, C16914e.m41023a(this.f47686h));
        C15469b.m32176a(parcel, 10, C16914e.m41023a(this.f47687i));
        C15469b.m32176a(parcel, 11, C16914e.m41023a(this.f47688j));
        C15469b.m32176a(parcel, 12, C16914e.m41023a(this.f47689k));
        C15469b.m32176a(parcel, 14, C16914e.m41023a(this.f47690l));
        C15469b.m32176a(parcel, 15, C16914e.m41023a(this.f47691m));
        C15469b.m32184a(parcel, 16, this.f47692n, false);
        C15469b.m32184a(parcel, 17, this.f47693o, false);
        C15469b.m32183a(parcel, 18, (Parcelable) this.f47694p, i, false);
        C15469b.m32197c(parcel, a);
    }
}

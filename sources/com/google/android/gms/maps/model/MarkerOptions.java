package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.p1027a.C14882b.C14883a;

public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Creator<MarkerOptions> CREATOR = new C16964m();

    /* renamed from: a */
    public LatLng f47769a;

    /* renamed from: b */
    public String f47770b;

    /* renamed from: c */
    public String f47771c;

    /* renamed from: d */
    public C16952a f47772d;

    /* renamed from: e */
    public float f47773e = 0.5f;

    /* renamed from: f */
    public float f47774f = 1.0f;

    /* renamed from: g */
    public boolean f47775g;

    /* renamed from: h */
    public boolean f47776h = true;

    /* renamed from: i */
    public boolean f47777i;

    /* renamed from: j */
    public float f47778j;

    /* renamed from: k */
    public float f47779k = 0.5f;

    /* renamed from: l */
    public float f47780l;

    /* renamed from: m */
    public float f47781m = 1.0f;

    /* renamed from: n */
    public float f47782n;

    public MarkerOptions() {
    }

    MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f47769a = latLng;
        this.f47770b = str;
        this.f47771c = str2;
        if (iBinder == null) {
            this.f47772d = null;
        } else {
            this.f47772d = new C16952a(C14883a.m30535a(iBinder));
        }
        this.f47773e = f;
        this.f47774f = f2;
        this.f47775g = z;
        this.f47776h = z2;
        this.f47777i = z3;
        this.f47778j = f3;
        this.f47779k = f4;
        this.f47780l = f5;
        this.f47781m = f6;
        this.f47782n = f7;
    }

    /* renamed from: a */
    public final MarkerOptions mo32711a(LatLng latLng) {
        this.f47769a = latLng;
        return this;
    }

    /* renamed from: a */
    public final MarkerOptions mo32712a(C16952a aVar) {
        this.f47772d = aVar;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f47769a, i, false);
        C15469b.m32187a(parcel, 3, this.f47770b, false);
        C15469b.m32187a(parcel, 4, this.f47771c, false);
        C15469b.m32182a(parcel, 5, this.f47772d == null ? null : this.f47772d.f47842a.asBinder(), false);
        C15469b.m32178a(parcel, 6, this.f47773e);
        C15469b.m32178a(parcel, 7, this.f47774f);
        C15469b.m32189a(parcel, 8, this.f47775g);
        C15469b.m32189a(parcel, 9, this.f47776h);
        C15469b.m32189a(parcel, 10, this.f47777i);
        C15469b.m32178a(parcel, 11, this.f47778j);
        C15469b.m32178a(parcel, 12, this.f47779k);
        C15469b.m32178a(parcel, 13, this.f47780l);
        C15469b.m32178a(parcel, 14, this.f47781m);
        C15469b.m32178a(parcel, 15, this.f47782n);
        C15469b.m32197c(parcel, a);
    }
}

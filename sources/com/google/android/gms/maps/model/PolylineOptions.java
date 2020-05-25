package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Creator<PolylineOptions> CREATOR = new C16968q();

    /* renamed from: a */
    public final List<LatLng> f47800a;

    /* renamed from: b */
    public float f47801b;

    /* renamed from: c */
    public int f47802c;

    /* renamed from: d */
    public float f47803d;

    /* renamed from: e */
    public boolean f47804e;

    /* renamed from: f */
    public boolean f47805f;

    /* renamed from: g */
    public boolean f47806g;

    /* renamed from: h */
    public Cap f47807h;

    /* renamed from: i */
    public Cap f47808i;

    /* renamed from: j */
    public int f47809j;

    /* renamed from: k */
    public List<PatternItem> f47810k;

    public PolylineOptions() {
        this.f47801b = 10.0f;
        this.f47802c = -16777216;
        this.f47804e = true;
        this.f47807h = new ButtCap();
        this.f47808i = new ButtCap();
        this.f47809j = 0;
        this.f47810k = null;
        this.f47800a = new ArrayList();
    }

    PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List<PatternItem> list2) {
        this.f47801b = 10.0f;
        this.f47802c = -16777216;
        this.f47804e = true;
        this.f47807h = new ButtCap();
        this.f47808i = new ButtCap();
        this.f47809j = 0;
        this.f47810k = null;
        this.f47800a = list;
        this.f47801b = f;
        this.f47802c = i;
        this.f47803d = f2;
        this.f47804e = z;
        this.f47805f = z2;
        this.f47806g = z3;
        if (cap != null) {
            this.f47807h = cap;
        }
        if (cap2 != null) {
            this.f47808i = cap2;
        }
        this.f47809j = i2;
        this.f47810k = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32196b(parcel, 2, this.f47800a, false);
        C15469b.m32178a(parcel, 3, this.f47801b);
        C15469b.m32195b(parcel, 4, this.f47802c);
        C15469b.m32178a(parcel, 5, this.f47803d);
        C15469b.m32189a(parcel, 6, this.f47804e);
        C15469b.m32189a(parcel, 7, this.f47805f);
        C15469b.m32189a(parcel, 8, this.f47806g);
        C15469b.m32183a(parcel, 9, (Parcelable) this.f47807h, i, false);
        C15469b.m32183a(parcel, 10, (Parcelable) this.f47808i, i, false);
        C15469b.m32195b(parcel, 11, this.f47809j);
        C15469b.m32196b(parcel, 12, this.f47810k, false);
        C15469b.m32197c(parcel, a);
    }
}

package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Creator<PolygonOptions> CREATOR = new C16967p();

    /* renamed from: a */
    public final List<LatLng> f47789a;

    /* renamed from: b */
    public final List<List<LatLng>> f47790b;

    /* renamed from: c */
    public float f47791c;

    /* renamed from: d */
    public int f47792d;

    /* renamed from: e */
    public int f47793e;

    /* renamed from: f */
    public float f47794f;

    /* renamed from: g */
    public boolean f47795g;

    /* renamed from: h */
    public boolean f47796h;

    /* renamed from: i */
    public boolean f47797i;

    /* renamed from: j */
    public int f47798j;

    /* renamed from: k */
    public List<PatternItem> f47799k;

    public PolygonOptions() {
        this.f47791c = 10.0f;
        this.f47792d = -16777216;
        this.f47795g = true;
        this.f47789a = new ArrayList();
        this.f47790b = new ArrayList();
    }

    PolygonOptions(List<LatLng> list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List<PatternItem> list3) {
        this.f47791c = 10.0f;
        this.f47792d = -16777216;
        this.f47795g = true;
        this.f47789a = list;
        this.f47790b = list2;
        this.f47791c = f;
        this.f47792d = i;
        this.f47793e = i2;
        this.f47794f = f2;
        this.f47795g = z;
        this.f47796h = z2;
        this.f47797i = z3;
        this.f47798j = i3;
        this.f47799k = list3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32196b(parcel, 2, this.f47789a, false);
        List<List<LatLng>> list = this.f47790b;
        if (list != null) {
            int a2 = C15469b.m32175a(parcel, 3);
            parcel.writeList(list);
            C15469b.m32194b(parcel, a2);
        }
        C15469b.m32178a(parcel, 4, this.f47791c);
        C15469b.m32195b(parcel, 5, this.f47792d);
        C15469b.m32195b(parcel, 6, this.f47793e);
        C15469b.m32178a(parcel, 7, this.f47794f);
        C15469b.m32189a(parcel, 8, this.f47795g);
        C15469b.m32189a(parcel, 9, this.f47796h);
        C15469b.m32189a(parcel, 10, this.f47797i);
        C15469b.m32195b(parcel, 11, this.f47798j);
        C15469b.m32196b(parcel, 12, this.f47799k, false);
        C15469b.m32197c(parcel, a);
    }
}

package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15462p.C15463a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<PlaceReport> CREATOR = new C16898a();

    /* renamed from: a */
    public final String f47658a;

    /* renamed from: b */
    public final String f47659b;

    /* renamed from: c */
    private final int f47660c;

    /* renamed from: d */
    private final String f47661d;

    PlaceReport(int i, String str, String str2, String str3) {
        this.f47660c = i;
        this.f47658a = str;
        this.f47659b = str2;
        this.f47661d = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return C15462p.m32120a(this.f47658a, placeReport.f47658a) && C15462p.m32120a(this.f47659b, placeReport.f47659b) && C15462p.m32120a(this.f47661d, placeReport.f47661d);
    }

    public int hashCode() {
        return C15462p.m32118a(this.f47658a, this.f47659b, this.f47661d);
    }

    public String toString() {
        C15463a a = C15462p.m32119a((Object) this);
        a.mo28449a("placeId", this.f47658a);
        a.mo28449a("tag", this.f47659b);
        if (!"unknown".equals(this.f47661d)) {
            a.mo28449a("source", this.f47661d);
        }
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f47660c);
        C15469b.m32187a(parcel, 2, this.f47658a, false);
        C15469b.m32187a(parcel, 3, this.f47659b, false);
        C15469b.m32187a(parcel, 4, this.f47661d, false);
        C15469b.m32197c(parcel, a);
    }
}

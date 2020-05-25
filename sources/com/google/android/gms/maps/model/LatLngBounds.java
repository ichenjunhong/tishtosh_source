package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LatLngBounds> CREATOR = new C16961j();

    /* renamed from: a */
    public final LatLng f47761a;

    /* renamed from: b */
    public final LatLng f47762b;

    /* renamed from: com.google.android.gms.maps.model.LatLngBounds$a */
    public static final class C16950a {

        /* renamed from: a */
        private double f47763a = Double.POSITIVE_INFINITY;

        /* renamed from: b */
        private double f47764b = Double.NEGATIVE_INFINITY;

        /* renamed from: c */
        private double f47765c = Double.NaN;

        /* renamed from: d */
        private double f47766d = Double.NaN;

        /* renamed from: a */
        public final LatLngBounds mo32709a() {
            C15464q.m32130a(!Double.isNaN(this.f47765c), (Object) "no included points");
            return new LatLngBounds(new LatLng(this.f47763a, this.f47765c), new LatLng(this.f47764b, this.f47766d));
        }

        /* renamed from: a */
        public final C16950a mo32708a(LatLng latLng) {
            this.f47763a = Math.min(this.f47763a, latLng.f47759a);
            this.f47764b = Math.max(this.f47764b, latLng.f47759a);
            double d = latLng.f47760b;
            if (Double.isNaN(this.f47765c)) {
                this.f47765c = d;
            } else {
                boolean z = true;
                if (this.f47765c > this.f47766d ? !(this.f47765c <= d || d <= this.f47766d) : !(this.f47765c <= d && d <= this.f47766d)) {
                    z = false;
                }
                if (!z) {
                    if (((this.f47765c - d) + 360.0d) % 360.0d < ((d - this.f47766d) + 360.0d) % 360.0d) {
                        this.f47765c = d;
                    }
                }
                return this;
            }
            this.f47766d = d;
            return this;
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C15464q.m32124a(latLng, (Object) "null southwest");
        C15464q.m32124a(latLng2, (Object) "null northeast");
        C15464q.m32135b(latLng2.f47759a >= latLng.f47759a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.f47759a), Double.valueOf(latLng2.f47759a));
        this.f47761a = latLng;
        this.f47762b = latLng2;
    }

    /* renamed from: a */
    public static C16950a m41115a() {
        return new C16950a();
    }

    /* renamed from: b */
    public final LatLng mo32703b() {
        double d = (this.f47761a.f47759a + this.f47762b.f47759a) / 2.0d;
        double d2 = this.f47762b.f47760b;
        double d3 = this.f47761a.f47760b;
        if (d3 > d2) {
            d2 += 360.0d;
        }
        return new LatLng(d, (d2 + d3) / 2.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f47761a.equals(latLngBounds.f47761a) && this.f47762b.equals(latLngBounds.f47762b);
    }

    public final int hashCode() {
        return C15462p.m32118a(this.f47761a, this.f47762b);
    }

    public final String toString() {
        return C15462p.m32119a((Object) this).mo28449a("southwest", this.f47761a).mo28449a("northeast", this.f47762b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f47761a, i, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f47762b, i, false);
        C15469b.m32197c(parcel, a);
    }
}

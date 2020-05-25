package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzaj extends AbstractSafeParcelable {
    public static final Creator<zzaj> CREATOR = new C16896o();

    /* renamed from: a */
    private final int f47667a;

    /* renamed from: b */
    private final int f47668b;

    /* renamed from: c */
    private final long f47669c;

    /* renamed from: d */
    private final long f47670d;

    zzaj(int i, int i2, long j, long j2) {
        this.f47667a = i;
        this.f47668b = i2;
        this.f47669c = j;
        this.f47670d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaj zzaj = (zzaj) obj;
            return this.f47667a == zzaj.f47667a && this.f47668b == zzaj.f47668b && this.f47669c == zzaj.f47669c && this.f47670d == zzaj.f47670d;
        }
    }

    public final int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f47668b), Integer.valueOf(this.f47667a), Long.valueOf(this.f47670d), Long.valueOf(this.f47669c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkLocationStatus:");
        sb.append(" Wifi status: ");
        sb.append(this.f47667a);
        sb.append(" Cell status: ");
        sb.append(this.f47668b);
        sb.append(" elapsed time NS: ");
        sb.append(this.f47670d);
        sb.append(" system time ms: ");
        sb.append(this.f47669c);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f47667a);
        C15469b.m32195b(parcel, 2, this.f47668b);
        C15469b.m32180a(parcel, 3, this.f47669c);
        C15469b.m32180a(parcel, 4, this.f47670d);
        C15469b.m32197c(parcel, a);
    }
}

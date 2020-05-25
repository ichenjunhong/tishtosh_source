package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.Arrays;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationAvailability> CREATOR = new C16888g();

    /* renamed from: a */
    private int f47622a;

    /* renamed from: b */
    private int f47623b;

    /* renamed from: c */
    private long f47624c;

    /* renamed from: d */
    private int f47625d;

    /* renamed from: e */
    private zzaj[] f47626e;

    LocationAvailability(int i, int i2, int i3, long j, zzaj[] zzajArr) {
        this.f47625d = i;
        this.f47622a = i2;
        this.f47623b = i3;
        this.f47624c = j;
        this.f47626e = zzajArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f47622a == locationAvailability.f47622a && this.f47623b == locationAvailability.f47623b && this.f47624c == locationAvailability.f47624c && this.f47625d == locationAvailability.f47625d && Arrays.equals(this.f47626e, locationAvailability.f47626e);
        }
    }

    public final int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f47625d), Integer.valueOf(this.f47622a), Integer.valueOf(this.f47623b), Long.valueOf(this.f47624c), this.f47626e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f47622a);
        C15469b.m32195b(parcel, 2, this.f47623b);
        C15469b.m32180a(parcel, 3, this.f47624c);
        C15469b.m32195b(parcel, 4, this.f47625d);
        C15469b.m32191a(parcel, 5, (T[]) this.f47626e, i, false);
        C15469b.m32197c(parcel, a);
    }

    public final String toString() {
        boolean z = this.f47625d < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }
}

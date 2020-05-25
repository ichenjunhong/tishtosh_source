package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzj extends AbstractSafeParcelable {
    public static final Creator<zzj> CREATOR = new C16907y();

    /* renamed from: a */
    private boolean f47674a;

    /* renamed from: b */
    private long f47675b;

    /* renamed from: c */
    private float f47676c;

    /* renamed from: d */
    private long f47677d;

    /* renamed from: e */
    private int f47678e;

    public zzj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    zzj(boolean z, long j, float f, long j2, int i) {
        this.f47674a = z;
        this.f47675b = j;
        this.f47676c = f;
        this.f47677d = j2;
        this.f47678e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.f47674a == zzj.f47674a && this.f47675b == zzj.f47675b && Float.compare(this.f47676c, zzj.f47676c) == 0 && this.f47677d == zzj.f47677d && this.f47678e == zzj.f47678e;
    }

    public final int hashCode() {
        return C15462p.m32118a(Boolean.valueOf(this.f47674a), Long.valueOf(this.f47675b), Float.valueOf(this.f47676c), Long.valueOf(this.f47677d), Integer.valueOf(this.f47678e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f47674a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f47675b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f47676c);
        if (this.f47677d != Long.MAX_VALUE) {
            long elapsedRealtime = this.f47677d - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append("ms");
        }
        if (this.f47678e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f47678e);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32189a(parcel, 1, this.f47674a);
        C15469b.m32180a(parcel, 2, this.f47675b);
        C15469b.m32178a(parcel, 3, this.f47676c);
        C15469b.m32180a(parcel, 4, this.f47677d);
        C15469b.m32195b(parcel, 5, this.f47678e);
        C15469b.m32197c(parcel, a);
    }
}

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationRequest> CREATOR = new C16889h();

    /* renamed from: a */
    public int f47627a;

    /* renamed from: b */
    public long f47628b;

    /* renamed from: c */
    public long f47629c;

    /* renamed from: d */
    public boolean f47630d;

    /* renamed from: e */
    public long f47631e;

    /* renamed from: f */
    public int f47632f;

    /* renamed from: g */
    public float f47633g;

    /* renamed from: h */
    public long f47634h;

    public LocationRequest() {
        this.f47627a = 102;
        this.f47628b = 3600000;
        this.f47629c = 600000;
        this.f47631e = Long.MAX_VALUE;
        this.f47632f = Integer.MAX_VALUE;
    }

    LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f47627a = i;
        this.f47628b = j;
        this.f47629c = j2;
        this.f47630d = z;
        this.f47631e = j3;
        this.f47632f = i2;
        this.f47633g = f;
        this.f47634h = j4;
    }

    /* renamed from: a */
    private long m40984a() {
        long j = this.f47634h;
        return j < this.f47628b ? this.f47628b : j;
    }

    /* renamed from: b */
    public static void m40985b(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final LocationRequest mo32563a(long j) {
        m40985b(j);
        this.f47628b = j;
        if (!this.f47630d) {
            double d = (double) this.f47628b;
            Double.isNaN(d);
            this.f47629c = (long) (d / 6.0d);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f47627a == locationRequest.f47627a && this.f47628b == locationRequest.f47628b && this.f47629c == locationRequest.f47629c && this.f47630d == locationRequest.f47630d && this.f47631e == locationRequest.f47631e && this.f47632f == locationRequest.f47632f && this.f47633g == locationRequest.f47633g && m40984a() == locationRequest.m40984a();
    }

    public final int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f47627a), Long.valueOf(this.f47628b), Float.valueOf(this.f47633g), Long.valueOf(this.f47634h));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        switch (this.f47627a) {
            case 100:
                str = "PRIORITY_HIGH_ACCURACY";
                break;
            case 102:
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            case 104:
                str = "PRIORITY_LOW_POWER";
                break;
            case 105:
                str = "PRIORITY_NO_POWER";
                break;
            default:
                str = "???";
                break;
        }
        sb.append(str);
        if (this.f47627a != 105) {
            sb.append(" requested=");
            sb.append(this.f47628b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f47629c);
        sb.append("ms");
        if (this.f47634h > this.f47628b) {
            sb.append(" maxWait=");
            sb.append(this.f47634h);
            sb.append("ms");
        }
        if (this.f47633g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f47633g);
            sb.append("m");
        }
        if (this.f47631e != Long.MAX_VALUE) {
            long elapsedRealtime = this.f47631e - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append("ms");
        }
        if (this.f47632f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f47632f);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f47627a);
        C15469b.m32180a(parcel, 2, this.f47628b);
        C15469b.m32180a(parcel, 3, this.f47629c);
        C15469b.m32189a(parcel, 4, this.f47630d);
        C15469b.m32180a(parcel, 5, this.f47631e);
        C15469b.m32195b(parcel, 6, this.f47632f);
        C15469b.m32178a(parcel, 7, this.f47633g);
        C15469b.m32180a(parcel, 8, this.f47634h);
        C15469b.m32197c(parcel, a);
    }
}

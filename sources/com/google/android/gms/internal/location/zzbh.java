package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.C2240a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.Locale;

public final class zzbh extends AbstractSafeParcelable {
    public static final Creator<zzbh> CREATOR = new C16522t();

    /* renamed from: a */
    private final String f46428a;

    /* renamed from: b */
    private final long f46429b;

    /* renamed from: c */
    private final short f46430c;

    /* renamed from: d */
    private final double f46431d;

    /* renamed from: e */
    private final double f46432e;

    /* renamed from: f */
    private final float f46433f;

    /* renamed from: g */
    private final int f46434g;

    /* renamed from: h */
    private final int f46435h;

    /* renamed from: i */
    private final int f46436i;

    public zzbh(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            String str2 = "requestId is null or too long: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f46430c = s;
                this.f46428a = str;
                this.f46431d = d;
                this.f46432e = d2;
                this.f46433f = f;
                this.f46429b = j;
                this.f46434g = i4;
                this.f46435h = i2;
                this.f46436i = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbh = (zzbh) obj;
        return this.f46433f == zzbh.f46433f && this.f46431d == zzbh.f46431d && this.f46432e == zzbh.f46432e && this.f46430c == zzbh.f46430c;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f46431d);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f46432e);
        return (((((((i * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31) + Float.floatToIntBits(this.f46433f)) * 31) + this.f46430c) * 31) + this.f46434g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]";
        Object[] objArr = new Object[9];
        objArr[0] = this.f46430c != 1 ? null : "CIRCLE";
        objArr[1] = this.f46428a.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f46434g);
        objArr[3] = Double.valueOf(this.f46431d);
        objArr[4] = Double.valueOf(this.f46432e);
        objArr[5] = Float.valueOf(this.f46433f);
        objArr[6] = Integer.valueOf(this.f46435h / 1000);
        objArr[7] = Integer.valueOf(this.f46436i);
        objArr[8] = Long.valueOf(this.f46429b);
        return C2240a.m6773a(locale, str, objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 1, this.f46428a, false);
        C15469b.m32180a(parcel, 2, this.f46429b);
        short s = this.f46430c;
        C15469b.m32179a(parcel, 3, 4);
        parcel.writeInt(s);
        C15469b.m32177a(parcel, 4, this.f46431d);
        C15469b.m32177a(parcel, 5, this.f46432e);
        C15469b.m32178a(parcel, 6, this.f46433f);
        C15469b.m32195b(parcel, 7, this.f46434g);
        C15469b.m32195b(parcel, 8, this.f46435h);
        C15469b.m32195b(parcel, 9, this.f46436i);
        C15469b.m32197c(parcel, a);
    }
}

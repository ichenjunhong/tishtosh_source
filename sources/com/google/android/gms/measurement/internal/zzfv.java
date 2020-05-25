package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzfv extends AbstractSafeParcelable {
    public static final Creator<zzfv> CREATOR = new C17100ek();

    /* renamed from: a */
    public final String f48479a;

    /* renamed from: b */
    public final long f48480b;

    /* renamed from: c */
    public final Long f48481c;

    /* renamed from: d */
    public final String f48482d;

    /* renamed from: e */
    public final String f48483e;

    /* renamed from: f */
    public final Double f48484f;

    /* renamed from: g */
    private final int f48485g;

    /* renamed from: h */
    private final Float f48486h;

    zzfv(C17101el elVar) {
        this(elVar.f48274c, elVar.f48275d, elVar.f48276e, elVar.f48273b);
    }

    zzfv(String str, long j, Object obj, String str2) {
        C15464q.m32125a(str);
        this.f48485g = 2;
        this.f48479a = str;
        this.f48480b = j;
        this.f48483e = str2;
        if (obj == null) {
            this.f48481c = null;
            this.f48486h = null;
            this.f48484f = null;
            this.f48482d = null;
        } else if (obj instanceof Long) {
            this.f48481c = (Long) obj;
            this.f48486h = null;
            this.f48484f = null;
            this.f48482d = null;
        } else if (obj instanceof String) {
            this.f48481c = null;
            this.f48486h = null;
            this.f48484f = null;
            this.f48482d = (String) obj;
        } else if (obj instanceof Double) {
            this.f48481c = null;
            this.f48486h = null;
            this.f48484f = (Double) obj;
            this.f48482d = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    zzfv(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f48485g = i;
        this.f48479a = str;
        this.f48480b = j;
        this.f48481c = l;
        if (i == 1) {
            this.f48484f = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f48484f = d;
        }
        this.f48482d = str2;
        this.f48483e = str3;
    }

    /* renamed from: a */
    public final Object mo33393a() {
        if (this.f48481c != null) {
            return this.f48481c;
        }
        if (this.f48484f != null) {
            return this.f48484f;
        }
        if (this.f48482d != null) {
            return this.f48482d;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f48485g);
        C15469b.m32187a(parcel, 2, this.f48479a, false);
        C15469b.m32180a(parcel, 3, this.f48480b);
        C15469b.m32186a(parcel, 4, this.f48481c, false);
        C15469b.m32184a(parcel, 5, (Float) null, false);
        C15469b.m32187a(parcel, 6, this.f48482d, false);
        C15469b.m32187a(parcel, 7, this.f48483e, false);
        Double d = this.f48484f;
        if (d != null) {
            C15469b.m32179a(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        C15469b.m32197c(parcel, a);
    }
}

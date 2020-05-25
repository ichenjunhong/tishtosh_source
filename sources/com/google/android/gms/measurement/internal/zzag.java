package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzag extends AbstractSafeParcelable {
    public static final Creator<zzag> CREATOR = new C17121g();

    /* renamed from: a */
    public final String f48475a;

    /* renamed from: b */
    public final zzad f48476b;

    /* renamed from: c */
    public final String f48477c;

    /* renamed from: d */
    public final long f48478d;

    public zzag(String str, zzad zzad, String str2, long j) {
        this.f48475a = str;
        this.f48476b = zzad;
        this.f48477c = str2;
        this.f48478d = j;
    }

    zzag(zzag zzag, long j) {
        C15464q.m32123a(zzag);
        this.f48475a = zzag.f48475a;
        this.f48476b = zzag.f48476b;
        this.f48477c = zzag.f48477c;
        this.f48478d = j;
    }

    public final String toString() {
        String str = this.f48477c;
        String str2 = this.f48475a;
        String valueOf = String.valueOf(this.f48476b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f48475a, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f48476b, i, false);
        C15469b.m32187a(parcel, 4, this.f48477c, false);
        C15469b.m32180a(parcel, 5, this.f48478d);
        C15469b.m32197c(parcel, a);
    }
}

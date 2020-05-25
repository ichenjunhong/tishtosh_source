package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzajw extends AbstractSafeParcelable {
    public static final Creator<zzajw> CREATOR = new C15970il();

    /* renamed from: a */
    public final boolean f46076a;

    /* renamed from: b */
    public final String f46077b;

    /* renamed from: c */
    public final int f46078c;

    /* renamed from: d */
    public final byte[] f46079d;

    /* renamed from: e */
    public final String[] f46080e;

    /* renamed from: f */
    public final String[] f46081f;

    /* renamed from: g */
    public final boolean f46082g;

    /* renamed from: h */
    public final long f46083h;

    zzajw(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f46076a = z;
        this.f46077b = str;
        this.f46078c = i;
        this.f46079d = bArr;
        this.f46080e = strArr;
        this.f46081f = strArr2;
        this.f46082g = z2;
        this.f46083h = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32189a(parcel, 1, this.f46076a);
        C15469b.m32187a(parcel, 2, this.f46077b, false);
        C15469b.m32195b(parcel, 3, this.f46078c);
        C15469b.m32190a(parcel, 4, this.f46079d, false);
        C15469b.m32192a(parcel, 5, this.f46080e, false);
        C15469b.m32192a(parcel, 6, this.f46081f, false);
        C15469b.m32189a(parcel, 7, this.f46082g);
        C15469b.m32180a(parcel, 8, this.f46083h);
        C15469b.m32197c(parcel, a);
    }
}

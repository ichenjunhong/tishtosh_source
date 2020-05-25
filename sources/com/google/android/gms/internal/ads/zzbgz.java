package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.taobao.android.dexposed.ClassUtils;

@C16299uq
public final class zzbgz extends AbstractSafeParcelable {
    public static final Creator<zzbgz> CREATOR = new afi();

    /* renamed from: a */
    public String f46237a;

    /* renamed from: b */
    public int f46238b;

    /* renamed from: c */
    public int f46239c;

    /* renamed from: d */
    public boolean f46240d;

    /* renamed from: e */
    public boolean f46241e;

    public zzbgz(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzbgz(int i, int i2, boolean z, boolean z2) {
        this(15302000, i2, true, false, z2);
    }

    private zzbgz(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str = z ? "0" : "1";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
        sb.append("afma-sdk-a-v");
        sb.append(i);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(i2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(str);
        this(sb.toString(), i, i2, z, z3);
    }

    zzbgz(String str, int i, int i2, boolean z, boolean z2) {
        this.f46237a = str;
        this.f46238b = i;
        this.f46239c = i2;
        this.f46240d = z;
        this.f46241e = z2;
    }

    /* renamed from: a */
    public static zzbgz m39278a() {
        return new zzbgz(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f46237a, false);
        C15469b.m32195b(parcel, 3, this.f46238b);
        C15469b.m32195b(parcel, 4, this.f46239c);
        C15469b.m32189a(parcel, 5, this.f46240d);
        C15469b.m32189a(parcel, 6, this.f46241e);
        C15469b.m32197c(parcel, a);
    }
}

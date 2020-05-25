package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzaki extends AbstractSafeParcelable {
    public static final Creator<zzaki> CREATOR = new C15982ix();

    /* renamed from: a */
    private final String f46084a;

    /* renamed from: b */
    private final boolean f46085b;

    /* renamed from: c */
    private final int f46086c;

    /* renamed from: d */
    private final String f46087d;

    public zzaki(String str, boolean z, int i, String str2) {
        this.f46084a = str;
        this.f46085b = z;
        this.f46086c = i;
        this.f46087d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 1, this.f46084a, false);
        C15469b.m32189a(parcel, 2, this.f46085b);
        C15469b.m32195b(parcel, 3, this.f46086c);
        C15469b.m32187a(parcel, 4, this.f46087d, false);
        C15469b.m32197c(parcel, a);
    }
}

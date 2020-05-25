package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzaju extends AbstractSafeParcelable {
    public static final Creator<zzaju> CREATOR = new C15969ik();

    /* renamed from: a */
    private final String f46073a;

    /* renamed from: b */
    private final String[] f46074b;

    /* renamed from: c */
    private final String[] f46075c;

    zzaju(String str, String[] strArr, String[] strArr2) {
        this.f46073a = str;
        this.f46074b = strArr;
        this.f46075c = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 1, this.f46073a, false);
        C15469b.m32192a(parcel, 2, this.f46074b, false);
        C15469b.m32192a(parcel, 3, this.f46075c, false);
        C15469b.m32197c(parcel, a);
    }
}

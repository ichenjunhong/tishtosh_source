package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzbad extends AbstractSafeParcelable {
    public static final Creator<zzbad> CREATOR = new C16404yn();

    /* renamed from: a */
    public final zzyv f46224a;

    /* renamed from: b */
    public final String f46225b;

    public zzbad(zzyv zzyv, String str) {
        this.f46224a = zzyv;
        this.f46225b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f46224a, i, false);
        C15469b.m32187a(parcel, 3, this.f46225b, false);
        C15469b.m32197c(parcel, a);
    }
}

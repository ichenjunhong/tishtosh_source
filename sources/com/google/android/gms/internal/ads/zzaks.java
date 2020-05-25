package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzaks extends AbstractSafeParcelable {
    public static final Creator<zzaks> CREATOR = new C15989jd();

    /* renamed from: a */
    public final int f46090a;

    public zzaks(int i) {
        this.f46090a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46090a);
        C15469b.m32197c(parcel, a);
    }
}

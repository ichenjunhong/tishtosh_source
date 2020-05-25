package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzabp extends AbstractSafeParcelable {
    public static final Creator<zzabp> CREATOR = new C15616aq();

    /* renamed from: a */
    public final int f46060a;

    public zzabp(int i) {
        this.f46060a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 2, this.f46060a);
        C15469b.m32197c(parcel, a);
    }
}

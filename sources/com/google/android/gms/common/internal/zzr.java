package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzr extends AbstractSafeParcelable {
    public static final Creator<zzr> CREATOR = new C15426aq();

    /* renamed from: a */
    private final int f39885a;

    zzr(int i) {
        this.f39885a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39885a);
        C15469b.m32197c(parcel, a);
    }
}

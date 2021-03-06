package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzv extends AbstractSafeParcelable {
    public static final Creator<zzv> CREATOR = new C16462j();

    /* renamed from: a */
    private final int f46371a = 1;

    /* renamed from: b */
    private final String f46372b;

    zzv(int i, String str) {
        this.f46372b = (String) C15464q.m32123a(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46371a);
        C15469b.m32187a(parcel, 2, this.f46372b, false);
        C15469b.m32197c(parcel, a);
    }
}

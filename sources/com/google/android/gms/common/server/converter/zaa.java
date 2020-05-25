package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zaa extends AbstractSafeParcelable {
    public static final Creator<zaa> CREATOR = new C15488a();

    /* renamed from: a */
    public final StringToIntConverter f39910a;

    /* renamed from: b */
    private final int f39911b;

    zaa(int i, StringToIntConverter stringToIntConverter) {
        this.f39911b = i;
        this.f39910a = stringToIntConverter;
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f39911b = 1;
        this.f39910a = stringToIntConverter;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39911b);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f39910a, i, false);
        C15469b.m32197c(parcel, a);
    }
}

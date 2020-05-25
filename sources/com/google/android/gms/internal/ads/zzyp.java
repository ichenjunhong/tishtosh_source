package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzyp extends AbstractSafeParcelable {
    public static final Creator<zzyp> CREATOR = new bzn();

    /* renamed from: a */
    private final String f46315a;

    /* renamed from: b */
    private final String f46316b;

    public zzyp(String str, String str2) {
        this.f46315a = str;
        this.f46316b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 1, this.f46315a, false);
        C15469b.m32187a(parcel, 2, this.f46316b, false);
        C15469b.m32197c(parcel, a);
    }
}

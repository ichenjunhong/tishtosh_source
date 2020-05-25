package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzae extends AbstractSafeParcelable {
    public static final Creator<zzae> CREATOR = new C16892k();

    /* renamed from: a */
    private final String f47664a;

    /* renamed from: b */
    private final String f47665b;

    /* renamed from: c */
    private final String f47666c;

    zzae(String str, String str2, String str3) {
        this.f47666c = str;
        this.f47664a = str2;
        this.f47665b = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 1, this.f47664a, false);
        C15469b.m32187a(parcel, 2, this.f47665b, false);
        C15469b.m32187a(parcel, 5, this.f47666c, false);
        C15469b.m32197c(parcel, a);
    }
}

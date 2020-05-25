package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzayi extends AbstractSafeParcelable {
    public static final Creator<zzayi> CREATOR = new C16351wo();

    /* renamed from: a */
    String f46223a;

    public zzayi(String str) {
        this.f46223a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f46223a, false);
        C15469b.m32197c(parcel, a);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.p1030c.C14910a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzacm extends AbstractSafeParcelable {
    public static final Creator<zzacm> CREATOR = new C15716be();

    /* renamed from: a */
    public final String f46061a;

    public zzacm(C14910a aVar) {
        this.f46061a = aVar.f38452a;
    }

    zzacm(String str) {
        this.f46061a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 15, this.f46061a, false);
        C15469b.m32197c(parcel, a);
    }
}

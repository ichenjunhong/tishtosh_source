package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.C15040j;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzacq extends AbstractSafeParcelable {
    public static final Creator<zzacq> CREATOR = new C15720bg();

    /* renamed from: a */
    public final boolean f46062a;

    /* renamed from: b */
    public final boolean f46063b;

    /* renamed from: c */
    public final boolean f46064c;

    public zzacq(C15040j jVar) {
        this(jVar.f38866a, jVar.f38867b, jVar.f38868c);
    }

    public zzacq(boolean z, boolean z2, boolean z3) {
        this.f46062a = z;
        this.f46063b = z2;
        this.f46064c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32189a(parcel, 2, this.f46062a);
        C15469b.m32189a(parcel, 3, this.f46063b);
        C15469b.m32189a(parcel, 4, this.f46064c);
        C15469b.m32197c(parcel, a);
    }
}

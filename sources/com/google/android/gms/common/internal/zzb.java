package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzb extends AbstractSafeParcelable {
    public static final Creator<zzb> CREATOR = new C15413ad();

    /* renamed from: a */
    Bundle f39883a;

    /* renamed from: b */
    Feature[] f39884b;

    zzb(Bundle bundle, Feature[] featureArr) {
        this.f39883a = bundle;
        this.f39884b = featureArr;
    }

    public zzb() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32181a(parcel, 1, this.f39883a, false);
        C15469b.m32191a(parcel, 2, (T[]) this.f39884b, i, false);
        C15469b.m32197c(parcel, a);
    }
}

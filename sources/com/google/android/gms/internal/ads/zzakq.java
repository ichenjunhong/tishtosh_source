package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzakq extends AbstractSafeParcelable {
    public static final Creator<zzakq> CREATOR = new C15988jc();

    /* renamed from: a */
    public final String f46088a;

    /* renamed from: b */
    public final Bundle f46089b;

    public zzakq(String str, Bundle bundle) {
        this.f46088a = str;
        this.f46089b = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 1, this.f46088a, false);
        C15469b.m32181a(parcel, 2, this.f46089b, false);
        C15469b.m32197c(parcel, a);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzbql extends AbstractSafeParcelable {
    public static final Creator<zzbql> CREATOR = new aoz();

    /* renamed from: a */
    private final int f46242a;

    /* renamed from: b */
    private final byte[] f46243b;

    zzbql(int i, byte[] bArr) {
        this.f46242a = i;
        this.f46243b = bArr;
    }

    public zzbql(byte[] bArr) {
        this(1, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46242a);
        C15469b.m32190a(parcel, 2, this.f46243b, false);
        C15469b.m32197c(parcel, a);
    }
}

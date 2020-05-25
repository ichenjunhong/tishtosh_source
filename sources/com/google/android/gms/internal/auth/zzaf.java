package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzaf extends AbstractSafeParcelable {
    public static final Creator<zzaf> CREATOR = new C16456d();

    /* renamed from: a */
    private final int f46364a = 1;

    /* renamed from: b */
    private final String f46365b;

    /* renamed from: c */
    private final byte[] f46366c;

    zzaf(int i, String str, byte[] bArr) {
        this.f46365b = (String) C15464q.m32123a(str);
        this.f46366c = (byte[]) C15464q.m32123a(bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46364a);
        C15469b.m32187a(parcel, 2, this.f46365b, false);
        C15469b.m32190a(parcel, 3, this.f46366c, false);
        C15469b.m32197c(parcel, a);
    }
}

package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzab extends AbstractSafeParcelable {
    public static final Creator<zzab> CREATOR = new C16454b();

    /* renamed from: a */
    private final int f46359a = 1;

    /* renamed from: b */
    private final String f46360b;

    /* renamed from: c */
    private final int f46361c;

    zzab(int i, String str, int i2) {
        this.f46360b = (String) C15464q.m32123a(str);
        this.f46361c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46359a);
        C15469b.m32187a(parcel, 2, this.f46360b, false);
        C15469b.m32195b(parcel, 3, this.f46361c);
        C15469b.m32197c(parcel, a);
    }
}

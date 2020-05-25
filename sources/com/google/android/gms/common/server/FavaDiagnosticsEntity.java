package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<FavaDiagnosticsEntity> CREATOR = new C15487a();

    /* renamed from: a */
    private final int f39900a;

    /* renamed from: b */
    private final String f39901b;

    /* renamed from: c */
    private final int f39902c;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f39900a = i;
        this.f39901b = str;
        this.f39902c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39900a);
        C15469b.m32187a(parcel, 2, this.f39901b, false);
        C15469b.m32195b(parcel, 3, this.f39902c);
        C15469b.m32197c(parcel, a);
    }
}

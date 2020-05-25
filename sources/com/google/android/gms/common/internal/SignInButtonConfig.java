package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Creator<SignInButtonConfig> CREATOR = new C15411ab();

    /* renamed from: a */
    public final int f39752a;

    /* renamed from: b */
    public final int f39753b;

    /* renamed from: c */
    public final Scope[] f39754c;

    /* renamed from: d */
    private final int f39755d;

    SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.f39755d = i;
        this.f39752a = i2;
        this.f39753b = i3;
        this.f39754c = scopeArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39755d);
        C15469b.m32195b(parcel, 2, this.f39752a);
        C15469b.m32195b(parcel, 3, this.f39753b);
        C15469b.m32191a(parcel, 4, (T[]) this.f39754c, i, false);
        C15469b.m32197c(parcel, a);
    }
}

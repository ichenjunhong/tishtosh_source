package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C15148c();

    /* renamed from: a */
    public int f39171a;

    /* renamed from: b */
    private final int f39172b;

    /* renamed from: c */
    private Bundle f39173c;

    GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f39172b = i;
        this.f39171a = i2;
        this.f39173c = bundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39172b);
        C15469b.m32195b(parcel, 2, this.f39171a);
        C15469b.m32181a(parcel, 3, this.f39173c, false);
        C15469b.m32197c(parcel, a);
    }
}

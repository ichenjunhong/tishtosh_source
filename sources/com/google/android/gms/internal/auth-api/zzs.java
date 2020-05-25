package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzs extends AbstractSafeParcelable {
    public static final Creator<zzs> CREATOR = new C16449f();

    /* renamed from: a */
    private final Credential f46354a;

    public zzs(Credential credential) {
        this.f46354a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 1, (Parcelable) this.f46354a, i, false);
        C15469b.m32197c(parcel, a);
    }
}

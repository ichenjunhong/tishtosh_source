package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzy extends AbstractSafeParcelable {
    public static final Creator<zzy> CREATOR = new C16452i();

    /* renamed from: a */
    private final Credential f46355a;

    public zzy(Credential credential) {
        this.f46355a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 1, (Parcelable) this.f46355a, i, false);
        C15469b.m32197c(parcel, a);
    }
}

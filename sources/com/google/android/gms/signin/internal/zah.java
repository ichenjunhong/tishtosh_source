package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zah extends AbstractSafeParcelable {
    public static final Creator<zah> CREATOR = new C17155h();

    /* renamed from: a */
    private final int f48540a;

    /* renamed from: b */
    private final ResolveAccountRequest f48541b;

    zah(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f48540a = i;
        this.f48541b = resolveAccountRequest;
    }

    public zah(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f48540a);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f48541b, i, false);
        C15469b.m32197c(parcel, a);
    }
}

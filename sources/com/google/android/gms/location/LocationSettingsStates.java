package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Creator<LocationSettingsStates> CREATOR = new C16895n();

    /* renamed from: a */
    public final boolean f47643a;

    /* renamed from: b */
    public final boolean f47644b;

    /* renamed from: c */
    public final boolean f47645c;

    /* renamed from: d */
    public final boolean f47646d;

    /* renamed from: e */
    public final boolean f47647e;

    /* renamed from: f */
    public final boolean f47648f;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f47643a = z;
        this.f47644b = z2;
        this.f47645c = z3;
        this.f47646d = z4;
        this.f47647e = z5;
        this.f47648f = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32189a(parcel, 1, this.f47643a);
        C15469b.m32189a(parcel, 2, this.f47644b);
        C15469b.m32189a(parcel, 3, this.f47645c);
        C15469b.m32189a(parcel, 4, this.f47646d);
        C15469b.m32189a(parcel, 5, this.f47647e);
        C15469b.m32189a(parcel, 6, this.f47648f);
        C15469b.m32197c(parcel, a);
    }
}

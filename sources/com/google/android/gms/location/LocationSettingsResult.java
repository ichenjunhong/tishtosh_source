package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class LocationSettingsResult extends AbstractSafeParcelable implements C15358j {
    public static final Creator<LocationSettingsResult> CREATOR = new C16894m();

    /* renamed from: a */
    public final LocationSettingsStates f47641a;

    /* renamed from: b */
    private final Status f47642b;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f47642b = status;
        this.f47641a = locationSettingsStates;
    }

    /* renamed from: a */
    public final Status mo27935a() {
        return this.f47642b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 1, (Parcelable) mo27935a(), i, false);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f47641a, i, false);
        C15469b.m32197c(parcel, a);
    }
}

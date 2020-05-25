package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Creator<LocationSettingsRequest> CREATOR = new C16893l();

    /* renamed from: a */
    private final List<LocationRequest> f47637a;

    /* renamed from: b */
    private final boolean f47638b;

    /* renamed from: c */
    private final boolean f47639c;

    /* renamed from: d */
    private zzae f47640d;

    LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2, zzae zzae) {
        this.f47637a = list;
        this.f47638b = z;
        this.f47639c = z2;
        this.f47640d = zzae;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32196b(parcel, 1, Collections.unmodifiableList(this.f47637a), false);
        C15469b.m32189a(parcel, 2, this.f47638b);
        C15469b.m32189a(parcel, 3, this.f47639c);
        C15469b.m32183a(parcel, 5, (Parcelable) this.f47640d, i, false);
        C15469b.m32197c(parcel, a);
    }
}

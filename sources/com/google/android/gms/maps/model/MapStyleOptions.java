package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Creator<MapStyleOptions> CREATOR = new C16963l();

    /* renamed from: a */
    private static final String f47767a = "MapStyleOptions";

    /* renamed from: b */
    private String f47768b;

    public MapStyleOptions(String str) {
        this.f47768b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f47768b, false);
        C15469b.m32197c(parcel, a);
    }
}

package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class Tile extends AbstractSafeParcelable {
    public static final Creator<Tile> CREATOR = new C16974w();

    /* renamed from: a */
    public final int f47828a;

    /* renamed from: b */
    public final int f47829b;

    /* renamed from: c */
    public final byte[] f47830c;

    public Tile(int i, int i2, byte[] bArr) {
        this.f47828a = i;
        this.f47829b = i2;
        this.f47830c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 2, this.f47828a);
        C15469b.m32195b(parcel, 3, this.f47829b);
        C15469b.m32190a(parcel, 4, this.f47830c, false);
        C15469b.m32197c(parcel, a);
    }
}

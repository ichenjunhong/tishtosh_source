package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzaco extends zzyz {
    public zzaco(zzyz zzyz) {
        super(zzyz.f46338a, zzyz.f46339b, zzyz.f46340c, zzyz.f46341d, zzyz.f46342e, zzyz.f46343f, zzyz.f46344g, zzyz.f46345h, zzyz.f46346i, zzyz.f46347j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f46338a, false);
        C15469b.m32195b(parcel, 3, this.f46339b);
        C15469b.m32195b(parcel, 6, this.f46342e);
        C15469b.m32197c(parcel, a);
    }
}

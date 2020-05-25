package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.internal.ads.C16299uq;

@C16299uq
public final class zzar extends AbstractSafeParcelable {
    public static final Creator<zzar> CREATOR = new C15032s();

    /* renamed from: a */
    public final boolean f38857a;

    /* renamed from: b */
    public final boolean f38858b;

    /* renamed from: c */
    public final boolean f38859c;

    /* renamed from: d */
    public final float f38860d;

    /* renamed from: e */
    public final int f38861e;

    /* renamed from: f */
    public final boolean f38862f;

    /* renamed from: g */
    public final boolean f38863g;

    /* renamed from: h */
    public final boolean f38864h;

    /* renamed from: i */
    private final String f38865i;

    public zzar(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, i, z4, z5, z6);
    }

    zzar(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.f38857a = z;
        this.f38858b = z2;
        this.f38865i = str;
        this.f38859c = z3;
        this.f38860d = f;
        this.f38861e = i;
        this.f38862f = z4;
        this.f38863g = z5;
        this.f38864h = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32189a(parcel, 2, this.f38857a);
        C15469b.m32189a(parcel, 3, this.f38858b);
        C15469b.m32187a(parcel, 4, this.f38865i, false);
        C15469b.m32189a(parcel, 5, this.f38859c);
        C15469b.m32178a(parcel, 6, this.f38860d);
        C15469b.m32195b(parcel, 7, this.f38861e);
        C15469b.m32189a(parcel, 8, this.f38862f);
        C15469b.m32189a(parcel, 9, this.f38863g);
        C15469b.m32189a(parcel, 10, this.f38864h);
        C15469b.m32197c(parcel, a);
    }
}

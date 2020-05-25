package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzbqo extends AbstractSafeParcelable {
    public static final Creator<zzbqo> CREATOR = new apb();

    /* renamed from: a */
    private final int f46244a;

    /* renamed from: b */
    private final String f46245b;

    /* renamed from: c */
    private final String f46246c;

    zzbqo(int i, String str, String str2) {
        this.f46244a = i;
        this.f46245b = str;
        this.f46246c = str2;
    }

    public zzbqo(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46244a);
        C15469b.m32187a(parcel, 2, this.f46245b, false);
        C15469b.m32187a(parcel, 3, this.f46246c, false);
        C15469b.m32197c(parcel, a);
    }
}

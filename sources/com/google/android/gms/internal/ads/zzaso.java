package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.mediation.C15078t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.taobao.android.dexposed.ClassUtils;

@C16299uq
public final class zzaso extends AbstractSafeParcelable {
    public static final Creator<zzaso> CREATOR = new C16198qx();

    /* renamed from: a */
    private final int f46091a;

    /* renamed from: b */
    private final int f46092b;

    /* renamed from: c */
    private final int f46093c;

    /* renamed from: a */
    public static zzaso m39269a(C15078t tVar) {
        throw new NoSuchMethodError();
    }

    zzaso(int i, int i2, int i3) {
        this.f46091a = i;
        this.f46092b = i2;
        this.f46093c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46091a);
        C15469b.m32195b(parcel, 2, this.f46092b);
        C15469b.m32195b(parcel, 3, this.f46093c);
        C15469b.m32197c(parcel, a);
    }

    public final String toString() {
        int i = this.f46091a;
        int i2 = this.f46092b;
        int i3 = this.f46093c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(i2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(i3);
        return sb.toString();
    }
}

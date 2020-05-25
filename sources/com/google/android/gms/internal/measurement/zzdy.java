package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzdy extends AbstractSafeParcelable {
    public static final Creator<zzdy> CREATOR = new C16595cl();

    /* renamed from: a */
    public final long f47591a;

    /* renamed from: b */
    public final long f47592b;

    /* renamed from: c */
    public final boolean f47593c;

    /* renamed from: d */
    public final String f47594d;

    /* renamed from: e */
    public final String f47595e;

    /* renamed from: f */
    public final String f47596f;

    /* renamed from: g */
    public final Bundle f47597g;

    zzdy(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f47591a = j;
        this.f47592b = j2;
        this.f47593c = z;
        this.f47594d = str;
        this.f47595e = str2;
        this.f47596f = str3;
        this.f47597g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32180a(parcel, 1, this.f47591a);
        C15469b.m32180a(parcel, 2, this.f47592b);
        C15469b.m32189a(parcel, 3, this.f47593c);
        C15469b.m32187a(parcel, 4, this.f47594d, false);
        C15469b.m32187a(parcel, 5, this.f47595e, false);
        C15469b.m32187a(parcel, 6, this.f47596f, false);
        C15469b.m32181a(parcel, 7, this.f47597g, false);
        C15469b.m32197c(parcel, a);
    }
}

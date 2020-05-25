package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

public final class zam extends AbstractSafeParcelable {
    public static final Creator<zam> CREATOR = new C15493b();

    /* renamed from: a */
    final String f39936a;

    /* renamed from: b */
    final Field<?, ?> f39937b;

    /* renamed from: c */
    private final int f39938c;

    zam(int i, String str, Field<?, ?> field) {
        this.f39938c = i;
        this.f39936a = str;
        this.f39937b = field;
    }

    zam(String str, Field<?, ?> field) {
        this.f39938c = 1;
        this.f39936a = str;
        this.f39937b = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39938c);
        C15469b.m32187a(parcel, 2, this.f39936a, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f39937b, i, false);
        C15469b.m32197c(parcel, a);
    }
}

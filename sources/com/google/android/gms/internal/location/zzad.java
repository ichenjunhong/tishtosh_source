package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzad extends AbstractSafeParcelable implements C15358j {
    public static final Creator<zzad> CREATOR = new C16504b();

    /* renamed from: a */
    private static final zzad f46411a = new zzad(Status.f39265a);

    /* renamed from: b */
    private final Status f46412b;

    public zzad(Status status) {
        this.f46412b = status;
    }

    /* renamed from: a */
    public final Status mo27935a() {
        return this.f46412b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 1, (Parcelable) mo27935a(), i, false);
        C15469b.m32197c(parcel, a);
    }
}

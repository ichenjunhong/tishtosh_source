package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zaa extends AbstractSafeParcelable implements C15358j {
    public static final Creator<zaa> CREATOR = new C17149b();

    /* renamed from: a */
    private final int f48537a;

    /* renamed from: b */
    private int f48538b;

    /* renamed from: c */
    private Intent f48539c;

    zaa(int i, int i2, Intent intent) {
        this.f48537a = i;
        this.f48538b = i2;
        this.f48539c = intent;
    }

    public zaa() {
        this(0, null);
    }

    private zaa(int i, Intent intent) {
        this(2, 0, null);
    }

    /* renamed from: a */
    public final Status mo27935a() {
        if (this.f48538b == 0) {
            return Status.f39265a;
        }
        return Status.f39269e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f48537a);
        C15469b.m32195b(parcel, 2, this.f48538b);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f48539c, i, false);
        C15469b.m32197c(parcel, a);
    }
}

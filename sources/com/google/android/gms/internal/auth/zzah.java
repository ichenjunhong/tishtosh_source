package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzah extends AbstractSafeParcelable {
    public static final Creator<zzah> CREATOR = new C16457e();

    /* renamed from: a */
    private final int f46367a = 1;

    /* renamed from: b */
    private final String f46368b;

    /* renamed from: c */
    private final PendingIntent f46369c;

    zzah(int i, String str, PendingIntent pendingIntent) {
        this.f46368b = (String) C15464q.m32123a(str);
        this.f46369c = (PendingIntent) C15464q.m32123a(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46367a);
        C15469b.m32187a(parcel, 2, this.f46368b, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f46369c, i, false);
        C15469b.m32197c(parcel, a);
    }
}

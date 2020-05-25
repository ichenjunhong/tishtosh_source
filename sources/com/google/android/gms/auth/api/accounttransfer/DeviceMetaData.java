package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Creator<DeviceMetaData> CREATOR = new C15115e();

    /* renamed from: a */
    public boolean f39018a;

    /* renamed from: b */
    public long f39019b;

    /* renamed from: c */
    public final boolean f39020c;

    /* renamed from: d */
    private final int f39021d;

    DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.f39021d = i;
        this.f39018a = z;
        this.f39019b = j;
        this.f39020c = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39021d);
        C15469b.m32189a(parcel, 2, this.f39018a);
        C15469b.m32180a(parcel, 3, this.f39019b);
        C15469b.m32189a(parcel, 4, this.f39020c);
        C15469b.m32197c(parcel, a);
    }
}

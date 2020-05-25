package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15453l.C15454a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountResponse> CREATOR = new C15410aa();

    /* renamed from: a */
    public ConnectionResult f39747a;

    /* renamed from: b */
    public boolean f39748b;

    /* renamed from: c */
    public boolean f39749c;

    /* renamed from: d */
    private final int f39750d;

    /* renamed from: e */
    private IBinder f39751e;

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f39750d = i;
        this.f39751e = iBinder;
        this.f39747a = connectionResult;
        this.f39748b = z;
        this.f39749c = z2;
    }

    /* renamed from: a */
    public final C15453l mo28358a() {
        return C15454a.m32109a(this.f39751e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39750d);
        C15469b.m32182a(parcel, 2, this.f39751e, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f39747a, i, false);
        C15469b.m32189a(parcel, 4, this.f39748b);
        C15469b.m32189a(parcel, 5, this.f39749c);
        C15469b.m32197c(parcel, a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f39747a.equals(resolveAccountResponse.f39747a) && mo28358a().equals(resolveAccountResponse.mo28358a());
    }
}

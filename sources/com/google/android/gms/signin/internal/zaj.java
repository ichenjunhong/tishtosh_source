package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zaj extends AbstractSafeParcelable {
    public static final Creator<zaj> CREATOR = new C17156i();

    /* renamed from: a */
    public final ConnectionResult f48542a;

    /* renamed from: b */
    public final ResolveAccountResponse f48543b;

    /* renamed from: c */
    private final int f48544c;

    zaj(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f48544c = i;
        this.f48542a = connectionResult;
        this.f48543b = resolveAccountResponse;
    }

    public zaj(int i) {
        this(new ConnectionResult(8, null), null);
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f48544c);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f48542a, i, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f48543b, i, false);
        C15469b.m32197c(parcel, a);
    }
}

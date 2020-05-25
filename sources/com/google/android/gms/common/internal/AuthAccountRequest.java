package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Creator<AuthAccountRequest> CREATOR = new C15470t();

    /* renamed from: a */
    public Integer f39720a;

    /* renamed from: b */
    public Integer f39721b;

    /* renamed from: c */
    private final int f39722c;

    /* renamed from: d */
    private final IBinder f39723d;

    /* renamed from: e */
    private final Scope[] f39724e;

    /* renamed from: f */
    private Account f39725f;

    AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account) {
        this.f39722c = i;
        this.f39723d = iBinder;
        this.f39724e = scopeArr;
        this.f39720a = num;
        this.f39721b = num2;
        this.f39725f = account;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39722c);
        C15469b.m32182a(parcel, 2, this.f39723d, false);
        C15469b.m32191a(parcel, 3, (T[]) this.f39724e, i, false);
        C15469b.m32185a(parcel, 4, this.f39720a, false);
        C15469b.m32185a(parcel, 5, this.f39721b, false);
        C15469b.m32183a(parcel, 6, (Parcelable) this.f39725f, i, false);
        C15469b.m32197c(parcel, a);
    }
}

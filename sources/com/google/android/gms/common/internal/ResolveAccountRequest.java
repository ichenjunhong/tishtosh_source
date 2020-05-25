package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountRequest> CREATOR = new C15476z();

    /* renamed from: a */
    public final Account f39743a;

    /* renamed from: b */
    public final int f39744b;

    /* renamed from: c */
    public final GoogleSignInAccount f39745c;

    /* renamed from: d */
    private final int f39746d;

    ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f39746d = i;
        this.f39743a = account;
        this.f39744b = i2;
        this.f39745c = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39746d);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f39743a, i, false);
        C15469b.m32195b(parcel, 3, this.f39744b);
        C15469b.m32183a(parcel, 4, (Parcelable) this.f39745c, i, false);
        C15469b.m32197c(parcel, a);
    }
}

package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInAccount> CREATOR = new C15144h();

    /* renamed from: a */
    public GoogleSignInAccount f39164a;

    /* renamed from: b */
    private String f39165b;

    /* renamed from: c */
    private String f39166c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f39164a = googleSignInAccount;
        this.f39165b = C15464q.m32126a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f39166c = C15464q.m32126a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 4, this.f39165b, false);
        C15469b.m32183a(parcel, 7, (Parcelable) this.f39164a, i, false);
        C15469b.m32187a(parcel, 8, this.f39166c, false);
        C15469b.m32197c(parcel, a);
    }
}

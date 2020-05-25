package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEventsRequest> CREATOR = new C15169b();

    /* renamed from: a */
    public int f38989a;

    /* renamed from: b */
    public String f38990b;

    /* renamed from: c */
    public Account f38991c;

    /* renamed from: d */
    private final int f38992d;

    AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f38992d = i;
        this.f38989a = i2;
        this.f38990b = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f38991c = account;
        } else {
            this.f38991c = new Account(str, "com.google");
        }
    }

    public AccountChangeEventsRequest() {
        this.f38992d = 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f38992d);
        C15469b.m32195b(parcel, 2, this.f38989a);
        C15469b.m32187a(parcel, 3, this.f38990b, false);
        C15469b.m32183a(parcel, 4, (Parcelable) this.f38991c, i, false);
        C15469b.m32197c(parcel, a);
    }
}

package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEvent> CREATOR = new C15105a();

    /* renamed from: a */
    public final String f38983a;

    /* renamed from: b */
    public final int f38984b;

    /* renamed from: c */
    public final int f38985c;

    /* renamed from: d */
    public final String f38986d;

    /* renamed from: e */
    private final int f38987e;

    /* renamed from: f */
    private final long f38988f;

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f38987e = i;
        this.f38988f = j;
        this.f38983a = (String) C15464q.m32123a(str);
        this.f38984b = i2;
        this.f38985c = i3;
        this.f38986d = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f38987e);
        C15469b.m32180a(parcel, 2, this.f38988f);
        C15469b.m32187a(parcel, 3, this.f38983a, false);
        C15469b.m32195b(parcel, 4, this.f38984b);
        C15469b.m32195b(parcel, 5, this.f38985c);
        C15469b.m32187a(parcel, 6, this.f38986d, false);
        C15469b.m32197c(parcel, a);
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.f38984b) {
            case 1:
                str = "ADDED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "RENAMED_FROM";
                break;
            case 4:
                str = "RENAMED_TO";
                break;
        }
        String str2 = this.f38983a;
        String str3 = this.f38986d;
        int i = this.f38985c;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f38987e), Long.valueOf(this.f38988f), this.f38983a, Integer.valueOf(this.f38984b), Integer.valueOf(this.f38985c), this.f38986d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f38987e == accountChangeEvent.f38987e && this.f38988f == accountChangeEvent.f38988f && C15462p.m32120a(this.f38983a, accountChangeEvent.f38983a) && this.f38984b == accountChangeEvent.f38984b && this.f38985c == accountChangeEvent.f38985c && C15462p.m32120a(this.f38986d, accountChangeEvent.f38986d);
    }
}

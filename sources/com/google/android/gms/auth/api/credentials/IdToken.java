package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<IdToken> CREATOR = new C15127h();

    /* renamed from: a */
    public final String f39094a;

    /* renamed from: b */
    public final String f39095b;

    public IdToken(String str, String str2) {
        C15464q.m32134b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C15464q.m32134b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f39094a = str;
        this.f39095b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 1, this.f39094a, false);
        C15469b.m32187a(parcel, 2, this.f39095b, false);
        C15469b.m32197c(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return C15462p.m32120a(this.f39094a, idToken.f39094a) && C15462p.m32120a(this.f39095b, idToken.f39095b);
    }
}

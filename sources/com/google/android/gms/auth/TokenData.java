package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.List;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<TokenData> CREATOR = new C15171d();

    /* renamed from: a */
    public final String f38995a;

    /* renamed from: b */
    private final int f38996b;

    /* renamed from: c */
    private final Long f38997c;

    /* renamed from: d */
    private final boolean f38998d;

    /* renamed from: e */
    private final boolean f38999e;

    /* renamed from: f */
    private final List<String> f39000f;

    /* renamed from: g */
    private final String f39001g;

    TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list, String str2) {
        this.f38996b = i;
        this.f38995a = C15464q.m32125a(str);
        this.f38997c = l;
        this.f38998d = z;
        this.f38999e = z2;
        this.f39000f = list;
        this.f39001g = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f38995a, tokenData.f38995a) || !C15462p.m32120a(this.f38997c, tokenData.f38997c) || this.f38998d != tokenData.f38998d || this.f38999e != tokenData.f38999e || !C15462p.m32120a(this.f39000f, tokenData.f39000f) || !C15462p.m32120a(this.f39001g, tokenData.f39001g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C15462p.m32118a(this.f38995a, this.f38997c, Boolean.valueOf(this.f38998d), Boolean.valueOf(this.f38999e), this.f39000f, this.f39001g);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f38996b);
        C15469b.m32187a(parcel, 2, this.f38995a, false);
        C15469b.m32186a(parcel, 3, this.f38997c, false);
        C15469b.m32189a(parcel, 4, this.f38998d);
        C15469b.m32189a(parcel, 5, this.f38999e);
        C15469b.m32188a(parcel, 6, this.f39000f, false);
        C15469b.m32187a(parcel, 7, this.f39001g, false);
        C15469b.m32197c(parcel, a);
    }
}

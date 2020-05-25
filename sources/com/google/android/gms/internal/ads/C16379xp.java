package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C15462p;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.xp */
public final class C16379xp extends C16386xw {

    /* renamed from: a */
    private final String f45973a;

    /* renamed from: b */
    private final int f45974b;

    public C16379xp(String str, int i) {
        this.f45973a = str;
        this.f45974b = i;
    }

    /* renamed from: a */
    public final String mo31475a() {
        return this.f45973a;
    }

    /* renamed from: b */
    public final int mo31476b() {
        return this.f45974b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C16379xp)) {
            return false;
        }
        C16379xp xpVar = (C16379xp) obj;
        if (!C15462p.m32120a(this.f45973a, xpVar.f45973a) || !C15462p.m32120a(Integer.valueOf(this.f45974b), Integer.valueOf(xpVar.f45974b))) {
            return false;
        }
        return true;
    }
}

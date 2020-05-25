package com.p683ss.android.ugc.aweme.account.bean;

import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.bean.e */
public final class C20938e {

    /* renamed from: a */
    public final String f56969a;

    /* renamed from: b */
    public final int f56970b;

    /* renamed from: c */
    public final String f56971c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20938e) {
                C20938e eVar = (C20938e) obj;
                if (C52711k.m112239a((Object) this.f56969a, (Object) eVar.f56969a)) {
                    if (!(this.f56970b == eVar.f56970b) || !C52711k.m112239a((Object) this.f56971c, (Object) eVar.f56971c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f56969a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f56970b) * 31;
        String str2 = this.f56971c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlatformInfo(name=");
        sb.append(this.f56969a);
        sb.append(", iconResID=");
        sb.append(this.f56970b);
        sb.append(", type=");
        sb.append(this.f56971c);
        sb.append(")");
        return sb.toString();
    }

    public C20938e(String str, int i, String str2) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(str2, "type");
        this.f56969a = str;
        this.f56970b = i;
        this.f56971c = str2;
    }
}

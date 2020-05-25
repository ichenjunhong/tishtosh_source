package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import com.bytedance.sdk.account.p861f.p862a.C13112k;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.o */
public final class C21671o extends C13112k {

    /* renamed from: a */
    public final String f58702a;

    /* renamed from: b */
    public final int f58703b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21671o) {
                C21671o oVar = (C21671o) obj;
                if (C52711k.m112239a((Object) this.f58702a, (Object) oVar.f58702a)) {
                    if (this.f58703b == oVar.f58703b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f58702a;
        return ((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.f58703b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmailVerifyQueryObj(code=");
        sb.append(this.f58702a);
        sb.append(", type=");
        sb.append(this.f58703b);
        sb.append(")");
        return sb.toString();
    }

    public C21671o(String str, int i) {
        C52711k.m112240b(str, "code");
        super(22);
        this.f58702a = str;
        this.f58703b = i;
    }
}

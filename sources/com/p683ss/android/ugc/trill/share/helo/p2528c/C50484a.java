package com.p683ss.android.ugc.trill.share.helo.p2528c;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.trill.share.helo.c.a */
public final class C50484a extends BaseResponse {
    @C17952c(mo34828a = "bind_helo_status")

    /* renamed from: a */
    public final int f126553a;
    @C17952c(mo34828a = "accredit_helo_status")

    /* renamed from: b */
    public final int f126554b;

    public C50484a() {
        this(0, 0, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C50484a) {
                C50484a aVar = (C50484a) obj;
                if (this.f126553a == aVar.f126553a) {
                    if (this.f126554b == aVar.f126554b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.f126553a) * 31) + Integer.hashCode(this.f126554b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserHeloConfiguration(bindHeloStatus=");
        sb.append(this.f126553a);
        sb.append(", accreditHeloStatus=");
        sb.append(this.f126554b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo98382a() {
        if (this.f126553a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo98383b() {
        if (this.f126554b == 1) {
            return true;
        }
        return false;
    }

    private C50484a(int i, int i2) {
        this.f126553a = i;
        this.f126554b = i2;
    }

    private /* synthetic */ C50484a(int i, int i2, int i3, C52707g gVar) {
        this(0, 0);
    }
}

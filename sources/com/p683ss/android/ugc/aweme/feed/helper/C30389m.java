package com.p683ss.android.ugc.aweme.feed.helper;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.m */
public final class C30389m {

    /* renamed from: a */
    public final String f79447a;

    /* renamed from: b */
    public final int f79448b;

    /* renamed from: c */
    public final long f79449c;

    /* renamed from: d */
    public final String f79450d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C30389m) {
                C30389m mVar = (C30389m) obj;
                if (C52711k.m112239a((Object) this.f79447a, (Object) mVar.f79447a)) {
                    if (this.f79448b == mVar.f79448b) {
                        if (!(this.f79449c == mVar.f79449c) || !C52711k.m112239a((Object) this.f79450d, (Object) mVar.f79450d)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f79447a;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.f79448b)) * 31) + Long.hashCode(this.f79449c)) * 31;
        String str2 = this.f79450d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewUserBehavior(gid=");
        sb.append(this.f79447a);
        sb.append(", action=");
        sb.append(this.f79448b);
        sb.append(", actionTime=");
        sb.append(this.f79449c);
        sb.append(", eventType=");
        sb.append(this.f79450d);
        sb.append(")");
        return sb.toString();
    }

    public C30389m(String str, int i, long j, String str2) {
        C52711k.m112240b(str, "gid");
        C52711k.m112240b(str2, "eventType");
        this.f79447a = str;
        this.f79448b = i;
        this.f79449c = j;
        this.f79450d = str2;
    }
}

package com.p683ss.android.ugc.aweme.userservice.api;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.userservice.api.a */
public final class C47589a {

    /* renamed from: a */
    public final String f120042a;

    /* renamed from: b */
    public final String f120043b;

    /* renamed from: c */
    public final int f120044c;

    /* renamed from: d */
    public final int f120045d;

    /* renamed from: e */
    public final int f120046e;

    /* renamed from: f */
    public final String f120047f;

    /* renamed from: g */
    public final int f120048g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47589a) {
                C47589a aVar = (C47589a) obj;
                if (C52711k.m112239a((Object) this.f120042a, (Object) aVar.f120042a) && C52711k.m112239a((Object) this.f120043b, (Object) aVar.f120043b)) {
                    if (this.f120044c == aVar.f120044c) {
                        if (this.f120045d == aVar.f120045d) {
                            if ((this.f120046e == aVar.f120046e) && C52711k.m112239a((Object) this.f120047f, (Object) aVar.f120047f)) {
                                if (this.f120048g == aVar.f120048g) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f120042a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f120043b;
        int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f120044c) * 31) + this.f120045d) * 31) + this.f120046e) * 31;
        String str3 = this.f120047f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f120048g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowRequestParam(userId=");
        sb.append(this.f120042a);
        sb.append(", secUserId=");
        sb.append(this.f120043b);
        sb.append(", type=");
        sb.append(this.f120044c);
        sb.append(", channelId=");
        sb.append(this.f120045d);
        sb.append(", from=");
        sb.append(this.f120046e);
        sb.append(", itemId=");
        sb.append(this.f120047f);
        sb.append(", fromPreviousPage=");
        sb.append(this.f120048g);
        sb.append(")");
        return sb.toString();
    }

    public C47589a(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        C52711k.m112240b(str, "userId");
        C52711k.m112240b(str2, "secUserId");
        this.f120042a = str;
        this.f120043b = str2;
        this.f120044c = i;
        this.f120045d = i2;
        this.f120046e = i3;
        this.f120047f = str3;
        this.f120048g = i4;
    }
}

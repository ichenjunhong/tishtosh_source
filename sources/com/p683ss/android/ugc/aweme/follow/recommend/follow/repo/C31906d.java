package com.p683ss.android.ugc.aweme.follow.recommend.follow.repo;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.d */
public final class C31906d {

    /* renamed from: a */
    public final int f83343a;

    /* renamed from: b */
    public final int f83344b;

    /* renamed from: c */
    public final String f83345c;

    /* renamed from: d */
    public final int f83346d;

    /* renamed from: e */
    public final int f83347e;

    /* renamed from: f */
    public final int f83348f;

    /* renamed from: g */
    public final String f83349g;

    /* renamed from: h */
    public final int f83350h;

    /* renamed from: i */
    public final String f83351i;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31906d) {
                C31906d dVar = (C31906d) obj;
                if (this.f83343a == dVar.f83343a) {
                    if ((this.f83344b == dVar.f83344b) && C52711k.m112239a((Object) this.f83345c, (Object) dVar.f83345c)) {
                        if (this.f83346d == dVar.f83346d) {
                            if (this.f83347e == dVar.f83347e) {
                                if ((this.f83348f == dVar.f83348f) && C52711k.m112239a((Object) this.f83349g, (Object) dVar.f83349g)) {
                                    if (!(this.f83350h == dVar.f83350h) || !C52711k.m112239a((Object) this.f83351i, (Object) dVar.f83351i)) {
                                        return false;
                                    }
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
        int hashCode = ((Integer.hashCode(this.f83343a) * 31) + Integer.hashCode(this.f83344b)) * 31;
        String str = this.f83345c;
        int i = 0;
        int hashCode2 = (((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.f83346d)) * 31) + Integer.hashCode(this.f83347e)) * 31) + Integer.hashCode(this.f83348f)) * 31;
        String str2 = this.f83349g;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.f83350h)) * 31;
        String str3 = this.f83351i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendFollowRequestParam(count=");
        sb.append(this.f83343a);
        sb.append(", cursor=");
        sb.append(this.f83344b);
        sb.append(", targetUserId=");
        sb.append(this.f83345c);
        sb.append(", recommendType=");
        sb.append(this.f83346d);
        sb.append(", yellowPointCount=");
        sb.append(this.f83347e);
        sb.append(", addressBookAccess=");
        sb.append(this.f83348f);
        sb.append(", recImprUsers=");
        sb.append(this.f83349g);
        sb.append(", gpsAccess=");
        sb.append(this.f83350h);
        sb.append(", secTargetUserId=");
        sb.append(this.f83351i);
        sb.append(")");
        return sb.toString();
    }

    public C31906d(int i, int i2, String str, int i3, int i4, int i5, String str2, int i6, String str3) {
        this.f83343a = i;
        this.f83344b = i2;
        this.f83345c = str;
        this.f83346d = i3;
        this.f83347e = i4;
        this.f83348f = i5;
        this.f83349g = str2;
        this.f83350h = i6;
        this.f83351i = str3;
    }
}

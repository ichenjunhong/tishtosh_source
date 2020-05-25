package com.p683ss.android.ugc.aweme.friends.recommendlist.repository;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.g */
public final class C32609g {

    /* renamed from: a */
    public final Integer f84851a;

    /* renamed from: b */
    public final Integer f84852b;

    /* renamed from: c */
    public final String f84853c;

    /* renamed from: d */
    public final int f84854d;

    /* renamed from: e */
    public final Integer f84855e;

    /* renamed from: f */
    public final Integer f84856f;

    /* renamed from: g */
    public final String f84857g;

    /* renamed from: h */
    public final String f84858h;

    /* renamed from: i */
    public final Integer f84859i;

    /* renamed from: j */
    public final String f84860j;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32609g) {
                C32609g gVar = (C32609g) obj;
                if (C52711k.m112239a((Object) this.f84851a, (Object) gVar.f84851a) && C52711k.m112239a((Object) this.f84852b, (Object) gVar.f84852b) && C52711k.m112239a((Object) this.f84853c, (Object) gVar.f84853c)) {
                    if (!(this.f84854d == gVar.f84854d) || !C52711k.m112239a((Object) this.f84855e, (Object) gVar.f84855e) || !C52711k.m112239a((Object) this.f84856f, (Object) gVar.f84856f) || !C52711k.m112239a((Object) this.f84857g, (Object) gVar.f84857g) || !C52711k.m112239a((Object) this.f84858h, (Object) gVar.f84858h) || !C52711k.m112239a((Object) this.f84859i, (Object) gVar.f84859i) || !C52711k.m112239a((Object) this.f84860j, (Object) gVar.f84860j)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f84851a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f84852b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.f84853c;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.f84854d)) * 31;
        Integer num3 = this.f84855e;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f84856f;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str2 = this.f84857g;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f84858h;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num5 = this.f84859i;
        int hashCode8 = (hashCode7 + (num5 != null ? num5.hashCode() : 0)) * 31;
        String str4 = this.f84860j;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendListUserRequestParams(count=");
        sb.append(this.f84851a);
        sb.append(", cursor=");
        sb.append(this.f84852b);
        sb.append(", targetUserId=");
        sb.append(this.f84853c);
        sb.append(", recommendType=");
        sb.append(this.f84854d);
        sb.append(", yellowPointCount=");
        sb.append(this.f84855e);
        sb.append(", addressBookAccess=");
        sb.append(this.f84856f);
        sb.append(", recImprUsers=");
        sb.append(this.f84857g);
        sb.append(", pushUserId=");
        sb.append(this.f84858h);
        sb.append(", gpsAccess=");
        sb.append(this.f84859i);
        sb.append(", secTargetUserId=");
        sb.append(this.f84860j);
        sb.append(")");
        return sb.toString();
    }

    public C32609g(Integer num, Integer num2, String str, int i, Integer num3, Integer num4, String str2, String str3, Integer num5, String str4) {
        this.f84851a = num;
        this.f84852b = num2;
        this.f84853c = str;
        this.f84854d = i;
        this.f84855e = num3;
        this.f84856f = num4;
        this.f84857g = str2;
        this.f84858h = str3;
        this.f84859i = num5;
        this.f84860j = str4;
    }
}

package com.p683ss.android.ugc.aweme.friends.recommendlist.repository;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.e */
public final class C32606e {

    /* renamed from: a */
    public final Integer f84839a;

    /* renamed from: b */
    public final Integer f84840b;

    /* renamed from: c */
    public final String f84841c;

    /* renamed from: d */
    public final int f84842d;

    /* renamed from: e */
    public final Integer f84843e;

    /* renamed from: f */
    public final Integer f84844f;

    /* renamed from: g */
    public final String f84845g;

    /* renamed from: h */
    public final String f84846h;

    /* renamed from: i */
    public final Integer f84847i;

    /* renamed from: j */
    public final String f84848j;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32606e) {
                C32606e eVar = (C32606e) obj;
                if (C52711k.m112239a((Object) this.f84839a, (Object) eVar.f84839a) && C52711k.m112239a((Object) this.f84840b, (Object) eVar.f84840b) && C52711k.m112239a((Object) this.f84841c, (Object) eVar.f84841c)) {
                    if (!(this.f84842d == eVar.f84842d) || !C52711k.m112239a((Object) this.f84843e, (Object) eVar.f84843e) || !C52711k.m112239a((Object) this.f84844f, (Object) eVar.f84844f) || !C52711k.m112239a((Object) this.f84845g, (Object) eVar.f84845g) || !C52711k.m112239a((Object) this.f84846h, (Object) eVar.f84846h) || !C52711k.m112239a((Object) this.f84847i, (Object) eVar.f84847i) || !C52711k.m112239a((Object) this.f84848j, (Object) eVar.f84848j)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f84839a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f84840b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.f84841c;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.f84842d)) * 31;
        Integer num3 = this.f84843e;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f84844f;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str2 = this.f84845g;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f84846h;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num5 = this.f84847i;
        int hashCode8 = (hashCode7 + (num5 != null ? num5.hashCode() : 0)) * 31;
        String str4 = this.f84848j;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendListRequestParams(count=");
        sb.append(this.f84839a);
        sb.append(", cursor=");
        sb.append(this.f84840b);
        sb.append(", targetUserId=");
        sb.append(this.f84841c);
        sb.append(", recommendType=");
        sb.append(this.f84842d);
        sb.append(", yellowPointCount=");
        sb.append(this.f84843e);
        sb.append(", addressBookAccess=");
        sb.append(this.f84844f);
        sb.append(", recImprUsers=");
        sb.append(this.f84845g);
        sb.append(", pushUserId=");
        sb.append(this.f84846h);
        sb.append(", gpsAccess=");
        sb.append(this.f84847i);
        sb.append(", secTargetUserId=");
        sb.append(this.f84848j);
        sb.append(")");
        return sb.toString();
    }

    public C32606e(Integer num, Integer num2, String str, int i, Integer num3, Integer num4, String str2, String str3, Integer num5, String str4) {
        this.f84839a = num;
        this.f84840b = num2;
        this.f84841c = str;
        this.f84842d = i;
        this.f84843e = num3;
        this.f84844f = num4;
        this.f84845g = str2;
        this.f84846h = str3;
        this.f84847i = num5;
        this.f84848j = str4;
    }
}

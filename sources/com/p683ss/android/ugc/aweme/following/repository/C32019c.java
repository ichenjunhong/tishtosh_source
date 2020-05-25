package com.p683ss.android.ugc.aweme.following.repository;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.repository.c */
public final class C32019c {

    /* renamed from: a */
    public final String f83590a;

    /* renamed from: b */
    public final String f83591b;

    /* renamed from: c */
    public final long f83592c;

    /* renamed from: d */
    public final int f83593d;

    /* renamed from: e */
    public final int f83594e;

    /* renamed from: f */
    public final int f83595f;

    /* renamed from: g */
    public final int f83596g;

    /* renamed from: h */
    public final int f83597h;

    /* renamed from: i */
    public final int f83598i;

    /* renamed from: j */
    public final int f83599j;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32019c) {
                C32019c cVar = (C32019c) obj;
                if (C52711k.m112239a((Object) this.f83590a, (Object) cVar.f83590a) && C52711k.m112239a((Object) this.f83591b, (Object) cVar.f83591b)) {
                    if (this.f83592c == cVar.f83592c) {
                        if (this.f83593d == cVar.f83593d) {
                            if (this.f83594e == cVar.f83594e) {
                                if (this.f83595f == cVar.f83595f) {
                                    if (this.f83596g == cVar.f83596g) {
                                        if (this.f83597h == cVar.f83597h) {
                                            if (this.f83598i == cVar.f83598i) {
                                                if (this.f83599j == cVar.f83599j) {
                                                    return true;
                                                }
                                            }
                                        }
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
        String str = this.f83590a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f83591b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((((((((((hashCode + i) * 31) + Long.hashCode(this.f83592c)) * 31) + Integer.hashCode(this.f83593d)) * 31) + Integer.hashCode(this.f83594e)) * 31) + Integer.hashCode(this.f83595f)) * 31) + Integer.hashCode(this.f83596g)) * 31) + Integer.hashCode(this.f83597h)) * 31) + Integer.hashCode(this.f83598i)) * 31) + Integer.hashCode(this.f83599j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowRelationQueryParam(userId=");
        sb.append(this.f83590a);
        sb.append(", secUserId=");
        sb.append(this.f83591b);
        sb.append(", maxTime=");
        sb.append(this.f83592c);
        sb.append(", count=");
        sb.append(this.f83593d);
        sb.append(", offset=");
        sb.append(this.f83594e);
        sb.append(", sourceType=");
        sb.append(this.f83595f);
        sb.append(", addressBookAccess=");
        sb.append(this.f83596g);
        sb.append(", gpsAccess=");
        sb.append(this.f83597h);
        sb.append(", vcdCount=");
        sb.append(this.f83598i);
        sb.append(", afterVcdAuthorize=");
        sb.append(this.f83599j);
        sb.append(")");
        return sb.toString();
    }

    public C32019c(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C52711k.m112240b(str, "userId");
        C52711k.m112240b(str2, "secUserId");
        this.f83590a = str;
        this.f83591b = str2;
        this.f83592c = j;
        this.f83593d = i;
        this.f83594e = i2;
        this.f83595f = i3;
        this.f83596g = i4;
        this.f83597h = i5;
        this.f83598i = i6;
        this.f83599j = i7;
    }

    public /* synthetic */ C32019c(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C52707g gVar) {
        this(str, str2, j, i, i2, i3, i4, i5, i6, 0);
    }
}

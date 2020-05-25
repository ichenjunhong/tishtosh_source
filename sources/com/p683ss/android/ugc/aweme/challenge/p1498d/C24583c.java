package com.p683ss.android.ugc.aweme.challenge.p1498d;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.d.c */
public final class C24583c {

    /* renamed from: a */
    public final String f65043a;

    /* renamed from: b */
    public final long f65044b;

    /* renamed from: c */
    public final int f65045c;

    /* renamed from: d */
    public final boolean f65046d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24583c) {
                C24583c cVar = (C24583c) obj;
                if (C52711k.m112239a((Object) this.f65043a, (Object) cVar.f65043a)) {
                    if (this.f65044b == cVar.f65044b) {
                        if (this.f65045c == cVar.f65045c) {
                            if (this.f65046d == cVar.f65046d) {
                                return true;
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
        String str = this.f65043a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f65044b;
        int i = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f65045c) * 31;
        boolean z = this.f65046d;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiColAwemeListRequestParams(chid=");
        sb.append(this.f65043a);
        sb.append(", cursor=");
        sb.append(this.f65044b);
        sb.append(", count=");
        sb.append(this.f65045c);
        sb.append(", isHashTag=");
        sb.append(this.f65046d);
        sb.append(")");
        return sb.toString();
    }

    public C24583c(String str, long j, int i, boolean z) {
        C52711k.m112240b(str, "chid");
        this.f65043a = str;
        this.f65044b = j;
        this.f65045c = i;
        this.f65046d = z;
    }
}

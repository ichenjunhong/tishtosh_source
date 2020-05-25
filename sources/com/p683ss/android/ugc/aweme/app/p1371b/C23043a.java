package com.p683ss.android.ugc.aweme.app.p1371b;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.b.a */
public final class C23043a {

    /* renamed from: a */
    public boolean f61396a;

    /* renamed from: b */
    public long f61397b;

    /* renamed from: c */
    public String f61398c;

    public C23043a() {
        this(false, 0, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23043a) {
                C23043a aVar = (C23043a) obj;
                if (this.f61396a == aVar.f61396a) {
                    if (!(this.f61397b == aVar.f61397b) || !C52711k.m112239a((Object) this.f61398c, (Object) aVar.f61398c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f61396a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        long j = this.f61397b;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f61398c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiConfig(isBanned=");
        sb.append(this.f61396a);
        sb.append(", delayTime=");
        sb.append(this.f61397b);
        sb.append(", apiName=");
        sb.append(this.f61398c);
        sb.append(")");
        return sb.toString();
    }

    public C23043a(boolean z, long j, String str) {
        C52711k.m112240b(str, "apiName");
        this.f61396a = z;
        this.f61397b = j;
        this.f61398c = str;
    }

    public /* synthetic */ C23043a(boolean z, long j, String str, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            j = 45000;
        }
        if ((i & 4) != 0) {
            str = "default";
        }
        this(false, j, str);
    }
}

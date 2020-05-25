package com.p683ss.android.ugc.aweme.friends.utils;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.utils.a */
public final class C32781a {
    @C17952c(mo34828a = "content")

    /* renamed from: a */
    public String f85364a;
    @C17952c(mo34828a = "status")

    /* renamed from: b */
    public int f85365b;
    @C17952c(mo34828a = "extra")

    /* renamed from: c */
    public String f85366c;

    public C32781a() {
        this(null, 0, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32781a) {
                C32781a aVar = (C32781a) obj;
                if (C52711k.m112239a((Object) this.f85364a, (Object) aVar.f85364a)) {
                    if (!(this.f85365b == aVar.f85365b) || !C52711k.m112239a((Object) this.f85366c, (Object) aVar.f85366c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f85364a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.f85365b)) * 31;
        String str2 = this.f85366c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorizeInfo(content=");
        sb.append(this.f85364a);
        sb.append(", status=");
        sb.append(this.f85365b);
        sb.append(", extra=");
        sb.append(this.f85366c);
        sb.append(")");
        return sb.toString();
    }

    public C32781a(String str, int i, String str2) {
        this.f85364a = str;
        this.f85365b = i;
        this.f85366c = str2;
    }

    public /* synthetic */ C32781a(String str, int i, String str2, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        this(str, i, null);
    }
}

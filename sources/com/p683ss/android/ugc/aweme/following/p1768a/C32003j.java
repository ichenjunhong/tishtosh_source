package com.p683ss.android.ugc.aweme.following.p1768a;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.a.j */
public final class C32003j {

    /* renamed from: a */
    public final int f83561a;

    /* renamed from: b */
    public final String f83562b;

    public C32003j() {
        this(0, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32003j) {
                C32003j jVar = (C32003j) obj;
                if (!(this.f83561a == jVar.f83561a) || !C52711k.m112239a((Object) this.f83562b, (Object) jVar.f83562b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f83561a) * 31;
        String str = this.f83562b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationTitle(type=");
        sb.append(this.f83561a);
        sb.append(", title=");
        sb.append(this.f83562b);
        sb.append(")");
        return sb.toString();
    }

    public C32003j(int i, String str) {
        C52711k.m112240b(str, "title");
        this.f83561a = i;
        this.f83562b = str;
    }

    private /* synthetic */ C32003j(int i, String str, int i2, C52707g gVar) {
        this(0, "");
    }
}

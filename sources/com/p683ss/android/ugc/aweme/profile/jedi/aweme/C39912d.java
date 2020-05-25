package com.p683ss.android.ugc.aweme.profile.jedi.aweme;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.d */
public final class C39912d {

    /* renamed from: a */
    public final int f101763a;

    /* renamed from: b */
    public final int f101764b;

    /* renamed from: c */
    public final long f101765c;

    /* renamed from: d */
    public String f101766d;

    /* renamed from: e */
    public String f101767e;

    public C39912d() {
        this(0, 0, 0, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39912d) {
                C39912d dVar = (C39912d) obj;
                if (this.f101763a == dVar.f101763a) {
                    if (this.f101764b == dVar.f101764b) {
                        if (!(this.f101765c == dVar.f101765c) || !C52711k.m112239a((Object) this.f101766d, (Object) dVar.f101766d) || !C52711k.m112239a((Object) this.f101767e, (Object) dVar.f101767e)) {
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
        int hashCode = ((((Integer.hashCode(this.f101763a) * 31) + Integer.hashCode(this.f101764b)) * 31) + Long.hashCode(this.f101765c)) * 31;
        String str = this.f101766d;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f101767e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeListRequestParams(type=");
        sb.append(this.f101763a);
        sb.append(", count=");
        sb.append(this.f101764b);
        sb.append(", cursor=");
        sb.append(this.f101765c);
        sb.append(", userId=");
        sb.append(this.f101766d);
        sb.append(", secUserId=");
        sb.append(this.f101767e);
        sb.append(")");
        return sb.toString();
    }

    public C39912d(int i, int i2, long j, String str, String str2) {
        this.f101763a = i;
        this.f101764b = i2;
        this.f101765c = j;
        this.f101766d = str;
        this.f101767e = str2;
    }

    private /* synthetic */ C39912d(int i, int i2, long j, String str, String str2, int i3, C52707g gVar) {
        this(0, 20, 0, null, null);
    }
}

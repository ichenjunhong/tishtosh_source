package com.p683ss.android.ugc.vcd;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.vcd.o */
public final class C50517o {
    @C17952c(mo34828a = "nickname")

    /* renamed from: a */
    public final String f126640a;
    @C17952c(mo34828a = "user_id")

    /* renamed from: b */
    public final String f126641b;
    @C17952c(mo34828a = "follower_count")

    /* renamed from: c */
    public final int f126642c;
    @C17952c(mo34828a = "following_count")

    /* renamed from: d */
    public final int f126643d;
    @C17952c(mo34828a = "avatar")

    /* renamed from: e */
    public final C50505e f126644e;

    public C50517o() {
        this(null, null, 0, 0, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C50517o) {
                C50517o oVar = (C50517o) obj;
                if (C52711k.m112239a((Object) this.f126640a, (Object) oVar.f126640a) && C52711k.m112239a((Object) this.f126641b, (Object) oVar.f126641b)) {
                    if (this.f126642c == oVar.f126642c) {
                        if (!(this.f126643d == oVar.f126643d) || !C52711k.m112239a((Object) this.f126644e, (Object) oVar.f126644e)) {
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
        String str = this.f126640a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f126641b;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f126642c) * 31) + this.f126643d) * 31;
        C50505e eVar = this.f126644e;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VcdUserStruct(nickname=");
        sb.append(this.f126640a);
        sb.append(", uid=");
        sb.append(this.f126641b);
        sb.append(", followerCount=");
        sb.append(this.f126642c);
        sb.append(", followingCount=");
        sb.append(this.f126643d);
        sb.append(", avatarUrl=");
        sb.append(this.f126644e);
        sb.append(")");
        return sb.toString();
    }

    private C50517o(String str, String str2, int i, int i2, C50505e eVar) {
        C52711k.m112240b(str, "nickname");
        C52711k.m112240b(str2, "uid");
        this.f126640a = str;
        this.f126641b = str2;
        this.f126642c = i;
        this.f126643d = i2;
        this.f126644e = eVar;
    }

    private /* synthetic */ C50517o(String str, String str2, int i, int i2, C50505e eVar, int i3, C52707g gVar) {
        this("", "", 0, 0, null);
    }
}

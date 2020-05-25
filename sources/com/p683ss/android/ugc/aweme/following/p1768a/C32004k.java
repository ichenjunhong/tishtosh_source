package com.p683ss.android.ugc.aweme.following.p1768a;

import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.a.k */
public final class C32004k {

    /* renamed from: a */
    public final int f83563a;

    /* renamed from: b */
    public final User f83564b;

    /* renamed from: c */
    public final int f83565c;

    /* renamed from: d */
    public final String f83566d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32004k) {
                C32004k kVar = (C32004k) obj;
                if ((this.f83563a == kVar.f83563a) && C52711k.m112239a((Object) this.f83564b, (Object) kVar.f83564b)) {
                    if (!(this.f83565c == kVar.f83565c) || !C52711k.m112239a((Object) this.f83566d, (Object) kVar.f83566d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f83563a) * 31;
        User user = this.f83564b;
        int i = 0;
        int hashCode2 = (((hashCode + (user != null ? user.hashCode() : 0)) * 31) + Integer.hashCode(this.f83565c)) * 31;
        String str = this.f83566d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationUser(type=");
        sb.append(this.f83563a);
        sb.append(", user=");
        sb.append(this.f83564b);
        sb.append(", order=");
        sb.append(this.f83565c);
        sb.append(", requestId=");
        sb.append(this.f83566d);
        sb.append(")");
        return sb.toString();
    }

    public C32004k(int i, User user, int i2, String str) {
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "requestId");
        this.f83563a = i;
        this.f83564b = user;
        this.f83565c = i2;
        this.f83566d = str;
    }

    public /* synthetic */ C32004k(int i, User user, int i2, String str, int i3, C52707g gVar) {
        this(i, user, 0, "");
    }

    /* renamed from: a */
    public static /* synthetic */ C32004k m74394a(C32004k kVar, int i, User user, int i2, String str, int i3, Object obj) {
        int i4 = kVar.f83563a;
        User user2 = kVar.f83564b;
        String str2 = kVar.f83566d;
        C52711k.m112240b(user2, "user");
        C52711k.m112240b(str2, "requestId");
        return new C32004k(i4, user2, i2, str2);
    }
}

package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.user.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.ak */
public final class C5720ak implements C5757m {

    /* renamed from: a */
    public final long f15042a;

    /* renamed from: b */
    public final long f15043b;

    /* renamed from: c */
    public final long f15044c;

    /* renamed from: d */
    public final User f15045d;

    /* renamed from: e */
    public final User f15046e;

    /* renamed from: f */
    public final long f15047f;

    /* renamed from: g */
    public final long f15048g;

    /* renamed from: h */
    public final long f15049h;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5720ak) {
                C5720ak akVar = (C5720ak) obj;
                if (this.f15042a == akVar.f15042a) {
                    if (this.f15043b == akVar.f15043b) {
                        if ((this.f15044c == akVar.f15044c) && C52711k.m112239a((Object) this.f15045d, (Object) akVar.f15045d) && C52711k.m112239a((Object) this.f15046e, (Object) akVar.f15046e)) {
                            if (this.f15047f == akVar.f15047f) {
                                if (this.f15048g == akVar.f15048g) {
                                    if (this.f15049h == akVar.f15049h) {
                                        return true;
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
        int hashCode = ((((Long.hashCode(this.f15042a) * 31) + Long.hashCode(this.f15043b)) * 31) + Long.hashCode(this.f15044c)) * 31;
        User user = this.f15045d;
        int i = 0;
        int hashCode2 = (hashCode + (user != null ? user.hashCode() : 0)) * 31;
        User user2 = this.f15046e;
        if (user2 != null) {
            i = user2.hashCode();
        }
        return ((((((hashCode2 + i) * 31) + Long.hashCode(this.f15047f)) * 31) + Long.hashCode(this.f15048g)) * 31) + Long.hashCode(this.f15049h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PortalInvite(inviteStartTime=");
        sb.append(this.f15042a);
        sb.append(", inviteCountDown=");
        sb.append(this.f15043b);
        sb.append(", rewardCountDown=");
        sb.append(this.f15044c);
        sb.append(", sugarDaddy=");
        sb.append(this.f15045d);
        sb.append(", anchor=");
        sb.append(this.f15046e);
        sb.append(", roomId=");
        sb.append(this.f15047f);
        sb.append(", portalId=");
        sb.append(this.f15048g);
        sb.append(", inviteRoomId=");
        sb.append(this.f15049h);
        sb.append(")");
        return sb.toString();
    }

    public C5720ak(long j, long j2, long j3, User user, User user2, long j4, long j5, long j6) {
        C52711k.m112240b(user, "sugarDaddy");
        C52711k.m112240b(user2, "anchor");
        this.f15042a = j;
        this.f15043b = j2;
        this.f15044c = j3;
        this.f15045d = user;
        this.f15046e = user2;
        this.f15047f = j4;
        this.f15048g = j5;
        this.f15049h = j6;
    }
}

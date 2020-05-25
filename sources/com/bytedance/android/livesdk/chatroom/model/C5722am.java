package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.user.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.am */
public final class C5722am implements C5757m {

    /* renamed from: a */
    public final long f15054a;

    /* renamed from: b */
    public final long f15055b;

    /* renamed from: c */
    public final User f15056c;

    /* renamed from: d */
    public final User f15057d;

    /* renamed from: e */
    public final long f15058e;

    /* renamed from: f */
    public final long f15059f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5722am) {
                C5722am amVar = (C5722am) obj;
                if (this.f15054a == amVar.f15054a) {
                    if ((this.f15055b == amVar.f15055b) && C52711k.m112239a((Object) this.f15056c, (Object) amVar.f15056c) && C52711k.m112239a((Object) this.f15057d, (Object) amVar.f15057d)) {
                        if (this.f15058e == amVar.f15058e) {
                            if (this.f15059f == amVar.f15059f) {
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
        int hashCode = ((Long.hashCode(this.f15054a) * 31) + Long.hashCode(this.f15055b)) * 31;
        User user = this.f15056c;
        int i = 0;
        int hashCode2 = (hashCode + (user != null ? user.hashCode() : 0)) * 31;
        User user2 = this.f15057d;
        if (user2 != null) {
            i = user2.hashCode();
        }
        return ((((hashCode2 + i) * 31) + Long.hashCode(this.f15058e)) * 31) + Long.hashCode(this.f15059f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PortalReward(rewardStartTime=");
        sb.append(this.f15054a);
        sb.append(", rewardCountDown=");
        sb.append(this.f15055b);
        sb.append(", sugarDaddy=");
        sb.append(this.f15056c);
        sb.append(", anchor=");
        sb.append(this.f15057d);
        sb.append(", roomId=");
        sb.append(this.f15058e);
        sb.append(", portalId=");
        sb.append(this.f15059f);
        sb.append(")");
        return sb.toString();
    }

    public C5722am(long j, long j2, User user, User user2, long j3, long j4) {
        C52711k.m112240b(user, "sugarDaddy");
        C52711k.m112240b(user2, "anchor");
        this.f15054a = j;
        this.f15055b = j2;
        this.f15056c = user;
        this.f15057d = user2;
        this.f15058e = j3;
        this.f15059f = j4;
    }
}

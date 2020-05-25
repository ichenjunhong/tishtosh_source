package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.user.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.ao */
public final class C5726ao implements C5757m {

    /* renamed from: a */
    public final long f15071a;

    /* renamed from: b */
    public final long f15072b;

    /* renamed from: c */
    public final long f15073c;

    /* renamed from: d */
    public final User f15074d;

    /* renamed from: e */
    public final User f15075e;

    /* renamed from: f */
    public final long f15076f;

    /* renamed from: g */
    public final long f15077g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5726ao) {
                C5726ao aoVar = (C5726ao) obj;
                if (this.f15071a == aoVar.f15071a) {
                    if (this.f15072b == aoVar.f15072b) {
                        if ((this.f15073c == aoVar.f15073c) && C52711k.m112239a((Object) this.f15074d, (Object) aoVar.f15074d) && C52711k.m112239a((Object) this.f15075e, (Object) aoVar.f15075e)) {
                            if (this.f15076f == aoVar.f15076f) {
                                if (this.f15077g == aoVar.f15077g) {
                                    return true;
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
        int hashCode = ((((Long.hashCode(this.f15071a) * 31) + Long.hashCode(this.f15072b)) * 31) + Long.hashCode(this.f15073c)) * 31;
        User user = this.f15074d;
        int i = 0;
        int hashCode2 = (hashCode + (user != null ? user.hashCode() : 0)) * 31;
        User user2 = this.f15075e;
        if (user2 != null) {
            i = user2.hashCode();
        }
        return ((((hashCode2 + i) * 31) + Long.hashCode(this.f15076f)) * 31) + Long.hashCode(this.f15077g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PortalWait(waitStartTime=");
        sb.append(this.f15071a);
        sb.append(", waitCountDown=");
        sb.append(this.f15072b);
        sb.append(", rewardCountDown=");
        sb.append(this.f15073c);
        sb.append(", sugarDaddy=");
        sb.append(this.f15074d);
        sb.append(", anchor=");
        sb.append(this.f15075e);
        sb.append(", roomId=");
        sb.append(this.f15076f);
        sb.append(", portalId=");
        sb.append(this.f15077g);
        sb.append(")");
        return sb.toString();
    }

    public C5726ao(long j, long j2, long j3, User user, User user2, long j4, long j5) {
        C52711k.m112240b(user, "sugarDaddy");
        C52711k.m112240b(user2, "anchor");
        this.f15071a = j;
        this.f15072b = j2;
        this.f15073c = j3;
        this.f15074d = user;
        this.f15075e = user2;
        this.f15076f = j4;
        this.f15077g = j5;
    }
}

package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.user.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.al */
public final class C5721al implements C5757m {

    /* renamed from: a */
    public final long f15050a;

    /* renamed from: b */
    public final long f15051b;

    /* renamed from: c */
    public final boolean f15052c;

    /* renamed from: d */
    public final User f15053d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5721al) {
                C5721al alVar = (C5721al) obj;
                if (this.f15050a == alVar.f15050a) {
                    if (this.f15051b == alVar.f15051b) {
                        if (!(this.f15052c == alVar.f15052c) || !C52711k.m112239a((Object) this.f15053d, (Object) alVar.f15053d)) {
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
        int hashCode = ((Long.hashCode(this.f15050a) * 31) + Long.hashCode(this.f15051b)) * 31;
        boolean z = this.f15052c;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        User user = this.f15053d;
        return i + (user != null ? user.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PortalOpen(roomId=");
        sb.append(this.f15050a);
        sb.append(", userId=");
        sb.append(this.f15051b);
        sb.append(", isAnchor=");
        sb.append(this.f15052c);
        sb.append(", sugarDaddy=");
        sb.append(this.f15053d);
        sb.append(")");
        return sb.toString();
    }

    public C5721al(long j, long j2, boolean z, User user) {
        C52711k.m112240b(user, "sugarDaddy");
        this.f15050a = j;
        this.f15051b = j2;
        this.f15052c = z;
        this.f15053d = user;
    }
}

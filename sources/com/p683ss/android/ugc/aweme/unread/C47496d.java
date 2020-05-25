package com.p683ss.android.ugc.aweme.unread;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.unread.d */
public final class C47496d {

    /* renamed from: a */
    public final String f119793a;

    /* renamed from: b */
    public final int f119794b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47496d) {
                C47496d dVar = (C47496d) obj;
                if (C52711k.m112239a((Object) this.f119793a, (Object) dVar.f119793a)) {
                    if (this.f119794b == dVar.f119794b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f119793a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f119794b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnReadVideoEvent(uid=");
        sb.append(this.f119793a);
        sb.append(", unReadVideoSize=");
        sb.append(this.f119794b);
        sb.append(")");
        return sb.toString();
    }
}

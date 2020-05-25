package com.p683ss.android.ugc.aweme.commercialize.feed.p1570d;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.d.c */
public final class C25905c {

    /* renamed from: a */
    public final String f68439a;

    /* renamed from: b */
    public final long f68440b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25905c) {
                C25905c cVar = (C25905c) obj;
                if (C52711k.m112239a((Object) this.f68439a, (Object) cVar.f68439a)) {
                    if (this.f68440b == cVar.f68440b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f68439a;
        return ((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.f68440b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadAdWebStateMsg(channel=");
        sb.append(this.f68439a);
        sb.append(", clickTime=");
        sb.append(this.f68440b);
        sb.append(")");
        return sb.toString();
    }

    public C25905c(String str, long j) {
        this.f68439a = str;
        this.f68440b = j;
    }
}

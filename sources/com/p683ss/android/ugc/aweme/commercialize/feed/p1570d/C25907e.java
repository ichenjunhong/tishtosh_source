package com.p683ss.android.ugc.aweme.commercialize.feed.p1570d;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.d.e */
public final class C25907e {

    /* renamed from: a */
    public long f68442a;

    /* renamed from: b */
    public int f68443b;

    /* renamed from: c */
    public final long f68444c;

    /* renamed from: d */
    public final String f68445d;

    public C25907e() {
        this(0, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25907e) {
                C25907e eVar = (C25907e) obj;
                if (!(this.f68444c == eVar.f68444c) || !C52711k.m112239a((Object) this.f68445d, (Object) eVar.f68445d)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f68444c) * 31;
        String str = this.f68445d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadDownloadMsg(creativeId=");
        sb.append(this.f68444c);
        sb.append(", logExtra=");
        sb.append(this.f68445d);
        sb.append(")");
        return sb.toString();
    }

    public C25907e(long j, String str) {
        this.f68444c = j;
        this.f68445d = str;
        this.f68443b = -1;
    }

    public /* synthetic */ C25907e(long j, String str, int i, C52707g gVar) {
        this(0, "");
    }
}

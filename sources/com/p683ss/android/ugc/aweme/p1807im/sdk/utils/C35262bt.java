package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bt */
public final class C35262bt {

    /* renamed from: a */
    public int f90595a;

    /* renamed from: b */
    public String f90596b;

    /* renamed from: c */
    public int f90597c;

    public C35262bt() {
        this(0, null, 0, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35262bt) {
                C35262bt btVar = (C35262bt) obj;
                if ((this.f90595a == btVar.f90595a) && C52711k.m112239a((Object) this.f90596b, (Object) btVar.f90596b)) {
                    if (this.f90597c == btVar.f90597c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f90595a * 31;
        String str = this.f90596b;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.f90597c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XPreloadInfo(taskId=");
        sb.append(this.f90595a);
        sb.append(", url=");
        sb.append(this.f90596b);
        sb.append(", percent=");
        sb.append(this.f90597c);
        sb.append(")");
        return sb.toString();
    }

    public C35262bt(int i, String str, int i2) {
        C52711k.m112240b(str, "url");
        this.f90595a = i;
        this.f90596b = str;
        this.f90597c = i2;
    }

    private /* synthetic */ C35262bt(int i, String str, int i2, int i3, C52707g gVar) {
        this(0, "", 0);
    }
}

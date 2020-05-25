package com.p683ss.android.ugc.aweme.discover.helper;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.f */
public final class C28197f {

    /* renamed from: a */
    public final int f74025a;

    /* renamed from: b */
    public final int f74026b;

    /* renamed from: c */
    public final int f74027c;

    /* renamed from: d */
    public final C28208p f74028d;

    public C28197f() {
        this(0, 0, 0, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28197f) {
                C28197f fVar = (C28197f) obj;
                if (this.f74025a == fVar.f74025a) {
                    if (this.f74026b == fVar.f74026b) {
                        if (!(this.f74027c == fVar.f74027c) || !C52711k.m112239a((Object) this.f74028d, (Object) fVar.f74028d)) {
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
        int hashCode = ((((Integer.hashCode(this.f74025a) * 31) + Integer.hashCode(this.f74026b)) * 31) + Integer.hashCode(this.f74027c)) * 31;
        C28208p pVar = this.f74028d;
        return hashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicDownloadStatus(status=");
        sb.append(this.f74025a);
        sb.append(", percent=");
        sb.append(this.f74026b);
        sb.append(", errorMsg=");
        sb.append(this.f74027c);
        sb.append(", toVideoProgress=");
        sb.append(this.f74028d);
        sb.append(")");
        return sb.toString();
    }

    public C28197f(int i, int i2, int i3, C28208p pVar) {
        this.f74025a = i;
        this.f74026b = i2;
        this.f74027c = i3;
        this.f74028d = pVar;
    }

    public /* synthetic */ C28197f(int i, int i2, int i3, C28208p pVar, int i4, C52707g gVar) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        this(i, i2, 0, null);
    }
}

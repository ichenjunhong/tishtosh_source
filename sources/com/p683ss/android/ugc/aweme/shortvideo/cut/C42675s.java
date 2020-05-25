package com.p683ss.android.ugc.aweme.shortvideo.cut;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.s */
public final class C42675s<DATA> {

    /* renamed from: a */
    public final int f107975a;

    /* renamed from: b */
    public final int f107976b;

    /* renamed from: c */
    public final DATA f107977c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42675s) {
                C42675s sVar = (C42675s) obj;
                if (this.f107975a == sVar.f107975a) {
                    if (!(this.f107976b == sVar.f107976b) || !C52711k.m112239a((Object) this.f107977c, (Object) sVar.f107977c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.f107975a * 31) + this.f107976b) * 31;
        DATA data = this.f107977c;
        return i + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoFrameData(width=");
        sb.append(this.f107975a);
        sb.append(", height=");
        sb.append(this.f107976b);
        sb.append(", data=");
        sb.append(this.f107977c);
        sb.append(")");
        return sb.toString();
    }

    public C42675s(int i, int i2, DATA data) {
        this.f107975a = i;
        this.f107976b = i2;
        this.f107977c = data;
    }
}

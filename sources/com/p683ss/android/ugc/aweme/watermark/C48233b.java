package com.p683ss.android.ugc.aweme.watermark;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.watermark.b */
public final class C48233b {

    /* renamed from: a */
    public final int f121373a;

    /* renamed from: b */
    public final int f121374b;

    /* renamed from: c */
    public final int f121375c;

    /* renamed from: d */
    public final String f121376d;

    /* renamed from: e */
    public final int f121377e;

    /* renamed from: f */
    public final int f121378f;

    /* renamed from: g */
    public final boolean f121379g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48233b) {
                C48233b bVar = (C48233b) obj;
                if (this.f121373a == bVar.f121373a) {
                    if (this.f121374b == bVar.f121374b) {
                        if ((this.f121375c == bVar.f121375c) && C52711k.m112239a((Object) this.f121376d, (Object) bVar.f121376d)) {
                            if (this.f121377e == bVar.f121377e) {
                                if (this.f121378f == bVar.f121378f) {
                                    if (this.f121379g == bVar.f121379g) {
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
        int i = ((((this.f121373a * 31) + this.f121374b) * 31) + this.f121375c) * 31;
        String str = this.f121376d;
        int hashCode = (((((i + (str != null ? str.hashCode() : 0)) * 31) + this.f121377e) * 31) + this.f121378f) * 31;
        boolean z = this.f121379g;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentWatermarkParam(inputMediaDuration=");
        sb.append(this.f121373a);
        sb.append(", inputMediaWidth=");
        sb.append(this.f121374b);
        sb.append(", inputMediaHeight=");
        sb.append(this.f121375c);
        sb.append(", commentWaterMarkPath=");
        sb.append(this.f121376d);
        sb.append(", commentWaterMarkHeight=");
        sb.append(this.f121377e);
        sb.append(", commentWaterMarkWidth=");
        sb.append(this.f121378f);
        sb.append(", is1To1=");
        sb.append(this.f121379g);
        sb.append(")");
        return sb.toString();
    }

    public C48233b(int i, int i2, int i3, String str, int i4, int i5, boolean z) {
        C52711k.m112240b(str, "commentWaterMarkPath");
        this.f121373a = i;
        this.f121374b = i2;
        this.f121375c = i3;
        this.f121376d = str;
        this.f121377e = i4;
        this.f121378f = i5;
        this.f121379g = z;
    }
}

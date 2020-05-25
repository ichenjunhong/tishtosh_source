package com.p683ss.android.ugc.aweme.journey;

import android.graphics.BlurMaskFilter.Blur;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.journey.w */
public final class C35792w {

    /* renamed from: a */
    public final float f91933a;

    /* renamed from: b */
    public final Blur f91934b;

    /* renamed from: c */
    public final float f91935c = 0.0f;

    /* renamed from: d */
    public final float f91936d;

    /* renamed from: e */
    public final int f91937e;

    /* renamed from: f */
    public final float f91938f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35792w) {
                C35792w wVar = (C35792w) obj;
                if (Float.compare(this.f91933a, wVar.f91933a) == 0 && C52711k.m112239a((Object) this.f91934b, (Object) wVar.f91934b) && Float.compare(this.f91935c, wVar.f91935c) == 0 && Float.compare(this.f91936d, wVar.f91936d) == 0) {
                    if (!(this.f91937e == wVar.f91937e) || Float.compare(this.f91938f, wVar.f91938f) != 0) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f91933a) * 31;
        Blur blur = this.f91934b;
        return ((((((((hashCode + (blur != null ? blur.hashCode() : 0)) * 31) + Float.hashCode(this.f91935c)) * 31) + Float.hashCode(this.f91936d)) * 31) + Integer.hashCode(this.f91937e)) * 31) + Float.hashCode(this.f91938f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(blurRadius=");
        sb.append(this.f91933a);
        sb.append(", blur=");
        sb.append(this.f91934b);
        sb.append(", dx=");
        sb.append(this.f91935c);
        sb.append(", dy=");
        sb.append(this.f91936d);
        sb.append(", shadowColor=");
        sb.append(this.f91937e);
        sb.append(", radius=");
        sb.append(this.f91938f);
        sb.append(")");
        return sb.toString();
    }

    public C35792w(float f, Blur blur, float f2, float f3, int i, float f4) {
        C52711k.m112240b(blur, "blur");
        this.f91933a = f;
        this.f91934b = blur;
        this.f91936d = f3;
        this.f91937e = i;
        this.f91938f = f4;
    }
}

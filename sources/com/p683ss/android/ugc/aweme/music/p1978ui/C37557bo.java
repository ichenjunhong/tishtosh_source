package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.graphics.BlurMaskFilter.Blur;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bo */
public final class C37557bo {

    /* renamed from: a */
    public final float f95811a;

    /* renamed from: b */
    public final Blur f95812b;

    /* renamed from: c */
    public final float f95813c = 0.0f;

    /* renamed from: d */
    public final float f95814d;

    /* renamed from: e */
    public final int f95815e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37557bo) {
                C37557bo boVar = (C37557bo) obj;
                if (Float.compare(this.f95811a, boVar.f95811a) == 0 && C52711k.m112239a((Object) this.f95812b, (Object) boVar.f95812b) && Float.compare(this.f95813c, boVar.f95813c) == 0 && Float.compare(this.f95814d, boVar.f95814d) == 0) {
                    if (this.f95815e == boVar.f95815e) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f95811a) * 31;
        Blur blur = this.f95812b;
        return ((((((floatToIntBits + (blur != null ? blur.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f95813c)) * 31) + Float.floatToIntBits(this.f95814d)) * 31) + this.f95815e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(blurRadius=");
        sb.append(this.f95811a);
        sb.append(", blur=");
        sb.append(this.f95812b);
        sb.append(", dx=");
        sb.append(this.f95813c);
        sb.append(", dy=");
        sb.append(this.f95814d);
        sb.append(", shadowColor=");
        sb.append(this.f95815e);
        sb.append(")");
        return sb.toString();
    }

    public C37557bo(float f, Blur blur, float f2, float f3, int i) {
        C52711k.m112240b(blur, "blur");
        this.f95811a = f;
        this.f95812b = blur;
        this.f95814d = f3;
        this.f95815e = i;
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a */
public final class C43618a {

    /* renamed from: a */
    public float f110485a;

    /* renamed from: b */
    public float f110486b;

    /* renamed from: c */
    public float f110487c;

    /* renamed from: d */
    public float f110488d;

    /* renamed from: e */
    public float f110489e;

    /* renamed from: f */
    public int f110490f;

    public C43618a() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43618a) {
                C43618a aVar = (C43618a) obj;
                if (Float.compare(this.f110485a, aVar.f110485a) == 0 && Float.compare(this.f110486b, aVar.f110486b) == 0 && Float.compare(this.f110487c, aVar.f110487c) == 0 && Float.compare(this.f110488d, aVar.f110488d) == 0 && Float.compare(this.f110489e, aVar.f110489e) == 0) {
                    if (this.f110490f == aVar.f110490f) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.f110485a) * 31) + Float.floatToIntBits(this.f110486b)) * 31) + Float.floatToIntBits(this.f110487c)) * 31) + Float.floatToIntBits(this.f110488d)) * 31) + Float.floatToIntBits(this.f110489e)) * 31) + this.f110490f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimatorInfo(scaleX=");
        sb.append(this.f110485a);
        sb.append(", scaleY=");
        sb.append(this.f110486b);
        sb.append(", rotation=");
        sb.append(this.f110487c);
        sb.append(", x=");
        sb.append(this.f110488d);
        sb.append(", y=");
        sb.append(this.f110489e);
        sb.append(", focusIndex=");
        sb.append(this.f110490f);
        sb.append(")");
        return sb.toString();
    }

    private C43618a(float f, float f2, float f3, float f4, float f5, int i) {
        this.f110485a = f;
        this.f110486b = f2;
        this.f110487c = f3;
        this.f110488d = f4;
        this.f110489e = f5;
        this.f110490f = i;
    }

    public /* synthetic */ C43618a(float f, float f2, float f3, float f4, float f5, int i, int i2, C52707g gVar) {
        this(1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0);
    }
}

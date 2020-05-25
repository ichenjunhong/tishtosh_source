package com.p683ss.android.ugc.aweme.shortvideo.cut.model;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.f */
public final class C42663f {

    /* renamed from: a */
    public boolean f107950a;

    /* renamed from: b */
    public final int f107951b;

    /* renamed from: c */
    public final int f107952c;

    /* renamed from: d */
    public final int f107953d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42663f) {
                C42663f fVar = (C42663f) obj;
                if (this.f107951b == fVar.f107951b) {
                    if (this.f107952c == fVar.f107952c) {
                        if (this.f107953d == fVar.f107953d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f107951b * 31) + this.f107952c) * 31) + this.f107953d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwapStateWrapper(state=");
        sb.append(this.f107951b);
        sb.append(", from=");
        sb.append(this.f107952c);
        sb.append(", to=");
        sb.append(this.f107953d);
        sb.append(")");
        return sb.toString();
    }

    public C42663f(int i, int i2, int i3) {
        this.f107951b = i;
        this.f107952c = i2;
        this.f107953d = i3;
    }
}

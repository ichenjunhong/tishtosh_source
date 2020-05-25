package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f */
public final class C31101f {

    /* renamed from: a */
    public final int f81387a;

    /* renamed from: b */
    public final int f81388b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31101f) {
                C31101f fVar = (C31101f) obj;
                if (this.f81387a == fVar.f81387a) {
                    if (this.f81388b == fVar.f81388b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.f81387a) * 31) + Integer.hashCode(this.f81388b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionDescVO(imageResId=");
        sb.append(this.f81387a);
        sb.append(", textResId=");
        sb.append(this.f81388b);
        sb.append(")");
        return sb.toString();
    }

    public C31101f(int i, int i2) {
        this.f81387a = i;
        this.f81388b = i2;
    }
}

package dmt.p2652av.video;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: dmt.av.video.w */
public final class C53028w {

    /* renamed from: a */
    public int f131501a;

    /* renamed from: b */
    public int f131502b;

    /* renamed from: c */
    public int f131503c;

    /* renamed from: d */
    public boolean f131504d;

    public C53028w() {
        this(0, 0, 0, false, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53028w) {
                C53028w wVar = (C53028w) obj;
                if (this.f131501a == wVar.f131501a) {
                    if (this.f131502b == wVar.f131502b) {
                        if (this.f131503c == wVar.f131503c) {
                            if (this.f131504d == wVar.f131504d) {
                                return true;
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
        int i = ((((this.f131501a * 31) + this.f131502b) * 31) + this.f131503c) * 31;
        boolean z = this.f131504d;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VEMusicParamCache(trackIndex=");
        sb.append(this.f131501a);
        sb.append(", trimIn=");
        sb.append(this.f131502b);
        sb.append(", trimOut=");
        sb.append(this.f131503c);
        sb.append(", isCycle=");
        sb.append(this.f131504d);
        sb.append(")");
        return sb.toString();
    }

    private C53028w(int i, int i2, int i3, boolean z) {
        this.f131501a = i;
        this.f131502b = i2;
        this.f131503c = i3;
        this.f131504d = z;
    }

    private /* synthetic */ C53028w(int i, int i2, int i3, boolean z, int i4, C52707g gVar) {
        this(-1, 0, 0, false);
    }
}

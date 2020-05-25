package com.p683ss.android.ugc.aweme.feed.unread;

/* renamed from: com.ss.android.ugc.aweme.feed.unread.c */
public final class C31169c {

    /* renamed from: a */
    public final boolean f81583a;

    /* renamed from: b */
    public final boolean f81584b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31169c) {
                C31169c cVar = (C31169c) obj;
                if (this.f81583a == cVar.f81583a) {
                    if (this.f81584b == cVar.f81584b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f81583a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.f81584b;
        if (!z2) {
            i = z2;
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnReadSunRoofShowState(coldStart=");
        sb.append(this.f81583a);
        sb.append(", visible=");
        sb.append(this.f81584b);
        sb.append(")");
        return sb.toString();
    }

    public C31169c(boolean z, boolean z2) {
        this.f81583a = z;
        this.f81584b = z2;
    }
}

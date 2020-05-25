package com.p683ss.android.ugc.aweme.feed;

/* renamed from: com.ss.android.ugc.aweme.feed.ab */
public final class C29983ab {

    /* renamed from: a */
    public final int f78239a;

    /* renamed from: b */
    public final int f78240b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29983ab) {
                C29983ab abVar = (C29983ab) obj;
                if (this.f78239a == abVar.f78239a) {
                    if (this.f78240b == abVar.f78240b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.f78239a) * 31) + Integer.hashCode(this.f78240b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NumberResult(video=");
        sb.append(this.f78239a);
        sb.append(", image=");
        sb.append(this.f78240b);
        sb.append(")");
        return sb.toString();
    }

    public C29983ab(int i, int i2) {
        this.f78239a = i;
        this.f78240b = i2;
    }
}

package com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.a */
public final class C34743a {

    /* renamed from: a */
    public final int f89476a;

    /* renamed from: b */
    public final int f89477b;

    /* renamed from: c */
    public final int f89478c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34743a) {
                C34743a aVar = (C34743a) obj;
                if (this.f89476a == aVar.f89476a) {
                    if (this.f89477b == aVar.f89477b) {
                        if (this.f89478c == aVar.f89478c) {
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
        return (((this.f89476a * 31) + this.f89477b) * 31) + this.f89478c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DragState(state=");
        sb.append(this.f89476a);
        sb.append(", fullWidth=");
        sb.append(this.f89477b);
        sb.append(", fullHeight=");
        sb.append(this.f89478c);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo72805a() {
        if (this.f89476a == 0) {
            return true;
        }
        return false;
    }

    public C34743a(int i, int i2, int i3) {
        this.f89476a = i;
        this.f89477b = i2;
        this.f89478c = i3;
    }
}

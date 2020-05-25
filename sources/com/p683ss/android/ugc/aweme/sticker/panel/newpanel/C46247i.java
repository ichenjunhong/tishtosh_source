package com.p683ss.android.ugc.aweme.sticker.panel.newpanel;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.i */
public final class C46247i {

    /* renamed from: a */
    public final int f116682a;

    /* renamed from: b */
    public final int f116683b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46247i) {
                C46247i iVar = (C46247i) obj;
                if (this.f116682a == iVar.f116682a) {
                    if (this.f116683b == iVar.f116683b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f116682a * 31) + this.f116683b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollerOperation(type=");
        sb.append(this.f116682a);
        sb.append(", targetPosition=");
        sb.append(this.f116683b);
        sb.append(")");
        return sb.toString();
    }

    public C46247i(int i, int i2) {
        this.f116682a = i;
        this.f116683b = i2;
    }
}

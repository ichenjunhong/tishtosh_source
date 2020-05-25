package com.bytedance.ies.bullet.p653ui.common.p657d;

/* renamed from: com.bytedance.ies.bullet.ui.common.d.e */
public final class C10584e {

    /* renamed from: a */
    public final int f28126a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10584e) {
                if (this.f28126a == ((C10584e) obj).f28126a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f28126a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UIColor(color=");
        sb.append(this.f28126a);
        sb.append(")");
        return sb.toString();
    }

    public C10584e(int i) {
        this.f28126a = i;
    }
}

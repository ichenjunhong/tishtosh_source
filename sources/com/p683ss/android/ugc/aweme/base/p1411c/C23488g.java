package com.p683ss.android.ugc.aweme.base.p1411c;

/* renamed from: com.ss.android.ugc.aweme.base.c.g */
public final class C23488g {

    /* renamed from: a */
    public final int f62558a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23488g) {
                if (this.f62558a == ((C23488g) obj).f62558a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f62558a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserLoginStateChangeEvent(type=");
        sb.append(this.f62558a);
        sb.append(")");
        return sb.toString();
    }

    public C23488g(int i) {
        this.f62558a = i;
    }
}

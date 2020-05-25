package com.p683ss.android.ttve.common;

/* renamed from: com.ss.android.ttve.common.h */
public final class C20079h {

    /* renamed from: a */
    public int f55200a = 720;

    /* renamed from: b */
    public int f55201b = 1280;

    public final int hashCode() {
        return (this.f55200a * 65537) + 1 + this.f55201b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f55200a);
        sb.append("x");
        sb.append(this.f55201b);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20079h)) {
            return false;
        }
        C20079h hVar = (C20079h) obj;
        if (this.f55200a == hVar.f55200a && this.f55201b == hVar.f55201b) {
            return true;
        }
        return false;
    }
}

package com.bytedance.frameworks.apm.trace;

/* renamed from: com.bytedance.frameworks.apm.trace.b */
public final class C9789b {

    /* renamed from: a */
    public int f26644a;

    /* renamed from: b */
    public int f26645b;

    /* renamed from: c */
    public int f26646c;

    /* renamed from: d */
    public int f26647d = 1;

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26646c);
        sb.append(",");
        sb.append(this.f26644a);
        sb.append(",");
        sb.append(this.f26647d);
        sb.append(",");
        sb.append(this.f26645b);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo17631a(long j) {
        this.f26647d++;
        this.f26645b = (int) (((long) this.f26645b) + j);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9789b) {
            C9789b bVar = (C9789b) obj;
            if (bVar.f26644a == this.f26644a && bVar.f26646c == this.f26646c) {
                return true;
            }
        }
        return false;
    }

    public C9789b(int i, int i2, int i3) {
        this.f26644a = i;
        this.f26645b = i2;
        this.f26646c = i3;
    }
}

package com.bytedance.apm.p485h;

/* renamed from: com.bytedance.apm.h.i */
public class C9047i {

    /* renamed from: b */
    public long f24709b;

    /* renamed from: c */
    public int f24710c;

    /* renamed from: d */
    public int f24711d;

    /* renamed from: e */
    public int f24712e;

    /* renamed from: f */
    public long f24713f;

    /* renamed from: g */
    public long f24714g;

    public String toString() {
        StringBuilder sb = new StringBuilder("TrafficLogEntity{value=");
        sb.append(this.f24709b);
        sb.append(", netType=");
        sb.append(this.f24710c);
        sb.append(", send=");
        sb.append(this.f24711d);
        sb.append(", front=");
        sb.append(this.f24712e);
        sb.append(", time=");
        sb.append(this.f24713f);
        sb.append(", sid=");
        sb.append(this.f24714g);
        sb.append('}');
        return sb.toString();
    }

    public C9047i(long j, int i, int i2, int i3, long j2) {
        this.f24709b = j;
        this.f24710c = i2;
        this.f24711d = i3;
        this.f24712e = i;
        this.f24713f = j2;
    }

    public C9047i(long j, int i, int i2, int i3, long j2, long j3) {
        this.f24709b = j;
        this.f24710c = i2;
        this.f24711d = i3;
        this.f24712e = i;
        this.f24713f = j2;
        this.f24714g = j3;
    }
}

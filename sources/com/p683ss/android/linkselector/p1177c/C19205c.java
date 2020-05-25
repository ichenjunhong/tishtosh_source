package com.p683ss.android.linkselector.p1177c;

import com.p683ss.android.linkselector.p1176b.C19202b;

/* renamed from: com.ss.android.linkselector.c.c */
public final class C19205c {

    /* renamed from: a */
    public String f52924a;

    /* renamed from: b */
    public C19202b f52925b;

    /* renamed from: c */
    public int f52926c;

    /* renamed from: d */
    public long f52927d;

    /* renamed from: e */
    public long f52928e;

    /* renamed from: f */
    public String f52929f;

    /* renamed from: g */
    public Exception f52930g;

    /* renamed from: h */
    public boolean f52931h;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeedMonitor{url='");
        sb.append(this.f52924a);
        sb.append('\'');
        sb.append(", host=");
        sb.append(this.f52925b.toString());
        sb.append(", status=");
        sb.append(this.f52926c);
        sb.append(", duration=");
        sb.append(this.f52927d);
        sb.append(", sendTime=");
        sb.append(this.f52928e);
        sb.append(", traceCode='");
        sb.append(this.f52929f);
        sb.append('\'');
        sb.append(", exception=");
        sb.append(this.f52930g);
        sb.append(", isSuccess=");
        sb.append(this.f52931h);
        sb.append('}');
        return sb.toString();
    }

    public C19205c(String str, C19202b bVar, int i, long j, long j2, String str2, Exception exc, boolean z) {
        this.f52924a = str;
        this.f52925b = bVar;
        this.f52926c = i;
        this.f52927d = j;
        this.f52928e = j2;
        this.f52929f = str2;
        this.f52930g = exc;
        this.f52931h = z;
    }
}

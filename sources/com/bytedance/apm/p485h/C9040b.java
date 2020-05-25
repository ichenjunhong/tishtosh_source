package com.bytedance.apm.p485h;

/* renamed from: com.bytedance.apm.h.b */
public final class C9040b {

    /* renamed from: a */
    public long f24662a;

    /* renamed from: b */
    public boolean f24663b;

    /* renamed from: c */
    public long f24664c;

    /* renamed from: d */
    public String f24665d;

    /* renamed from: e */
    public boolean f24666e;

    /* renamed from: f */
    public String f24667f;

    /* renamed from: g */
    public long f24668g;

    /* renamed from: h */
    public String f24669h;

    /* renamed from: i */
    public long f24670i;

    /* renamed from: j */
    public String f24671j;

    /* renamed from: k */
    public boolean f24672k;

    /* renamed from: l */
    public String f24673l;

    /* renamed from: m */
    public boolean f24674m;

    public C9040b() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatteryLogEntity{id=");
        sb.append(this.f24662a);
        sb.append(", front=");
        sb.append(this.f24663b);
        sb.append(", time=");
        sb.append(this.f24664c);
        sb.append(", type='");
        sb.append(this.f24665d);
        sb.append('\'');
        sb.append(", status=");
        sb.append(this.f24666e);
        sb.append(", scene='");
        sb.append(this.f24667f);
        sb.append('\'');
        sb.append(", accumulation=");
        sb.append(this.f24668g);
        sb.append(", source='");
        sb.append(this.f24669h);
        sb.append('\'');
        sb.append(", versionId=");
        sb.append(this.f24670i);
        sb.append(", processName='");
        sb.append(this.f24671j);
        sb.append('\'');
        sb.append(", mainProcess=");
        sb.append(this.f24672k);
        sb.append(", startUuid='");
        sb.append(this.f24673l);
        sb.append('\'');
        sb.append(", deleteFlag=");
        sb.append(this.f24674m);
        sb.append('}');
        return sb.toString();
    }

    public C9040b(boolean z, long j, String str, long j2) {
        this.f24663b = z;
        this.f24664c = j;
        this.f24665d = str;
        this.f24668g = j2;
    }

    public C9040b(boolean z, long j, String str, boolean z2, String str2, long j2, String str3) {
        this.f24663b = z;
        this.f24664c = j;
        this.f24665d = str;
        this.f24666e = z2;
        this.f24667f = str2;
        this.f24668g = j2;
        this.f24669h = str3;
    }
}

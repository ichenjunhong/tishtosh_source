package com.bytedance.apm.p471b.p474c.p475a;

/* renamed from: com.bytedance.apm.b.c.a.b */
public abstract class C8964b {

    /* renamed from: d */
    public long f24397d;

    /* renamed from: e */
    public long f24398e;

    /* renamed from: f */
    public String f24399f;

    /* renamed from: g */
    public StackTraceElement[] f24400g;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo16254a() {
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i < this.f24400g.length; i++) {
            sb.append(this.f24400g[i].toString());
            sb.append(9);
        }
        return sb.toString();
    }
}

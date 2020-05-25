package com.toutiao.proxyserver.p2610b;

/* renamed from: com.toutiao.proxyserver.b.a */
public final class C51807a {

    /* renamed from: a */
    public final String f129272a;

    /* renamed from: b */
    public final String f129273b;

    /* renamed from: c */
    public final int f129274c;

    /* renamed from: d */
    public final int f129275d;

    /* renamed from: e */
    public final String f129276e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoHttpHeaderInfo{key='");
        sb.append(this.f129272a);
        sb.append('\'');
        sb.append(", mime='");
        sb.append(this.f129273b);
        sb.append('\'');
        sb.append(", contentLength=");
        sb.append(this.f129274c);
        sb.append(", flag=");
        sb.append(this.f129275d);
        sb.append(", extra='");
        sb.append(this.f129276e);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C51807a(String str, String str2, int i, int i2, String str3) {
        this.f129272a = str;
        this.f129273b = str2;
        this.f129274c = i;
        this.f129275d = i2;
        this.f129276e = str3;
    }
}

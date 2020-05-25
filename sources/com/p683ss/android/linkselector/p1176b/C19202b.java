package com.p683ss.android.linkselector.p1176b;

/* renamed from: com.ss.android.linkselector.b.b */
public final class C19202b extends C19201a {

    /* renamed from: d */
    public String f52918d;

    /* renamed from: e */
    public String f52919e;

    /* renamed from: f */
    public long f52920f;

    /* renamed from: g */
    public long f52921g;

    /* renamed from: h */
    public final long mo39196h() {
        return this.f52921g + this.f52920f;
    }

    /* renamed from: g */
    public final String mo39194g() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52919e);
        sb.append("://");
        sb.append(this.f52918d);
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Host{weightTime=");
        sb.append(this.f52920f);
        sb.append(", schema='");
        sb.append(this.f52919e);
        sb.append('\'');
        sb.append(", host='");
        sb.append(this.f52918d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C19202b(String str, String str2) {
        this.f52918d = str;
        this.f52919e = str2;
    }

    public C19202b(String str, String str2, long j) {
        this.f52918d = str;
        this.f52919e = str2;
        this.f52920f = j;
    }
}

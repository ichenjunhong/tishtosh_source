package com.linecorp.linesdk.p1086a;

/* renamed from: com.linecorp.linesdk.a.d */
public final class C18214d {

    /* renamed from: a */
    public final String f50271a;

    /* renamed from: b */
    public final long f50272b;

    /* renamed from: c */
    public final long f50273c;

    /* renamed from: d */
    public final String f50274d;

    public final int hashCode() {
        return (((((this.f50271a.hashCode() * 31) + ((int) (this.f50272b ^ (this.f50272b >>> 32)))) * 31) + ((int) (this.f50273c ^ (this.f50273c >>> 32)))) * 31) + this.f50274d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalAccessToken{accessToken='#####', expiresInMillis=");
        sb.append(this.f50272b);
        sb.append(", issuedClientTimeMillis=");
        sb.append(this.f50273c);
        sb.append(", refreshToken='");
        sb.append(this.f50274d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18214d dVar = (C18214d) obj;
        if (this.f50272b == dVar.f50272b && this.f50273c == dVar.f50273c && this.f50271a.equals(dVar.f50271a)) {
            return this.f50274d.equals(dVar.f50274d);
        }
        return false;
    }

    public C18214d(String str, long j, long j2, String str2) {
        this.f50271a = str;
        this.f50272b = j;
        this.f50273c = j2;
        this.f50274d = str2;
    }
}

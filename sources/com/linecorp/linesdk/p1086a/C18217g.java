package com.linecorp.linesdk.p1086a;

/* renamed from: com.linecorp.linesdk.a.g */
public final class C18217g {

    /* renamed from: a */
    public final String f50279a;

    /* renamed from: b */
    public final long f50280b;

    /* renamed from: c */
    public final String f50281c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefreshTokenResult{accessToken='#####', expiresInMillis=");
        sb.append(this.f50280b);
        sb.append(", refreshToken='#####'}");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f50279a.hashCode() * 31) + ((int) (this.f50280b ^ (this.f50280b >>> 32)))) * 31;
        if (this.f50281c != null) {
            i = this.f50281c.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18217g gVar = (C18217g) obj;
        if (this.f50280b != gVar.f50280b || !this.f50279a.equals(gVar.f50279a)) {
            return false;
        }
        if (this.f50281c != null) {
            return this.f50281c.equals(gVar.f50281c);
        }
        if (gVar.f50281c == null) {
            return true;
        }
        return false;
    }

    public C18217g(String str, long j, String str2) {
        this.f50279a = str;
        this.f50280b = j;
        this.f50281c = str2;
    }
}

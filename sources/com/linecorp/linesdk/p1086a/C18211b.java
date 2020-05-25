package com.linecorp.linesdk.p1086a;

import java.util.Collections;
import java.util.List;

/* renamed from: com.linecorp.linesdk.a.b */
public final class C18211b {

    /* renamed from: a */
    public final long f50265a;

    /* renamed from: b */
    public final List<String> f50266b;

    /* renamed from: c */
    private final String f50267c;

    public final int hashCode() {
        return (((Integer.valueOf(this.f50267c).intValue() * 31) + ((int) (this.f50265a ^ (this.f50265a >>> 32)))) * 31) + this.f50266b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessTokenVerificationResult{expiresInMillis=");
        sb.append(this.f50265a);
        sb.append(", channelId=");
        sb.append(this.f50267c);
        sb.append(", permissions=");
        sb.append(this.f50266b);
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
        C18211b bVar = (C18211b) obj;
        if (this.f50267c.equals(bVar.f50267c) && this.f50265a == bVar.f50265a) {
            return this.f50266b.equals(bVar.f50266b);
        }
        return false;
    }

    public C18211b(String str, long j, List<String> list) {
        this.f50267c = str;
        this.f50265a = j;
        this.f50266b = Collections.unmodifiableList(list);
    }
}

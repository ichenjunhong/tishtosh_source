package com.p683ss.android.http.p1169a.p1172b;

import com.p683ss.android.http.p1169a.C19186d;
import com.p683ss.android.http.p1169a.p1174d.C19188b;
import com.p683ss.android.http.p1169a.p1174d.C19190d;

/* renamed from: com.ss.android.http.a.b.e */
public final class C19180e implements C19186d, Cloneable {

    /* renamed from: a */
    private final String f52876a;

    /* renamed from: b */
    private final String f52877b;

    /* renamed from: a */
    public final String mo39131a() {
        return this.f52876a;
    }

    /* renamed from: b */
    public final String mo39132b() {
        return this.f52877b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int hashCode() {
        return C19190d.m46779a(C19190d.m46779a(17, (Object) this.f52876a), (Object) this.f52877b);
    }

    public final String toString() {
        int length = this.f52876a.length();
        if (this.f52877b != null) {
            length += this.f52877b.length() + 1;
        }
        C19188b bVar = new C19188b(length);
        bVar.mo39151a(this.f52876a);
        if (this.f52877b != null) {
            bVar.mo39151a("=");
            bVar.mo39151a(this.f52877b);
        }
        return bVar.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19186d)) {
            return false;
        }
        C19180e eVar = (C19180e) obj;
        if (!this.f52876a.equals(eVar.f52876a) || !C19190d.m46780a((Object) this.f52877b, (Object) eVar.f52877b)) {
            return false;
        }
        return true;
    }

    public C19180e(String str, String str2) {
        if (str != null) {
            this.f52876a = str;
            this.f52877b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}

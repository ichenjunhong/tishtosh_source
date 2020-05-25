package com.google.p1057b.p1059b;

import com.google.p1057b.p1058a.C17413h;
import com.google.p1057b.p1058a.C17417i;
import com.google.p1057b.p1058a.C17421k;

/* renamed from: com.google.b.b.e */
public final class C17452e {

    /* renamed from: a */
    public final long f49011a = 0;

    /* renamed from: b */
    public final long f49012b = 0;

    /* renamed from: c */
    public final long f49013c = 0;

    /* renamed from: d */
    public final long f49014d = 0;

    /* renamed from: e */
    public final long f49015e = 0;

    /* renamed from: f */
    public final long f49016f = 0;

    public final int hashCode() {
        return C17417i.m42645a(Long.valueOf(this.f49011a), Long.valueOf(this.f49012b), Long.valueOf(this.f49013c), Long.valueOf(this.f49014d), Long.valueOf(this.f49015e), Long.valueOf(this.f49016f));
    }

    public final String toString() {
        return C17413h.m42637a(this).mo33742a("hitCount", this.f49011a).mo33742a("missCount", this.f49012b).mo33742a("loadSuccessCount", this.f49013c).mo33742a("loadExceptionCount", this.f49014d).mo33742a("totalLoadTime", this.f49015e).mo33742a("evictionCount", this.f49016f).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17452e)) {
            return false;
        }
        C17452e eVar = (C17452e) obj;
        if (this.f49011a == eVar.f49011a && this.f49012b == eVar.f49012b && this.f49013c == eVar.f49013c && this.f49014d == eVar.f49014d && this.f49015e == eVar.f49015e && this.f49016f == eVar.f49016f) {
            return true;
        }
        return false;
    }

    public C17452e(long j, long j2, long j3, long j4, long j5, long j6) {
        C17421k.m42659a(true);
        C17421k.m42659a(true);
        C17421k.m42659a(true);
        C17421k.m42659a(true);
        C17421k.m42659a(true);
        C17421k.m42659a(true);
    }
}

package com.p683ss.android.ugc.aweme.crossplatform.p1612a;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.a.b */
public final class C27095b {

    /* renamed from: e */
    public static final C27096a f71464e = new C27096a(null);

    /* renamed from: a */
    public final String f71465a;

    /* renamed from: b */
    public final int f71466b;

    /* renamed from: c */
    public final long f71467c;

    /* renamed from: d */
    public final String f71468d;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.a.b$a */
    public static final class C27096a {
        private C27096a() {
        }

        public /* synthetic */ C27096a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27095b) {
                C27095b bVar = (C27095b) obj;
                if (C52711k.m112239a((Object) this.f71465a, (Object) bVar.f71465a)) {
                    if (this.f71466b == bVar.f71466b) {
                        if (!(this.f71467c == bVar.f71467c) || !C52711k.m112239a((Object) this.f71468d, (Object) bVar.f71468d)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f71465a;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.f71466b)) * 31) + Long.hashCode(this.f71467c)) * 31;
        String str2 = this.f71468d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongVideoStatusEvent(sessionId=");
        sb.append(this.f71465a);
        sb.append(", status=");
        sb.append(this.f71466b);
        sb.append(", currentTime=");
        sb.append(this.f71467c);
        sb.append(", currentId=");
        sb.append(this.f71468d);
        sb.append(")");
        return sb.toString();
    }

    public C27095b(String str, int i, long j, String str2) {
        C52711k.m112240b(str, "sessionId");
        C52711k.m112240b(str2, "currentId");
        this.f71465a = str;
        this.f71466b = i;
        this.f71467c = j;
        this.f71468d = str2;
    }
}

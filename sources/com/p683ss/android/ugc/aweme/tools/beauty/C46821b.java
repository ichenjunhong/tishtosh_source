package com.p683ss.android.ugc.aweme.tools.beauty;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.b */
public final class C46821b {

    /* renamed from: c */
    public static final C46822a f118298c = new C46822a(null);

    /* renamed from: a */
    public final String f118299a;

    /* renamed from: b */
    public final int f118300b;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.b$a */
    public static final class C46822a {
        private C46822a() {
        }

        public /* synthetic */ C46822a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46821b) {
                C46821b bVar = (C46821b) obj;
                if (C52711k.m112239a((Object) this.f118299a, (Object) bVar.f118299a)) {
                    if (this.f118300b == bVar.f118300b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f118299a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f118300b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeautySequence(effectId=");
        sb.append(this.f118299a);
        sb.append(", type=");
        sb.append(this.f118300b);
        sb.append(")");
        return sb.toString();
    }

    public C46821b(String str, int i) {
        C52711k.m112240b(str, "effectId");
        this.f118299a = str;
        this.f118300b = i;
    }

    public /* synthetic */ C46821b(String str, int i, int i2, C52707g gVar) {
        this(str, 1);
    }
}

package com.p683ss.android.ugc.aweme.proaccount;

import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.proaccount.a */
public final class C39675a {

    /* renamed from: a */
    public final String f101256a;

    /* renamed from: b */
    public final int f101257b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39675a) {
                C39675a aVar = (C39675a) obj;
                if (C52711k.m112239a((Object) this.f101256a, (Object) aVar.f101256a)) {
                    if (this.f101257b == aVar.f101257b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f101256a;
        return ((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.f101257b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Gender(name=");
        sb.append(this.f101256a);
        sb.append(", id=");
        sb.append(this.f101257b);
        sb.append(")");
        return sb.toString();
    }

    public C39675a(String str, int i) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        this.f101256a = str;
        this.f101257b = i;
    }
}

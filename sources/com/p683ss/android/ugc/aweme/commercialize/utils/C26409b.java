package com.p683ss.android.ugc.aweme.commercialize.utils;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b */
public final class C26409b {

    /* renamed from: a */
    public final String f69659a;

    /* renamed from: b */
    public final boolean f69660b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b$a */
    public static final class C26410a {

        /* renamed from: a */
        public String f69661a = "";

        /* renamed from: b */
        public boolean f69662b = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26409b) {
                C26409b bVar = (C26409b) obj;
                if (C52711k.m112239a((Object) this.f69659a, (Object) bVar.f69659a)) {
                    if (this.f69660b == bVar.f69660b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f69659a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f69660b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdCardActionParams(clickFrom=");
        sb.append(this.f69659a);
        sb.append(", needLog=");
        sb.append(this.f69660b);
        sb.append(")");
        return sb.toString();
    }

    private C26409b(String str, boolean z) {
        this.f69659a = str;
        this.f69660b = z;
    }

    public /* synthetic */ C26409b(String str, boolean z, C52707g gVar) {
        this(str, z);
    }
}

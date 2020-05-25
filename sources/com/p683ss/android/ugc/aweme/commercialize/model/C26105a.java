package com.p683ss.android.ugc.aweme.commercialize.model;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.a */
public final class C26105a {

    /* renamed from: a */
    public final int f68909a;

    /* renamed from: b */
    public final String f68910b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26105a) {
                C26105a aVar = (C26105a) obj;
                if (!(this.f68909a == aVar.f68909a) || !C52711k.m112239a((Object) this.f68910b, (Object) aVar.f68910b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f68909a) * 31;
        String str = this.f68910b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdHalfWebPageShowParams(delay=");
        sb.append(this.f68909a);
        sb.append(", eventType=");
        sb.append(this.f68910b);
        sb.append(")");
        return sb.toString();
    }

    public C26105a(int i, String str) {
        this.f68909a = i;
        this.f68910b = str;
    }
}

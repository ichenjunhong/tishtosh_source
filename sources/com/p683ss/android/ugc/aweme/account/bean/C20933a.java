package com.p683ss.android.ugc.aweme.account.bean;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.bean.a */
public final class C20933a {

    /* renamed from: d */
    public static final C20934a f56960d = new C20934a(null);

    /* renamed from: a */
    public final String f56961a;

    /* renamed from: b */
    public final String f56962b;

    /* renamed from: c */
    public final boolean f56963c;

    /* renamed from: com.ss.android.ugc.aweme.account.bean.a$a */
    public static final class C20934a {
        private C20934a() {
        }

        public /* synthetic */ C20934a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20933a) {
                C20933a aVar = (C20933a) obj;
                if (C52711k.m112239a((Object) this.f56961a, (Object) aVar.f56961a) && C52711k.m112239a((Object) this.f56962b, (Object) aVar.f56962b)) {
                    if (this.f56963c == aVar.f56963c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f56961a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f56962b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f56963c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppBindRequest(platformName=");
        sb.append(this.f56961a);
        sb.append(", bindKey=");
        sb.append(this.f56962b);
        sb.append(", actionBool=");
        sb.append(this.f56963c);
        sb.append(")");
        return sb.toString();
    }
}

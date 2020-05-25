package com.p683ss.android.ugc.aweme.p1482bw.p1483a;

import android.os.Bundle;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bw.a.c */
public final class C24432c {

    /* renamed from: g */
    public static final C24433a f64810g = new C24433a(null);

    /* renamed from: a */
    public final String f64811a;

    /* renamed from: b */
    public final int f64812b;

    /* renamed from: c */
    public final boolean f64813c;

    /* renamed from: d */
    public final Bundle f64814d;

    /* renamed from: e */
    public final String f64815e;

    /* renamed from: f */
    public final String f64816f;

    /* renamed from: com.ss.android.ugc.aweme.bw.a.c$a */
    public static final class C24433a {
        private C24433a() {
        }

        public /* synthetic */ C24433a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C24432c m59808a(String str, int i, boolean z, Bundle bundle, String str2, String str3) {
            C24432c cVar = new C24432c(str, i, z, bundle, str2, str3);
            return cVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24432c) {
                C24432c cVar = (C24432c) obj;
                if (C52711k.m112239a((Object) this.f64811a, (Object) cVar.f64811a)) {
                    if (this.f64812b == cVar.f64812b) {
                        if (!(this.f64813c == cVar.f64813c) || !C52711k.m112239a((Object) this.f64814d, (Object) cVar.f64814d) || !C52711k.m112239a((Object) this.f64815e, (Object) cVar.f64815e) || !C52711k.m112239a((Object) this.f64816f, (Object) cVar.f64816f)) {
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
        String str = this.f64811a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f64812b) * 31;
        boolean z = this.f64813c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        Bundle bundle = this.f64814d;
        int hashCode2 = (i2 + (bundle != null ? bundle.hashCode() : 0)) * 31;
        String str2 = this.f64815e;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f64816f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseMusicRequestBean(title=");
        sb.append(this.f64811a);
        sb.append(", musicChooseType=");
        sb.append(this.f64812b);
        sb.append(", allowClear=");
        sb.append(this.f64813c);
        sb.append(", bundle=");
        sb.append(this.f64814d);
        sb.append(", shootWay=");
        sb.append(this.f64815e);
        sb.append(", creationId=");
        sb.append(this.f64816f);
        sb.append(")");
        return sb.toString();
    }

    public C24432c(String str, int i, boolean z, Bundle bundle, String str2, String str3) {
        this.f64811a = str;
        this.f64812b = i;
        this.f64813c = z;
        this.f64814d = bundle;
        this.f64815e = str2;
        this.f64816f = str3;
    }
}

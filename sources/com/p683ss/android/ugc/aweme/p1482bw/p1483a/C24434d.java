package com.p683ss.android.ugc.aweme.p1482bw.p1483a;

import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bw.a.d */
public final class C24434d {

    /* renamed from: f */
    public static final C24435a f64817f = new C24435a(null);

    /* renamed from: a */
    public final boolean f64818a;

    /* renamed from: b */
    public final String f64819b;

    /* renamed from: c */
    public final C42482c f64820c;

    /* renamed from: d */
    public final String f64821d;

    /* renamed from: e */
    public final boolean f64822e;

    /* renamed from: com.ss.android.ugc.aweme.bw.a.d$a */
    public static final class C24435a {
        private C24435a() {
        }

        public /* synthetic */ C24435a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C24434d m59809a(Boolean bool, String str, C42482c cVar, String str2) {
            boolean z;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            C24434d dVar = new C24434d(z, str, cVar, str2, false, 16, null);
            return dVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24434d) {
                C24434d dVar = (C24434d) obj;
                if ((this.f64818a == dVar.f64818a) && C52711k.m112239a((Object) this.f64819b, (Object) dVar.f64819b) && C52711k.m112239a((Object) this.f64820c, (Object) dVar.f64820c) && C52711k.m112239a((Object) this.f64821d, (Object) dVar.f64821d)) {
                    if (this.f64822e == dVar.f64822e) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f64818a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        String str = this.f64819b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        C42482c cVar = this.f64820c;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str2 = this.f64821d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i4 = (hashCode2 + i3) * 31;
        boolean z2 = this.f64822e;
        if (!z2) {
            i = z2;
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseMusicResultBean(isCancelCurrentMusic=");
        sb.append(this.f64818a);
        sb.append(", musicOrigin=");
        sb.append(this.f64819b);
        sb.append(", music=");
        sb.append(this.f64820c);
        sb.append(", musicLocalPath=");
        sb.append(this.f64821d);
        sb.append(", isShowTips=");
        sb.append(this.f64822e);
        sb.append(")");
        return sb.toString();
    }

    public C24434d(boolean z, String str, C42482c cVar, String str2, boolean z2) {
        this.f64818a = z;
        this.f64819b = str;
        this.f64820c = cVar;
        this.f64821d = str2;
        this.f64822e = z2;
    }

    public /* synthetic */ C24434d(boolean z, String str, C42482c cVar, String str2, boolean z2, int i, C52707g gVar) {
        this(z, str, cVar, str2, true);
    }
}

package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c */
public final class C26448c {

    /* renamed from: a */
    public final Aweme f69711a;

    /* renamed from: b */
    public final String f69712b;

    /* renamed from: c */
    public final String f69713c;

    /* renamed from: d */
    public final String f69714d;

    /* renamed from: e */
    public final String f69715e;

    /* renamed from: f */
    public final String f69716f;

    /* renamed from: g */
    public final boolean f69717g;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c$a */
    public static final class C26449a {

        /* renamed from: a */
        private Aweme f69718a;

        /* renamed from: b */
        private String f69719b = "";

        /* renamed from: c */
        private String f69720c = "";

        /* renamed from: d */
        private String f69721d = "";

        /* renamed from: e */
        private String f69722e = "";

        /* renamed from: f */
        private String f69723f = "";

        /* renamed from: g */
        private boolean f69724g;

        /* renamed from: a */
        public final C26448c mo54170a() {
            C26448c cVar = new C26448c(this.f69718a, this.f69719b, this.f69720c, this.f69721d, this.f69722e, this.f69723f, this.f69724g, null);
            return cVar;
        }

        /* renamed from: a */
        public final C26449a mo54169a(boolean z) {
            C26449a aVar = this;
            aVar.f69724g = z;
            return aVar;
        }

        /* renamed from: a */
        public final C26449a mo54167a(Aweme aweme) {
            C52711k.m112240b(aweme, "aweme");
            C26449a aVar = this;
            aVar.f69718a = aweme;
            return aVar;
        }

        /* renamed from: b */
        public final C26449a mo54171b(String str) {
            C52711k.m112240b(str, "refer");
            C26449a aVar = this;
            aVar.f69720c = str;
            return aVar;
        }

        /* renamed from: c */
        public final C26449a mo54172c(String str) {
            C52711k.m112240b(str, "showFailReason");
            C26449a aVar = this;
            aVar.f69721d = str;
            return aVar;
        }

        /* renamed from: d */
        public final C26449a mo54173d(String str) {
            C52711k.m112240b(str, "cardType");
            C26449a aVar = this;
            aVar.f69722e = str;
            return aVar;
        }

        /* renamed from: e */
        public final C26449a mo54174e(String str) {
            C52711k.m112240b(str, "status");
            C26449a aVar = this;
            aVar.f69723f = str;
            return aVar;
        }

        /* renamed from: a */
        public final C26449a mo54168a(String str) {
            C52711k.m112240b(str, "label");
            C26449a aVar = this;
            aVar.f69719b = str;
            return aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26448c) {
                C26448c cVar = (C26448c) obj;
                if (C52711k.m112239a((Object) this.f69711a, (Object) cVar.f69711a) && C52711k.m112239a((Object) this.f69712b, (Object) cVar.f69712b) && C52711k.m112239a((Object) this.f69713c, (Object) cVar.f69713c) && C52711k.m112239a((Object) this.f69714d, (Object) cVar.f69714d) && C52711k.m112239a((Object) this.f69715e, (Object) cVar.f69715e) && C52711k.m112239a((Object) this.f69716f, (Object) cVar.f69716f)) {
                    if (this.f69717g == cVar.f69717g) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f69711a;
        int i = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f69712b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f69713c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f69714d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f69715e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f69716f;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.f69717g;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        boolean z;
        boolean z2;
        StringBuilder sb = new StringBuilder("label=");
        sb.append(this.f69712b);
        sb.append(", refer=");
        sb.append(this.f69713c);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        boolean z3 = false;
        if (this.f69714d.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sb3 = new StringBuilder(", showFailReason=");
            sb3.append(this.f69714d);
            sb2.append(sb3.toString());
        }
        if (this.f69715e.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            StringBuilder sb4 = new StringBuilder(", cardType=");
            sb4.append(this.f69715e);
            sb2.append(sb4.toString());
        }
        if (this.f69716f.length() > 0) {
            z3 = true;
        }
        if (z3) {
            StringBuilder sb5 = new StringBuilder(", status=");
            sb5.append(this.f69716f);
            sb2.append(sb5.toString());
        }
        if (this.f69711a != null) {
            StringBuilder sb6 = new StringBuilder(", aweme_id=");
            sb6.append(this.f69711a.getAid());
            sb2.append(sb6.toString());
        }
        StringBuilder sb7 = new StringBuilder("ispreload=");
        sb7.append(this.f69717g);
        sb2.append(sb7.toString());
        String sb8 = sb2.toString();
        C52711k.m112236a((Object) sb8, "builder.toString()");
        return sb8;
    }

    private C26448c(Aweme aweme, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.f69711a = aweme;
        this.f69712b = str;
        this.f69713c = str2;
        this.f69714d = str3;
        this.f69715e = str4;
        this.f69716f = str5;
        this.f69717g = z;
    }

    public /* synthetic */ C26448c(Aweme aweme, String str, String str2, String str3, String str4, String str5, boolean z, C52707g gVar) {
        this(aweme, str, str2, str3, str4, str5, z);
    }
}

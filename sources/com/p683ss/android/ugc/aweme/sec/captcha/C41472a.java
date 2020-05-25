package com.p683ss.android.ugc.aweme.sec.captcha;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sec.captcha.a */
public final class C41472a {

    /* renamed from: a */
    public String f105135a;

    /* renamed from: b */
    public int f105136b;

    /* renamed from: c */
    public String f105137c;

    /* renamed from: d */
    public String f105138d;

    /* renamed from: e */
    public String f105139e;

    /* renamed from: f */
    public String f105140f;

    /* renamed from: g */
    public String f105141g;

    /* renamed from: h */
    public int f105142h;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41472a) {
                C41472a aVar = (C41472a) obj;
                if (C52711k.m112239a((Object) this.f105135a, (Object) aVar.f105135a)) {
                    if ((this.f105136b == aVar.f105136b) && C52711k.m112239a((Object) this.f105137c, (Object) aVar.f105137c) && C52711k.m112239a((Object) this.f105138d, (Object) aVar.f105138d) && C52711k.m112239a((Object) this.f105139e, (Object) aVar.f105139e) && C52711k.m112239a((Object) this.f105140f, (Object) aVar.f105140f) && C52711k.m112239a((Object) this.f105141g, (Object) aVar.f105141g)) {
                        if (this.f105142h == aVar.f105142h) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f105135a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f105136b) * 31;
        String str2 = this.f105137c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f105138d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f105139e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f105140f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f105141g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.f105142h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptchaParams(language=");
        sb.append(this.f105135a);
        sb.append(", aid=");
        sb.append(this.f105136b);
        sb.append(", appName=");
        sb.append(this.f105137c);
        sb.append(", iid=");
        sb.append(this.f105138d);
        sb.append(", did=");
        sb.append(this.f105139e);
        sb.append(", channel=");
        sb.append(this.f105140f);
        sb.append(", session=");
        sb.append(this.f105141g);
        sb.append(", errorCode=");
        sb.append(this.f105142h);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo84217a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f105138d = str;
    }

    /* renamed from: b */
    public final void mo84218b(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f105139e = str;
    }

    private C41472a(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2) {
        C52711k.m112240b(str, "language");
        C52711k.m112240b(str2, "appName");
        C52711k.m112240b(str3, "iid");
        C52711k.m112240b(str4, "did");
        C52711k.m112240b(str5, "channel");
        C52711k.m112240b(str6, "session");
        this.f105135a = str;
        this.f105136b = i;
        this.f105137c = str2;
        this.f105138d = str3;
        this.f105139e = str4;
        this.f105140f = str5;
        this.f105141g = str6;
        this.f105142h = i2;
    }

    public /* synthetic */ C41472a(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, int i3, C52707g gVar) {
        this(str, i, str2, str3, str4, str5, str6, 3058);
    }
}

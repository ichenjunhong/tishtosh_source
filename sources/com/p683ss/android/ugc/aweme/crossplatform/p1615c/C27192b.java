package com.p683ss.android.ugc.aweme.crossplatform.p1615c;

import com.p683ss.android.ugc.aweme.commercialize.utils.C26384ak;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.b */
public final class C27192b {

    /* renamed from: A */
    public boolean f71737A;

    /* renamed from: B */
    public boolean f71738B;

    /* renamed from: C */
    public String f71739C;

    /* renamed from: D */
    public String f71740D;

    /* renamed from: E */
    public String f71741E;

    /* renamed from: F */
    public boolean f71742F;

    /* renamed from: G */
    public boolean f71743G;

    /* renamed from: H */
    public String f71744H;

    /* renamed from: I */
    public long f71745I;

    /* renamed from: a */
    public long f71746a;

    /* renamed from: b */
    public String f71747b;

    /* renamed from: c */
    public int f71748c;

    /* renamed from: d */
    public boolean f71749d;

    /* renamed from: e */
    public String f71750e;

    /* renamed from: f */
    public String f71751f;

    /* renamed from: g */
    public String f71752g;

    /* renamed from: h */
    public String f71753h;

    /* renamed from: i */
    public String f71754i;

    /* renamed from: j */
    public String f71755j;

    /* renamed from: k */
    public String f71756k;

    /* renamed from: l */
    public boolean f71757l;

    /* renamed from: m */
    public String f71758m;

    /* renamed from: n */
    public boolean f71759n;

    /* renamed from: o */
    public boolean f71760o;

    /* renamed from: p */
    public boolean f71761p;

    /* renamed from: q */
    public String f71762q;

    /* renamed from: r */
    public String f71763r;

    /* renamed from: s */
    public boolean f71764s;

    /* renamed from: t */
    public String f71765t;

    /* renamed from: u */
    public String f71766u;

    /* renamed from: v */
    public int f71767v;

    /* renamed from: w */
    public int f71768w;

    /* renamed from: x */
    public boolean f71769x;

    /* renamed from: y */
    public int f71770y;

    /* renamed from: z */
    public String f71771z;

    public C27192b() {
        this(0, null, 0, false, null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, null, null, 0, 0, false, 0, null, false, false, null, null, null, false, false, null, 0, -1, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27192b) {
                C27192b bVar = (C27192b) obj;
                if ((this.f71746a == bVar.f71746a) && C52711k.m112239a((Object) this.f71747b, (Object) bVar.f71747b)) {
                    if (this.f71748c == bVar.f71748c) {
                        if ((this.f71749d == bVar.f71749d) && C52711k.m112239a((Object) this.f71750e, (Object) bVar.f71750e) && C52711k.m112239a((Object) this.f71751f, (Object) bVar.f71751f) && C52711k.m112239a((Object) this.f71752g, (Object) bVar.f71752g) && C52711k.m112239a((Object) this.f71753h, (Object) bVar.f71753h) && C52711k.m112239a((Object) this.f71754i, (Object) bVar.f71754i) && C52711k.m112239a((Object) this.f71755j, (Object) bVar.f71755j) && C52711k.m112239a((Object) this.f71756k, (Object) bVar.f71756k)) {
                            if ((this.f71757l == bVar.f71757l) && C52711k.m112239a((Object) this.f71758m, (Object) bVar.f71758m)) {
                                if (this.f71759n == bVar.f71759n) {
                                    if (this.f71760o == bVar.f71760o) {
                                        if ((this.f71761p == bVar.f71761p) && C52711k.m112239a((Object) this.f71762q, (Object) bVar.f71762q) && C52711k.m112239a((Object) this.f71763r, (Object) bVar.f71763r)) {
                                            if ((this.f71764s == bVar.f71764s) && C52711k.m112239a((Object) this.f71765t, (Object) bVar.f71765t) && C52711k.m112239a((Object) this.f71766u, (Object) bVar.f71766u)) {
                                                if (this.f71767v == bVar.f71767v) {
                                                    if (this.f71768w == bVar.f71768w) {
                                                        if (this.f71769x == bVar.f71769x) {
                                                            if ((this.f71770y == bVar.f71770y) && C52711k.m112239a((Object) this.f71771z, (Object) bVar.f71771z)) {
                                                                if (this.f71737A == bVar.f71737A) {
                                                                    if ((this.f71738B == bVar.f71738B) && C52711k.m112239a((Object) this.f71739C, (Object) bVar.f71739C) && C52711k.m112239a((Object) this.f71740D, (Object) bVar.f71740D) && C52711k.m112239a((Object) this.f71741E, (Object) bVar.f71741E)) {
                                                                        if (this.f71742F == bVar.f71742F) {
                                                                            if ((this.f71743G == bVar.f71743G) && C52711k.m112239a((Object) this.f71744H, (Object) bVar.f71744H)) {
                                                                                if (this.f71745I == bVar.f71745I) {
                                                                                    return true;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f71746a) * 31;
        String str = this.f71747b;
        int i = 0;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.f71748c)) * 31;
        boolean z = this.f71749d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str2 = this.f71750e;
        int hashCode3 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f71751f;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f71752g;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f71753h;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f71754i;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f71755j;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f71756k;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        boolean z2 = this.f71757l;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode9 + (z2 ? 1 : 0)) * 31;
        String str9 = this.f71758m;
        int hashCode10 = (i3 + (str9 != null ? str9.hashCode() : 0)) * 31;
        boolean z3 = this.f71759n;
        if (z3) {
            z3 = true;
        }
        int i4 = (hashCode10 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f71760o;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f71761p;
        if (z5) {
            z5 = true;
        }
        int i6 = (i5 + (z5 ? 1 : 0)) * 31;
        String str10 = this.f71762q;
        int hashCode11 = (i6 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f71763r;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        boolean z6 = this.f71764s;
        if (z6) {
            z6 = true;
        }
        int i7 = (hashCode12 + (z6 ? 1 : 0)) * 31;
        String str12 = this.f71765t;
        int hashCode13 = (i7 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f71766u;
        int hashCode14 = (((((hashCode13 + (str13 != null ? str13.hashCode() : 0)) * 31) + Integer.hashCode(this.f71767v)) * 31) + Integer.hashCode(this.f71768w)) * 31;
        boolean z7 = this.f71769x;
        if (z7) {
            z7 = true;
        }
        int hashCode15 = (((hashCode14 + (z7 ? 1 : 0)) * 31) + Integer.hashCode(this.f71770y)) * 31;
        String str14 = this.f71771z;
        int hashCode16 = (hashCode15 + (str14 != null ? str14.hashCode() : 0)) * 31;
        boolean z8 = this.f71737A;
        if (z8) {
            z8 = true;
        }
        int i8 = (hashCode16 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.f71738B;
        if (z9) {
            z9 = true;
        }
        int i9 = (i8 + (z9 ? 1 : 0)) * 31;
        String str15 = this.f71739C;
        int hashCode17 = (i9 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.f71740D;
        int hashCode18 = (hashCode17 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.f71741E;
        int hashCode19 = (hashCode18 + (str17 != null ? str17.hashCode() : 0)) * 31;
        boolean z10 = this.f71742F;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode19 + (z10 ? 1 : 0)) * 31;
        boolean z11 = this.f71743G;
        if (z11) {
            z11 = true;
        }
        int i11 = (i10 + (z11 ? 1 : 0)) * 31;
        String str18 = this.f71744H;
        if (str18 != null) {
            i = str18.hashCode();
        }
        return ((i11 + i) * 31) + Long.hashCode(this.f71745I);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceInfo(adId=");
        sb.append(this.f71746a);
        sb.append(", adType=");
        sb.append(this.f71747b);
        sb.append(", adSystemOrigin=");
        sb.append(this.f71748c);
        sb.append(", isFromAppAd=");
        sb.append(this.f71749d);
        sb.append(", downloadUrl=");
        sb.append(this.f71750e);
        sb.append(", downloadAppName=");
        sb.append(this.f71751f);
        sb.append(", downloadPkgName=");
        sb.append(this.f71752g);
        sb.append(", downloadAppExtra=");
        sb.append(this.f71753h);
        sb.append(", logExtra=");
        sb.append(this.f71754i);
        sb.append(", gdLabel=");
        sb.append(this.f71755j);
        sb.append(", gdExtJson=");
        sb.append(this.f71756k);
        sb.append(", disableDownloadDialog=");
        sb.append(this.f71757l);
        sb.append(", creativeId=");
        sb.append(this.f71758m);
        sb.append(", showDownloadStatusBar=");
        sb.append(this.f71759n);
        sb.append(", forbidJump=");
        sb.append(this.f71760o);
        sb.append(", canSendStat=");
        sb.append(this.f71761p);
        sb.append(", adJsUrl=");
        sb.append(this.f71762q);
        sb.append(", douPlusMonitorUrl=");
        sb.append(this.f71763r);
        sb.append(", douPlusFullProcessMonitor=");
        sb.append(this.f71764s);
        sb.append(", quickAppUrl=");
        sb.append(this.f71765t);
        sb.append(", preloadChannel=");
        sb.append(this.f71766u);
        sb.append(", preloadWeb=");
        sb.append(this.f71767v);
        sb.append(", useWebUrl=");
        sb.append(this.f71768w);
        sb.append(", interceptEPlatform=");
        sb.append(this.f71769x);
        sb.append(", webType=");
        sb.append(this.f71770y);
        sb.append(", quickShopEnterFrom=");
        sb.append(this.f71771z);
        sb.append(", isFromCommentAppAd=");
        sb.append(this.f71737A);
        sb.append(", enableWebReport=");
        sb.append(this.f71738B);
        sb.append(", hasAdInfoJson=");
        sb.append(this.f71739C);
        sb.append(", adInfoJson=");
        sb.append(this.f71740D);
        sb.append(", commerceEnterFrom=");
        sb.append(this.f71741E);
        sb.append(", openBrowserToDownloadApk=");
        sb.append(this.f71742F);
        sb.append(", isEnableCardPreload=");
        sb.append(this.f71743G);
        sb.append(", challengeId=");
        sb.append(this.f71744H);
        sb.append(", userClickTime=");
        sb.append(this.f71745I);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final JSONObject mo55536a() {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.f71746a);
            jSONObject.put("ad_type", this.f71748c);
            jSONObject.put("log_extra", this.f71754i);
            jSONObject.put("download_url", this.f71750e);
            jSONObject.put("package_name", this.f71752g);
            jSONObject.put("app_name", this.f71751f);
            String str = "code";
            if (this.f71746a == 0) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put(str, i);
            C26384ak.f69607d.mo54105a(this.f71746a, this.f71754i);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private C27192b(long j, String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, String str9, boolean z3, boolean z4, boolean z5, String str10, String str11, boolean z6, String str12, String str13, int i2, int i3, boolean z7, int i4, String str14, boolean z8, boolean z9, String str15, String str16, String str17, boolean z10, boolean z11, String str18, long j2) {
        this.f71746a = j;
        this.f71747b = str;
        this.f71748c = i;
        this.f71749d = z;
        this.f71750e = str2;
        this.f71751f = str3;
        this.f71752g = str4;
        this.f71753h = str5;
        this.f71754i = str6;
        this.f71755j = str7;
        this.f71756k = str8;
        this.f71757l = z2;
        this.f71758m = str9;
        this.f71759n = z3;
        this.f71760o = z4;
        this.f71761p = z5;
        this.f71762q = str10;
        this.f71763r = str11;
        this.f71764s = z6;
        this.f71765t = str12;
        this.f71766u = str13;
        this.f71767v = i2;
        this.f71768w = i3;
        this.f71769x = z7;
        this.f71770y = i4;
        this.f71771z = str14;
        this.f71737A = z8;
        this.f71738B = z9;
        this.f71739C = str15;
        this.f71740D = str16;
        this.f71741E = str17;
        this.f71742F = z10;
        this.f71743G = z11;
        this.f71744H = str18;
        this.f71745I = j2;
    }

    private /* synthetic */ C27192b(long j, String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, String str9, boolean z3, boolean z4, boolean z5, String str10, String str11, boolean z6, String str12, String str13, int i2, int i3, boolean z7, int i4, String str14, boolean z8, boolean z9, String str15, String str16, String str17, boolean z10, boolean z11, String str18, long j2, int i5, int i6, C52707g gVar) {
        this(0, "", 0, false, null, null, null, null, null, null, null, true, null, false, false, false, null, null, false, null, null, 0, 0, false, 0, null, false, false, null, null, null, false, true, null, 0);
    }
}

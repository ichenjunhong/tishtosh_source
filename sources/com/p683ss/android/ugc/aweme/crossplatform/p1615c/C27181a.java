package com.p683ss.android.ugc.aweme.crossplatform.p1615c;

import android.os.Bundle;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.a */
public final class C27181a {

    /* renamed from: a */
    public Integer f71704a;

    /* renamed from: b */
    public Bundle f71705b;

    /* renamed from: c */
    public String f71706c;

    /* renamed from: d */
    public boolean f71707d;

    /* renamed from: e */
    public String f71708e;

    /* renamed from: f */
    public String f71709f;

    /* renamed from: g */
    public boolean f71710g;

    /* renamed from: h */
    public boolean f71711h;

    /* renamed from: i */
    public boolean f71712i;

    /* renamed from: j */
    public String f71713j;

    /* renamed from: k */
    public boolean f71714k;

    /* renamed from: l */
    public boolean f71715l;

    /* renamed from: m */
    public String f71716m;

    /* renamed from: n */
    public boolean f71717n;

    public C27181a() {
        this(null, null, null, false, null, null, false, false, false, null, false, false, null, false, 16383, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27181a) {
                C27181a aVar = (C27181a) obj;
                if (C52711k.m112239a((Object) this.f71704a, (Object) aVar.f71704a) && C52711k.m112239a((Object) this.f71705b, (Object) aVar.f71705b) && C52711k.m112239a((Object) this.f71706c, (Object) aVar.f71706c)) {
                    if ((this.f71707d == aVar.f71707d) && C52711k.m112239a((Object) this.f71708e, (Object) aVar.f71708e) && C52711k.m112239a((Object) this.f71709f, (Object) aVar.f71709f)) {
                        if (this.f71710g == aVar.f71710g) {
                            if (this.f71711h == aVar.f71711h) {
                                if ((this.f71712i == aVar.f71712i) && C52711k.m112239a((Object) this.f71713j, (Object) aVar.f71713j)) {
                                    if (this.f71714k == aVar.f71714k) {
                                        if ((this.f71715l == aVar.f71715l) && C52711k.m112239a((Object) this.f71716m, (Object) aVar.f71716m)) {
                                            if (this.f71717n == aVar.f71717n) {
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f71704a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Bundle bundle = this.f71705b;
        int hashCode2 = (hashCode + (bundle != null ? bundle.hashCode() : 0)) * 31;
        String str = this.f71706c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f71707d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str2 = this.f71708e;
        int hashCode4 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f71709f;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.f71710g;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode5 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f71711h;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f71712i;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        String str4 = this.f71713j;
        int hashCode6 = (i5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z5 = this.f71714k;
        if (z5) {
            z5 = true;
        }
        int i6 = (hashCode6 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f71715l;
        if (z6) {
            z6 = true;
        }
        int i7 = (i6 + (z6 ? 1 : 0)) * 31;
        String str5 = this.f71716m;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i8 = (i7 + i) * 31;
        boolean z7 = this.f71717n;
        if (z7) {
            z7 = true;
        }
        return i8 + (z7 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseInfo(platform=");
        sb.append(this.f71704a);
        sb.append(", rawBundle=");
        sb.append(this.f71705b);
        sb.append(", url=");
        sb.append(this.f71706c);
        sb.append(", safeTemplate=");
        sb.append(this.f71707d);
        sb.append(", groupId=");
        sb.append(this.f71708e);
        sb.append(", enterFrom=");
        sb.append(this.f71709f);
        sb.append(", autoPlayAudio=");
        sb.append(this.f71710g);
        sb.append(", forbidJump=");
        sb.append(this.f71711h);
        sb.append(", fromNotification=");
        sb.append(this.f71712i);
        sb.append(", awemeId=");
        sb.append(this.f71713j);
        sb.append(", controlRequestUrl=");
        sb.append(this.f71714k);
        sb.append(", noHardware=");
        sb.append(this.f71715l);
        sb.append(", ownerId=");
        sb.append(this.f71716m);
        sb.append(", hideSystemVideoPoster=");
        sb.append(this.f71717n);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo55531a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f71716m = str;
    }

    private C27181a(Integer num, Bundle bundle, String str, boolean z, String str2, String str3, boolean z2, boolean z3, boolean z4, String str4, boolean z5, boolean z6, String str5, boolean z7) {
        C52711k.m112240b(str5, "ownerId");
        this.f71704a = num;
        this.f71705b = bundle;
        this.f71706c = str;
        this.f71707d = z;
        this.f71708e = str2;
        this.f71709f = str3;
        this.f71710g = z2;
        this.f71711h = z3;
        this.f71712i = z4;
        this.f71713j = str4;
        this.f71714k = z5;
        this.f71715l = z6;
        this.f71716m = str5;
        this.f71717n = z7;
    }

    private /* synthetic */ C27181a(Integer num, Bundle bundle, String str, boolean z, String str2, String str3, boolean z2, boolean z3, boolean z4, String str4, boolean z5, boolean z6, String str5, boolean z7, int i, C52707g gVar) {
        this(null, null, null, false, null, null, false, false, false, null, false, false, "", false);
    }
}

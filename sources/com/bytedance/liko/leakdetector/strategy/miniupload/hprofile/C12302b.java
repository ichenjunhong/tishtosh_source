package com.bytedance.liko.leakdetector.strategy.miniupload.hprofile;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.b */
public final class C12302b {
    @C17952c(mo34828a = "aid")

    /* renamed from: a */
    public final String f32429a;
    @C17952c(mo34828a = "channel")

    /* renamed from: b */
    public final String f32430b;
    @C17952c(mo34828a = "device_id")

    /* renamed from: c */
    public final String f32431c;
    @C17952c(mo34828a = "app_version")

    /* renamed from: d */
    public final String f32432d;
    @C17952c(mo34828a = "update_version_code")

    /* renamed from: e */
    public final String f32433e;
    @C17952c(mo34828a = "current_update_version_code")

    /* renamed from: f */
    public final String f32434f;
    @C17952c(mo34828a = "os_version")

    /* renamed from: g */
    public final String f32435g;
    @C17952c(mo34828a = "os_api")

    /* renamed from: h */
    public final String f32436h;
    @C17952c(mo34828a = "device_model")

    /* renamed from: i */
    public final String f32437i;
    @C17952c(mo34828a = "device_brand")

    /* renamed from: j */
    public final String f32438j;
    @C17952c(mo34828a = "device_manufacturer")

    /* renamed from: k */
    public final String f32439k;
    @C17952c(mo34828a = "process_name")

    /* renamed from: l */
    public final String f32440l;
    @C17952c(mo34828a = "version_name")

    /* renamed from: m */
    public final String f32441m;
    @C17952c(mo34828a = "version_code")

    /* renamed from: n */
    public final String f32442n;
    @C17952c(mo34828a = "region")

    /* renamed from: o */
    public final String f32443o;
    @C17952c(mo34828a = "os")

    /* renamed from: p */
    public final String f32444p;
    @C17952c(mo34828a = "device_platform")

    /* renamed from: q */
    public final String f32445q;
    @C17952c(mo34828a = "sid")

    /* renamed from: r */
    public final String f32446r;
    @C17952c(mo34828a = "config_time")

    /* renamed from: s */
    public final String f32447s;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f32447s, (java.lang.Object) r3.f32447s) != false) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x00c9
            boolean r0 = r3 instanceof com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.C12302b
            if (r0 == 0) goto L_0x00c7
            com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.b r3 = (com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.C12302b) r3
            java.lang.String r0 = r2.f32429a
            java.lang.String r1 = r3.f32429a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32430b
            java.lang.String r1 = r3.f32430b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32431c
            java.lang.String r1 = r3.f32431c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32432d
            java.lang.String r1 = r3.f32432d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32433e
            java.lang.String r1 = r3.f32433e
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32434f
            java.lang.String r1 = r3.f32434f
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32435g
            java.lang.String r1 = r3.f32435g
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32436h
            java.lang.String r1 = r3.f32436h
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32437i
            java.lang.String r1 = r3.f32437i
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32438j
            java.lang.String r1 = r3.f32438j
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32439k
            java.lang.String r1 = r3.f32439k
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32440l
            java.lang.String r1 = r3.f32440l
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32441m
            java.lang.String r1 = r3.f32441m
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32442n
            java.lang.String r1 = r3.f32442n
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32443o
            java.lang.String r1 = r3.f32443o
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32444p
            java.lang.String r1 = r3.f32444p
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32445q
            java.lang.String r1 = r3.f32445q
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32446r
            java.lang.String r1 = r3.f32446r
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r2.f32447s
            java.lang.String r3 = r3.f32447s
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r3 = 0
            return r3
        L_0x00c9:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.C12302b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f32429a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32430b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32431c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f32432d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f32433e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f32434f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f32435g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f32436h;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f32437i;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f32438j;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f32439k;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f32440l;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f32441m;
        int hashCode13 = (hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.f32442n;
        int hashCode14 = (hashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.f32443o;
        int hashCode15 = (hashCode14 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.f32444p;
        int hashCode16 = (hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.f32445q;
        int hashCode17 = (hashCode16 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String str18 = this.f32446r;
        int hashCode18 = (hashCode17 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.f32447s;
        if (str19 != null) {
            i = str19.hashCode();
        }
        return hashCode18 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderBean(aid=");
        sb.append(this.f32429a);
        sb.append(", channel=");
        sb.append(this.f32430b);
        sb.append(", deviceID=");
        sb.append(this.f32431c);
        sb.append(", appVersion=");
        sb.append(this.f32432d);
        sb.append(", updateVersionCode=");
        sb.append(this.f32433e);
        sb.append(", currentUpdateVersionCode=");
        sb.append(this.f32434f);
        sb.append(", osVersion=");
        sb.append(this.f32435g);
        sb.append(", osApi=");
        sb.append(this.f32436h);
        sb.append(", deviceModel=");
        sb.append(this.f32437i);
        sb.append(", deviceBrand=");
        sb.append(this.f32438j);
        sb.append(", deviceManufacturer=");
        sb.append(this.f32439k);
        sb.append(", processName=");
        sb.append(this.f32440l);
        sb.append(", verionName=");
        sb.append(this.f32441m);
        sb.append(", verisonCode=");
        sb.append(this.f32442n);
        sb.append(", region=");
        sb.append(this.f32443o);
        sb.append(", os=");
        sb.append(this.f32444p);
        sb.append(", devicePlatform=");
        sb.append(this.f32445q);
        sb.append(", sid=");
        sb.append(this.f32446r);
        sb.append(", configTime=");
        sb.append(this.f32447s);
        sb.append(")");
        return sb.toString();
    }

    public C12302b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        this.f32429a = str;
        this.f32430b = str2;
        this.f32431c = str3;
        this.f32432d = str4;
        this.f32433e = str5;
        this.f32434f = str6;
        this.f32435g = str7;
        this.f32436h = str8;
        this.f32437i = str9;
        this.f32438j = str10;
        this.f32439k = str11;
        this.f32440l = str12;
        this.f32441m = str13;
        this.f32442n = str14;
        this.f32443o = str15;
        this.f32444p = str16;
        this.f32445q = str17;
        this.f32446r = str18;
        this.f32447s = str19;
    }
}

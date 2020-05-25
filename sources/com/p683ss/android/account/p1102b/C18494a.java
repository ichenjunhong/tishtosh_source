package com.p683ss.android.account.p1102b;

/* renamed from: com.ss.android.account.b.a */
public final class C18494a {

    /* renamed from: a */
    public static final String[] f50947a = {"flyme", "huawei", "sina_weibo", "telecom", "qq_weibo", "renren_sns", "kaixin_sns", "qzone_sns", "mobile", "live_stream", "aweme", "aweme_v2", "weixin", "xiaomi", "email", "google", "facebook", "twitter", "instagram", "line", "kakaotalk", "vk", "toutiao", "toutiao_v2", "flipchat", "gogokid"};

    /* renamed from: b */
    public final String f50948b;

    /* renamed from: c */
    public final int f50949c;

    /* renamed from: d */
    public boolean f50950d;

    /* renamed from: e */
    public String f50951e = "";

    /* renamed from: f */
    public String f50952f;

    /* renamed from: g */
    public String f50953g = "";

    /* renamed from: h */
    public String f50954h;

    /* renamed from: i */
    public long f50955i;

    /* renamed from: j */
    public long f50956j;

    /* renamed from: k */
    public long f50957k;

    /* renamed from: a */
    public final void mo37743a() {
        this.f50950d = false;
        this.f50951e = "";
        this.f50952f = null;
        this.f50953g = "";
        this.f50956j = 0;
        this.f50957k = 0;
        this.f50955i = 0;
    }

    /* renamed from: a */
    public static C18494a m44739a(String str) {
        return m44740a(str, 0);
    }

    public C18494a(String str, int i) {
        this.f50948b = str;
        this.f50949c = i;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p683ss.android.account.p1102b.C18494a m44740a(java.lang.String r1, int r2) {
        /*
            int r2 = r1.hashCode()
            r0 = 0
            switch(r2) {
                case -1530308138: goto L_0x011b;
                case -1512021772: goto L_0x0110;
                case -1429363305: goto L_0x0105;
                case -1240244679: goto L_0x00fa;
                case -1206476313: goto L_0x00ef;
                case -1134307907: goto L_0x00e4;
                case -1068855134: goto L_0x00da;
                case -1035863501: goto L_0x00cf;
                case -916346253: goto L_0x00c4;
                case -791575966: goto L_0x00b9;
                case -759499589: goto L_0x00ad;
                case -589445623: goto L_0x00a2;
                case -471473230: goto L_0x0097;
                case 3765: goto L_0x008b;
                case 3321844: goto L_0x007f;
                case 93227207: goto L_0x0073;
                case 96619420: goto L_0x0067;
                case 97536331: goto L_0x005c;
                case 199970038: goto L_0x0050;
                case 486515695: goto L_0x0044;
                case 497130182: goto L_0x0038;
                case 635922494: goto L_0x002c;
                case 730878681: goto L_0x0021;
                case 1766810787: goto L_0x0016;
                case 1851692357: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0125
        L_0x000a:
            java.lang.String r2 = "flipchat"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 23
            goto L_0x0126
        L_0x0016:
            java.lang.String r2 = "kaixin_sns"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 3
            goto L_0x0126
        L_0x0021:
            java.lang.String r2 = "renren_sns"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 2
            goto L_0x0126
        L_0x002c:
            java.lang.String r2 = "toutiao_v2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 22
            goto L_0x0126
        L_0x0038:
            java.lang.String r2 = "facebook"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 16
            goto L_0x0126
        L_0x0044:
            java.lang.String r2 = "kakaotalk"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 19
            goto L_0x0126
        L_0x0050:
            java.lang.String r2 = "gogokid"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 24
            goto L_0x0126
        L_0x005c:
            java.lang.String r2 = "flyme"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 7
            goto L_0x0126
        L_0x0067:
            java.lang.String r2 = "email"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 11
            goto L_0x0126
        L_0x0073:
            java.lang.String r2 = "aweme"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 13
            goto L_0x0126
        L_0x007f:
            java.lang.String r2 = "line"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 18
            goto L_0x0126
        L_0x008b:
            java.lang.String r2 = "vk"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 20
            goto L_0x0126
        L_0x0097:
            java.lang.String r2 = "sina_weibo"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 0
            goto L_0x0126
        L_0x00a2:
            java.lang.String r2 = "qq_weibo"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 1
            goto L_0x0126
        L_0x00ad:
            java.lang.String r2 = "xiaomi"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 10
            goto L_0x0126
        L_0x00b9:
            java.lang.String r2 = "weixin"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 6
            goto L_0x0126
        L_0x00c4:
            java.lang.String r2 = "twitter"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 17
            goto L_0x0126
        L_0x00cf:
            java.lang.String r2 = "live_stream"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 12
            goto L_0x0126
        L_0x00da:
            java.lang.String r2 = "mobile"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 5
            goto L_0x0126
        L_0x00e4:
            java.lang.String r2 = "toutiao"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 21
            goto L_0x0126
        L_0x00ef:
            java.lang.String r2 = "huawei"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 8
            goto L_0x0126
        L_0x00fa:
            java.lang.String r2 = "google"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 15
            goto L_0x0126
        L_0x0105:
            java.lang.String r2 = "telecom"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 9
            goto L_0x0126
        L_0x0110:
            java.lang.String r2 = "aweme_v2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 14
            goto L_0x0126
        L_0x011b:
            java.lang.String r2 = "qzone_sns"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0125
            r2 = 4
            goto L_0x0126
        L_0x0125:
            r2 = -1
        L_0x0126:
            switch(r2) {
                case 0: goto L_0x0184;
                case 1: goto L_0x0180;
                case 2: goto L_0x017c;
                case 3: goto L_0x0178;
                case 4: goto L_0x0174;
                case 5: goto L_0x0170;
                case 6: goto L_0x016c;
                case 7: goto L_0x0168;
                case 8: goto L_0x0164;
                case 9: goto L_0x0160;
                case 10: goto L_0x015c;
                case 11: goto L_0x0158;
                case 12: goto L_0x0154;
                case 13: goto L_0x0150;
                case 14: goto L_0x0150;
                case 15: goto L_0x014c;
                case 16: goto L_0x0148;
                case 17: goto L_0x0144;
                case 18: goto L_0x0140;
                case 19: goto L_0x013c;
                case 20: goto L_0x0138;
                case 21: goto L_0x0134;
                case 22: goto L_0x0134;
                case 23: goto L_0x0130;
                case 24: goto L_0x012b;
                default: goto L_0x0129;
            }
        L_0x0129:
            goto L_0x0187
        L_0x012b:
            r0 = 2132549305(0x7f1c1eb9, float:2.0751909E38)
            goto L_0x0187
        L_0x0130:
            r0 = 2132549303(0x7f1c1eb7, float:2.0751905E38)
            goto L_0x0187
        L_0x0134:
            r0 = 2132549318(0x7f1c1ec6, float:2.0751935E38)
            goto L_0x0187
        L_0x0138:
            r0 = 2132549320(0x7f1c1ec8, float:2.075194E38)
            goto L_0x0187
        L_0x013c:
            r0 = 2132549311(0x7f1c1ebf, float:2.0751921E38)
            goto L_0x0187
        L_0x0140:
            r0 = 2132549312(0x7f1c1ec0, float:2.0751923E38)
            goto L_0x0187
        L_0x0144:
            r0 = 2132549319(0x7f1c1ec7, float:2.0751937E38)
            goto L_0x0187
        L_0x0148:
            r0 = 2132549302(0x7f1c1eb6, float:2.0751903E38)
            goto L_0x0187
        L_0x014c:
            r0 = 2132549306(0x7f1c1eba, float:2.075191E38)
            goto L_0x0187
        L_0x0150:
            r0 = 2132549300(0x7f1c1eb4, float:2.0751899E38)
            goto L_0x0187
        L_0x0154:
            r0 = 2132549308(0x7f1c1ebc, float:2.0751915E38)
            goto L_0x0187
        L_0x0158:
            r0 = 2132549301(0x7f1c1eb5, float:2.07519E38)
            goto L_0x0187
        L_0x015c:
            r0 = 2132549323(0x7f1c1ecb, float:2.0751945E38)
            goto L_0x0187
        L_0x0160:
            r0 = 2132549316(0x7f1c1ec4, float:2.0751931E38)
            goto L_0x0187
        L_0x0164:
            r0 = 2132549307(0x7f1c1ebb, float:2.0751913E38)
            goto L_0x0187
        L_0x0168:
            r0 = 2132549304(0x7f1c1eb8, float:2.0751907E38)
            goto L_0x0187
        L_0x016c:
            r0 = 2132549322(0x7f1c1eca, float:2.0751943E38)
            goto L_0x0187
        L_0x0170:
            r0 = 2132549313(0x7f1c1ec1, float:2.0751925E38)
            goto L_0x0187
        L_0x0174:
            r0 = 2132549314(0x7f1c1ec2, float:2.0751927E38)
            goto L_0x0187
        L_0x0178:
            r0 = 2132549310(0x7f1c1ebe, float:2.075192E38)
            goto L_0x0187
        L_0x017c:
            r0 = 2132549315(0x7f1c1ec3, float:2.075193E38)
            goto L_0x0187
        L_0x0180:
            r0 = 2132549317(0x7f1c1ec5, float:2.0751933E38)
            goto L_0x0187
        L_0x0184:
            r0 = 2132549321(0x7f1c1ec9, float:2.0751941E38)
        L_0x0187:
            com.ss.android.account.b.a r2 = new com.ss.android.account.b.a
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.account.p1102b.C18494a.m44740a(java.lang.String, int):com.ss.android.account.b.a");
    }
}

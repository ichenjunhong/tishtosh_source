package com.bytedance.p126ad.symphony.p131c;

/* renamed from: com.bytedance.ad.symphony.c.b */
public abstract class C2702b {

    /* renamed from: a */
    public String f8193a;

    /* renamed from: b */
    public String f8194b;

    /* renamed from: c */
    public String f8195c;

    /* renamed from: d */
    public String f8196d;

    /* renamed from: e */
    public int f8197e;

    /* renamed from: f */
    public String f8198f;

    /* renamed from: com.bytedance.ad.symphony.c.b$a */
    public static class C2703a extends C2702b {
        /* renamed from: a */
        public final String mo7270a() {
            return "ad_sdk_bid_request";
        }

        public C2703a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.ad.symphony.c.b$b */
    public static class C2704b extends C2702b {
        /* renamed from: a */
        public final String mo7270a() {
            return "ad_sdk_bid_response";
        }

        public C2704b(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.ad.symphony.c.b$c */
    public static class C2705c extends C2702b {
        /* renamed from: a */
        public final String mo7270a() {
            return "ad_sdk_creative_request";
        }

        public C2705c(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.ad.symphony.c.b$d */
    public static class C2706d extends C2702b {
        /* renamed from: a */
        public final String mo7270a() {
            return "ad_sdk_creative_response";
        }

        public C2706d(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.ad.symphony.c.b$e */
    public static class C2707e extends C2702b {
        /* renamed from: a */
        public final String mo7270a() {
            return "ad_sdk_loss_notice";
        }

        public C2707e(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.ad.symphony.c.b$f */
    public static class C2708f extends C2702b {
        /* renamed from: a */
        public final String mo7270a() {
            return "ad_sdk_win_notice";
        }

        public C2708f(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public abstract String mo7270a();

    public C2702b(String str) {
        this.f8196d = str;
    }
}

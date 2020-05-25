package com.p683ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.retrofit2.p831b.C12705g;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi */
public final class TwoStepAuthApi {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f58264a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(TwoStepAuthApi.class), "api", "getApi()Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$Api;"))};

    /* renamed from: b */
    public static final TwoStepAuthApi f58265b = new TwoStepAuthApi();

    /* renamed from: c */
    private static final C52668f f58266c = C52732g.m112285a(C21485d.f58287a);

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$Api */
    public interface Api {
        @C53084o(mo110612a = "/passport/email/send_code/")
        @C12705g
        C0013i<C21479a> sendEmailCode(@C53072c(mo110600a = "verify_ticket") String str, @C53072c(mo110600a = "type") Integer num);

        @C53084o(mo110612a = "/passport/mobile/send_code/v1/")
        @C12705g
        C0013i<C21481b> sendSmsCode(@C53072c(mo110600a = "verify_ticket") String str, @C53072c(mo110600a = "type") Integer num);

        @C53075f(mo110603a = "/passport/email/check_code/")
        C0013i<C21483c> verifyEmailCode(@C53089t(mo110619a = "mix_mode") Integer num, @C53089t(mo110619a = "email") String str, @C53089t(mo110619a = "code") String str2, @C53089t(mo110619a = "type") int i, @C53089t(mo110619a = "verify_ticket") String str3);

        @C53075f(mo110603a = "/passport/account/verify/")
        C0013i<C21483c> verifyPassword(@C53089t(mo110619a = "username") String str, @C53089t(mo110619a = "mobile") String str2, @C53089t(mo110619a = "email") String str3, @C53089t(mo110619a = "password") String str4, @C53089t(mo110619a = "mix_mode") int i, @C53089t(mo110619a = "verify_ticket") String str5);

        @C53075f(mo110603a = "/passport/mobile/check_code/")
        C0013i<C21483c> verifySmsCode(@C53089t(mo110619a = "mix_mode") Integer num, @C53089t(mo110619a = "mobile") String str, @C53089t(mo110619a = "code") String str2, @C53089t(mo110619a = "type") int i, @C53089t(mo110619a = "verify_ticket") String str3);

        @C53075f(mo110603a = "/passport/auth/verify/")
        C0013i<C21483c> verifyThirdParty(@C53089t(mo110619a = "access_token") String str, @C53089t(mo110619a = "access_token_secret") String str2, @C53089t(mo110619a = "code") String str3, @C53089t(mo110619a = "expires_in") Integer num, @C53089t(mo110619a = "openid") Integer num2, @C53089t(mo110619a = "platform") String str4, @C53089t(mo110619a = "platform_app_id") Integer num3, @C53089t(mo110619a = "mid") Integer num4, @C53089t(mo110619a = "verify_ticket") String str5);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a */
    public static final class C21479a {
        @C17952c(mo34828a = "message")

        /* renamed from: a */
        public final String f58267a;
        @C17952c(mo34828a = "data")

        /* renamed from: b */
        public final C21480a f58268b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a */
        public static final class C21480a {
            @C17952c(mo34828a = "email")

            /* renamed from: a */
            public final String f58269a;
            @C17952c(mo34828a = "captcha")

            /* renamed from: b */
            public final String f58270b;
            @C17952c(mo34828a = "description")

            /* renamed from: c */
            public final String f58271c;
            @C17952c(mo34828a = "error_code")

            /* renamed from: d */
            public final Integer f58272d;

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
                if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f58272d, (java.lang.Object) r3.f58272d) != false) goto L_0x0033;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0033
                    boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21479a.C21480a
                    if (r0 == 0) goto L_0x0031
                    com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r3 = (com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21479a.C21480a) r3
                    java.lang.String r0 = r2.f58269a
                    java.lang.String r1 = r3.f58269a
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    java.lang.String r0 = r2.f58270b
                    java.lang.String r1 = r3.f58270b
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    java.lang.String r0 = r2.f58271c
                    java.lang.String r1 = r3.f58271c
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    java.lang.Integer r0 = r2.f58272d
                    java.lang.Integer r3 = r3.f58272d
                    boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                    if (r3 == 0) goto L_0x0031
                    goto L_0x0033
                L_0x0031:
                    r3 = 0
                    return r3
                L_0x0033:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21479a.C21480a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.f58269a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f58270b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f58271c;
                int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                Integer num = this.f58272d;
                if (num != null) {
                    i = num.hashCode();
                }
                return hashCode3 + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Data(email=");
                sb.append(this.f58269a);
                sb.append(", captcha=");
                sb.append(this.f58270b);
                sb.append(", errorDescription=");
                sb.append(this.f58271c);
                sb.append(", errorCode=");
                sb.append(this.f58272d);
                sb.append(")");
                return sb.toString();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f58268b, (java.lang.Object) r3.f58268b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21479a
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a r3 = (com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21479a) r3
                java.lang.String r0 = r2.f58267a
                java.lang.String r1 = r3.f58267a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r0 = r2.f58268b
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r3 = r3.f58268b
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21479a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f58267a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C21480a aVar = this.f58268b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SendEmailCodeResponse(message=");
            sb.append(this.f58267a);
            sb.append(", data=");
            sb.append(this.f58268b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b */
    public static final class C21481b {
        @C17952c(mo34828a = "message")

        /* renamed from: a */
        public final String f58273a;
        @C17952c(mo34828a = "data")

        /* renamed from: b */
        public final C21482a f58274b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b$a */
        public static final class C21482a {
            @C17952c(mo34828a = "mobile")

            /* renamed from: a */
            public final String f58275a;
            @C17952c(mo34828a = "retry_time")

            /* renamed from: b */
            public final Integer f58276b;
            @C17952c(mo34828a = "captcha")

            /* renamed from: c */
            public final String f58277c;
            @C17952c(mo34828a = "description")

            /* renamed from: d */
            public final String f58278d;
            @C17952c(mo34828a = "error_code")

            /* renamed from: e */
            public final Integer f58279e;
            @C17952c(mo34828a = "next_url")

            /* renamed from: f */
            public final String f58280f;

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
                if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f58280f, (java.lang.Object) r3.f58280f) != false) goto L_0x0047;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0047
                    boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21481b.C21482a
                    if (r0 == 0) goto L_0x0045
                    com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b$a r3 = (com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21481b.C21482a) r3
                    java.lang.String r0 = r2.f58275a
                    java.lang.String r1 = r3.f58275a
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    java.lang.Integer r0 = r2.f58276b
                    java.lang.Integer r1 = r3.f58276b
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    java.lang.String r0 = r2.f58277c
                    java.lang.String r1 = r3.f58277c
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    java.lang.String r0 = r2.f58278d
                    java.lang.String r1 = r3.f58278d
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    java.lang.Integer r0 = r2.f58279e
                    java.lang.Integer r1 = r3.f58279e
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    java.lang.String r0 = r2.f58280f
                    java.lang.String r3 = r3.f58280f
                    boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                    if (r3 == 0) goto L_0x0045
                    goto L_0x0047
                L_0x0045:
                    r3 = 0
                    return r3
                L_0x0047:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21481b.C21482a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.f58275a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Integer num = this.f58276b;
                int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
                String str2 = this.f58277c;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f58278d;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
                Integer num2 = this.f58279e;
                int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
                String str4 = this.f58280f;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                return hashCode5 + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Data(mobile=");
                sb.append(this.f58275a);
                sb.append(", retryTime=");
                sb.append(this.f58276b);
                sb.append(", captcha=");
                sb.append(this.f58277c);
                sb.append(", errorDescription=");
                sb.append(this.f58278d);
                sb.append(", errorCode=");
                sb.append(this.f58279e);
                sb.append(", nextUrl=");
                sb.append(this.f58280f);
                sb.append(")");
                return sb.toString();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f58274b, (java.lang.Object) r3.f58274b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21481b
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b r3 = (com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21481b) r3
                java.lang.String r0 = r2.f58273a
                java.lang.String r1 = r3.f58273a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b$a r0 = r2.f58274b
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b$a r3 = r3.f58274b
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21481b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f58273a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C21482a aVar = this.f58274b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SendSmsCodeResponse(message=");
            sb.append(this.f58273a);
            sb.append(", data=");
            sb.append(this.f58274b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c */
    public static final class C21483c {
        @C17952c(mo34828a = "message")

        /* renamed from: a */
        public final String f58281a;
        @C17952c(mo34828a = "data")

        /* renamed from: b */
        public final C21484a f58282b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a */
        public static final class C21484a {
            @C17952c(mo34828a = "ticket")

            /* renamed from: a */
            public final String f58283a;
            @C17952c(mo34828a = "captcha")

            /* renamed from: b */
            public final String f58284b;
            @C17952c(mo34828a = "error_code")

            /* renamed from: c */
            public final Integer f58285c;
            @C17952c(mo34828a = "description")

            /* renamed from: d */
            public final String f58286d;

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
                if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f58286d, (java.lang.Object) r3.f58286d) != false) goto L_0x0033;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0033
                    boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21483c.C21484a
                    if (r0 == 0) goto L_0x0031
                    com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r3 = (com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21483c.C21484a) r3
                    java.lang.String r0 = r2.f58283a
                    java.lang.String r1 = r3.f58283a
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    java.lang.String r0 = r2.f58284b
                    java.lang.String r1 = r3.f58284b
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    java.lang.Integer r0 = r2.f58285c
                    java.lang.Integer r1 = r3.f58285c
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    java.lang.String r0 = r2.f58286d
                    java.lang.String r3 = r3.f58286d
                    boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                    if (r3 == 0) goto L_0x0031
                    goto L_0x0033
                L_0x0031:
                    r3 = 0
                    return r3
                L_0x0033:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21483c.C21484a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.f58283a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f58284b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                Integer num = this.f58285c;
                int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
                String str3 = this.f58286d;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return hashCode3 + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Data(ticket=");
                sb.append(this.f58283a);
                sb.append(", captcha=");
                sb.append(this.f58284b);
                sb.append(", errorCode=");
                sb.append(this.f58285c);
                sb.append(", errorDescription=");
                sb.append(this.f58286d);
                sb.append(")");
                return sb.toString();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f58282b, (java.lang.Object) r3.f58282b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21483c
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c r3 = (com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21483c) r3
                java.lang.String r0 = r2.f58281a
                java.lang.String r1 = r3.f58281a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r2.f58282b
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r3 = r3.f58282b
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21483c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f58281a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C21484a aVar = this.f58282b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TwoStepApiResponse(message=");
            sb.append(this.f58281a);
            sb.append(", data=");
            sb.append(this.f58282b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$d */
    static final class C21485d extends C52712l implements C52670a<Api> {

        /* renamed from: a */
        public static final C21485d f58287a = new C21485d();

        C21485d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Api) ((IRetrofitService) C23826bi.m58450a(IRetrofitService.class)).createNewRetrofit(AccountApiInModule.f56868a).create(Api.class);
        }
    }

    private TwoStepAuthApi() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Api mo45660a() {
        return (Api) f58266c.getValue();
    }
}

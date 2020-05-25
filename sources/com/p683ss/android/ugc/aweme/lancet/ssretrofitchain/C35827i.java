package com.p683ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35818c.C35819a;
import com.p683ss.android.ugc.aweme.sec.C41475f;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.i */
public final class C35827i extends C35818c {

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.i$a */
    public static final class C35828a extends C41475f<Boolean> {

        /* renamed from: g */
        private C12686c f92001g;

        /* access modifiers changed from: private */
        /* renamed from: e */
        public Boolean mo74486b() throws Exception {
            if (this.f92001g.f33321b.contains("/passport/user/check_email_registered") || this.f92001g.f33321b.contains("/passport/email/register/v2/")) {
                C26890h.m65011a("slide_verification_response", new C23089d().mo47829a("enter_method", C20854a.m53162b().getLoginMobEnterMethod()).mo47829a("status", "1").f61491a);
            }
            return Boolean.valueOf(true);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public Boolean mo74485a() {
            if (this.f92001g.f33321b.contains("/passport/user/check_email_registered") || this.f92001g.f33321b.contains("/passport/email/register/v2/")) {
                C26890h.m65011a("slide_verification_response", new C23089d().mo47829a("enter_method", C20854a.m53162b().getLoginMobEnterMethod()).mo47829a("status", "2").f61491a);
            }
            return Boolean.valueOf(false);
        }

        public C35828a(C12686c cVar) {
            this.f92001g = cVar;
        }
    }

    public C35827i(C35818c cVar) {
        super(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C35819a mo74476a(C35823f fVar, C12686c cVar, C12799u uVar) {
        C35828a aVar = new C35828a(cVar);
        try {
            if (aVar.mo84222a(fVar.f91996a.f91998a) && ((Boolean) aVar.mo84211c()).booleanValue()) {
                return new C35819a(true, true);
            }
        } catch (Throwable unused) {
        }
        return C35817b.f91989a;
    }
}

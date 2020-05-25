package com.p683ss.android.ugc.aweme.account.security;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p064c.p065a.C1680ad;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.account.security.SafeInfoNoticeApi */
public interface SafeInfoNoticeApi {

    /* renamed from: a */
    public static final C22145a f59708a = C22145a.f59709a;

    /* renamed from: com.ss.android.ugc.aweme.account.security.SafeInfoNoticeApi$a */
    public static final class C22145a {

        /* renamed from: a */
        static final /* synthetic */ C22145a f59709a = new C22145a();

        private C22145a() {
        }

        /* renamed from: a */
        public static SafeInfoNoticeApi m54941a() {
            Object a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(Api.f61282b).mo19925a().mo19930a(SafeInfoNoticeApi.class);
            C52711k.m112236a(a, "ServiceManager.get().get…nfoNoticeApi::class.java)");
            return (SafeInfoNoticeApi) a;
        }
    }

    @C53084o(mo110612a = "/safe_info/user/confirm/notice/")
    @C53074e
    C1680ad<BaseResponse> safeInfoConfirm(@C53072c(mo110600a = "notice_id") String str, @C53072c(mo110600a = "notice_type") String str2);

    @C53075f(mo110603a = "/safe_info/user/message/notice/")
    C1680ad<C22148c> safeInfoNoticeMsg(@C53089t(mo110619a = "adolescent_model") boolean z);
}

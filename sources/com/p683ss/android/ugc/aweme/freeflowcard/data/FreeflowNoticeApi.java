package com.p683ss.android.ugc.aweme.freeflowcard.data;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.FreeflowNoticeApi */
public final class FreeflowNoticeApi {

    /* renamed from: a */
    public static IRetrofitService f84558a;

    /* renamed from: b */
    public static NoticeApi f84559b;

    /* renamed from: c */
    public static final C32473a f84560c = new C32473a(null);

    /* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.FreeflowNoticeApi$NoticeApi */
    interface NoticeApi {
        @C53075f(mo110603a = "/aweme/v1/notice/send/")
        C17832m<BaseResponse> sendNotice(@C53089t(mo110619a = "oid") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.FreeflowNoticeApi$a */
    public static final class C32473a {
        private C32473a() {
        }

        public /* synthetic */ C32473a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C17832m<BaseResponse> m75187a(String str) {
            C52711k.m112240b(str, "oid");
            try {
                return FreeflowNoticeApi.f84559b.sendNotice(str);
            } catch (ExecutionException e) {
                RuntimeException propagateCompatibleException = FreeflowNoticeApi.f84558a.propagateCompatibleException(e);
                C52711k.m112236a((Object) propagateCompatibleException, "retrofitService.propagateCompatibleException(e)");
                throw propagateCompatibleException;
            }
        }
    }

    static {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIRetrofitServicebyMonsterPlugin, "ServiceManager.get().get…rofitService::class.java)");
        IRetrofitService iRetrofitService = createIRetrofitServicebyMonsterPlugin;
        f84558a = iRetrofitService;
        Object create = iRetrofitService.createNewRetrofit(Api.f61282b).create(NoticeApi.class);
        C52711k.m112236a(create, "retrofitService.createNe…te(NoticeApi::class.java)");
        f84559b = (NoticeApi) create;
    }
}

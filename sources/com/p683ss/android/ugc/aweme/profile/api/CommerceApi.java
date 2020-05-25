package com.p683ss.android.ugc.aweme.profile.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.profile.model.ShopUserMessage;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.profile.api.CommerceApi */
public final class CommerceApi {

    /* renamed from: a */
    public static final IRetrofitService f101554a;

    /* renamed from: b */
    public static final IRetrofit f101555b;

    /* renamed from: c */
    public static final C39787a f101556c = new C39787a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.api.CommerceApi$RealApi */
    public interface RealApi {
        @C53075f(mo110603a = "/aweme/v2/shop/user/message/list/")
        C17832m<ShopUserMessage> getShopUserMessage();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.api.CommerceApi$a */
    public static final class C39787a {
        private C39787a() {
        }

        /* renamed from: a */
        public static ShopUserMessage m88499a() throws Exception {
            try {
                return (ShopUserMessage) ((RealApi) CommerceApi.f101555b.create(RealApi.class)).getShopUserMessage().get();
            } catch (ExecutionException e) {
                RuntimeException propagateCompatibleException = CommerceApi.f101554a.propagateCompatibleException(e);
                C52711k.m112236a((Object) propagateCompatibleException, "RETROFIT_SERVICE.propagateCompatibleException(e)");
                throw propagateCompatibleException;
            }
        }

        public /* synthetic */ C39787a(C52707g gVar) {
            this();
        }
    }

    static {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        f101554a = createIRetrofitServicebyMonsterPlugin;
        f101555b = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(Api.f61282b);
    }
}

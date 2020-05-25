package com.p683ss.android.ugc.aweme.p2377ug.amplify.api;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.p1140c.C18845b;
import p064c.p065a.C1687b;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.ug.amplify.api.AmplifyApi */
public interface AmplifyApi {

    /* renamed from: a */
    public static final C47426a f119656a = C47426a.f119657a;

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.api.AmplifyApi$a */
    public static final class C47426a {

        /* renamed from: a */
        static final /* synthetic */ C47426a f119657a = new C47426a();

        private C47426a() {
        }

        /* renamed from: a */
        public static AmplifyApi m102802a() {
            Object a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(AmplifyApi.class);
            C52711k.m112236a(a, "ServiceManager.get().get…e(AmplifyApi::class.java)");
            return (AmplifyApi) a;
        }
    }

    @C53084o(mo110612a = "/aweme/v2/ug/ugc/permission/user/perm/grant")
    C1687b confirmAction();

    @C53084o(mo110612a = "/aweme/v2/ug/ugc/permission/user/perm/refuse")
    C1687b refuseAction();
}

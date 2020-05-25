package com.p683ss.android.ugc.aweme.opensdk;

import com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse;
import p064c.p065a.C1680ad;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.opensdk.CheckScopeApi */
public interface CheckScopeApi {

    /* renamed from: a */
    public static final C38482a f97900a = C38482a.f97901a;

    /* renamed from: com.ss.android.ugc.aweme.opensdk.CheckScopeApi$a */
    public static final class C38482a {

        /* renamed from: a */
        static final /* synthetic */ C38482a f97901a = new C38482a();

        private C38482a() {
        }
    }

    @C53084o(mo110612a = "/oauth/get_client_scopes/")
    @C53074e
    C1680ad<ClientKeyScopesResponse> checkScopeExist(@C53072c(mo110600a = "client_key") String str, @C53072c(mo110600a = "app_identity") String str2);
}
